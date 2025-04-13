package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cj0 {

    /* renamed from: a */
    private static final Object f49285a = new Object();

    /* renamed from: b */
    private static volatile cj0 f49286b;

    private cj0() {
    }

    /* renamed from: a */
    public static cj0 m23293a() {
        if (f49286b == null) {
            synchronized (f49285a) {
                if (f49286b == null) {
                    f49286b = new cj0();
                }
            }
        }
        return f49286b;
    }
}
