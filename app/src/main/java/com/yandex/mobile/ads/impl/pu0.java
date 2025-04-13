package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pu0 {

    /* renamed from: a */
    @NotNull
    private final ju0 f53792a;

    /* renamed from: b */
    @NotNull
    private final List<j60> f53793b;

    /* renamed from: c */
    private final int f53794c;

    /* renamed from: d */
    @Nullable
    private final C6037xr f53795d;

    /* renamed from: e */
    @NotNull
    private final aw0 f53796e;

    /* renamed from: f */
    private final int f53797f;

    /* renamed from: g */
    private final int f53798g;

    /* renamed from: h */
    private final int f53799h;

    /* renamed from: i */
    private int f53800i;

    /* JADX WARN: Multi-variable type inference failed */
    public pu0(@NotNull ju0 call, @NotNull List<? extends j60> interceptors, int i2, @Nullable C6037xr c6037xr, @NotNull aw0 request, int i3, int i4, int i5) {
        Intrinsics.m32179h(call, "call");
        Intrinsics.m32179h(interceptors, "interceptors");
        Intrinsics.m32179h(request, "request");
        this.f53792a = call;
        this.f53793b = interceptors;
        this.f53794c = i2;
        this.f53795d = c6037xr;
        this.f53796e = request;
        this.f53797f = i3;
        this.f53798g = i4;
        this.f53799h = i5;
    }

    /* renamed from: a */
    public static pu0 m27495a(pu0 pu0Var, int i2, C6037xr c6037xr, aw0 aw0Var, int i3) {
        if ((i3 & 1) != 0) {
            i2 = pu0Var.f53794c;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            c6037xr = pu0Var.f53795d;
        }
        C6037xr c6037xr2 = c6037xr;
        if ((i3 & 4) != 0) {
            aw0Var = pu0Var.f53796e;
        }
        aw0 request = aw0Var;
        int i5 = (i3 & 8) != 0 ? pu0Var.f53797f : 0;
        int i6 = (i3 & 16) != 0 ? pu0Var.f53798g : 0;
        int i7 = (i3 & 32) != 0 ? pu0Var.f53799h : 0;
        Objects.requireNonNull(pu0Var);
        Intrinsics.m32179h(request, "request");
        return new pu0(pu0Var.f53792a, pu0Var.f53793b, i4, c6037xr2, request, i5, i6, i7);
    }

    @NotNull
    /* renamed from: b */
    public final ju0 m27498b() {
        return this.f53792a;
    }

    /* renamed from: c */
    public final int m27499c() {
        return this.f53797f;
    }

    @Nullable
    /* renamed from: d */
    public final C6037xr m27500d() {
        return this.f53795d;
    }

    /* renamed from: e */
    public final int m27501e() {
        return this.f53798g;
    }

    @NotNull
    /* renamed from: f */
    public final aw0 m27502f() {
        return this.f53796e;
    }

    /* renamed from: g */
    public final int m27503g() {
        return this.f53799h;
    }

    /* renamed from: h */
    public final int m27504h() {
        return this.f53798g;
    }

    @NotNull
    /* renamed from: i */
    public final aw0 m27505i() {
        return this.f53796e;
    }

    @NotNull
    /* renamed from: a */
    public final ju0 m27496a() {
        return this.f53792a;
    }

    @NotNull
    /* renamed from: a */
    public final rw0 m27497a(@NotNull aw0 request) throws IOException {
        Intrinsics.m32179h(request, "request");
        if (this.f53794c < this.f53793b.size()) {
            this.f53800i++;
            C6037xr c6037xr = this.f53795d;
            if (c6037xr != null) {
                if (c6037xr.m29796h().m30289a(request.m22640h())) {
                    if (!(this.f53800i == 1)) {
                        StringBuilder m26356a = l60.m26356a("network interceptor ");
                        m26356a.append(this.f53793b.get(this.f53794c - 1));
                        m26356a.append(" must call proceed() exactly once");
                        throw new IllegalStateException(m26356a.toString().toString());
                    }
                } else {
                    StringBuilder m26356a2 = l60.m26356a("network interceptor ");
                    m26356a2.append(this.f53793b.get(this.f53794c - 1));
                    m26356a2.append(" must retain the same host and port");
                    throw new IllegalStateException(m26356a2.toString().toString());
                }
            }
            pu0 m27495a = m27495a(this, this.f53794c + 1, null, request, 58);
            j60 j60Var = this.f53793b.get(this.f53794c);
            rw0 mo24184a = j60Var.mo24184a(m27495a);
            if (mo24184a != null) {
                if (this.f53795d != null) {
                    if (!(this.f53794c + 1 >= this.f53793b.size() || m27495a.f53800i == 1)) {
                        throw new IllegalStateException(("network interceptor " + j60Var + " must call proceed() exactly once").toString());
                    }
                }
                if (mo24184a.m27993a() != null) {
                    return mo24184a;
                }
                throw new IllegalStateException(("interceptor " + j60Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + j60Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
