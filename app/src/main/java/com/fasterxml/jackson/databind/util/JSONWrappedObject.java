package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: classes.dex */
public class JSONWrappedObject implements JsonSerializable {
    public final String _prefix;
    public final JavaType _serializationType;
    public final String _suffix;
    public final Object _value;

    public JSONWrappedObject(String str, String str2, Object obj) {
        this(str, str2, obj, null);
    }

    public String getPrefix() {
        return this._prefix;
    }

    public JavaType getSerializationType() {
        return this._serializationType;
    }

    public String getSuffix() {
        return this._suffix;
    }

    public Object getValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        String str = this._prefix;
        if (str != null) {
            jsonGenerator.writeRaw(str);
        }
        Object obj = this._value;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            JavaType javaType = this._serializationType;
            if (javaType != null) {
                serializerProvider.findTypedValueSerializer(javaType, true, (BeanProperty) null).serialize(this._value, jsonGenerator, serializerProvider);
            } else {
                serializerProvider.findTypedValueSerializer(obj.getClass(), true, (BeanProperty) null).serialize(this._value, jsonGenerator, serializerProvider);
            }
        }
        String str2 = this._suffix;
        if (str2 != null) {
            jsonGenerator.writeRaw(str2);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException, JsonProcessingException {
        serialize(jsonGenerator, serializerProvider);
    }

    public JSONWrappedObject(String str, String str2, Object obj, JavaType javaType) {
        this._prefix = str;
        this._suffix = str2;
        this._value = obj;
        this._serializationType = javaType;
    }
}
