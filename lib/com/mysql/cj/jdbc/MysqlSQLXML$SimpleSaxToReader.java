/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import java.io.Reader;
import java.io.StringReader;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MysqlSQLXML.SimpleSaxToReader
extends DefaultHandler {
    StringBuilder buf = new StringBuilder();
    private boolean inCDATA = false;

    MysqlSQLXML.SimpleSaxToReader() {
    }

    @Override
    public void startDocument() throws SAXException {
        this.buf.append("<?xml version='1.0' encoding='UTF-8'?>");
    }

    @Override
    public void endDocument() throws SAXException {
    }

    @Override
    public void startElement(String namespaceURI, String sName, String qName, Attributes attrs) throws SAXException {
        this.buf.append("<");
        this.buf.append(qName);
        if (attrs != null) {
            for (int i = 0; i < attrs.getLength(); ++i) {
                this.buf.append(" ");
                this.buf.append(attrs.getQName(i)).append("=\"");
                this.escapeCharsForXml(attrs.getValue(i), true);
                this.buf.append("\"");
            }
        }
        this.buf.append(">");
    }

    @Override
    public void characters(char[] buffer, int offset, int len) throws SAXException {
        if (!this.inCDATA) {
            this.escapeCharsForXml(buffer, offset, len, false);
        } else {
            this.buf.append(buffer, offset, len);
        }
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        this.characters(ch, start, length);
    }

    public void startCDATA() throws SAXException {
        this.buf.append("<![CDATA[");
        this.inCDATA = true;
    }

    public void endCDATA() throws SAXException {
        this.inCDATA = false;
        this.buf.append("]]>");
    }

    public void comment(char[] ch, int start, int length) throws SAXException {
        this.buf.append("<!--");
        for (int i = 0; i < length; ++i) {
            this.buf.append(ch[start + i]);
        }
        this.buf.append("-->");
    }

    Reader toReader() {
        return new StringReader(this.buf.toString());
    }

    private void escapeCharsForXml(String str, boolean isAttributeData) {
        if (str == null) {
            return;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; ++i) {
            this.escapeCharsForXml(str.charAt(i), isAttributeData);
        }
    }

    private void escapeCharsForXml(char[] buffer, int offset, int len, boolean isAttributeData) {
        if (buffer == null) {
            return;
        }
        for (int i = 0; i < len; ++i) {
            this.escapeCharsForXml(buffer[offset + i], isAttributeData);
        }
    }

    private void escapeCharsForXml(char c, boolean isAttributeData) {
        switch (c) {
            case '<': {
                this.buf.append("&lt;");
                break;
            }
            case '>': {
                this.buf.append("&gt;");
                break;
            }
            case '&': {
                this.buf.append("&amp;");
                break;
            }
            case '\"': {
                if (!isAttributeData) {
                    this.buf.append("\"");
                    break;
                }
                this.buf.append("&quot;");
                break;
            }
            case '\r': {
                this.buf.append("&#xD;");
                break;
            }
            default: {
                if (c >= '\u0001' && c <= '\u001f' && c != '\t' && c != '\n' || c >= '\u007f' && c <= '\u009f' || c == '\u2028' || isAttributeData && (c == '\t' || c == '\n')) {
                    this.buf.append("&#x");
                    this.buf.append(Integer.toHexString(c).toUpperCase());
                    this.buf.append(";");
                    break;
                }
                this.buf.append(c);
            }
        }
    }
}
