package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ReferenceTypeDeserializer<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private static final long serialVersionUID = 2;
    public final JavaType _fullType;
    public final JsonDeserializer<Object> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final TypeDeserializer _valueTypeDeserializer;

    public ReferenceTypeDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(javaType);
        this._valueInstantiator = valueInstantiator;
        this._fullType = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        JsonDeserializer<?> findContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(this._fullType.getReferencedType(), beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, this._fullType.getReferencedType());
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return (findContextualValueDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) ? this : withResolved(typeDeserializer, findContextualValueDeserializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            return (T) deserialize(jsonParser, deserializationContext, valueInstantiator.createUsingDefault(deserializationContext));
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        return (T) referenceValue(typeDeserializer == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            return getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
        return typeDeserializer2 == null ? deserialize(jsonParser, deserializationContext) : referenceValue(typeDeserializer2.deserializeTypedFromAny(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public abstract T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    public abstract Object getReferenced(T t);

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._fullType;
    }

    public abstract T referenceValue(Object obj);

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer == null) {
            return null;
        }
        return jsonDeserializer.supportsUpdate(deserializationConfig);
    }

    public abstract T updateReference(T t, Object obj);

    public abstract ReferenceTypeDeserializer<T> withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer);

    @Deprecated
    public ReferenceTypeDeserializer(JavaType javaType, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        this(javaType, null, typeDeserializer, jsonDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        Object deserializeWithType;
        Object deserializeWithType2;
        if (!this._valueDeserializer.supportsUpdate(deserializationContext.getConfig()).equals(Boolean.FALSE) && this._valueTypeDeserializer == null) {
            Object referenced = getReferenced(t);
            if (referenced == null) {
                TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                if (typeDeserializer == null) {
                    deserializeWithType2 = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                } else {
                    deserializeWithType2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                }
                return referenceValue(deserializeWithType2);
            }
            deserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext, referenced);
        } else {
            TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
            if (typeDeserializer2 == null) {
                deserializeWithType = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
            } else {
                deserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer2);
            }
        }
        return updateReference(t, deserializeWithType);
    }
}
