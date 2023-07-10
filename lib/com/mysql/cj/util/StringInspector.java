/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.util;

import com.mysql.cj.Messages;
import com.mysql.cj.util.SearchMode;
import com.mysql.cj.util.StringUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class StringInspector {
    private static final int NON_COMMENTS_MYSQL_VERSION_REF_LENGTH = 5;
    private String source = null;
    private String openingMarkers = null;
    private String closingMarkers = null;
    private String overridingMarkers = null;
    private Set<SearchMode> defaultSearchMode = null;
    private int srcLen = 0;
    private int pos = 0;
    private int stopAt = 0;
    private boolean escaped = false;
    private boolean inMysqlBlock = false;

    public StringInspector(String source, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        this(source, 0, openingMarkers, closingMarkers, overridingMarkers, searchMode);
    }

    public StringInspector(String source, int startingPosition, String openingMarkers, String closingMarkers, String overridingMarkers, Set<SearchMode> searchMode) {
        if (source == null) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.1"));
        }
        this.source = source;
        this.openingMarkers = openingMarkers;
        this.closingMarkers = closingMarkers;
        this.overridingMarkers = overridingMarkers;
        this.defaultSearchMode = searchMode;
        if (this.defaultSearchMode.contains((Object)SearchMode.SKIP_BETWEEN_MARKERS)) {
            if (this.openingMarkers == null || this.closingMarkers == null || this.openingMarkers.length() != this.closingMarkers.length()) {
                throw new IllegalArgumentException(Messages.getString("StringInspector.2", new String[]{this.openingMarkers, this.closingMarkers}));
            }
            if (this.overridingMarkers == null) {
                throw new IllegalArgumentException(Messages.getString("StringInspector.3", new String[]{this.overridingMarkers, this.openingMarkers}));
            }
            for (char c : this.overridingMarkers.toCharArray()) {
                if (this.openingMarkers.indexOf(c) != -1) continue;
                throw new IllegalArgumentException(Messages.getString("StringInspector.3", new String[]{this.overridingMarkers, this.openingMarkers}));
            }
        }
        this.srcLen = source.length();
        this.pos = 0;
        this.stopAt = this.srcLen;
        this.setStartPosition(startingPosition);
    }

    public int setStartPosition(int pos) {
        if (pos < 0) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.4"));
        }
        if (pos > this.stopAt) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.5"));
        }
        int prevPos = this.pos;
        this.pos = pos;
        this.resetEscaped();
        this.inMysqlBlock = false;
        return prevPos;
    }

    public int setStopPosition(int pos) {
        if (pos < 0) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.6"));
        }
        if (pos > this.srcLen) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.7"));
        }
        int prevPos = this.stopAt;
        this.stopAt = pos;
        return prevPos;
    }

    public void reset() {
        this.pos = 0;
        this.stopAt = this.srcLen;
        this.escaped = false;
        this.inMysqlBlock = false;
    }

    public char getChar() {
        if (this.pos >= this.stopAt) {
            return '\u0000';
        }
        return this.source.charAt(this.pos);
    }

    public int getPosition() {
        return this.pos;
    }

    public int incrementPosition() {
        return this.incrementPosition(this.defaultSearchMode);
    }

    public int incrementPosition(Set<SearchMode> searchMode) {
        if (this.pos >= this.stopAt) {
            return -1;
        }
        if (searchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE) && this.getChar() == '\\') {
            this.escaped = !this.escaped;
        } else if (this.escaped) {
            this.escaped = false;
        }
        return ++this.pos;
    }

    public int incrementPosition(int by) {
        return this.incrementPosition(by, this.defaultSearchMode);
    }

    public int incrementPosition(int by, Set<SearchMode> searchMode) {
        for (int i = 0; i < by; ++i) {
            if (this.incrementPosition(searchMode) != -1) continue;
            return -1;
        }
        return this.pos;
    }

    private void resetEscaped() {
        this.escaped = false;
        if (this.defaultSearchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE)) {
            for (int i = this.pos - 1; i >= 0 && this.source.charAt(i) == '\\'; --i) {
                this.escaped = !this.escaped;
            }
        }
    }

    public int indexOfNextChar() {
        return this.indexOfNextChar(this.defaultSearchMode);
    }

    private int indexOfNextChar(Set<SearchMode> searchMode) {
        char c2;
        if (this.source == null) {
            return -1;
        }
        if (this.pos >= this.stopAt) {
            return -1;
        }
        char c0 = '\u0000';
        char c1 = this.source.charAt(this.pos);
        char c = c2 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
        while (this.pos < this.stopAt) {
            boolean checkSkipConditions;
            c0 = c1;
            c1 = c2;
            c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
            boolean dashDashCommentImmediateEnd = false;
            boolean bl = checkSkipConditions = !searchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE) || !this.escaped;
            if (checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_BETWEEN_MARKERS) && this.openingMarkers.indexOf(c0) != -1) {
                this.indexOfClosingMarker(searchMode);
                if (this.pos >= this.stopAt) {
                    --this.pos;
                } else {
                    c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                    c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
                }
            } else if (checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_BLOCK_COMMENTS) && c0 == '/' && c1 == '*' && c2 != '!' && c2 != '+') {
                ++this.pos;
                while (++this.pos < this.stopAt && (this.source.charAt(this.pos) != '*' || (this.pos + 1 < this.srcLen ? (int)this.source.charAt(this.pos + 1) : 0) != 47)) {
                }
                this.pos = this.pos >= this.stopAt ? --this.pos : ++this.pos;
                c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
            } else if (checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_LINE_COMMENTS) && (c0 == '-' && c1 == '-' && (Character.isWhitespace(c2) || (dashDashCommentImmediateEnd = c2 == ';') || c2 == '\u0000') || c0 == '#')) {
                if (dashDashCommentImmediateEnd) {
                    ++this.pos;
                    ++this.pos;
                    c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                    c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
                } else {
                    while (++this.pos < this.stopAt && (c0 = this.source.charAt(this.pos)) != '\n' && c0 != '\r') {
                    }
                    if (this.pos >= this.stopAt) {
                        --this.pos;
                    } else {
                        char c3 = c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                        if (c0 == '\r' && c1 == '\n') {
                            ++this.pos;
                            c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                        }
                        c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
                    }
                }
            } else if (checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_HINT_BLOCKS) && c0 == '/' && c1 == '*' && c2 == '+') {
                ++this.pos;
                ++this.pos;
                while (++this.pos < this.stopAt && (this.source.charAt(this.pos) != '*' || (this.pos + 1 < this.srcLen ? (int)this.source.charAt(this.pos + 1) : 0) != 47)) {
                }
                this.pos = this.pos >= this.stopAt ? --this.pos : ++this.pos;
                c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
            } else if (checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_MYSQL_MARKERS) && c0 == '/' && c1 == '*' && c2 == '!') {
                ++this.pos;
                ++this.pos;
                if (c2 == '!') {
                    int i;
                    for (i = 0; i < 5 && this.pos + 1 + i < this.srcLen && Character.isDigit(this.source.charAt(this.pos + 1 + i)); ++i) {
                    }
                    if (i == 5) {
                        this.pos += 5;
                        if (this.pos >= this.stopAt) {
                            this.pos = this.stopAt - 1;
                        }
                    }
                }
                c1 = this.pos + 1 < this.srcLen ? this.source.charAt(this.pos + 1) : (char)'\u0000';
                c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
                this.inMysqlBlock = true;
            } else if (this.inMysqlBlock && checkSkipConditions && searchMode.contains((Object)SearchMode.SKIP_MYSQL_MARKERS) && c0 == '*' && c1 == '/') {
                ++this.pos;
                c1 = c2;
                c2 = this.pos + 2 < this.srcLen ? this.source.charAt(this.pos + 2) : (char)'\u0000';
                this.inMysqlBlock = false;
            } else if (!searchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE) || !Character.isWhitespace(c0)) {
                return this.pos;
            }
            this.escaped = false;
            ++this.pos;
        }
        return -1;
    }

    private int indexOfClosingMarker(Set<SearchMode> searchMode) {
        boolean outerIsAnOverridingMarker;
        if (this.source == null) {
            return -1;
        }
        if (this.pos >= this.stopAt) {
            return -1;
        }
        char c0 = this.source.charAt(this.pos);
        int markerIndex = this.openingMarkers.indexOf(c0);
        if (markerIndex == -1) {
            return this.pos;
        }
        int nestedMarkersCount = 0;
        char openingMarker = c0;
        char closingMarker = this.closingMarkers.charAt(markerIndex);
        boolean bl = outerIsAnOverridingMarker = this.overridingMarkers.indexOf(openingMarker) != -1;
        while (++this.pos < this.stopAt && ((c0 = this.source.charAt(this.pos)) != closingMarker || nestedMarkersCount != 0)) {
            if (!outerIsAnOverridingMarker && this.overridingMarkers.indexOf(c0) != -1) {
                int overridingMarkerIndex = this.openingMarkers.indexOf(c0);
                int overridingNestedMarkersCount = 0;
                char overridingOpeningMarker = c0;
                char overridingClosingMarker = this.closingMarkers.charAt(overridingMarkerIndex);
                while (++this.pos < this.stopAt && ((c0 = this.source.charAt(this.pos)) != overridingClosingMarker || overridingNestedMarkersCount != 0)) {
                    if (c0 == overridingOpeningMarker) {
                        ++overridingNestedMarkersCount;
                        continue;
                    }
                    if (c0 == overridingClosingMarker) {
                        --overridingNestedMarkersCount;
                        continue;
                    }
                    if (!searchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE) || c0 != '\\') continue;
                    ++this.pos;
                }
                if (this.pos < this.stopAt) continue;
                --this.pos;
                continue;
            }
            if (c0 == openingMarker) {
                ++nestedMarkersCount;
                continue;
            }
            if (c0 == closingMarker) {
                --nestedMarkersCount;
                continue;
            }
            if (!searchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE) || c0 != '\\') continue;
            ++this.pos;
        }
        return this.pos;
    }

    public int indexOfNextAlphanumericChar() {
        if (this.source == null) {
            return -1;
        }
        if (this.pos >= this.stopAt) {
            return -1;
        }
        Set<SearchMode> searchMode = this.defaultSearchMode;
        if (!this.defaultSearchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE)) {
            searchMode = EnumSet.copyOf(this.defaultSearchMode);
            searchMode.add(SearchMode.SKIP_WHITE_SPACE);
        }
        while (this.pos < this.stopAt) {
            int prevPos = this.pos;
            if (this.indexOfNextChar(searchMode) == -1) {
                return -1;
            }
            if (Character.isLetterOrDigit(this.source.charAt(this.pos))) {
                return this.pos;
            }
            if (this.pos != prevPos) continue;
            this.incrementPosition(searchMode);
        }
        return -1;
    }

    public int indexOfNextNonWsChar() {
        if (this.source == null) {
            return -1;
        }
        if (this.pos >= this.stopAt) {
            return -1;
        }
        Set<SearchMode> searchMode = this.defaultSearchMode;
        if (!this.defaultSearchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE)) {
            searchMode = EnumSet.copyOf(this.defaultSearchMode);
            searchMode.add(SearchMode.SKIP_WHITE_SPACE);
        }
        return this.indexOfNextChar(searchMode);
    }

    public int indexOfNextWsChar() {
        if (this.source == null) {
            return -1;
        }
        if (this.pos >= this.stopAt) {
            return -1;
        }
        Set<SearchMode> searchMode = this.defaultSearchMode;
        if (this.defaultSearchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE)) {
            searchMode = EnumSet.copyOf(this.defaultSearchMode);
            searchMode.remove((Object)SearchMode.SKIP_WHITE_SPACE);
        }
        while (this.pos < this.stopAt) {
            int prevPos = this.pos;
            if (this.indexOfNextChar(searchMode) == -1) {
                return -1;
            }
            if (Character.isWhitespace(this.source.charAt(this.pos))) {
                return this.pos;
            }
            if (this.pos != prevPos) continue;
            this.incrementPosition(searchMode);
        }
        return -1;
    }

    public int indexOfIgnoreCase(String searchFor) {
        return this.indexOfIgnoreCase(searchFor, this.defaultSearchMode);
    }

    public int indexOfIgnoreCase(String searchFor, Set<SearchMode> searchMode) {
        if (searchFor == null) {
            return -1;
        }
        int searchForLength = searchFor.length();
        int localStopAt = this.srcLen - searchForLength + 1;
        if (localStopAt > this.stopAt) {
            localStopAt = this.stopAt;
        }
        if (this.pos >= localStopAt || searchForLength == 0) {
            return -1;
        }
        char firstCharOfSearchForUc = Character.toUpperCase(searchFor.charAt(0));
        char firstCharOfSearchForLc = Character.toLowerCase(searchFor.charAt(0));
        Set<SearchMode> localSearchMode = searchMode;
        if (Character.isWhitespace(firstCharOfSearchForLc) && this.defaultSearchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE)) {
            localSearchMode = EnumSet.copyOf(this.defaultSearchMode);
            localSearchMode.remove((Object)SearchMode.SKIP_WHITE_SPACE);
        }
        while (this.pos < localStopAt) {
            if (this.indexOfNextChar(localSearchMode) == -1) {
                return -1;
            }
            if (StringUtils.isCharEqualIgnoreCase(this.getChar(), firstCharOfSearchForUc, firstCharOfSearchForLc) && StringUtils.regionMatchesIgnoreCase(this.source, this.pos, searchFor)) {
                return this.pos;
            }
            this.incrementPosition(localSearchMode);
        }
        return -1;
    }

    public int indexOfIgnoreCase(String ... searchFor) {
        if (searchFor == null) {
            return -1;
        }
        int searchForLength = 0;
        for (String searchForPart : searchFor) {
            searchForLength += searchForPart.length();
        }
        if (searchForLength == 0) {
            return -1;
        }
        int searchForWordsCount = searchFor.length;
        int localStopAt = this.srcLen - (searchForLength += searchForWordsCount > 0 ? searchForWordsCount - 1 : 0) + 1;
        if (localStopAt > this.stopAt) {
            localStopAt = this.stopAt;
        }
        if (this.pos >= localStopAt) {
            return -1;
        }
        Set<SearchMode> searchMode1 = this.defaultSearchMode;
        if (Character.isWhitespace(searchFor[0].charAt(0)) && this.defaultSearchMode.contains((Object)SearchMode.SKIP_WHITE_SPACE)) {
            searchMode1 = EnumSet.copyOf(this.defaultSearchMode);
            searchMode1.remove((Object)SearchMode.SKIP_WHITE_SPACE);
        }
        EnumSet<SearchMode> searchMode2 = EnumSet.copyOf(this.defaultSearchMode);
        searchMode2.add(SearchMode.SKIP_WHITE_SPACE);
        searchMode2.remove((Object)SearchMode.SKIP_BETWEEN_MARKERS);
        while (this.pos < localStopAt) {
            int positionOfFirstWord = this.indexOfIgnoreCase(searchFor[0], searchMode1);
            if (positionOfFirstWord == -1 || positionOfFirstWord >= localStopAt) {
                return -1;
            }
            int startingPositionForNextWord = this.incrementPosition(searchFor[0].length(), searchMode2);
            int wc = 0;
            boolean match = true;
            while (++wc < searchForWordsCount && match) {
                if (this.indexOfNextChar(searchMode2) == -1 || startingPositionForNextWord == this.pos || !StringUtils.regionMatchesIgnoreCase(this.source, this.pos, searchFor[wc])) {
                    match = false;
                    continue;
                }
                startingPositionForNextWord = this.incrementPosition(searchFor[wc].length(), searchMode2);
            }
            if (!match) continue;
            this.setStartPosition(positionOfFirstWord);
            return positionOfFirstWord;
        }
        return -1;
    }

    public String stripCommentsAndHints() {
        this.reset();
        EnumSet<SearchMode> searchMode = EnumSet.of(SearchMode.SKIP_BLOCK_COMMENTS, SearchMode.SKIP_LINE_COMMENTS, SearchMode.SKIP_HINT_BLOCKS);
        if (this.defaultSearchMode.contains((Object)SearchMode.ALLOW_BACKSLASH_ESCAPE)) {
            searchMode.add(SearchMode.ALLOW_BACKSLASH_ESCAPE);
        }
        StringBuilder noCommsStr = new StringBuilder(this.source.length());
        while (this.pos < this.stopAt) {
            int prevPos = this.pos;
            if (this.indexOfNextChar(searchMode) == -1) {
                return noCommsStr.toString();
            }
            if (!this.escaped && this.openingMarkers.indexOf(this.getChar()) != -1) {
                int idxOpMrkr = this.pos;
                if (this.indexOfClosingMarker(searchMode) < this.srcLen) {
                    this.incrementPosition(searchMode);
                }
                noCommsStr.append(this.source, idxOpMrkr, this.pos);
                continue;
            }
            if (this.pos - prevPos > 1 && prevPos > 0 && !Character.isWhitespace(this.source.charAt(prevPos - 1)) && !Character.isWhitespace(this.source.charAt(this.pos))) {
                noCommsStr.append(" ");
            }
            noCommsStr.append(this.getChar());
            this.incrementPosition(searchMode);
        }
        return noCommsStr.toString();
    }

    public List<String> split(String delimiter, boolean trim) {
        if (delimiter == null) {
            throw new IllegalArgumentException(Messages.getString("StringInspector.8"));
        }
        this.reset();
        int startPos = 0;
        ArrayList<String> splitParts = new ArrayList<String>();
        while (this.indexOfIgnoreCase(delimiter) != -1) {
            this.indexOfIgnoreCase(delimiter);
            String part = this.source.substring(startPos, this.pos);
            if (trim) {
                part = part.trim();
            }
            splitParts.add(part);
            startPos = this.incrementPosition(delimiter.length());
        }
        String token = this.source.substring(startPos);
        if (trim) {
            token = token.trim();
        }
        splitParts.add(token);
        return splitParts;
    }
}
