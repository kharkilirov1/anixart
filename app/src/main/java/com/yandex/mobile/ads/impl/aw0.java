package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.C6074yf;
import com.yandex.mobile.ads.impl.t00;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class aw0 {

    /* renamed from: a */
    @NotNull
    private final t00 f48661a;

    /* renamed from: b */
    @NotNull
    private final String f48662b;

    /* renamed from: c */
    @NotNull
    private final C5204hy f48663c;

    /* renamed from: d */
    @Nullable
    private final dw0 f48664d;

    /* renamed from: e */
    @NotNull
    private final Map<Class<?>, Object> f48665e;

    /* renamed from: f */
    @Nullable
    private C6074yf f48666f;

    /* renamed from: com.yandex.mobile.ads.impl.aw0$a */
    public static class C4827a {

        /* renamed from: a */
        @Nullable
        private t00 f48667a;

        /* renamed from: b */
        @NotNull
        private String f48668b;

        /* renamed from: c */
        @NotNull
        private C5204hy.a f48669c;

        /* renamed from: d */
        @Nullable
        private dw0 f48670d;

        /* renamed from: e */
        @NotNull
        private Map<Class<?>, Object> f48671e;

        public C4827a() {
            this.f48671e = new LinkedHashMap();
            this.f48668b = "GET";
            this.f48669c = new C5204hy.a();
        }

        @NotNull
        /* renamed from: a */
        public final C4827a m22642a(@NotNull t00 url) {
            Intrinsics.m32179h(url, "url");
            this.f48667a = url;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C4827a m22649b(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            this.f48669c.m25392c(name, value);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C4827a m22644a(@NotNull URL url) {
            Intrinsics.m32179h(url, "url");
            String url2 = url.toString();
            Intrinsics.m32178g(url2, "url.toString()");
            t00 url3 = t00.C5777b.m28425b(url2);
            Intrinsics.m32179h(url3, "url");
            this.f48667a = url3;
            return this;
        }

        public C4827a(@NotNull aw0 request) {
            Map<Class<?>, Object> m32069n;
            Intrinsics.m32179h(request, "request");
            this.f48671e = new LinkedHashMap();
            this.f48667a = request.m22640h();
            this.f48668b = request.m22638f();
            this.f48670d = request.m22632a();
            if (request.m22635c().isEmpty()) {
                m32069n = new LinkedHashMap<>();
            } else {
                m32069n = MapsKt.m32069n(request.m22635c());
            }
            this.f48671e = m32069n;
            this.f48669c = request.m22636d().m25382b();
        }

        @NotNull
        /* renamed from: a */
        public final void m22648a(@NotNull String name, @NotNull String value) {
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(value, "value");
            this.f48669c.m25388a(name, value);
        }

        @NotNull
        /* renamed from: a */
        public final void m22647a(@NotNull String name) {
            Intrinsics.m32179h(name, "name");
            this.f48669c.m25389b(name);
        }

        @NotNull
        /* renamed from: a */
        public final C4827a m22641a(@NotNull C5204hy headers) {
            Intrinsics.m32179h(headers, "headers");
            this.f48669c = headers.m25382b();
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final void m22646a(@NotNull C6074yf cacheControl) {
            Intrinsics.m32179h(cacheControl, "cacheControl");
            String c6074yf = cacheControl.toString();
            if (c6074yf.length() == 0) {
                this.f48669c.m25389b("Cache-Control");
            } else {
                this.f48669c.m25392c("Cache-Control", c6074yf);
            }
        }

        @NotNull
        /* renamed from: a */
        public final C4827a m22643a(@NotNull String method, @Nullable dw0 dw0Var) {
            Intrinsics.m32179h(method, "method");
            if (method.length() > 0) {
                if (dw0Var == null) {
                    if (!(!n00.m26786d(method))) {
                        throw new IllegalArgumentException(C0000a.m16m("method ", method, " must have a request body.").toString());
                    }
                } else if (!n00.m26783a(method)) {
                    throw new IllegalArgumentException(C0000a.m16m("method ", method, " must not have a request body.").toString());
                }
                this.f48668b = method;
                this.f48670d = dw0Var;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        @NotNull
        /* renamed from: a */
        public final aw0 m22645a() {
            t00 t00Var = this.f48667a;
            if (t00Var != null) {
                return new aw0(t00Var, this.f48668b, this.f48669c.m25386a(), this.f48670d, t91.m28506a(this.f48671e));
            }
            throw new IllegalStateException("url == null".toString());
        }
    }

    public aw0(@NotNull t00 url, @NotNull String method, @NotNull C5204hy headers, @Nullable dw0 dw0Var, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(method, "method");
        Intrinsics.m32179h(headers, "headers");
        Intrinsics.m32179h(tags, "tags");
        this.f48661a = url;
        this.f48662b = method;
        this.f48663c = headers;
        this.f48664d = dw0Var;
        this.f48665e = tags;
    }

    @JvmName
    @Nullable
    /* renamed from: a */
    public final dw0 m22632a() {
        return this.f48664d;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final C6074yf m22634b() {
        C6074yf c6074yf = this.f48666f;
        if (c6074yf != null) {
            return c6074yf;
        }
        int i2 = C6074yf.f56815n;
        C6074yf m29935a = C6074yf.b.m29935a(this.f48663c);
        this.f48666f = m29935a;
        return m29935a;
    }

    @NotNull
    /* renamed from: c */
    public final Map<Class<?>, Object> m22635c() {
        return this.f48665e;
    }

    @JvmName
    @NotNull
    /* renamed from: d */
    public final C5204hy m22636d() {
        return this.f48663c;
    }

    /* renamed from: e */
    public final boolean m22637e() {
        return this.f48661a.m28393h();
    }

    @JvmName
    @NotNull
    /* renamed from: f */
    public final String m22638f() {
        return this.f48662b;
    }

    @NotNull
    /* renamed from: g */
    public final C4827a m22639g() {
        return new C4827a(this);
    }

    @JvmName
    @NotNull
    /* renamed from: h */
    public final t00 m22640h() {
        return this.f48661a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String toString() {
        StringBuilder m24u = C0000a.m24u("Request{method=");
        m24u.append(this.f48662b);
        m24u.append(", url=");
        m24u.append(this.f48661a);
        if (this.f48663c.size() != 0) {
            m24u.append(", headers=[");
            int i2 = 0;
            for (Pair<? extends String, ? extends String> pair : this.f48663c) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.f63055b;
                String str2 = (String) pair2.f63056c;
                if (i2 > 0) {
                    m24u.append(", ");
                }
                C0576a.m4100A(m24u, str, ':', str2);
                i2 = i3;
            }
            m24u.append(']');
        }
        if (!this.f48665e.isEmpty()) {
            m24u.append(", tags=");
            m24u.append(this.f48665e);
        }
        m24u.append('}');
        String sb = m24u.toString();
        Intrinsics.m32178g(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    @Nullable
    /* renamed from: a */
    public final String m22633a(@NotNull String name) {
        Intrinsics.m32179h(name, "name");
        return this.f48663c.m25381a(name);
    }
}
