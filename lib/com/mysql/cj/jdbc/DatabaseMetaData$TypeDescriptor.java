/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.jdbc;

import com.mysql.cj.Messages;
import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.exceptions.SQLError;
import com.mysql.cj.util.StringUtils;
import java.sql.SQLException;
import java.util.StringTokenizer;

class DatabaseMetaData.TypeDescriptor {
    int bufferLength;
    Integer datetimePrecision = null;
    Integer columnSize = null;
    Integer charOctetLength = null;
    Integer decimalDigits = null;
    String isNullable;
    int nullability;
    int numPrecRadix = 10;
    String mysqlTypeName;
    MysqlType mysqlType;

    DatabaseMetaData.TypeDescriptor(String typeInfo, String nullabilityInfo) throws SQLException {
        if (typeInfo == null) {
            throw SQLError.createSQLException(Messages.getString("DatabaseMetaData.0"), "S1009", DatabaseMetaData.this.getExceptionInterceptor());
        }
        this.mysqlType = MysqlType.getByName(typeInfo);
        int maxLength = 0;
        switch (this.mysqlType) {
            case ENUM: {
                String temp = typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.lastIndexOf(")"));
                StringTokenizer tokenizer = new StringTokenizer(temp, ",");
                while (tokenizer.hasMoreTokens()) {
                    String nextToken = tokenizer.nextToken();
                    maxLength = Math.max(maxLength, nextToken.length() - 2);
                }
                this.columnSize = maxLength;
                break;
            }
            case SET: {
                String temp = typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.lastIndexOf(")"));
                StringTokenizer tokenizer = new StringTokenizer(temp, ",");
                int numElements = tokenizer.countTokens();
                if (numElements > 0) {
                    maxLength += numElements - 1;
                }
                while (tokenizer.hasMoreTokens()) {
                    String setMember = tokenizer.nextToken().trim();
                    if (setMember.startsWith("'") && setMember.endsWith("'")) {
                        maxLength += setMember.length() - 2;
                        continue;
                    }
                    maxLength += setMember.length();
                }
                this.columnSize = maxLength;
                break;
            }
            case FLOAT: 
            case FLOAT_UNSIGNED: {
                if (typeInfo.indexOf(",") != -1) {
                    this.columnSize = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.indexOf(",")).trim());
                    this.decimalDigits = Integer.valueOf(typeInfo.substring(typeInfo.indexOf(",") + 1, typeInfo.indexOf(")")).trim());
                    break;
                }
                if (typeInfo.indexOf("(") != -1) {
                    int size = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.indexOf(")")).trim());
                    if (size <= 23) break;
                    this.mysqlType = this.mysqlType == MysqlType.FLOAT ? MysqlType.DOUBLE : MysqlType.DOUBLE_UNSIGNED;
                    this.columnSize = 22;
                    this.decimalDigits = 0;
                    break;
                }
                this.columnSize = 12;
                this.decimalDigits = 0;
                break;
            }
            case DECIMAL: 
            case DECIMAL_UNSIGNED: 
            case DOUBLE: 
            case DOUBLE_UNSIGNED: {
                if (typeInfo.indexOf(",") != -1) {
                    this.columnSize = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.indexOf(",")).trim());
                    this.decimalDigits = Integer.valueOf(typeInfo.substring(typeInfo.indexOf(",") + 1, typeInfo.indexOf(")")).trim());
                    break;
                }
                switch (this.mysqlType) {
                    case DECIMAL: 
                    case DECIMAL_UNSIGNED: {
                        this.columnSize = 65;
                        break;
                    }
                    case DOUBLE: 
                    case DOUBLE_UNSIGNED: {
                        this.columnSize = 22;
                        break;
                    }
                }
                this.decimalDigits = 0;
                break;
            }
            case CHAR: 
            case VARCHAR: 
            case TINYTEXT: 
            case MEDIUMTEXT: 
            case LONGTEXT: 
            case JSON: 
            case TEXT: 
            case TINYBLOB: 
            case MEDIUMBLOB: 
            case LONGBLOB: 
            case BLOB: 
            case BINARY: 
            case VARBINARY: 
            case BIT: {
                if (this.mysqlType == MysqlType.CHAR) {
                    this.columnSize = 1;
                }
                if (typeInfo.indexOf("(") == -1) break;
                int endParenIndex = typeInfo.indexOf(")");
                if (endParenIndex == -1) {
                    endParenIndex = typeInfo.length();
                }
                this.columnSize = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, endParenIndex).trim());
                if (!DatabaseMetaData.this.tinyInt1isBit || this.columnSize != 1 || !StringUtils.startsWithIgnoreCase(typeInfo, "tinyint")) break;
                if (DatabaseMetaData.this.transformedBitIsBoolean) {
                    this.mysqlType = MysqlType.BOOLEAN;
                    break;
                }
                this.mysqlType = MysqlType.BIT;
                break;
            }
            case TINYINT: {
                if (DatabaseMetaData.this.tinyInt1isBit && typeInfo.indexOf("(1)") != -1) {
                    if (DatabaseMetaData.this.transformedBitIsBoolean) {
                        this.mysqlType = MysqlType.BOOLEAN;
                        break;
                    }
                    this.mysqlType = MysqlType.BIT;
                    break;
                }
                this.columnSize = 3;
                break;
            }
            case TINYINT_UNSIGNED: {
                this.columnSize = 3;
                break;
            }
            case DATE: {
                this.datetimePrecision = 0;
                this.columnSize = 10;
                break;
            }
            case TIME: {
                int fract;
                this.datetimePrecision = 0;
                this.columnSize = 8;
                if (typeInfo.indexOf("(") == -1 || (fract = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.indexOf(")")).trim()).intValue()) <= 0) break;
                this.datetimePrecision = fract;
                DatabaseMetaData.TypeDescriptor typeDescriptor = this;
                typeDescriptor.columnSize = typeDescriptor.columnSize + (fract + 1);
                break;
            }
            case DATETIME: 
            case TIMESTAMP: {
                int fract;
                this.datetimePrecision = 0;
                this.columnSize = 19;
                if (typeInfo.indexOf("(") == -1 || (fract = Integer.valueOf(typeInfo.substring(typeInfo.indexOf("(") + 1, typeInfo.indexOf(")")).trim()).intValue()) <= 0) break;
                this.datetimePrecision = fract;
                DatabaseMetaData.TypeDescriptor typeDescriptor = this;
                typeDescriptor.columnSize = typeDescriptor.columnSize + (fract + 1);
                break;
            }
        }
        if (this.columnSize == null) {
            this.columnSize = this.mysqlType.getPrecision() > Integer.MAX_VALUE ? Integer.MAX_VALUE : this.mysqlType.getPrecision().intValue();
        }
        switch (this.mysqlType) {
            case CHAR: 
            case VARCHAR: 
            case TINYTEXT: 
            case MEDIUMTEXT: 
            case LONGTEXT: 
            case JSON: 
            case TEXT: 
            case TINYBLOB: 
            case MEDIUMBLOB: 
            case LONGBLOB: 
            case BLOB: 
            case BINARY: 
            case VARBINARY: 
            case BIT: {
                this.charOctetLength = this.columnSize;
                break;
            }
        }
        this.bufferLength = maxBufferSize;
        this.numPrecRadix = 10;
        if (nullabilityInfo != null) {
            if (nullabilityInfo.equals("YES")) {
                this.nullability = 1;
                this.isNullable = "YES";
            } else if (nullabilityInfo.equals("UNKNOWN")) {
                this.nullability = 2;
                this.isNullable = "";
            } else {
                this.nullability = 0;
                this.isNullable = "NO";
            }
        } else {
            this.nullability = 0;
            this.isNullable = "NO";
        }
    }
}
