package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class e50 {

    /* renamed from: d */
    private static final Object f49808d = new Object();

    /* renamed from: e */
    @Nullable
    private static volatile e50 f49809e;

    /* renamed from: a */
    private boolean f49810a = true;

    /* renamed from: b */
    private boolean f49811b = true;

    /* renamed from: c */
    private boolean f49812c = true;

    private e50() {
    }

    /* renamed from: a */
    public static e50 m24007a() {
        if (f49809e == null) {
            synchronized (f49808d) {
                if (f49809e == null) {
                    f49809e = new e50();
                }
            }
        }
        return f49809e;
    }

    /* renamed from: b */
    public final void m24009b(boolean z) {
        this.f49810a = z;
    }

    /* renamed from: c */
    public final boolean m24012c() {
        return this.f49810a;
    }

    /* renamed from: d */
    public final boolean m24013d() {
        return this.f49811b;
    }

    /* renamed from: b */
    public final boolean m24010b() {
        return this.f49812c;
    }

    /* renamed from: c */
    public final void m24011c(boolean z) {
        this.f49811b = z;
    }

    /* renamed from: a */
    public final void m24008a(boolean z) {
        this.f49812c = z;
    }
}
