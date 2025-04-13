package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.mx */
/* loaded from: classes3.dex */
final class C5463mx implements x80 {

    /* renamed from: a */
    private final Object f52825a = new Object();

    /* renamed from: b */
    @NonNull
    private final c90 f52826b;

    public C5463mx(@NonNull Context context, @NonNull String str) {
        this.f52826b = new c90(context, str);
    }

    @Override // com.yandex.mobile.ads.impl.x80
    @Nullable
    /* renamed from: a */
    public final Location mo26585a() {
        Location location;
        synchronized (this.f52825a) {
            b90 m23078a = this.f52826b.m23078a();
            if (m23078a == null || !m23078a.m22751b()) {
                location = null;
            } else {
                location = m23078a.m22750a();
                this.f52826b.m23079b();
            }
        }
        return location;
    }
}
