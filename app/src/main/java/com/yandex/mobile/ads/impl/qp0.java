package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class qp0 {

    /* renamed from: a */
    @NonNull
    private final Context f54122a;

    public qp0(@NonNull Context context) {
        this.f54122a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean m27771a() {
        return m27770a("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: b */
    public final boolean m27772b() {
        return m27770a("android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: a */
    private boolean m27770a(@NonNull String str) {
        try {
            return this.f54122a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
