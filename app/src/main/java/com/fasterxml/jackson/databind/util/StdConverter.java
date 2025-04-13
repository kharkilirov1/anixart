package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    public JavaType _findConverterType(TypeFactory typeFactory) {
        JavaType findSuperType = typeFactory.constructType(getClass()).findSuperType(Converter.class);
        if (findSuperType != null && findSuperType.containedTypeCount() >= 2) {
            return findSuperType;
        }
        StringBuilder m24u = C0000a.m24u("Cannot find OUT type parameter for Converter of type ");
        m24u.append(getClass().getName());
        throw new IllegalStateException(m24u.toString());
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public abstract OUT convert(IN in);

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getInputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getOutputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(1);
    }
}
