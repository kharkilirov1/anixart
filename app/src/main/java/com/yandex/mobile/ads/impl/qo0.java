package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class qo0 implements InterfaceC5701ro {

    /* renamed from: a */
    private final int f54120a;

    public qo0(int i2) {
        this.f54120a = i2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5701ro
    /* renamed from: a */
    public final boolean mo27335a(@NonNull Context context) {
        return this.f54120a == context.getResources().getConfiguration().orientation;
    }
}
