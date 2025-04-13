package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class in0 {

    /* renamed from: a */
    private final jn0 f51348a = new jn0();

    /* renamed from: b */
    private final ap0 f51349b = new ap0(0, new byte[65025]);

    /* renamed from: c */
    private int f51350c = -1;

    /* renamed from: d */
    private int f51351d;

    /* renamed from: e */
    private boolean f51352e;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        return false;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m25574a(com.yandex.mobile.ads.impl.C5598pn r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.in0.m25574a(com.yandex.mobile.ads.impl.pn):boolean");
    }

    /* renamed from: b */
    public final ap0 m25575b() {
        return this.f51349b;
    }

    /* renamed from: c */
    public final void m25576c() {
        jn0 jn0Var = this.f51348a;
        jn0Var.f51662a = 0;
        jn0Var.f51663b = 0L;
        jn0Var.f51664c = 0;
        jn0Var.f51665d = 0;
        jn0Var.f51666e = 0;
        this.f51349b.m22586c(0);
        this.f51350c = -1;
        this.f51352e = false;
    }

    /* renamed from: d */
    public final void m25577d() {
        if (this.f51349b.m22587c().length == 65025) {
            return;
        }
        ap0 ap0Var = this.f51349b;
        ap0Var.m22582a(this.f51349b.m22590e(), Arrays.copyOf(ap0Var.m22587c(), Math.max(65025, this.f51349b.m22590e())));
    }

    /* renamed from: a */
    public final jn0 m25573a() {
        return this.f51348a;
    }
}
