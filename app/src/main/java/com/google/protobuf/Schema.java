package com.google.protobuf;

import com.google.protobuf.ArrayDecoders;
import java.io.IOException;

/* loaded from: classes2.dex */
interface Schema<T> {
    /* renamed from: a */
    void mo13535a(T t, T t2);

    /* renamed from: b */
    void mo13537b(T t, Writer writer) throws IOException;

    /* renamed from: c */
    void mo13539c(T t);

    /* renamed from: d */
    boolean mo13540d(T t);

    /* renamed from: e */
    void mo13541e(T t, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: f */
    void mo13542f(T t, byte[] bArr, int i2, int i3, ArrayDecoders.Registers registers) throws IOException;

    /* renamed from: g */
    boolean mo13543g(T t, T t2);

    /* renamed from: h */
    int mo13544h(T t);

    /* renamed from: i */
    T mo13545i();

    /* renamed from: j */
    int mo13546j(T t);
}
