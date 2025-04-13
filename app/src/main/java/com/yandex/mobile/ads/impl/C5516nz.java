package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.nz */
/* loaded from: classes3.dex */
public final class C5516nz {

    /* renamed from: a */
    private static final Object f53104a = new Object();

    /* renamed from: b */
    private static volatile C5516nz f53105b;

    private C5516nz() {
    }

    @NonNull
    /* renamed from: a */
    public static C5516nz m26965a() {
        if (f53105b == null) {
            synchronized (f53104a) {
                if (f53105b == null) {
                    f53105b = new C5516nz();
                }
            }
        }
        return f53105b;
    }

    @NonNull
    /* renamed from: a */
    public static InterfaceC5465mz m26964a(boolean z) {
        if (z) {
            return new qf0();
        }
        return new C4807ae();
    }
}
