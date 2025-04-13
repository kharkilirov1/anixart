package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class StdDelegatingSerializer extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer {
    public final Converter<Object, ?> _converter;
    public final JsonSerializer<Object> _delegateSerializer;
    public final JavaType _delegateType;

    public StdDelegatingSerializer(Converter<?, ?> converter) {
        super(Object.class);
        this._converter = converter;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public JsonSerializer<Object> _findSerializer(Object obj, SerializerProvider serializerProvider) throws JsonMappingException {
        return serializerProvider.findValueSerializer(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        if (jsonSerializer != null) {
            jsonSerializer.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
        }
    }

    public Object convertValue(Object obj) {
        return this._converter.convert(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer = this._delegateSerializer;
        JavaType javaType = this._delegateType;
        if (jsonSerializer == null) {
            if (javaType == null) {
                javaType = this._converter.getOutputType(serializerProvider.getTypeFactory());
            }
            if (!javaType.isJavaLangObject()) {
                jsonSerializer = serializerProvider.findValueSerializer(javaType);
            }
        }
        if (jsonSerializer instanceof ContextualSerializer) {
            jsonSerializer = serializerProvider.handleSecondaryContextualization(jsonSerializer, beanProperty);
        }
        return (jsonSerializer == this._delegateSerializer && javaType == this._delegateType) ? this : withDelegate(this._converter, javaType, jsonSerializer);
    }

    public Converter<Object, ?> getConverter() {
        return this._converter;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<?> getDelegatee() {
        return this._delegateSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) throws JsonMappingException {
        JsonFormatVisitable jsonFormatVisitable = this._delegateSerializer;
        return jsonFormatVisitable instanceof SchemaAware ? ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, type) : super.getSchema(serializerProvider, type);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object convertValue = convertValue(obj);
        if (convertValue == null) {
            return true;
        }
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        return jsonSerializer == null ? obj == null : jsonSerializer.isEmpty(serializerProvider, convertValue);
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) throws JsonMappingException {
        JsonFormatVisitable jsonFormatVisitable = this._delegateSerializer;
        if (jsonFormatVisitable == null || !(jsonFormatVisitable instanceof ResolvableSerializer)) {
            return;
        }
        ((ResolvableSerializer) jsonFormatVisitable).resolve(serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object convertValue = convertValue(obj);
        if (convertValue == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findSerializer(convertValue, serializerProvider);
        }
        jsonSerializer.serialize(convertValue, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object convertValue = convertValue(obj);
        JsonSerializer<Object> jsonSerializer = this._delegateSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findSerializer(obj, serializerProvider);
        }
        jsonSerializer.serializeWithType(convertValue, jsonGenerator, serializerProvider, typeSerializer);
    }

    public StdDelegatingSerializer withDelegate(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        ClassUtil.verifyMustOverride(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(converter, javaType, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) throws JsonMappingException {
        JsonFormatVisitable jsonFormatVisitable = this._delegateSerializer;
        if (jsonFormatVisitable instanceof SchemaAware) {
            return ((SchemaAware) jsonFormatVisitable).getSchema(serializerProvider, type, z);
        }
        return super.getSchema(serializerProvider, type);
    }

    public <T> StdDelegatingSerializer(Class<T> cls, Converter<T, ?> converter) {
        super(cls, false);
        this._converter = converter;
        this._delegateType = null;
        this._delegateSerializer = null;
    }

    public StdDelegatingSerializer(Converter<Object, ?> converter, JavaType javaType, JsonSerializer<?> jsonSerializer) {
        super(javaType);
        this._converter = converter;
        this._delegateType = javaType;
        this._delegateSerializer = jsonSerializer;
    }
}
