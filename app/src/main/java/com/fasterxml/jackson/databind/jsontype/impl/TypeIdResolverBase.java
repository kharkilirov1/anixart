package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class TypeIdResolverBase implements TypeIdResolver {
    public final JavaType _baseType;
    public final TypeFactory _typeFactory;

    public TypeIdResolverBase() {
        this(null, null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromBaseType() {
        return idFromValueAndType(null, this._baseType.getRawClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public void init(JavaType javaType) {
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        StringBuilder m24u = C0000a.m24u("Sub-class ");
        m24u.append(getClass().getName());
        m24u.append(" MUST implement `typeFromId(DatabindContext,String)");
        throw new IllegalStateException(m24u.toString());
    }

    public TypeIdResolverBase(JavaType javaType, TypeFactory typeFactory) {
        this._baseType = javaType;
        this._typeFactory = typeFactory;
    }
}
