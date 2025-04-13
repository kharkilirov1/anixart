package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.rewarded.Reward;

/* loaded from: classes3.dex */
public final class ll1 implements Reward {

    /* renamed from: a */
    private final int f52450a;

    /* renamed from: b */
    @NonNull
    private final String f52451b;

    public ll1(int i2, @NonNull String str) {
        this.f52450a = i2;
        this.f52451b = str;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return this.f52450a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    @NonNull
    public final String getType() {
        return this.f52451b;
    }
}
