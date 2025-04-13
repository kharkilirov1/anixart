package com.fasterxml.jackson.databind.ser;

import androidx.room.util.C0576a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    private static final long serialVersionUID = 1;
    public transient JsonGenerator _generator;
    public transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    public transient Map<Object, WritableObjectId> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        private static final long serialVersionUID = 1;

        public Impl() {
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public DefaultSerializerProvider copy() {
            return Impl.class != Impl.class ? super.copy() : new Impl(this);
        }

        public Impl(Impl impl) {
            super(impl);
        }

        @Override // com.fasterxml.jackson.databind.ser.DefaultSerializerProvider
        public Impl createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            return new Impl(this, serializationConfig, serializerFactory);
        }

        public Impl(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            super(serializerProvider, serializationConfig, serializerFactory);
        }
    }

    public DefaultSerializerProvider() {
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer, PropertyName propertyName) throws IOException {
        try {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(propertyName.simpleAsEncoded(this._config));
            jsonSerializer.serialize(obj, jsonGenerator, this);
            jsonGenerator.writeEndObject();
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    private IOException _wrapAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String exceptionMessage = ClassUtil.exceptionMessage(exc);
        if (exceptionMessage == null) {
            StringBuilder m24u = C0000a.m24u("[no message for ");
            m24u.append(exc.getClass().getName());
            m24u.append("]");
            exceptionMessage = m24u.toString();
        }
        return new JsonMappingException(jsonGenerator, exceptionMessage, exc);
    }

    public Map<Object, WritableObjectId> _createObjectIdMap() {
        return isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    public void _serializeNull(JsonGenerator jsonGenerator) throws IOException {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) throws JsonMappingException {
        if (javaType == null) {
            throw new IllegalArgumentException("A class must be provided");
        }
        jsonFormatVisitorWrapper.setProvider(this);
        findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
    }

    public int cachedSerializersCount() {
        return this._serializerCache.size();
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory);

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        Map<Object, WritableObjectId> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            WritableObjectId writableObjectId = map.get(obj);
            if (writableObjectId != null) {
                return writableObjectId;
            }
        }
        ObjectIdGenerator<?> objectIdGenerator2 = null;
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
            int i2 = 0;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                ObjectIdGenerator<?> objectIdGenerator3 = this._objectIdGenerators.get(i2);
                if (objectIdGenerator3.canUseFor(objectIdGenerator)) {
                    objectIdGenerator2 = objectIdGenerator3;
                    break;
                }
                i2++;
            }
        } else {
            this._objectIdGenerators = new ArrayList<>(8);
        }
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGenerator2);
        }
        WritableObjectId writableObjectId2 = new WritableObjectId(objectIdGenerator2);
        this._seenObjectIds.put(obj, writableObjectId2);
        return writableObjectId2;
    }

    public void flushCachedSerializers() {
        this._serializerCache.flush();
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) throws JsonMappingException {
        JsonFormatVisitable findValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        JsonNode schema = findValueSerializer instanceof SchemaAware ? ((SchemaAware) findValueSerializer).getSchema(this, null) : JsonSchema.getDefaultSchemaNode();
        if (schema instanceof ObjectNode) {
            return new JsonSchema((ObjectNode) schema);
        }
        throw new IllegalArgumentException(C0576a.m4116o(cls, C0000a.m24u("Class "), " would not be serialized as a JSON object and therefore has no schema"));
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            return _findExplicitUntypedSerializer(cls) != null;
        } catch (JsonMappingException e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
            }
            return false;
        } catch (RuntimeException e3) {
            if (atomicReference == null) {
                throw e3;
            }
            atomicReference.set(e3);
            return false;
        }
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) {
        if (cls == null) {
            return null;
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        Object includeFilterInstance = handlerInstantiator != null ? handlerInstantiator.includeFilterInstance(this._config, beanPropertyDefinition, cls) : null;
        return includeFilterInstance == null ? ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : includeFilterInstance;
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public boolean includeFilterSuppressNulls(Object obj) throws JsonMappingException {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Throwable th) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), th.getClass().getName(), ClassUtil.exceptionMessage(th)), th);
            return false;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) throws IOException {
        boolean z;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = (javaType == null || !javaType.isContainerType()) ? findValueSerializer(obj.getClass(), (BeanProperty) null) : findValueSerializer(javaType, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            z = false;
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(fullRootName.getSimpleName());
            z = true;
        }
        try {
            jsonSerializer.serializeWithType(obj, jsonGenerator, this, typeSerializer);
            if (z) {
                jsonGenerator.writeEndObject();
            }
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> findTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, findTypedValueSerializer);
    }

    @Override // com.fasterxml.jackson.databind.SerializerProvider
    public JsonSerializer<Object> serializerInstance(Annotated annotated, Object obj) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JsonSerializer) {
            jsonSerializer = (JsonSerializer) obj;
        } else {
            if (!(obj instanceof Class)) {
                JavaType type = annotated.getType();
                StringBuilder m24u = C0000a.m24u("AnnotationIntrospector returned serializer definition of type ");
                m24u.append(obj.getClass().getName());
                m24u.append("; expected type JsonSerializer or Class<JsonSerializer> instead");
                reportBadDefinition(type, m24u.toString());
            }
            Class<?> cls = (Class) obj;
            if (cls == JsonSerializer.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (!JsonSerializer.class.isAssignableFrom(cls)) {
                JavaType type2 = annotated.getType();
                StringBuilder m24u2 = C0000a.m24u("AnnotationIntrospector returned Class ");
                m24u2.append(cls.getName());
                m24u2.append("; expected Class<JsonSerializer>");
                reportBadDefinition(type2, m24u2.toString());
            }
            HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
            JsonSerializer<?> serializerInstance = handlerInstantiator != null ? handlerInstantiator.serializerInstance(this._config, annotated, cls) : null;
            jsonSerializer = serializerInstance == null ? (JsonSerializer) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : serializerInstance;
        }
        return _handleResolvable(jsonSerializer);
    }

    public DefaultSerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        super(serializerProvider, serializationConfig, serializerFactory);
    }

    public DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer) throws IOException {
        try {
            jsonSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) throws IOException {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        JsonSerializer<Object> findTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, findTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws IOException {
        PropertyName findRootName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    findRootName = this._config.findRootName(obj.getClass());
                } else {
                    findRootName = this._config.findRootName(javaType);
                }
                _serialize(jsonGenerator, obj, jsonSerializer, findRootName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, jsonSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, jsonSerializer);
    }
}
