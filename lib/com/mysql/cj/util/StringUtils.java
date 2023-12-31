/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.util;

import com.mysql.cj.Messages;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.util.SearchMode;
import com.mysql.cj.util.StringInspector;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class StringUtils {
    private static final int WILD_COMPARE_MATCH = 0;
    private static final int WILD_COMPARE_CONTINUE_WITH_WILD = 1;
    private static final int WILD_COMPARE_NO_MATCH = -1;
    static final char WILDCARD_MANY = '%';
    static final char WILDCARD_ONE = '_';
    static final char WILDCARD_ESCAPE = '\\';
    private static final String VALID_ID_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789$_#@";
    private static final char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static final char[] EMPTY_SPACE = new char[255];

    public static String dumpAsHex(byte[] byteBuffer, int length) {
        length = Math.min(length, byteBuffer.length);
        StringBuilder fullOutBuilder = new StringBuilder(length * 4);
        StringBuilder asciiOutBuilder = new StringBuilder(16);
        int p = 0;
        int l = 0;
        while (p < length) {
            while (l < 8 && p < length) {
                int asInt = byteBuffer[p] & 0xFF;
                if (asInt < 16) {
                    fullOutBuilder.append("0");
                }
                fullOutBuilder.append(Integer.toHexString(asInt)).append(" ");
                asciiOutBuilder.append(" ").append(asInt >= 32 && asInt < 127 ? Character.valueOf((char)asInt) : ".");
                ++p;
                ++l;
            }
            while (l < 8) {
                fullOutBuilder.append("   ");
                ++l;
            }
            fullOutBuilder.append("   ").append((CharSequence)asciiOutBuilder).append(System.lineSeparator());
            asciiOutBuilder.setLength(0);
            l = 0;
        }
        return fullOutBuilder.toString();
    }

    public static String toHexString(byte[] byteBuffer, int length) {
        length = Math.min(length, byteBuffer.length);
        StringBuilder outputBuilder = new StringBuilder(length * 2);
        for (int i = 0; i < length; ++i) {
            int asInt = byteBuffer[i] & 0xFF;
            if (asInt < 16) {
                outputBuilder.append("0");
            }
            outputBuilder.append(Integer.toHexString(asInt));
        }
        return outputBuilder.toString();
    }

    private static boolean endsWith(byte[] dataFrom, String suffix) {
        for (int i = 1; i <= suffix.length(); ++i) {
            int dfOffset = dataFrom.length - i;
            int suffixOffset = suffix.length() - i;
            if (dataFrom[dfOffset] == suffix.charAt(suffixOffset)) continue;
            return false;
        }
        return true;
    }

    public static char firstNonWsCharUc(String searchIn) {
        return StringUtils.firstNonWsCharUc(searchIn, 0);
    }

    public static char firstNonWsCharUc(String searchIn, int startAt) {
        if (searchIn == null) {
            return '\u0000';
        }
        int length = searchIn.length();
        for (int i = startAt; i < length; ++i) {
            char c = searchIn.charAt(i);
            if (Character.isWhitespace(c)) continue;
            return Character.toUpperCase(c);
        }
        return '\u0000';
    }

    public static char firstAlphaCharUc(String searchIn, int startAt) {
        if (searchIn == null) {
            return '\u0000';
        }
        int length = searchIn.length();
        for (int i = startAt; i < length; ++i) {
            char c = searchIn.charAt(i);
            if (!Character.isLetter(c)) continue;
            return Character.toUpperCase(c);
        }
        return '\u0000';
    }

    public static String fixDecimalExponent(String dString) {
        char maybeMinusChar;
        int ePos = dString.indexOf(69);
        if (ePos == -1) {
            ePos = dString.indexOf(101);
        }
        if (ePos != -1 && dString.length() > ePos + 1 && (maybeMinusChar = dString.charAt(ePos + 1)) != '-' && maybeMinusChar != '+') {
            StringBuilder strBuilder = new StringBuilder(dString.length() + 1);
            strBuilder.append(dString.substring(0, ePos + 1));
            strBuilder.append('+');
            strBuilder.append(dString.substring(ePos + 1, dString.length()));
            dString = strBuilder.toString();
        }
        return dString;
    }

    public static byte[] getBytes(String s, String encoding) {
        if (s == null) {
            return new byte[0];
        }
        if (encoding == null) {
            return StringUtils.getBytes(s);
        }
        try {
            return s.getBytes(encoding);
        }
        catch (UnsupportedEncodingException uee) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("StringUtils.0", new Object[]{encoding}), uee);
        }
    }

    public static byte[] getBytesWrapped(String s, char beginWrap, char endWrap, String encoding) {
        byte[] b;
        if (encoding == null) {
            StringBuilder strBuilder = new StringBuilder(s.length() + 2);
            strBuilder.append(beginWrap);
            strBuilder.append(s);
            strBuilder.append(endWrap);
            b = StringUtils.getBytes(strBuilder.toString());
        } else {
            StringBuilder strBuilder = new StringBuilder(s.length() + 2);
            strBuilder.append(beginWrap);
            strBuilder.append(s);
            strBuilder.append(endWrap);
            s = strBuilder.toString();
            b = StringUtils.getBytes(s, encoding);
        }
        return b;
    }

    public static int indexOfIgnoreCase(String searchIn, String searchFor) {
        return StringUtils.indexOfIgnoreCase(0, searchIn, searchFor);
    }

    public static int indexOfIgnoreCase(int startingPosition, String searchIn, String searchFor) {
        int searchForLength;
        if (searchIn == null || searchFor == null) {
            return -1;
        }
        int searchInLength = searchIn.length();
        int stopSearchingAt = searchInLength - (searchForLength = searchFor.length());
        if (startingPosition > stopSearchingAt || searchForLength == 0) {
            return -1;
        }
        char firstCharOfSearchForUc = Character.toUpperCase(searchFor.charAt(0));
        char firstCharOfSearchForLc = Character.toLowerCase(searchFor.charAt(0));
        for (int i = startingPosition; i <= stopSearchingAt; ++i) {
            if (StringUtils.isCharAtPosNotEqualIgnoreCase(searchIn, i, firstCharOfSearchForUc, firstCharOfSearchForLc)) {
                while (++i <= stopSearchingAt && StringUtils.isCharAtPosNotEqualIgnoreCase(searchIn, i, firstCharOfSearchForUc, firstCharOfSearchForLc)) {
                }
            }
            if (i > stopSearchingAt || !StringUtils.regionMatchesIgnoreCase(searchIn, i, searchFor)) continue;
            return i;
        }
        return -1;
    }

    public static int indexOfIgnoreCase(int startingPosition, String searchIn, String[] searchForSequence, String openingMarkers, String closingMarkers, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(searchIn, startingPosition, openingMarkers, closingMarkers, "", searchMode);
        return strInspector.indexOfIgnoreCase(searchForSequence);
    }

    public static int indexOfIgnoreCase(int startingPosition, String searchIn, String searchFor, String openingMarkers, String closingMarkers, Set<SearchMode> searchMode) {
        return StringUtils.indexOfIgnoreCase(startingPosition, searchIn, searchFor, openingMarkers, closingMarkers, "", searchMode);
    }

    public static int indexOfIgnoreCase(int startingPosition, String searchIn, String searchFor, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(searchIn, startingPosition, openingMarkers, closingMarkers, overridingMarkers, searchMode);
        return strInspector.indexOfIgnoreCase(searchFor);
    }

    public static int indexOfNextAlphanumericChar(int startingPosition, String searchIn, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(searchIn, startingPosition, openingMarkers, closingMarkers, overridingMarkers, searchMode);
        return strInspector.indexOfNextAlphanumericChar();
    }

    public static int indexOfNextNonWsChar(int startingPosition, String searchIn, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(searchIn, startingPosition, openingMarkers, closingMarkers, overridingMarkers, searchMode);
        return strInspector.indexOfNextNonWsChar();
    }

    public static int indexOfNextWsChar(int startingPosition, String searchIn, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(searchIn, startingPosition, openingMarkers, closingMarkers, overridingMarkers, searchMode);
        return strInspector.indexOfNextWsChar();
    }

    private static boolean isCharAtPosNotEqualIgnoreCase(String searchIn, int pos, char firstCharOfSearchForUc, char firstCharOfSearchForLc) {
        return Character.toLowerCase(searchIn.charAt(pos)) != firstCharOfSearchForLc && Character.toUpperCase(searchIn.charAt(pos)) != firstCharOfSearchForUc;
    }

    protected static boolean isCharEqualIgnoreCase(char charToCompare, char compareToCharUC, char compareToCharLC) {
        return Character.toLowerCase(charToCompare) == compareToCharLC || Character.toUpperCase(charToCompare) == compareToCharUC;
    }

    public static List<String> split(String stringToSplit, String delimiter, boolean trim) {
        if (stringToSplit == null) {
            return new ArrayList<String>();
        }
        if (delimiter == null) {
            throw new IllegalArgumentException();
        }
        String[] tokens = stringToSplit.split(delimiter, -1);
        List<String> tokensList = Arrays.asList(tokens);
        if (trim) {
            tokensList = tokensList.stream().map(String::trim).collect(Collectors.toList());
        }
        return tokensList;
    }

    public static List<String> split(String stringToSplit, String delimiter, String openingMarkers, String closingMarkers, boolean trim) {
        return StringUtils.split(stringToSplit, delimiter, openingMarkers, closingMarkers, "", trim);
    }

    public static List<String> split(String stringToSplit, String delimiter, String openingMarkers, String closingMarkers, boolean trim, Set<SearchMode> searchMode) {
        return StringUtils.split(stringToSplit, delimiter, openingMarkers, closingMarkers, "", trim, searchMode);
    }

    public static List<String> split(String stringToSplit, String delimiter, String openingMarkers, String closingMarkers, String overridingMarkers, boolean trim) {
        return StringUtils.split(stringToSplit, delimiter, openingMarkers, closingMarkers, overridingMarkers, trim, SearchMode.__MRK_COM_MYM_HNT_WS);
    }

    public static List<String> split(String stringToSplit, String delimiter, String openingMarkers, String closingMarkers, String overridingMarkers, boolean trim, Set<SearchMode> searchMode) {
        StringInspector strInspector = new StringInspector(stringToSplit, openingMarkers, closingMarkers, overridingMarkers, searchMode);
        return strInspector.split(delimiter, trim);
    }

    private static boolean startsWith(byte[] dataFrom, String chars) {
        int charsLength = chars.length();
        if (dataFrom.length < charsLength) {
            return false;
        }
        for (int i = 0; i < charsLength; ++i) {
            if (dataFrom[i] == chars.charAt(i)) continue;
            return false;
        }
        return true;
    }

    public static boolean regionMatchesIgnoreCase(String searchIn, int startAt, String searchFor) {
        return searchIn.regionMatches(true, startAt, searchFor, 0, searchFor.length());
    }

    public static boolean startsWithIgnoreCase(String searchIn, String searchFor) {
        return StringUtils.regionMatchesIgnoreCase(searchIn, 0, searchFor);
    }

    public static boolean startsWithIgnoreCaseAndNonAlphaNumeric(String searchIn, String searchFor) {
        char c;
        int beginPos;
        if (searchIn == null) {
            return searchFor == null;
        }
        int inLength = searchIn.length();
        for (beginPos = 0; beginPos < inLength && !Character.isLetterOrDigit(c = searchIn.charAt(beginPos)); ++beginPos) {
        }
        return StringUtils.regionMatchesIgnoreCase(searchIn, beginPos, searchFor);
    }

    public static boolean startsWithIgnoreCaseAndWs(String searchIn, String searchFor) {
        return StringUtils.startsWithIgnoreCaseAndWs(searchIn, searchFor, 0);
    }

    public static boolean startsWithIgnoreCaseAndWs(String searchIn, String searchFor, int beginPos) {
        if (searchIn == null) {
            return searchFor == null;
        }
        while (beginPos < searchIn.length() && Character.isWhitespace(searchIn.charAt(beginPos))) {
            ++beginPos;
        }
        return StringUtils.regionMatchesIgnoreCase(searchIn, beginPos, searchFor);
    }

    public static int startsWithIgnoreCaseAndWs(String searchIn, String[] searchFor) {
        for (int i = 0; i < searchFor.length; ++i) {
            if (!StringUtils.startsWithIgnoreCaseAndWs(searchIn, searchFor[i], 0)) continue;
            return i;
        }
        return -1;
    }

    public static boolean endsWithIgnoreCase(String searchIn, String searchFor) {
        int len = searchFor.length();
        return searchIn.regionMatches(true, searchIn.length() - len, searchFor, 0, len);
    }

    public static byte[] stripEnclosure(byte[] source, String prefix, String suffix) {
        if (source.length >= prefix.length() + suffix.length() && StringUtils.startsWith(source, prefix) && StringUtils.endsWith(source, suffix)) {
            int totalToStrip = prefix.length() + suffix.length();
            int enclosedLength = source.length - totalToStrip;
            byte[] enclosed = new byte[enclosedLength];
            int startPos = prefix.length();
            int numToCopy = enclosed.length;
            System.arraycopy(source, startPos, enclosed, 0, numToCopy);
            return enclosed;
        }
        return source;
    }

    public static String toAsciiString(byte[] buffer) {
        return StringUtils.toAsciiString(buffer, 0, buffer.length);
    }

    public static String toAsciiString(byte[] buffer, int startPos, int length) {
        char[] charArray = new char[length];
        int readpoint = startPos;
        for (int i = 0; i < length; ++i) {
            charArray[i] = (char)buffer[readpoint];
            ++readpoint;
        }
        return new String(charArray);
    }

    public static boolean wildCompareIgnoreCase(String searchIn, String searchFor) {
        return StringUtils.wildCompareInternal(searchIn, searchFor) == 0;
    }

    private static int wildCompareInternal(String searchIn, String searchFor) {
        if (searchIn == null || searchFor == null) {
            return -1;
        }
        if (searchFor.equals("%")) {
            return 0;
        }
        int searchForPos = 0;
        int searchForEnd = searchFor.length();
        int searchInPos = 0;
        int searchInEnd = searchIn.length();
        int result = -1;
        while (searchForPos != searchForEnd) {
            while (searchFor.charAt(searchForPos) != '%' && searchFor.charAt(searchForPos) != '_') {
                if (searchFor.charAt(searchForPos) == '\\' && searchForPos + 1 != searchForEnd) {
                    ++searchForPos;
                }
                if (searchInPos == searchInEnd || Character.toUpperCase(searchFor.charAt(searchForPos++)) != Character.toUpperCase(searchIn.charAt(searchInPos++))) {
                    return 1;
                }
                if (searchForPos == searchForEnd) {
                    return searchInPos != searchInEnd ? 1 : 0;
                }
                result = 1;
            }
            if (searchFor.charAt(searchForPos) == '_') {
                do {
                    if (searchInPos == searchInEnd) {
                        return result;
                    }
                    ++searchInPos;
                } while (++searchForPos < searchForEnd && searchFor.charAt(searchForPos) == '_');
                if (searchForPos == searchForEnd) break;
            }
            if (searchFor.charAt(searchForPos) != '%') continue;
            ++searchForPos;
            while (searchForPos != searchForEnd) {
                if (searchFor.charAt(searchForPos) != '%') {
                    if (searchFor.charAt(searchForPos) != '_') break;
                    if (searchInPos == searchInEnd) {
                        return -1;
                    }
                    ++searchInPos;
                }
                ++searchForPos;
            }
            if (searchForPos == searchForEnd) {
                return 0;
            }
            if (searchInPos == searchInEnd) {
                return -1;
            }
            char cmp = searchFor.charAt(searchForPos);
            if (cmp == '\\' && searchForPos + 1 != searchForEnd) {
                cmp = searchFor.charAt(++searchForPos);
            }
            ++searchForPos;
            while (true) {
                if (searchInPos != searchInEnd && Character.toUpperCase(searchIn.charAt(searchInPos)) != Character.toUpperCase(cmp)) {
                    ++searchInPos;
                    continue;
                }
                if (searchInPos++ == searchInEnd) {
                    return -1;
                }
                int tmp = StringUtils.wildCompareInternal(searchIn.substring(searchInPos), searchFor.substring(searchForPos));
                if (tmp <= 0) {
                    return tmp;
                }
                if (searchInPos == searchInEnd) break;
            }
            return -1;
        }
        return searchInPos != searchInEnd ? 1 : 0;
    }

    public static int lastIndexOf(byte[] s, char c) {
        if (s == null) {
            return -1;
        }
        for (int i = s.length - 1; i >= 0; --i) {
            if (s[i] != c) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(byte[] s, char c) {
        if (s == null) {
            return -1;
        }
        int length = s.length;
        for (int i = 0; i < length; ++i) {
            if (s[i] != c) continue;
            return i;
        }
        return -1;
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean nullSafeEqual(String str1, String str2) {
        return str1 == null && str2 == null || str1 != null && str1.equals(str2);
    }

    public static String stripCommentsAndHints(String source, String openingMarkers, String closingMarkers, boolean allowBackslashEscapes) {
        StringInspector strInspector = new StringInspector(source, openingMarkers, closingMarkers, "", allowBackslashEscapes ? SearchMode.__BSE_MRK_COM_MYM_HNT_WS : SearchMode.__MRK_COM_MYM_HNT_WS);
        return strInspector.stripCommentsAndHints();
    }

    public static String sanitizeProcOrFuncName(String src) {
        if (src == null || src.equals("%")) {
            return null;
        }
        return src;
    }

    public static List<String> splitDBdotName(String source, String db, String quoteId, boolean isNoBslashEscSet) {
        String entityName;
        if (source == null || source.equals("%")) {
            return Collections.emptyList();
        }
        int dotIndex = -1;
        dotIndex = " ".equals(quoteId) ? source.indexOf(".") : StringUtils.indexOfIgnoreCase(0, source, ".", quoteId, quoteId, isNoBslashEscSet ? SearchMode.__MRK_WS : SearchMode.__BSE_MRK_WS);
        String database = db;
        if (dotIndex != -1) {
            database = StringUtils.unQuoteIdentifier(source.substring(0, dotIndex), quoteId);
            entityName = StringUtils.unQuoteIdentifier(source.substring(dotIndex + 1), quoteId);
        } else {
            entityName = StringUtils.unQuoteIdentifier(source, quoteId);
        }
        return Arrays.asList(database, entityName);
    }

    public static String getFullyQualifiedName(String db, String entity, String quoteId, boolean isPedantic) {
        StringBuilder fullyQualifiedName = new StringBuilder(StringUtils.quoteIdentifier(db == null ? "" : db, quoteId, isPedantic));
        fullyQualifiedName.append('.');
        fullyQualifiedName.append(StringUtils.quoteIdentifier(entity, quoteId, isPedantic));
        return fullyQualifiedName.toString();
    }

    public static boolean isEmptyOrWhitespaceOnly(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            if (Character.isWhitespace(str.charAt(i))) continue;
            return false;
        }
        return true;
    }

    public static String escapeQuote(String str, String quotChar) {
        if (str == null) {
            return null;
        }
        str = StringUtils.toString(StringUtils.stripEnclosure(str.getBytes(), quotChar, quotChar));
        int lastNdx = str.indexOf(quotChar);
        String tmpSrc = str.substring(0, lastNdx);
        tmpSrc = tmpSrc + quotChar + quotChar;
        String tmpRest = str.substring(lastNdx + 1, str.length());
        lastNdx = tmpRest.indexOf(quotChar);
        while (lastNdx > -1) {
            tmpSrc = tmpSrc + tmpRest.substring(0, lastNdx);
            tmpSrc = tmpSrc + quotChar + quotChar;
            tmpRest = tmpRest.substring(lastNdx + 1, tmpRest.length());
            lastNdx = tmpRest.indexOf(quotChar);
        }
        str = tmpSrc = tmpSrc + tmpRest;
        return str;
    }

    public static String quoteIdentifier(String identifier, String quoteChar, boolean isPedantic) {
        if (identifier == null) {
            return null;
        }
        identifier = identifier.trim();
        int quoteCharLength = quoteChar.length();
        if (quoteCharLength == 0) {
            return identifier;
        }
        if (!isPedantic && identifier.startsWith(quoteChar) && identifier.endsWith(quoteChar)) {
            int quoteCharNextExpectedPos;
            int quoteCharNextPosition;
            String identifierQuoteTrimmed = identifier.substring(quoteCharLength, identifier.length() - quoteCharLength);
            int quoteCharPos = identifierQuoteTrimmed.indexOf(quoteChar);
            while (quoteCharPos >= 0 && (quoteCharNextPosition = identifierQuoteTrimmed.indexOf(quoteChar, quoteCharNextExpectedPos = quoteCharPos + quoteCharLength)) == quoteCharNextExpectedPos) {
                quoteCharPos = identifierQuoteTrimmed.indexOf(quoteChar, quoteCharNextPosition + quoteCharLength);
            }
            if (quoteCharPos < 0) {
                return identifier;
            }
        }
        return quoteChar + identifier.replaceAll(quoteChar, quoteChar + quoteChar) + quoteChar;
    }

    public static String quoteIdentifier(String identifier, boolean isPedantic) {
        return StringUtils.quoteIdentifier(identifier, "`", isPedantic);
    }

    public static String unQuoteIdentifier(String identifier, String quoteChar) {
        if (identifier == null) {
            return null;
        }
        identifier = identifier.trim();
        int quoteCharLength = quoteChar.length();
        if (quoteCharLength == 0) {
            return identifier;
        }
        if (identifier.startsWith(quoteChar) && identifier.endsWith(quoteChar)) {
            String identifierQuoteTrimmed = identifier.substring(quoteCharLength, identifier.length() - quoteCharLength);
            int quoteCharPos = identifierQuoteTrimmed.indexOf(quoteChar);
            while (quoteCharPos >= 0) {
                int quoteCharNextExpectedPos = quoteCharPos + quoteCharLength;
                int quoteCharNextPosition = identifierQuoteTrimmed.indexOf(quoteChar, quoteCharNextExpectedPos);
                if (quoteCharNextPosition == quoteCharNextExpectedPos) {
                    quoteCharPos = identifierQuoteTrimmed.indexOf(quoteChar, quoteCharNextPosition + quoteCharLength);
                    continue;
                }
                return identifier;
            }
            return identifier.substring(quoteCharLength, identifier.length() - quoteCharLength).replaceAll(quoteChar + quoteChar, quoteChar);
        }
        return identifier;
    }

    public static int indexOfQuoteDoubleAware(String searchIn, String quoteChar, int startFrom) {
        if (searchIn == null || quoteChar == null || quoteChar.length() == 0 || startFrom > searchIn.length()) {
            return -1;
        }
        int lastIndex = searchIn.length() - 1;
        int beginPos = startFrom;
        int pos = -1;
        boolean next = true;
        while (next) {
            pos = searchIn.indexOf(quoteChar, beginPos);
            if (pos == -1 || pos == lastIndex || !searchIn.startsWith(quoteChar, pos + 1)) {
                next = false;
                continue;
            }
            beginPos = pos + 2;
        }
        return pos;
    }

    public static String toString(byte[] value, int offset, int length, String encoding) {
        if (encoding == null || "null".equalsIgnoreCase(encoding)) {
            return new String(value, offset, length);
        }
        try {
            return new String(value, offset, length, encoding);
        }
        catch (UnsupportedEncodingException uee) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("StringUtils.0", new Object[]{encoding}), uee);
        }
    }

    public static String toString(byte[] value, String encoding) {
        if (encoding == null) {
            return new String(value);
        }
        try {
            return new String(value, encoding);
        }
        catch (UnsupportedEncodingException uee) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("StringUtils.0", new Object[]{encoding}), uee);
        }
    }

    public static String toString(byte[] value, int offset, int length) {
        return new String(value, offset, length);
    }

    public static String toString(byte[] value) {
        return new String(value);
    }

    public static byte[] getBytes(char[] value) {
        return StringUtils.getBytes(value, 0, value.length);
    }

    public static byte[] getBytes(char[] c, String encoding) {
        return StringUtils.getBytes(c, 0, c.length, encoding);
    }

    public static byte[] getBytes(char[] value, int offset, int length) {
        return StringUtils.getBytes(value, offset, length, null);
    }

    public static byte[] getBytes(char[] value, int offset, int length, String encoding) {
        Charset cs;
        try {
            cs = encoding == null ? Charset.defaultCharset() : Charset.forName(encoding);
        }
        catch (UnsupportedCharsetException ex) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("StringUtils.0", new Object[]{encoding}), ex);
        }
        ByteBuffer buf = cs.encode(CharBuffer.wrap(value, offset, length));
        int encodedLen = buf.limit();
        byte[] asBytes = new byte[encodedLen];
        buf.get(asBytes, 0, encodedLen);
        return asBytes;
    }

    public static byte[] getBytes(String value) {
        return value.getBytes();
    }

    public static byte[] getBytes(String value, int offset, int length) {
        return value.substring(offset, offset + length).getBytes();
    }

    public static byte[] getBytes(String value, int offset, int length, String encoding) {
        if (encoding == null) {
            return StringUtils.getBytes(value, offset, length);
        }
        try {
            return value.substring(offset, offset + length).getBytes(encoding);
        }
        catch (UnsupportedEncodingException uee) {
            throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("StringUtils.0", new Object[]{encoding}), uee);
        }
    }

    public static final boolean isValidIdChar(char c) {
        return VALID_ID_CHARS.indexOf(c) != -1;
    }

    public static void appendAsHex(StringBuilder builder, byte[] bytes) {
        builder.append("0x");
        for (byte b : bytes) {
            builder.append(HEX_DIGITS[b >>> 4 & 0xF]).append(HEX_DIGITS[b & 0xF]);
        }
    }

    public static void appendAsHex(StringBuilder builder, int value) {
        if (value == 0) {
            builder.append("0x0");
            return;
        }
        int shift = 32;
        boolean nonZeroFound = false;
        builder.append("0x");
        do {
            byte nibble = (byte)(value >>> (shift -= 4) & 0xF);
            if (nonZeroFound) {
                builder.append(HEX_DIGITS[nibble]);
                continue;
            }
            if (nibble == 0) continue;
            builder.append(HEX_DIGITS[nibble]);
            nonZeroFound = true;
        } while (shift != 0);
    }

    public static byte[] getBytesNullTerminated(String value, String encoding) {
        Charset cs = Charset.forName(encoding);
        ByteBuffer buf = cs.encode(value);
        int encodedLen = buf.limit();
        byte[] asBytes = new byte[encodedLen + 1];
        buf.get(asBytes, 0, encodedLen);
        asBytes[encodedLen] = 0;
        return asBytes;
    }

    public static boolean canHandleAsServerPreparedStatementNoCache(String sql, ServerVersion serverVersion, boolean allowMultiQueries, boolean noBackslashEscapes, boolean useAnsiQuotes) {
        String quoteChar;
        if (StringUtils.startsWithIgnoreCaseAndNonAlphaNumeric(sql, "CALL")) {
            return false;
        }
        boolean canHandleAsStatement = true;
        boolean allowBackslashEscapes = !noBackslashEscapes;
        String string = quoteChar = useAnsiQuotes ? "\"" : "'";
        if (allowMultiQueries) {
            if (StringUtils.indexOfIgnoreCase(0, sql, ";", quoteChar, quoteChar, allowBackslashEscapes ? SearchMode.__BSE_MRK_COM_MYM_HNT_WS : SearchMode.__MRK_COM_MYM_HNT_WS) != -1) {
                canHandleAsStatement = false;
            }
        } else if (StringUtils.startsWithIgnoreCaseAndWs(sql, "XA ")) {
            canHandleAsStatement = false;
        } else if (StringUtils.startsWithIgnoreCaseAndWs(sql, "CREATE TABLE")) {
            canHandleAsStatement = false;
        } else if (StringUtils.startsWithIgnoreCaseAndWs(sql, "DO")) {
            canHandleAsStatement = false;
        } else if (StringUtils.startsWithIgnoreCaseAndWs(sql, "SET")) {
            canHandleAsStatement = false;
        } else if (StringUtils.startsWithIgnoreCaseAndWs(sql, "SHOW WARNINGS") && serverVersion.meetsMinimum(ServerVersion.parseVersion("5.7.2"))) {
            canHandleAsStatement = false;
        } else if (sql.startsWith("/* ping */")) {
            canHandleAsStatement = false;
        }
        return canHandleAsStatement;
    }

    public static String padString(String stringVal, int requiredLength) {
        int currentLength = stringVal.length();
        int difference = requiredLength - currentLength;
        if (difference > 0) {
            StringBuilder paddedBuf = new StringBuilder(requiredLength);
            paddedBuf.append(stringVal);
            paddedBuf.append(EMPTY_SPACE, 0, difference);
            return paddedBuf.toString();
        }
        return stringVal;
    }

    public static int safeIntParse(String intAsString) {
        try {
            return Integer.parseInt(intAsString);
        }
        catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public static boolean isStrictlyNumeric(CharSequence cs) {
        if (cs == null || cs.length() == 0) {
            return false;
        }
        for (int i = 0; i < cs.length(); ++i) {
            if (Character.isDigit(cs.charAt(i))) continue;
            return false;
        }
        return true;
    }

    public static String safeTrim(String toTrim) {
        return StringUtils.isNullOrEmpty(toTrim) ? toTrim : toTrim.trim();
    }

    public static String stringArrayToString(String[] elems, String prefix, String midDelimiter, String lastDelimiter, String suffix) {
        StringBuilder valuesString = new StringBuilder();
        if (elems.length > 1) {
            valuesString.append(Arrays.stream(elems).limit(elems.length - 1).collect(Collectors.joining(midDelimiter, prefix, lastDelimiter)));
        } else {
            valuesString.append(prefix);
        }
        valuesString.append(elems[elems.length - 1]).append(suffix);
        return valuesString.toString();
    }

    public static boolean hasWildcards(String src) {
        return StringUtils.indexOfIgnoreCase(0, src, "%") > -1 || StringUtils.indexOfIgnoreCase(0, src, "_") > -1;
    }

    public static String getUniqueSavepointId() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "_");
    }

    public static String joinWithSerialComma(List<?> elements) {
        if (elements == null || elements.size() == 0) {
            return "";
        }
        if (elements.size() == 1) {
            return elements.get(0).toString();
        }
        if (elements.size() == 2) {
            return elements.get(0) + " and " + elements.get(1);
        }
        return elements.subList(0, elements.size() - 1).stream().map(Object::toString).collect(Collectors.joining(", ", "", ", and ")) + elements.get(elements.size() - 1).toString();
    }

    public static byte[] unquoteBytes(byte[] bytes) {
        if (bytes[0] == 39 && bytes[bytes.length - 1] == 39) {
            byte[] valNoQuotes = new byte[bytes.length - 2];
            int j = 0;
            int quoteCnt = 0;
            for (int i = 1; i < bytes.length - 1; ++i) {
                quoteCnt = bytes[i] == 39 ? ++quoteCnt : 0;
                if (quoteCnt == 2) {
                    quoteCnt = 0;
                    continue;
                }
                valNoQuotes[j++] = bytes[i];
            }
            byte[] res = new byte[j];
            System.arraycopy(valNoQuotes, 0, res, 0, j);
            return res;
        }
        return bytes;
    }

    public static byte[] quoteBytes(byte[] bytes) {
        byte[] withQuotes = new byte[bytes.length * 2 + 2];
        int j = 0;
        withQuotes[j++] = 39;
        for (int i = 0; i < bytes.length; ++i) {
            if (bytes[i] == 39) {
                withQuotes[j++] = 39;
            }
            withQuotes[j++] = bytes[i];
        }
        withQuotes[j++] = 39;
        byte[] res = new byte[j];
        System.arraycopy(withQuotes, 0, res, 0, j);
        return res;
    }

    static {
        for (int i = 0; i < EMPTY_SPACE.length; ++i) {
            StringUtils.EMPTY_SPACE[i] = 32;
        }
    }
}
