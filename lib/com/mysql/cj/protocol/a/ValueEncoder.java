/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.protocol.a;

import com.mysql.cj.Messages;
import com.mysql.cj.exceptions.ExceptionFactory;
import com.mysql.cj.exceptions.WrongArgumentException;
import com.mysql.cj.protocol.InternalDate;
import com.mysql.cj.protocol.InternalTime;
import com.mysql.cj.protocol.InternalTimestamp;
import com.mysql.cj.protocol.a.NativeConstants;
import com.mysql.cj.protocol.a.NativePacketPayload;
import com.mysql.cj.util.StringUtils;
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
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class ValueEncoder {
    private NativePacketPayload packet;
    private String characterEncoding;
    private TimeZone timezone;

    public ValueEncoder(NativePacketPayload packet, String characterEncoding, TimeZone timezone) {
        this.packet = packet;
        this.characterEncoding = characterEncoding;
        this.timezone = timezone;
    }

    public void encodeValue(Object value, int fieldType) {
        if (value == null) {
            return;
        }
        switch (fieldType) {
            case 1: {
                this.encodeInt1(this.asByte(value));
                return;
            }
            case 2: {
                this.encodeInt2(this.asShort(value));
                return;
            }
            case 3: 
            case 4: {
                this.encodeInt4(this.asInteger(value));
                return;
            }
            case 5: 
            case 8: {
                this.encodeInt8(this.asLong(value));
                return;
            }
            case 10: {
                this.encodeDate(this.asInternalDate(value));
                return;
            }
            case 11: {
                this.encodeTime(this.asInternalTime(value));
                return;
            }
            case 12: {
                this.encodeDateTime(this.asInternalTimestampNoTz(value));
                return;
            }
            case 7: {
                this.encodeTimeStamp(this.asInternalTimestampTz(value));
                return;
            }
            case 254: {
                this.encodeString(this.asString(value));
                return;
            }
        }
    }

    public void encodeInt1(Byte value) {
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, value.longValue());
    }

    public void encodeInt2(Short value) {
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT2, value.longValue());
    }

    public void encodeInt4(Integer value) {
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT4, value.longValue());
    }

    public void encodeInt8(Long value) {
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT8, value);
    }

    public void encodeDate(InternalDate date) {
        this.packet.ensureCapacity(5);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, 4L);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT2, date.getYear());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, date.getMonth());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, date.getDay());
    }

    public void encodeTime(InternalTime time) {
        boolean hasFractionalSeconds = time.getNanos() > 0;
        this.packet.ensureCapacity((hasFractionalSeconds ? 12 : 8) + 1);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, hasFractionalSeconds ? 12L : 8L);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, time.isNegative() ? 1L : 0L);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT4, time.getHours() / 24);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, time.getHours() % 24);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, time.getMinutes());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, time.getSeconds());
        if (hasFractionalSeconds) {
            this.packet.writeInteger(NativeConstants.IntegerDataType.INT4, TimeUnit.NANOSECONDS.toMicros(time.getNanos()));
        }
    }

    public void encodeDateTime(InternalTimestamp timestamp) {
        boolean hasFractionalSeconds = timestamp.getNanos() > 0;
        this.packet.ensureCapacity((hasFractionalSeconds ? 11 : 7) + 1);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, hasFractionalSeconds ? 11L : 7L);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT2, timestamp.getYear());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getMonth());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getDay());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getHours());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getMinutes());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getSeconds());
        if (hasFractionalSeconds) {
            this.packet.writeInteger(NativeConstants.IntegerDataType.INT4, TimeUnit.NANOSECONDS.toMicros(timestamp.getNanos()));
        }
    }

    public void encodeTimeStamp(InternalTimestamp timestamp) {
        this.packet.ensureCapacity(14);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, 13L);
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT2, timestamp.getYear());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getMonth());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getDay());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getHours());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getMinutes());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT1, timestamp.getSeconds());
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT4, TimeUnit.NANOSECONDS.toMicros(timestamp.getNanos()));
        this.packet.writeInteger(NativeConstants.IntegerDataType.INT2, timestamp.getOffset());
    }

    public void encodeString(String value) {
        this.packet.writeBytes(NativeConstants.StringSelfDataType.STRING_LENENC, StringUtils.getBytes(value, this.characterEncoding));
    }

    private Byte asByte(Object value) {
        if (Boolean.class.isInstance(value)) {
            return (Boolean)value != false ? new Byte(1) : new Byte(0);
        }
        if (Byte.class.isInstance(value)) {
            return (Byte)value;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongTinyIntValueType", new Object[]{value.getClass()}));
    }

    private Short asShort(Object value) {
        if (Short.class.isInstance(value)) {
            return (Short)value;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongSmallIntValueType", new Object[]{value.getClass()}));
    }

    private Integer asInteger(Object value) {
        if (Integer.class.isInstance(value)) {
            return (Integer)value;
        }
        if (Float.class.isInstance(value)) {
            return Float.floatToIntBits(((Float)value).floatValue());
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongIntValueType", new Object[]{value.getClass()}));
    }

    private Long asLong(Object value) {
        if (Long.class.isInstance(value)) {
            return (Long)value;
        }
        if (Double.class.isInstance(value)) {
            return Double.doubleToLongBits((Double)value);
        }
        if (BigInteger.class.isInstance(value)) {
            return ((BigInteger)value).longValue();
        }
        if (BigDecimal.class.isInstance(value)) {
            return Double.doubleToLongBits(((BigDecimal)value).doubleValue());
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongBigIntValueType", new Object[]{value.getClass()}));
    }

    private InternalDate asInternalDate(Object value) {
        if (LocalDate.class.isInstance(value)) {
            LocalDate localDate = (LocalDate)value;
            InternalDate internalDate = new InternalDate();
            internalDate.setYear(localDate.getYear());
            internalDate.setMonth(localDate.getMonthValue());
            internalDate.setDay(localDate.getDayOfMonth());
            return internalDate;
        }
        if (Date.class.isInstance(value)) {
            Calendar calendar = Calendar.getInstance(this.timezone);
            calendar.setTime((Date)value);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            InternalDate internalDate = new InternalDate();
            internalDate.setYear(calendar.get(1));
            internalDate.setMonth(calendar.get(2) + 1);
            internalDate.setDay(calendar.get(5));
            return internalDate;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongDateValueType", new Object[]{value.getClass()}));
    }

    private InternalTime asInternalTime(Object value) {
        if (LocalTime.class.isInstance(value)) {
            LocalTime localTime = (LocalTime)value;
            InternalTime internalTime = new InternalTime();
            internalTime.setHours(localTime.getHour());
            internalTime.setMinutes(localTime.getMinute());
            internalTime.setSeconds(localTime.getSecond());
            internalTime.setNanos(localTime.getNano());
            return internalTime;
        }
        if (OffsetTime.class.isInstance(value)) {
            OffsetTime offsetTime = (OffsetTime)value;
            InternalTime internalTime = new InternalTime();
            internalTime.setHours(offsetTime.getHour());
            internalTime.setMinutes(offsetTime.getMinute());
            internalTime.setSeconds(offsetTime.getSecond());
            internalTime.setNanos(offsetTime.getNano());
            return internalTime;
        }
        if (Duration.class.isInstance(value)) {
            Duration duration = (Duration)value;
            Duration durationAbs = duration.abs();
            long fullSeconds = durationAbs.getSeconds();
            int seconds = (int)(fullSeconds % 60L);
            long fullMinutes = fullSeconds / 60L;
            int minutes = (int)(fullMinutes % 60L);
            long fullHours = fullMinutes / 60L;
            InternalTime internalTime = new InternalTime();
            internalTime.setNegative(duration.isNegative());
            internalTime.setHours((int)fullHours);
            internalTime.setMinutes(minutes);
            internalTime.setSeconds(seconds);
            internalTime.setNanos(durationAbs.getNano());
            return internalTime;
        }
        if (Time.class.isInstance(value)) {
            Time time = (Time)value;
            Calendar calendar = Calendar.getInstance(this.timezone);
            calendar.setTime(time);
            InternalTime internalTime = new InternalTime();
            internalTime.setHours(calendar.get(11));
            internalTime.setMinutes(calendar.get(12));
            internalTime.setSeconds(calendar.get(13));
            internalTime.setNanos((int)TimeUnit.MILLISECONDS.toNanos(calendar.get(14)));
            return internalTime;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongTimeValueType", new Object[]{value.getClass()}));
    }

    private InternalTimestamp asInternalTimestampNoTz(Object value) {
        if (LocalDateTime.class.isInstance(value)) {
            LocalDateTime localDateTime = (LocalDateTime)value;
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(localDateTime.getYear());
            internalTimestamp.setMonth(localDateTime.getMonthValue());
            internalTimestamp.setDay(localDateTime.getDayOfMonth());
            internalTimestamp.setHours(localDateTime.getHour());
            internalTimestamp.setMinutes(localDateTime.getMinute());
            internalTimestamp.setSeconds(localDateTime.getSecond());
            internalTimestamp.setNanos(localDateTime.getNano());
            return internalTimestamp;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongDatetimeValueType", new Object[]{value.getClass()}));
    }

    private InternalTimestamp asInternalTimestampTz(Object value) {
        if (Instant.class.isInstance(value)) {
            Instant instant = (Instant)value;
            OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.UTC);
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(offsetDateTime.getYear());
            internalTimestamp.setMonth(offsetDateTime.getMonthValue());
            internalTimestamp.setDay(offsetDateTime.getDayOfMonth());
            internalTimestamp.setHours(offsetDateTime.getHour());
            internalTimestamp.setMinutes(offsetDateTime.getMinute());
            internalTimestamp.setSeconds(offsetDateTime.getSecond());
            internalTimestamp.setNanos(offsetDateTime.getNano());
            internalTimestamp.setOffset(0);
            return internalTimestamp;
        }
        if (OffsetDateTime.class.isInstance(value)) {
            OffsetDateTime offsetDateTime = (OffsetDateTime)value;
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(offsetDateTime.getYear());
            internalTimestamp.setMonth(offsetDateTime.getMonthValue());
            internalTimestamp.setDay(offsetDateTime.getDayOfMonth());
            internalTimestamp.setHours(offsetDateTime.getHour());
            internalTimestamp.setMinutes(offsetDateTime.getMinute());
            internalTimestamp.setSeconds(offsetDateTime.getSecond());
            internalTimestamp.setNanos(offsetDateTime.getNano());
            internalTimestamp.setOffset((int)TimeUnit.SECONDS.toMinutes(offsetDateTime.getOffset().getTotalSeconds()));
            return internalTimestamp;
        }
        if (ZonedDateTime.class.isInstance(value)) {
            ZonedDateTime zonedDateTime = (ZonedDateTime)value;
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(zonedDateTime.getYear());
            internalTimestamp.setMonth(zonedDateTime.getMonthValue());
            internalTimestamp.setDay(zonedDateTime.getDayOfMonth());
            internalTimestamp.setHours(zonedDateTime.getHour());
            internalTimestamp.setMinutes(zonedDateTime.getMinute());
            internalTimestamp.setSeconds(zonedDateTime.getSecond());
            internalTimestamp.setNanos(zonedDateTime.getNano());
            internalTimestamp.setOffset((int)TimeUnit.SECONDS.toMinutes(zonedDateTime.getOffset().getTotalSeconds()));
            return internalTimestamp;
        }
        if (Calendar.class.isInstance(value)) {
            Calendar calendar = (Calendar)value;
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(calendar.get(1));
            internalTimestamp.setMonth(calendar.get(2) + 1);
            internalTimestamp.setDay(calendar.get(5));
            internalTimestamp.setHours(calendar.get(11));
            internalTimestamp.setMinutes(calendar.get(12));
            internalTimestamp.setSeconds(calendar.get(13));
            internalTimestamp.setNanos((int)TimeUnit.MILLISECONDS.toNanos(calendar.get(14)));
            internalTimestamp.setOffset((int)TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeZone().getOffset(calendar.getTimeInMillis())));
            return internalTimestamp;
        }
        if (Timestamp.class.isInstance(value)) {
            Timestamp timestamp = (Timestamp)value;
            Calendar calendar = Calendar.getInstance(this.timezone);
            calendar.setTime(timestamp);
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(calendar.get(1));
            internalTimestamp.setMonth(calendar.get(2) + 1);
            internalTimestamp.setDay(calendar.get(5));
            internalTimestamp.setHours(calendar.get(11));
            internalTimestamp.setMinutes(calendar.get(12));
            internalTimestamp.setSeconds(calendar.get(13));
            internalTimestamp.setNanos(timestamp.getNanos());
            internalTimestamp.setOffset((int)TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeZone().getOffset(calendar.getTimeInMillis())));
            return internalTimestamp;
        }
        if (java.util.Date.class.isInstance(value)) {
            java.util.Date date = (java.util.Date)value;
            Calendar calendar = Calendar.getInstance(this.timezone);
            calendar.setTime(date);
            InternalTimestamp internalTimestamp = new InternalTimestamp();
            internalTimestamp.setYear(calendar.get(1));
            internalTimestamp.setMonth(calendar.get(2) + 1);
            internalTimestamp.setDay(calendar.get(5));
            internalTimestamp.setHours(calendar.get(11));
            internalTimestamp.setMinutes(calendar.get(12));
            internalTimestamp.setSeconds(calendar.get(13));
            internalTimestamp.setNanos((int)TimeUnit.MILLISECONDS.toNanos(calendar.get(14)));
            internalTimestamp.setOffset((int)TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeZone().getOffset(date.getTime())));
            return internalTimestamp;
        }
        throw ExceptionFactory.createException(WrongArgumentException.class, Messages.getString("ValueEncoder.WrongTimestampValueType", new Object[]{value.getClass()}));
    }

    private String asString(Object value) {
        if (String.class.isInstance(value)) {
            return (String)value;
        }
        return value.toString();
    }
}
