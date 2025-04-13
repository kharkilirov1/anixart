package com.yandex.mobile.ads.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class b90 {

    /* renamed from: a */
    @NonNull
    private final Object f48804a;

    public b90(@NonNull Object obj) {
        this.f48804a = obj;
    }

    @Nullable
    /* renamed from: a */
    public final Location m22750a() {
        Object m29279a = vu0.m29279a(this.f48804a, "getResult", new Object[0]);
        if (m29279a instanceof Location) {
            return (Location) m29279a;
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m22751b() {
        Object m29279a = vu0.m29279a(this.f48804a, "isComplete", new Object[0]);
        if (m29279a instanceof Boolean) {
            return ((Boolean) m29279a).booleanValue();
        }
        return false;
    }
}
