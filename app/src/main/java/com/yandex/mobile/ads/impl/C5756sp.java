package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.sp */
/* loaded from: classes3.dex */
public final class C5756sp implements InterfaceC5701ro {

    /* renamed from: a */
    @NonNull
    private final AdResponse<?> f54795a;

    public C5756sp(@NonNull AdResponse<?> adResponse) {
        this.f54795a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5701ro
    /* renamed from: a */
    public final boolean mo27335a(@NonNull Context context) {
        return "divkit".equals(this.f54795a.m21833w());
    }
}
