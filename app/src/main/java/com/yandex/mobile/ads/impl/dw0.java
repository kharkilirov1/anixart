package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class dw0 {

    /* renamed from: com.yandex.mobile.ads.impl.dw0$a */
    public static final class C4991a {
        private C4991a() {
        }

        public /* synthetic */ C4991a(int i2) {
            this();
        }

        @JvmStatic
        @NotNull
        @Deprecated
        @JvmOverloads
        /* renamed from: a */
        public static cw0 m23948a(@NotNull byte[] content) {
            Intrinsics.m32179h(content, "content");
            int length = content.length;
            t91.m28508a(content.length, 0, length);
            return new cw0(null, content, length, 0);
        }

        /* renamed from: b */
        public static cw0 m23949b(byte[] bArr) {
            int length = bArr.length;
            t91.m28508a(bArr.length, 0, length);
            return new cw0(null, bArr, length, 0);
        }
    }

    static {
        new C4991a(0);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    /* renamed from: a */
    public static final cw0 m23947a(@NotNull byte[] bArr) {
        return C4991a.m23948a(bArr);
    }

    /* renamed from: a */
    public abstract long mo23537a() throws IOException;

    /* renamed from: a */
    public abstract void mo23538a(@NotNull BufferedSink bufferedSink) throws IOException;

    @Nullable
    /* renamed from: b */
    public abstract hc0 mo23539b();
}
