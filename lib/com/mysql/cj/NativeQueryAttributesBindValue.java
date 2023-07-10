/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj;

import com.mysql.cj.QueryAttributesBindValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NativeQueryAttributesBindValue
implements QueryAttributesBindValue {
    private static final Map<Class<?>, Integer> JAVA_TO_MYSQL_FIELD_TYPE = new HashMap();
    private String name;
    public Object value;
    protected int type = 6;

    protected NativeQueryAttributesBindValue(String name, Object value) {
        this.name = name;
        this.value = value;
        this.type = this.getMysqlFieldType(value);
    }

    private int getMysqlFieldType(Object obj) {
        if (obj == null) {
            return 6;
        }
        Integer mysqlFieldType = JAVA_TO_MYSQL_FIELD_TYPE.get(obj.getClass());
        if (mysqlFieldType != null) {
            return mysqlFieldType;
        }
        Optional<Integer> mysqlType = JAVA_TO_MYSQL_FIELD_TYPE.entrySet().stream().filter(m -> ((Class)m.getKey()).isAssignableFrom(obj.getClass())).map(m -> (Integer)m.getValue()).findFirst();
        if (mysqlType.isPresent()) {
            return mysqlType.get();
        }
        return 254;
    }

    @Override
    public boolean isNull() {
        return this.type == 6;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public long getBoundLength() {
        if (this.isNull()) {
            return 0L;
        }
        switch (this.type) {
            case 1: {
                return 1L;
            }
            case 2: {
                return 2L;
            }
            case 3: {
                return 4L;
            }
            case 8: {
                return 8L;
            }
            case 4: {
                return 4L;
            }
            case 5: {
                return 8L;
            }
            case 10: {
                return 5L;
            }
            case 11: {
                return 13L;
            }
            case 12: {
                return 12L;
            }
            case 7: {
                return 14L;
            }
            case 254: {
                return this.value.toString().length() + 9;
            }
        }
        return 0L;
    }

    static {
        JAVA_TO_MYSQL_FIELD_TYPE.put(String.class, 254);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Boolean.class, 1);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Byte.class, 1);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Short.class, 2);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Integer.class, 3);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Long.class, 8);
        JAVA_TO_MYSQL_FIELD_TYPE.put(BigInteger.class, 8);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Float.class, 4);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Double.class, 5);
        JAVA_TO_MYSQL_FIELD_TYPE.put(BigDecimal.class, 5);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Date.class, 10);
        JAVA_TO_MYSQL_FIELD_TYPE.put(LocalDate.class, 10);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Time.class, 11);
        JAVA_TO_MYSQL_FIELD_TYPE.put(LocalTime.class, 11);
        JAVA_TO_MYSQL_FIELD_TYPE.put(OffsetTime.class, 11);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Duration.class, 11);
        JAVA_TO_MYSQL_FIELD_TYPE.put(LocalDateTime.class, 12);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Timestamp.class, 7);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Instant.class, 7);
        JAVA_TO_MYSQL_FIELD_TYPE.put(OffsetDateTime.class, 7);
        JAVA_TO_MYSQL_FIELD_TYPE.put(ZonedDateTime.class, 7);
        JAVA_TO_MYSQL_FIELD_TYPE.put(java.util.Date.class, 7);
        JAVA_TO_MYSQL_FIELD_TYPE.put(Calendar.class, 7);
    }
}
