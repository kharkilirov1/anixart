package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xm1 {
    /* renamed from: a */
    public static void m29768a(tl1 tl1Var) {
        if (!tl1Var.m28680g()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (tl1Var.m28683j()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: a */
    public static void m29769a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
