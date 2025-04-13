package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public final class qm1 {

    /* renamed from: b */
    @SuppressLint
    private static qm1 f54098b = new qm1();

    /* renamed from: a */
    private Context f54099a;

    private qm1() {
    }

    /* renamed from: a */
    public static qm1 m27750a() {
        return f54098b;
    }

    /* renamed from: a */
    public final void m27751a(Context context) {
        this.f54099a = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: b */
    public final Context m27752b() {
        return this.f54099a;
    }
}
