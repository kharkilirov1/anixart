package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class vw0 implements Closeable {

    /* renamed from: com.yandex.mobile.ads.impl.vw0$a */
    public static final class C5944a {
        private C5944a() {
        }

        public /* synthetic */ C5944a(int i2) {
            this();
        }

        /* renamed from: a */
        public static uw0 m29282a(byte[] bArr) {
            Intrinsics.m32179h(bArr, "<this>");
            Buffer buffer = new Buffer();
            buffer.m34567w(bArr);
            return new uw0(bArr.length, null, buffer);
        }
    }

    static {
        new C5944a(0);
    }

    @NotNull
    /* renamed from: a */
    public final InputStream m29281a() {
        return mo27789d().mo34568x();
    }

    /* renamed from: b */
    public abstract long mo27787b();

    @Nullable
    /* renamed from: c */
    public abstract hc0 mo27788c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t91.m28509a((Closeable) mo27789d());
    }

    @NotNull
    /* renamed from: d */
    public abstract BufferedSource mo27789d();
}
