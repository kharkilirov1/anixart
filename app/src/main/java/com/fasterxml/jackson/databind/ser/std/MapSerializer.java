package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonMapFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@JacksonStdImpl
/* loaded from: classes.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    private static final long serialVersionUID = 1;
    public PropertySerializerMap _dynamicValueSerializers;
    public final Object _filterId;
    public final Set<String> _ignoredEntries;
    public JsonSerializer<Object> _keySerializer;
    public final JavaType _keyType;
    public final BeanProperty _property;
    public final boolean _sortKeys;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer<Object> _valueSerializer;
    public final JavaType _valueType;
    public final boolean _valueTypeIsStatic;
    public final TypeSerializer _valueTypeSerializer;
    public static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$1 */
    public static /* synthetic */ class C08761 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MapSerializer(Set<String> set, JavaType javaType, JavaType javaType2, boolean z, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
        return serializerFor != null ? serializerFor : this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer construct(java.util.Set<java.lang.String> r9, com.fasterxml.jackson.databind.JavaType r10, boolean r11, com.fasterxml.jackson.databind.jsontype.TypeSerializer r12, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r13, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r14, java.lang.Object r15) {
        /*
            if (r10 != 0) goto L7
            com.fasterxml.jackson.databind.JavaType r10 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE
            r3 = r10
            r4 = r3
            goto L11
        L7:
            com.fasterxml.jackson.databind.JavaType r0 = r10.getKeyType()
            com.fasterxml.jackson.databind.JavaType r10 = r10.getContentType()
            r4 = r10
            r3 = r0
        L11:
            r10 = 0
            if (r11 != 0) goto L21
            if (r4 == 0) goto L1f
            boolean r11 = r4.isFinal()
            if (r11 == 0) goto L1f
            r10 = 1
            r11 = 1
            goto L2b
        L1f:
            r11 = 0
            goto L2b
        L21:
            java.lang.Class r0 = r4.getRawClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto L2b
            r5 = 0
            goto L2c
        L2b:
            r5 = r11
        L2c:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r1 = r10
            r2 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r15 == 0) goto L3c
            com.fasterxml.jackson.databind.ser.std.MapSerializer r10 = r10.withFilterId(r15)
        L3c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    public void _ensureOverride(String str) {
        ClassUtil.verifyMustOverride(MapSerializer.class, this, str);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, serializerProvider, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> findNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findSerializer(serializerProvider, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (jsonSerializer.isEmpty(serializerProvider, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            jsonSerializer = serializerProvider.getDefaultNullValueSerializer();
        }
        try {
            findNullKeySerializer.serialize(null, jsonGenerator, serializerProvider);
            jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
        } catch (Exception e2) {
            wrapAndThrow(serializerProvider, e2, obj, "");
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws JsonMappingException {
        JsonMapFormatVisitor expectMapFormat = jsonFormatVisitorWrapper.expectMapFormat(javaType);
        if (expectMapFormat != null) {
            expectMapFormat.keyFormat(this._keySerializer, this._keyType);
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findAndAddDynamic(this._dynamicValueSerializers, this._valueType, jsonFormatVisitorWrapper.getProvider());
            }
            expectMapFormat.valueFormat(jsonSerializer, this._valueType);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        if (r0 != 5) goto L88;
     */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r13, com.fasterxml.jackson.databind.BeanProperty r14) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JsonSerializer<?> getContentSerializer() {
        return this._valueSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public JavaType getContentType() {
        return this._valueType;
    }

    public JsonSerializer<?> getKeySerializer() {
        return this._keySerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("object", true);
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, serializerProvider, null);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        try {
            Object obj2 = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    obj2 = entry.getKey();
                    if (obj2 == null) {
                        serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                    } else if (set == null || !set.contains(obj2)) {
                        jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
                    }
                    if (value == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializer2 = this._valueSerializer;
                        if (jsonSerializer2 == null) {
                            jsonSerializer2 = _findSerializer(serializerProvider, value);
                        }
                        jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
                    }
                } catch (Exception e2) {
                    e = e2;
                    obj = obj2;
                    wrapAndThrow(serializerProvider, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        JsonSerializer<Object> jsonSerializer2 = this._keySerializer;
        Set<String> set = this._ignoredEntries;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
                Object value = entry.getValue();
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e2) {
                        wrapAndThrow(serializerProvider, e2, map, String.valueOf(key));
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public void serializeFilteredAnyProperties(SerializerProvider serializerProvider, JsonGenerator jsonGenerator, Object obj, Map<?, ?> map, PropertyFilter propertyFilter, Object obj2) throws IOException {
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj2;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                JsonSerializer<Object> findNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(serializerProvider, value);
                    }
                    if (z) {
                        if (defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                        }
                    } else if (obj2 != null && obj2.equals(value)) {
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                }
                mapProperty.reset(key, value, findNullKeySerializer, defaultNullValueSerializer);
                try {
                    propertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, mapProperty);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, map, String.valueOf(key));
                }
            }
        }
    }

    public void serializeFilteredFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyFilter propertyFilter, Object obj) throws IOException {
        JsonSerializer<Object> defaultNullValueSerializer;
        Set<String> set = this._ignoredEntries;
        MapProperty mapProperty = new MapProperty(this._valueTypeSerializer, this._property);
        boolean z = MARKER_FOR_EMPTY == obj;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set == null || !set.contains(key)) {
                JsonSerializer<Object> findNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
                Object value = entry.getValue();
                if (value != null) {
                    defaultNullValueSerializer = this._valueSerializer;
                    if (defaultNullValueSerializer == null) {
                        defaultNullValueSerializer = _findSerializer(serializerProvider, value);
                    }
                    if (z) {
                        if (defaultNullValueSerializer.isEmpty(serializerProvider, value)) {
                        }
                    } else if (obj != null && obj.equals(value)) {
                    }
                } else if (!this._suppressNulls) {
                    defaultNullValueSerializer = serializerProvider.getDefaultNullValueSerializer();
                }
                mapProperty.reset(key, value, findNullKeySerializer, defaultNullValueSerializer);
                try {
                    propertyFilter.serializeAsField(map, jsonGenerator, serializerProvider, mapProperty);
                } catch (Exception e2) {
                    wrapAndThrow(serializerProvider, e2, map, String.valueOf(key));
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(2:51|52)(1:(1:18)(2:49|31))|19|(3:43|44|(2:48|31)(2:46|47))(4:21|22|(1:24)|(3:39|40|(2:42|31))(2:26|(2:30|31)))|32|33|35|31|10) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        wrapAndThrow(r11, r3, r9, java.lang.String.valueOf(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void serializeOptionalFields(java.util.Map<?, ?> r9, com.fasterxml.jackson.core.JsonGenerator r10, com.fasterxml.jackson.databind.SerializerProvider r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r8._valueTypeSerializer
            if (r0 == 0) goto L8
            r8.serializeTypedFields(r9, r10, r11, r12)
            return
        L8:
            java.util.Set<java.lang.String> r0 = r8._ignoredEntries
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.MARKER_FOR_EMPTY
            if (r1 != r12) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L79
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L34
            com.fasterxml.jackson.databind.JavaType r5 = r8._keyType
            com.fasterxml.jackson.databind.BeanProperty r6 = r8._property
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.findNullKeySerializer(r5, r6)
            goto L3f
        L34:
            if (r0 == 0) goto L3d
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L3d
            goto L19
        L3d:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r8._keySerializer
        L3f:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L4f
            boolean r6 = r8._suppressNulls
            if (r6 == 0) goto L4a
            goto L19
        L4a:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r11.getDefaultNullValueSerializer()
            goto L69
        L4f:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r6 = r8._valueSerializer
            if (r6 != 0) goto L57
            com.fasterxml.jackson.databind.JsonSerializer r6 = r8._findSerializer(r11, r3)
        L57:
            if (r1 == 0) goto L60
            boolean r7 = r6.isEmpty(r11, r3)
            if (r7 == 0) goto L69
            goto L19
        L60:
            if (r12 == 0) goto L69
            boolean r7 = r12.equals(r3)
            if (r7 == 0) goto L69
            goto L19
        L69:
            r5.serialize(r4, r10, r11)     // Catch: java.lang.Exception -> L70
            r6.serialize(r3, r10, r11)     // Catch: java.lang.Exception -> L70
            goto L19
        L70:
            r3 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8.wrapAndThrow(r11, r3, r9, r4)
            goto L19
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeOptionalFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(2:50|51)(1:(1:13)(2:48|31))|14|(3:42|43|(2:47|31)(2:45|46))(4:16|17|(1:19)|(3:37|38|(2:41|31)(1:40))(2:21|(2:35|31)))|26|27|28|30|31|5) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        wrapAndThrow(r11, r3, r9, java.lang.String.valueOf(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void serializeTypedFields(java.util.Map<?, ?> r9, com.fasterxml.jackson.core.JsonGenerator r10, com.fasterxml.jackson.databind.SerializerProvider r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r8 = this;
            java.util.Set<java.lang.String> r0 = r8._ignoredEntries
            java.lang.Object r1 = com.fasterxml.jackson.databind.ser.std.MapSerializer.MARKER_FOR_EMPTY
            if (r1 != r12) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.util.Set r2 = r9.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.databind.JavaType r5 = r8._keyType
            com.fasterxml.jackson.databind.BeanProperty r6 = r8._property
            com.fasterxml.jackson.databind.JsonSerializer r5 = r11.findNullKeySerializer(r5, r6)
            goto L37
        L2c:
            if (r0 == 0) goto L35
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L35
            goto L11
        L35:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r8._keySerializer
        L37:
            java.lang.Object r3 = r3.getValue()
            if (r3 != 0) goto L47
            boolean r6 = r8._suppressNulls
            if (r6 == 0) goto L42
            goto L11
        L42:
            com.fasterxml.jackson.databind.JsonSerializer r6 = r11.getDefaultNullValueSerializer()
            goto L61
        L47:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r6 = r8._valueSerializer
            if (r6 != 0) goto L4f
            com.fasterxml.jackson.databind.JsonSerializer r6 = r8._findSerializer(r11, r3)
        L4f:
            if (r1 == 0) goto L58
            boolean r7 = r6.isEmpty(r11, r3)
            if (r7 == 0) goto L61
            goto L11
        L58:
            if (r12 == 0) goto L61
            boolean r7 = r12.equals(r3)
            if (r7 == 0) goto L61
            goto L11
        L61:
            r5.serialize(r4, r10, r11)
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r5 = r8._valueTypeSerializer     // Catch: java.lang.Exception -> L6a
            r6.serializeWithType(r3, r10, r11, r5)     // Catch: java.lang.Exception -> L6a
            goto L11
        L6a:
            r3 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r8.wrapAndThrow(r11, r3, r9, r4)
            goto L11
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeTypedFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    public MapSerializer withContentInclusion(Object obj, boolean z) {
        if (obj == this._suppressableValue && z == this._suppressNulls) {
            return this;
        }
        _ensureOverride("withContentInclusion");
        return new MapSerializer(this, this._valueTypeSerializer, obj, z);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, boolean z) {
        _ensureOverride("withResolved");
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, jsonSerializer, jsonSerializer2, set);
        return z != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z) : mapSerializer;
    }

    @Deprecated
    public void _ensureOverride() {
        _ensureOverride("N/A");
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (this._valueTypeSerializer == typeSerializer) {
            return this;
        }
        _ensureOverride("_withValueTypeSerializer");
        return new MapSerializer(this, typeSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public boolean hasSingleElement(Map<?, ?> map) {
        return map.size() == 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map<?, ?> map) {
        JsonSerializer<Object> _findSerializer;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        boolean z = MARKER_FOR_EMPTY == obj;
        if (jsonSerializer != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z) {
                    if (!jsonSerializer.isEmpty(serializerProvider, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    _findSerializer = _findSerializer(serializerProvider, obj3);
                } catch (JsonMappingException unused) {
                }
                if (!z) {
                    if (obj != null && obj.equals(map)) {
                    }
                    return false;
                }
                if (!_findSerializer.isEmpty(serializerProvider, obj3)) {
                    return false;
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        PropertyFilter findPropertyFilter;
        jsonGenerator.writeStartObject(map);
        if (!map.isEmpty()) {
            if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, serializerProvider);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj == null || (findPropertyFilter = findPropertyFilter(serializerProvider, obj, map2)) == null) {
                Object obj2 = this._suppressableValue;
                if (obj2 != null || this._suppressNulls) {
                    serializeOptionalFields(map2, jsonGenerator, serializerProvider, obj2);
                } else {
                    JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                    if (jsonSerializer != null) {
                        serializeFieldsUsing(map2, jsonGenerator, serializerProvider, jsonSerializer);
                    } else {
                        serializeFields(map2, jsonGenerator, serializerProvider);
                    }
                }
            } else {
                serializeFilteredFields(map2, jsonGenerator, serializerProvider, findPropertyFilter, this._suppressableValue);
            }
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        PropertyFilter findPropertyFilter;
        jsonGenerator.setCurrentValue(map);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(map, JsonToken.START_OBJECT));
        if (!map.isEmpty()) {
            if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
                map = _orderEntries(map, jsonGenerator, serializerProvider);
            }
            Map<?, ?> map2 = map;
            Object obj = this._filterId;
            if (obj == null || (findPropertyFilter = findPropertyFilter(serializerProvider, obj, map2)) == null) {
                Object obj2 = this._suppressableValue;
                if (obj2 != null || this._suppressNulls) {
                    serializeOptionalFields(map2, jsonGenerator, serializerProvider, obj2);
                } else {
                    JsonSerializer<Object> jsonSerializer = this._valueSerializer;
                    if (jsonSerializer != null) {
                        serializeFieldsUsing(map2, jsonGenerator, serializerProvider, jsonSerializer);
                    } else {
                        serializeFields(map2, jsonGenerator, serializerProvider);
                    }
                }
            } else {
                serializeFilteredFields(map2, jsonGenerator, serializerProvider, findPropertyFilter, this._suppressableValue);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride("withFilterId");
        return new MapSerializer(this, obj, this._sortKeys);
    }

    @Deprecated
    public MapSerializer withContentInclusion(Object obj) {
        return new MapSerializer(this, this._valueTypeSerializer, obj, this._suppressNulls);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    @Deprecated
    public static MapSerializer construct(String[] strArr, JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2, Object obj) {
        return construct(ArrayBuilders.arrayToSet(strArr), javaType, z, typeSerializer, jsonSerializer, jsonSerializer2, obj);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set) {
        super(Map.class, false);
        this._ignoredEntries = (set == null || set.isEmpty()) ? null : set;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }

    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
    }

    @Deprecated
    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj) {
        this(mapSerializer, typeSerializer, obj, false);
    }
}
