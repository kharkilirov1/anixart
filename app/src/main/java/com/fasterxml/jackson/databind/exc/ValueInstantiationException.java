package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* loaded from: classes.dex */
public class ValueInstantiationException extends JsonMappingException {
    public final JavaType _type;

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        super(jsonParser, str, th);
        this._type = javaType;
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new ValueInstantiationException(jsonParser, str, javaType);
    }

    public JavaType getType() {
        return this._type;
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        return new ValueInstantiationException(jsonParser, str, javaType, th);
    }

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
    }
}
