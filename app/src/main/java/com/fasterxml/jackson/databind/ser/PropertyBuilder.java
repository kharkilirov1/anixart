package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    public final AnnotationIntrospector _annotationIntrospector;
    public final BeanDescription _beanDesc;
    public final SerializationConfig _config;
    public Object _defaultBean;
    public final JsonInclude.Value _defaultInclusion;
    public final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 */
    public static /* synthetic */ class C08711 {
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

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value merge = JsonInclude.Value.merge(beanDescription.findPropertyInclusion(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.Value.empty()));
        this._defaultInclusion = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = serializationConfig.getAnnotationIntrospector();
    }

    public Object _throwWrapped(Exception exc, String str, Object obj) {
        Exception exc2 = exc;
        while (exc2.getCause() != null) {
            exc2 = exc2.getCause();
        }
        ClassUtil.throwIfError(exc2);
        ClassUtil.throwIfRTE(exc2);
        StringBuilder m28y = C0000a.m28y("Failed to get property '", str, "' of default ");
        m28y.append(obj.getClass().getName());
        m28y.append(" instance");
        throw new IllegalArgumentException(m28y.toString());
    }

    public BeanPropertyWriter buildWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z) throws JsonMappingException {
        JavaType javaType2;
        Object arrayComparator;
        Object defaultBean;
        Object obj;
        boolean z2;
        try {
            JavaType findSerializationType = findSerializationType(annotatedMember, z, javaType);
            if (typeSerializer2 != null) {
                if (findSerializationType == null) {
                    findSerializationType = javaType;
                }
                if (findSerializationType.getContentType() == null) {
                    serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "serialization type " + findSerializationType + " has no content", new Object[0]);
                }
                JavaType withContentTypeHandler = findSerializationType.withContentTypeHandler(typeSerializer2);
                withContentTypeHandler.getContentType();
                javaType2 = withContentTypeHandler;
            } else {
                javaType2 = findSerializationType;
            }
            Object obj2 = null;
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor == null) {
                return (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value withOverrides = this._config.getDefaultInclusion(javaType3.getRawClass(), accessor.getRawType(), this._defaultInclusion).withOverrides(beanPropertyDefinition.findInclusion());
            JsonInclude.Include valueInclusion = withOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i2 = C08711.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[valueInclusion.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (javaType3.isReferenceType()) {
                        arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    }
                    obj = obj2;
                    z2 = true;
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        r3 = i2 == 5;
                        if (javaType3.isContainerType() && !this._config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
                            arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        }
                        z2 = r3;
                        obj = obj2;
                    } else {
                        arrayComparator = serializerProvider.includeFilterInstance(beanPropertyDefinition, withOverrides.getValueFilter());
                        if (arrayComparator != null) {
                            r3 = serializerProvider.includeFilterSuppressNulls(arrayComparator);
                        }
                    }
                    obj = arrayComparator;
                    z2 = r3;
                } else {
                    arrayComparator = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                obj = arrayComparator;
                z2 = true;
            } else {
                if (!this._useRealPropertyDefaults || (defaultBean = getDefaultBean()) == null) {
                    obj2 = BeanUtil.getDefaultValue(javaType3);
                    r3 = true;
                } else {
                    if (serializerProvider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        obj2 = annotatedMember.getValue(defaultBean);
                    } catch (Exception e2) {
                        _throwWrapped(e2, beanPropertyDefinition.getName(), defaultBean);
                    }
                }
                if (obj2 != null) {
                    if (obj2.getClass().isArray()) {
                        arrayComparator = ArrayBuilders.getArrayComparator(obj2);
                        obj = arrayComparator;
                        z2 = r3;
                    }
                    z2 = r3;
                    obj = obj2;
                }
                obj = obj2;
                z2 = true;
            }
            Class<?>[] findViews = beanPropertyDefinition.findViews();
            if (findViews == null) {
                findViews = this._beanDesc.findDefaultViews();
            }
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
            Object findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember);
            if (findNullSerializer != null) {
                beanPropertyWriter.assignNullSerializer(serializerProvider.serializerInstance(annotatedMember, findNullSerializer));
            }
            NameTransformer findUnwrappingNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember);
            return findUnwrappingNameTransformer != null ? beanPropertyWriter.unwrappingWriter(findUnwrappingNameTransformer) : beanPropertyWriter;
        } catch (JsonMappingException e3) {
            return beanPropertyDefinition == null ? (BeanPropertyWriter) serializerProvider.reportBadDefinition(javaType, ClassUtil.exceptionMessage(e3)) : (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, ClassUtil.exceptionMessage(e3), new Object[0]);
        }
    }

    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                StringBuilder m24u = C0000a.m24u("Illegal concrete-type annotation for method '");
                m24u.append(annotated.getName());
                m24u.append("': class ");
                m24u.append(rawClass.getName());
                m24u.append(" not a super-type of (declared) class ");
                m24u.append(rawClass2.getName());
                throw new IllegalArgumentException(m24u.toString());
            }
            z = true;
            javaType = refineSerializationType;
        }
        JsonSerialize.Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (findSerializationTyping != null && findSerializationTyping != JsonSerialize.Typing.DEFAULT_TYPING) {
            z = findSerializationTyping == JsonSerialize.Typing.STATIC;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    public Annotations getClassAnnotations() {
        return this._beanDesc.getClassAnnotations();
    }

    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }

    @Deprecated
    public Object getDefaultValue(JavaType javaType) {
        return BeanUtil.getDefaultValue(javaType);
    }

    @Deprecated
    public Object getPropertyDefaultValue(String str, AnnotatedMember annotatedMember, JavaType javaType) {
        Object defaultBean = getDefaultBean();
        if (defaultBean == null) {
            return getDefaultValue(javaType);
        }
        try {
            return annotatedMember.getValue(defaultBean);
        } catch (Exception e2) {
            return _throwWrapped(e2, str, defaultBean);
        }
    }
}
