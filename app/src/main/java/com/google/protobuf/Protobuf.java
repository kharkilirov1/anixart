package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class Protobuf {

    /* renamed from: c */
    public static final Protobuf f24310c = new Protobuf();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, Schema<?>> f24312b = new ConcurrentHashMap();

    /* renamed from: a */
    public final SchemaFactory f24311a = new ManifestSchemaFactory();

    /* renamed from: a */
    public <T> Schema<T> m13567a(Class<T> cls) {
        Charset charset = Internal.f24210a;
        Objects.requireNonNull(cls, "messageType");
        Schema<T> schema = (Schema) this.f24312b.get(cls);
        if (schema != null) {
            return schema;
        }
        Schema<T> mo13487a = this.f24311a.mo13487a(cls);
        Objects.requireNonNull(mo13487a, "schema");
        Schema<T> schema2 = (Schema) this.f24312b.putIfAbsent(cls, mo13487a);
        return schema2 != null ? schema2 : mo13487a;
    }

    /* renamed from: b */
    public <T> Schema<T> m13568b(T t) {
        return m13567a(t.getClass());
    }
}
