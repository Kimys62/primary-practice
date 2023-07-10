/*
 * Decompiled with CFR 0.152.
 */
package com.mysql.cj.xdevapi;

import com.mysql.cj.xdevapi.CreateIndexParams;
import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonLiteral;
import com.mysql.cj.xdevapi.JsonNumber;
import com.mysql.cj.xdevapi.JsonString;
import com.mysql.cj.xdevapi.JsonValue;
import com.mysql.cj.xdevapi.XDevAPIError;

public static class CreateIndexParams.IndexField {
    private static final String FIELD = "field";
    private static final String TYPE = "type";
    private static final String REQUIRED = "required";
    private static final String OPTIONS = "options";
    private static final String SRID = "srid";
    private static final String ARRAY = "array";
    private String field;
    private String type;
    private Boolean required = Boolean.FALSE;
    private Integer options = null;
    private Integer srid = null;
    private Boolean array;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CreateIndexParams.IndexField(DbDoc indexField) {
        for (String key : indexField.keySet()) {
            if (TYPE.equals(key) || FIELD.equals(key) || REQUIRED.equals(key) || OPTIONS.equals(key) || SRID.equals(key) || ARRAY.equals(key)) continue;
            throw new XDevAPIError("The '" + key + "' field is not allowed in indexField.");
        }
        JsonValue val = (JsonValue)indexField.get(FIELD);
        if (val == null) throw new XDevAPIError("Index field definition has no document path.");
        if (!(val instanceof JsonString)) {
            throw new XDevAPIError("Index field 'field' member must be a string.");
        }
        this.field = ((JsonString)val).getString();
        val = (JsonValue)indexField.get(TYPE);
        if (val == null) throw new XDevAPIError("Index field definition has no field type.");
        if (!(val instanceof JsonString)) {
            throw new XDevAPIError("Index type must be a string.");
        }
        this.type = ((JsonString)val).getString();
        val = (JsonValue)indexField.get(REQUIRED);
        if (val != null) {
            if (!(val instanceof JsonLiteral) || JsonLiteral.NULL.equals(val)) throw new XDevAPIError("Index field 'required' member must be boolean.");
            this.required = Boolean.valueOf(((JsonLiteral)val).value);
        } else if (CreateIndexParams.GEOJSON.equalsIgnoreCase(this.type)) {
            this.required = Boolean.TRUE;
        }
        val = (JsonValue)indexField.get(OPTIONS);
        if (val != null) {
            if (!CreateIndexParams.GEOJSON.equalsIgnoreCase(this.type)) throw new XDevAPIError("Index field 'options' member should not be used for field types other than GEOJSON.");
            if (!(val instanceof JsonNumber)) throw new XDevAPIError("Index field 'options' member must be integer.");
            this.options = ((JsonNumber)val).getInteger();
        }
        if ((val = (JsonValue)indexField.get(SRID)) != null) {
            if (!CreateIndexParams.GEOJSON.equalsIgnoreCase(this.type)) throw new XDevAPIError("Index field 'srid' member should not be used for field types other than GEOJSON.");
            if (!(val instanceof JsonNumber)) throw new XDevAPIError("Index field 'srid' member must be integer.");
            this.srid = ((JsonNumber)val).getInteger();
        }
        if ((val = (JsonValue)indexField.get(ARRAY)) == null) return;
        if (!(val instanceof JsonLiteral) || JsonLiteral.NULL.equals(val)) throw new XDevAPIError("Index field 'array' member must be boolean.");
        this.array = Boolean.valueOf(((JsonLiteral)val).value);
    }

    public String getField() {
        return this.field;
    }

    public String getType() {
        return this.type;
    }

    public Boolean isRequired() {
        return this.required;
    }

    public Integer getOptions() {
        return this.options;
    }

    public Integer getSrid() {
        return this.srid;
    }

    public Boolean isArray() {
        return this.array;
    }
}
