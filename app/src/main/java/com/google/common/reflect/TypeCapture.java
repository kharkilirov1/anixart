package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
abstract class TypeCapture<T> {
    /* renamed from: a */
    public final Type m12096a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Preconditions.m11184h(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
