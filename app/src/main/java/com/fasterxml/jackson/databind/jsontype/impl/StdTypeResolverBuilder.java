package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import p000a.C0000a;

/* loaded from: classes.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    public TypeIdResolver _customIdResolver;
    public Class<?> _defaultImpl;
    public JsonTypeInfo.EnumC0835Id _idType;
    public JsonTypeInfo.EnumC0834As _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$1 */
    public static /* synthetic */ class C08681 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As;
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id;

        static {
            int[] iArr = new int[JsonTypeInfo.EnumC0835Id.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = iArr;
            try {
                iArr[JsonTypeInfo.EnumC0835Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC0835Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC0835Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC0835Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC0835Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.EnumC0834As.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = iArr2;
            try {
                iArr2[JsonTypeInfo.EnumC0834As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC0834As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC0834As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC0834As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC0834As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public StdTypeResolverBuilder() {
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.EnumC0835Id.NONE, (TypeIdResolver) null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC0835Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType defineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        int i2 = C08681.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i2 == 1) {
            return new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
            }
            if (i2 == 4) {
                return new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
            }
            if (i2 != 5) {
                StringBuilder m24u = C0000a.m24u("Do not know how to construct standard type serializer for inclusion type: ");
                m24u.append(this._includeAs);
                throw new IllegalStateException(m24u.toString());
            }
        }
        return new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl, this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC0835Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        int i2 = C08681.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i2 == 1) {
            return new AsArrayTypeSerializer(idResolver, null);
        }
        if (i2 == 2) {
            return new AsPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i2 == 3) {
            return new AsWrapperTypeSerializer(idResolver, null);
        }
        if (i2 == 4) {
            return new AsExternalTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i2 == 5) {
            return new AsExistingPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        StringBuilder m24u = C0000a.m24u("Do not know how to construct standard type serializer for inclusion type: ");
        m24u.append(this._includeAs);
        throw new IllegalStateException(m24u.toString());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ StdTypeResolverBuilder defaultImpl(Class cls) {
        return defaultImpl2((Class<?>) cls);
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls == null) {
            if (deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.isAbstract()) {
                return javaType;
            }
        } else {
            if (cls == Void.class || cls == NoClass.class) {
                return deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.EnumC0835Id enumC0835Id = this._idType;
        if (enumC0835Id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i2 = C08681.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[enumC0835Id.ordinal()];
        if (i2 == 1) {
            return ClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i2 == 2) {
            return MinimalClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i2 == 3) {
            return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
        }
        if (i2 == 4) {
            return null;
        }
        StringBuilder m24u = C0000a.m24u("Do not know how to construct standard type id resolver for idType: ");
        m24u.append(this._idType);
        throw new IllegalStateException(m24u.toString());
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", ClassUtil.classNameOf(polymorphicTypeValidator), ClassUtil.classNameOf(javaType.getRawClass())));
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator subTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.EnumC0835Id enumC0835Id = this._idType;
        if (enumC0835Id == JsonTypeInfo.EnumC0835Id.CLASS || enumC0835Id == JsonTypeInfo.EnumC0835Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validateBaseType = subTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, subTypeValidator);
            }
            if (validateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return subTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* renamed from: defaultImpl, reason: avoid collision after fix types in other method */
    public StdTypeResolverBuilder defaultImpl2(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.EnumC0834As enumC0834As) {
        if (enumC0834As == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this._includeAs = enumC0834As;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.EnumC0835Id enumC0835Id, TypeIdResolver typeIdResolver) {
        if (enumC0835Id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this._idType = enumC0835Id;
        this._customIdResolver = typeIdResolver;
        this._typeProperty = enumC0835Id.getDefaultPropertyName();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    public StdTypeResolverBuilder(JsonTypeInfo.EnumC0835Id enumC0835Id, JsonTypeInfo.EnumC0834As enumC0834As, String str) {
        this._idType = enumC0835Id;
        this._includeAs = enumC0834As;
        this._typeProperty = str;
    }
}
