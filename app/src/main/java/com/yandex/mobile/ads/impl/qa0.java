package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* loaded from: classes3.dex */
public final class qa0 implements InterfaceC5701ro {

    /* renamed from: a */
    @NonNull
    private final ma0 f53993a;

    /* renamed from: b */
    private final int f53994b;

    public qa0(@NonNull NativeAdAssets nativeAdAssets, int i2) {
        this.f53994b = i2;
        this.f53993a = new ma0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5701ro
    /* renamed from: a */
    public final boolean mo27335a(@NonNull Context context) {
        int i2 = tg1.f55120b;
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        Float m26600a = this.f53993a.m26600a();
        return i4 - (m26600a != null ? Math.round(m26600a.floatValue() * ((float) i3)) : 0) >= this.f53994b;
    }
}
