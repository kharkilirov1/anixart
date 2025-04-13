package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public class qh1 extends Exception {

    /* renamed from: a */
    public final km0 f54052a;

    public qh1() {
        this.f54052a = null;
    }

    public qh1(km0 km0Var) {
        this.f54052a = km0Var;
    }

    public qh1(String str) {
        super(str);
        this.f54052a = null;
    }

    public qh1(Exception exc) {
        super("Failed to parse response", exc);
        this.f54052a = null;
    }

    public qh1(Throwable th) {
        super(th);
        this.f54052a = null;
    }
}
