package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes2.dex */
public class TypeToken<T> {

    /* renamed from: a */
    public final Class<? super T> f23885a;

    /* renamed from: b */
    public final Type f23886b;

    /* renamed from: c */
    public final int f23887c;

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type m12855a = C$Gson$Types.m12855a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f23886b = m12855a;
        this.f23885a = (Class<? super T>) C$Gson$Types.m12860f(m12855a);
        this.f23887c = m12855a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.m12858d(this.f23886b, ((TypeToken) obj).f23886b);
    }

    public final int hashCode() {
        return this.f23887c;
    }

    public final String toString() {
        return C$Gson$Types.m12864j(this.f23886b);
    }

    public TypeToken(Type type) {
        Objects.requireNonNull(type);
        Type m12855a = C$Gson$Types.m12855a(type);
        this.f23886b = m12855a;
        this.f23885a = (Class<? super T>) C$Gson$Types.m12860f(m12855a);
        this.f23887c = m12855a.hashCode();
    }
}
