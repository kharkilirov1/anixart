package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class TypeDeserializerBase extends TypeDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    public final JavaType _baseType;
    public final JavaType _defaultImpl;
    public JsonDeserializer<Object> _defaultImplDeserializer;
    public final Map<String, JsonDeserializer<Object>> _deserializers;
    public final TypeIdResolver _idResolver;
    public final BeanProperty _property;
    public final boolean _typeIdVisible;
    public final String _typePropertyName;

    public TypeDeserializerBase(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        this._baseType = javaType;
        this._idResolver = typeIdResolver;
        this._typePropertyName = ClassUtil.nonNullString(str);
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = javaType2;
        this._property = null;
    }

    @Deprecated
    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeWithNativeTypeId(jsonParser, deserializationContext, jsonParser.getTypeId());
    }

    public final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer;
        JavaType javaType = this._defaultImpl;
        if (javaType == null) {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return NullifyingDeserializer.instance;
        }
        if (ClassUtil.isBogusClass(javaType.getRawClass())) {
            return NullifyingDeserializer.instance;
        }
        synchronized (this._defaultImpl) {
            if (this._defaultImplDeserializer == null) {
                this._defaultImplDeserializer = deserializationContext.findContextualValueDeserializer(this._defaultImpl, this._property);
            }
            jsonDeserializer = this._defaultImplDeserializer;
        }
        return jsonDeserializer;
    }

    public final JsonDeserializer<Object> _findDeserializer(DeserializationContext deserializationContext, String str) throws IOException {
        JsonDeserializer<Object> findContextualValueDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._deserializers.get(str);
        if (jsonDeserializer == null) {
            JavaType typeFromId = this._idResolver.typeFromId(deserializationContext, str);
            if (typeFromId == null) {
                jsonDeserializer = _findDefaultImplDeserializer(deserializationContext);
                if (jsonDeserializer == null) {
                    JavaType _handleUnknownTypeId = _handleUnknownTypeId(deserializationContext, str);
                    if (_handleUnknownTypeId == null) {
                        return NullifyingDeserializer.instance;
                    }
                    findContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(_handleUnknownTypeId, this._property);
                }
                this._deserializers.put(str, jsonDeserializer);
            } else {
                JavaType javaType = this._baseType;
                if (javaType != null && javaType.getClass() == typeFromId.getClass() && !typeFromId.hasGenericTypes()) {
                    typeFromId = deserializationContext.getTypeFactory().constructSpecializedType(this._baseType, typeFromId.getRawClass());
                }
                findContextualValueDeserializer = deserializationContext.findContextualValueDeserializer(typeFromId, this._property);
            }
            jsonDeserializer = findContextualValueDeserializer;
            this._deserializers.put(str, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    public JavaType _handleMissingTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingTypeId(this._baseType, this._idResolver, str);
    }

    public JavaType _handleUnknownTypeId(DeserializationContext deserializationContext, String str) throws IOException {
        String descForKnownTypeIds = this._idResolver.getDescForKnownTypeIds();
        String m14k = descForKnownTypeIds == null ? "type ids are not statically known" : C0000a.m14k("known type ids = ", descForKnownTypeIds);
        BeanProperty beanProperty = this._property;
        if (beanProperty != null) {
            m14k = String.format("%s (for POJO property '%s')", m14k, beanProperty.getName());
        }
        return deserializationContext.handleUnknownTypeId(this._baseType, str, this._idResolver, m14k);
    }

    public JavaType baseType() {
        return this._baseType;
    }

    public String baseTypeName() {
        return this._baseType.getRawClass().getName();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public abstract TypeDeserializer forProperty(BeanProperty beanProperty);

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Class<?> getDefaultImpl() {
        return ClassUtil.rawClass(this._defaultImpl);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public final String getPropertyName() {
        return this._typePropertyName;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeIdResolver getTypeIdResolver() {
        return this._idResolver;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public abstract JsonTypeInfo.EnumC0834As getTypeInclusion();

    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('[');
        m2872a.append(getClass().getName());
        m2872a.append("; base-type:");
        m2872a.append(this._baseType);
        m2872a.append("; id-resolver: ");
        m2872a.append(this._idResolver);
        m2872a.append(']');
        return m2872a.toString();
    }

    public Object _deserializeWithNativeTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonDeserializer<Object> _findDeserializer;
        if (obj == null) {
            _findDeserializer = _findDefaultImplDeserializer(deserializationContext);
            if (_findDeserializer == null) {
                return deserializationContext.reportInputMismatch(baseType(), "No (native) type id found when one was expected for polymorphic type handling", new Object[0]);
            }
        } else {
            _findDeserializer = _findDeserializer(deserializationContext, obj instanceof String ? (String) obj : String.valueOf(obj));
        }
        return _findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public TypeDeserializerBase(TypeDeserializerBase typeDeserializerBase, BeanProperty beanProperty) {
        this._baseType = typeDeserializerBase._baseType;
        this._idResolver = typeDeserializerBase._idResolver;
        this._typePropertyName = typeDeserializerBase._typePropertyName;
        this._typeIdVisible = typeDeserializerBase._typeIdVisible;
        this._deserializers = typeDeserializerBase._deserializers;
        this._defaultImpl = typeDeserializerBase._defaultImpl;
        this._defaultImplDeserializer = typeDeserializerBase._defaultImplDeserializer;
        this._property = beanProperty;
    }
}
