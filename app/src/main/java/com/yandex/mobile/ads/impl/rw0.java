package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.C6074yf;
import java.io.Closeable;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rw0 implements Closeable {

    /* renamed from: a */
    @NotNull
    private final aw0 f54430a;

    /* renamed from: b */
    @NotNull
    private final bt0 f54431b;

    /* renamed from: c */
    @NotNull
    private final String f54432c;

    /* renamed from: d */
    private final int f54433d;

    /* renamed from: e */
    @Nullable
    private final C4993dy f54434e;

    /* renamed from: f */
    @NotNull
    private final C5204hy f54435f;

    /* renamed from: g */
    @Nullable
    private final vw0 f54436g;

    /* renamed from: h */
    @Nullable
    private final rw0 f54437h;

    /* renamed from: i */
    @Nullable
    private final rw0 f54438i;

    /* renamed from: j */
    @Nullable
    private final rw0 f54439j;

    /* renamed from: k */
    private final long f54440k;

    /* renamed from: l */
    private final long f54441l;

    /* renamed from: m */
    @Nullable
    private final C6037xr f54442m;

    /* renamed from: n */
    @Nullable
    private C6074yf f54443n;

    /* renamed from: com.yandex.mobile.ads.impl.rw0$a */
    public static class C5716a {

        /* renamed from: a */
        @Nullable
        private aw0 f54444a;

        /* renamed from: b */
        @Nullable
        private bt0 f54445b;

        /* renamed from: c */
        private int f54446c;

        /* renamed from: d */
        @Nullable
        private String f54447d;

        /* renamed from: e */
        @Nullable
        private C4993dy f54448e;

        /* renamed from: f */
        @NotNull
        private C5204hy.a f54449f;

        /* renamed from: g */
        @Nullable
        private vw0 f54450g;

        /* renamed from: h */
        @Nullable
        private rw0 f54451h;

        /* renamed from: i */
        @Nullable
        private rw0 f54452i;

        /* renamed from: j */
        @Nullable
        private rw0 f54453j;

        /* renamed from: k */
        private long f54454k;

        /* renamed from: l */
        private long f54455l;

        /* renamed from: m */
        @Nullable
        private C6037xr f54456m;

        public C5716a() {
            this.f54446c = -1;
            this.f54449f = new C5204hy.a();
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28013a(@NotNull aw0 request) {
            Intrinsics.m32179h(request, "request");
            this.f54444a = request;
            return this;
        }

        /* renamed from: b */
        public final int m28022b() {
            return this.f54446c;
        }

        @NotNull
        /* renamed from: c */
        public final C5716a m28026c() {
            this.f54449f.m25392c("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28014a(@NotNull bt0 protocol) {
            Intrinsics.m32179h(protocol, "protocol");
            this.f54445b = protocol;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C5716a m28025b(@NotNull String message) {
            Intrinsics.m32179h(message, "message");
            this.f54447d = message;
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C5716a m28027c(@Nullable rw0 rw0Var) {
            if (!(rw0Var.m27993a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
            this.f54453j = rw0Var;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28011a(int i2) {
            this.f54446c = i2;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C5716a m28024b(@Nullable rw0 rw0Var) {
            m28010a(rw0Var, "networkResponse");
            this.f54451h = rw0Var;
            return this;
        }

        public C5716a(@NotNull rw0 response) {
            Intrinsics.m32179h(response, "response");
            this.f54446c = -1;
            this.f54444a = response.m28008p();
            this.f54445b = response.m28006n();
            this.f54446c = response.m27997e();
            this.f54447d = response.m28002j();
            this.f54448e = response.m27999g();
            this.f54449f = response.m28000h().m25382b();
            this.f54450g = response.m27993a();
            this.f54451h = response.m28003k();
            this.f54452i = response.m27995c();
            this.f54453j = response.m28005m();
            this.f54454k = response.m28009q();
            this.f54455l = response.m28007o();
            this.f54456m = response.m27998f();
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28015a(@Nullable C4993dy c4993dy) {
            this.f54448e = c4993dy;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m28021a(@NotNull String value) {
            Intrinsics.m32179h(value, "value");
            this.f54449f.m25388a("Warning", value);
        }

        @NotNull
        /* renamed from: b */
        public final C5716a m28023b(long j2) {
            this.f54454k = j2;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28016a(@NotNull C5204hy headers) {
            Intrinsics.m32179h(headers, "headers");
            this.f54449f = headers.m25382b();
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28018a(@Nullable vw0 vw0Var) {
            this.f54450g = vw0Var;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28017a(@Nullable rw0 rw0Var) {
            m28010a(rw0Var, "cacheResponse");
            this.f54452i = rw0Var;
            return this;
        }

        /* renamed from: a */
        private static void m28010a(rw0 rw0Var, String str) {
            if (rw0Var != null) {
                if (rw0Var.m27993a() == null) {
                    if (rw0Var.m28003k() == null) {
                        if (rw0Var.m27995c() == null) {
                            if (!(rw0Var.m28005m() == null)) {
                                throw new IllegalArgumentException(um1.m29049a(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(um1.m29049a(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(um1.m29049a(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(um1.m29049a(str, ".body != null").toString());
            }
        }

        @NotNull
        /* renamed from: a */
        public final C5716a m28012a(long j2) {
            this.f54455l = j2;
            return this;
        }

        /* renamed from: a */
        public final void m28020a(@NotNull C6037xr deferredTrailers) {
            Intrinsics.m32179h(deferredTrailers, "deferredTrailers");
            this.f54456m = deferredTrailers;
        }

        @NotNull
        /* renamed from: a */
        public final rw0 m28019a() {
            int i2 = this.f54446c;
            if (i2 >= 0) {
                aw0 aw0Var = this.f54444a;
                if (aw0Var != null) {
                    bt0 bt0Var = this.f54445b;
                    if (bt0Var != null) {
                        String str = this.f54447d;
                        if (str != null) {
                            return new rw0(aw0Var, bt0Var, str, i2, this.f54448e, this.f54449f.m25386a(), this.f54450g, this.f54451h, this.f54452i, this.f54453j, this.f54454k, this.f54455l, this.f54456m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            StringBuilder m26356a = l60.m26356a("code < 0: ");
            m26356a.append(this.f54446c);
            throw new IllegalStateException(m26356a.toString().toString());
        }
    }

    public rw0(@NotNull aw0 request, @NotNull bt0 protocol, @NotNull String message, int i2, @Nullable C4993dy c4993dy, @NotNull C5204hy headers, @Nullable vw0 vw0Var, @Nullable rw0 rw0Var, @Nullable rw0 rw0Var2, @Nullable rw0 rw0Var3, long j2, long j3, @Nullable C6037xr c6037xr) {
        Intrinsics.m32179h(request, "request");
        Intrinsics.m32179h(protocol, "protocol");
        Intrinsics.m32179h(message, "message");
        Intrinsics.m32179h(headers, "headers");
        this.f54430a = request;
        this.f54431b = protocol;
        this.f54432c = message;
        this.f54433d = i2;
        this.f54434e = c4993dy;
        this.f54435f = headers;
        this.f54436g = vw0Var;
        this.f54437h = rw0Var;
        this.f54438i = rw0Var2;
        this.f54439j = rw0Var3;
        this.f54440k = j2;
        this.f54441l = j3;
        this.f54442m = c6037xr;
    }

    @JvmName
    @Nullable
    /* renamed from: a */
    public final vw0 m27993a() {
        return this.f54436g;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final C6074yf m27994b() {
        C6074yf c6074yf = this.f54443n;
        if (c6074yf != null) {
            return c6074yf;
        }
        int i2 = C6074yf.f56815n;
        C6074yf m29935a = C6074yf.b.m29935a(this.f54435f);
        this.f54443n = m29935a;
        return m29935a;
    }

    @JvmName
    @Nullable
    /* renamed from: c */
    public final rw0 m27995c() {
        return this.f54438i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vw0 vw0Var = this.f54436g;
        if (vw0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        t91.m28509a((Closeable) vw0Var.mo27789d());
    }

    @NotNull
    /* renamed from: d */
    public final List<C5125gh> m27996d() {
        String str;
        C5204hy c5204hy = this.f54435f;
        int i2 = this.f54433d;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return EmptyList.f63144b;
            }
            str = "Proxy-Authenticate";
        }
        return m00.m26549a(c5204hy, str);
    }

    @JvmName
    /* renamed from: e */
    public final int m27997e() {
        return this.f54433d;
    }

    @JvmName
    @Nullable
    /* renamed from: f */
    public final C6037xr m27998f() {
        return this.f54442m;
    }

    @JvmName
    @Nullable
    /* renamed from: g */
    public final C4993dy m27999g() {
        return this.f54434e;
    }

    @JvmName
    @NotNull
    /* renamed from: h */
    public final C5204hy m28000h() {
        return this.f54435f;
    }

    /* renamed from: i */
    public final boolean m28001i() {
        int i2 = this.f54433d;
        return 200 <= i2 && i2 < 300;
    }

    @JvmName
    @NotNull
    /* renamed from: j */
    public final String m28002j() {
        return this.f54432c;
    }

    @JvmName
    @Nullable
    /* renamed from: k */
    public final rw0 m28003k() {
        return this.f54437h;
    }

    @NotNull
    /* renamed from: l */
    public final C5716a m28004l() {
        return new C5716a(this);
    }

    @JvmName
    @Nullable
    /* renamed from: m */
    public final rw0 m28005m() {
        return this.f54439j;
    }

    @JvmName
    @NotNull
    /* renamed from: n */
    public final bt0 m28006n() {
        return this.f54431b;
    }

    @JvmName
    /* renamed from: o */
    public final long m28007o() {
        return this.f54441l;
    }

    @JvmName
    @NotNull
    /* renamed from: p */
    public final aw0 m28008p() {
        return this.f54430a;
    }

    @JvmName
    /* renamed from: q */
    public final long m28009q() {
        return this.f54440k;
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Response{protocol=");
        m26356a.append(this.f54431b);
        m26356a.append(", code=");
        m26356a.append(this.f54433d);
        m26356a.append(", message=");
        m26356a.append(this.f54432c);
        m26356a.append(", url=");
        m26356a.append(this.f54430a.m22640h());
        m26356a.append('}');
        return m26356a.toString();
    }

    /* renamed from: a */
    public static String m27992a(rw0 rw0Var, String name) {
        Objects.requireNonNull(rw0Var);
        Intrinsics.m32179h(name, "name");
        String m25381a = rw0Var.f54435f.m25381a(name);
        if (m25381a == null) {
            return null;
        }
        return m25381a;
    }
}
