package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class ClassNameIdResolver extends TypeIdResolverBase {
    private static final String JAVA_UTIL_PKG = "java.util.";
    public final PolymorphicTypeValidator _subTypeValidator;

    @Deprecated
    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory) {
        this(javaType, typeFactory, LaissezFaireSubTypeValidator.instance);
    }

    public static ClassNameIdResolver construct(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    public String _idFrom(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (ClassUtil.isEnumType(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        return name.startsWith(JAVA_UTIL_PKG) ? obj instanceof EnumSet ? typeFactory.constructCollectionType(EnumSet.class, ClassUtil.findEnumType((EnumSet<?>) obj)).toCanonical() : obj instanceof EnumMap ? typeFactory.constructMapType(EnumMap.class, ClassUtil.findEnumType((EnumMap<?, ?>) obj), Object.class).toCanonical() : name : (name.indexOf(36) < 0 || ClassUtil.getOuterClass(cls) == null || ClassUtil.getOuterClass(this._baseType.getRawClass()) != null) ? name : this._baseType.getRawClass().getName();
    }

    public JavaType _typeFromId(String str, DatabindContext databindContext) throws IOException {
        JavaType resolveAndValidateSubType = databindContext.resolveAndValidateSubType(this._baseType, str, this._subTypeValidator);
        return (resolveAndValidateSubType == null && (databindContext instanceof DeserializationContext)) ? ((DeserializationContext) databindContext).handleUnknownTypeId(this._baseType, str, this, "no such class found") : resolveAndValidateSubType;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        return "class name used as type id";
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JsonTypeInfo.EnumC0835Id getMechanism() {
        return JsonTypeInfo.EnumC0835Id.CLASS;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        return _idFrom(obj, obj.getClass(), this._typeFactory);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return _idFrom(obj, cls, this._typeFactory);
    }

    public void registerSubtype(Class<?> cls, String str) {
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        return _typeFromId(str, databindContext);
    }

    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this._subTypeValidator = polymorphicTypeValidator;
    }
}
