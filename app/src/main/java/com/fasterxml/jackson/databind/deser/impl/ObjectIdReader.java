package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObjectIdReader implements Serializable {
    private static final long serialVersionUID = 1;
    public final JsonDeserializer<Object> _deserializer;
    public final JavaType _idType;
    public final ObjectIdGenerator<?> generator;
    public final SettableBeanProperty idProperty;
    public final PropertyName propertyName;
    public final ObjectIdResolver resolver;

    public ObjectIdReader(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, JsonDeserializer<?> jsonDeserializer, SettableBeanProperty settableBeanProperty, ObjectIdResolver objectIdResolver) {
        this._idType = javaType;
        this.propertyName = propertyName;
        this.generator = objectIdGenerator;
        this.resolver = objectIdResolver;
        this._deserializer = jsonDeserializer;
        this.idProperty = settableBeanProperty;
    }

    public static ObjectIdReader construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, JsonDeserializer<?> jsonDeserializer, SettableBeanProperty settableBeanProperty, ObjectIdResolver objectIdResolver) {
        return new ObjectIdReader(javaType, propertyName, objectIdGenerator, jsonDeserializer, settableBeanProperty, objectIdResolver);
    }

    public JsonDeserializer<Object> getDeserializer() {
        return this._deserializer;
    }

    public JavaType getIdType() {
        return this._idType;
    }

    public boolean isValidReferencePropertyName(String str, JsonParser jsonParser) {
        return this.generator.isValidReferencePropertyName(str, jsonParser);
    }

    public boolean maySerializeAsObject() {
        return this.generator.maySerializeAsObject();
    }

    public Object readObjectReference(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._deserializer.deserialize(jsonParser, deserializationContext);
    }
}
