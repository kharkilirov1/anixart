package com.yandex.metrica.push.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;

/* renamed from: com.yandex.metrica.push.impl.g */
/* loaded from: classes2.dex */
public class C4574g {

    /* renamed from: a */
    @NonNull
    private final Context f47375a;

    public C4574g(@NonNull Context context) {
        this.f47375a = context;
    }

    @Nullable
    /* renamed from: a */
    public Location m21541a(@NonNull String str, long j2, long j3, int i2) {
        InternalLogger.m21370i("Trying get location from custom LocationProvider", new Object[0]);
        C4562a.m21488a(this.f47375a).m21490a();
        return null;
    }
}
