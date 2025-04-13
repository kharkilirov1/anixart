package com.yandex.mobile.ads.mediation.rewarded;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.rewarded.Reward;

/* loaded from: classes3.dex */
final class MediatedReward implements Reward {

    /* renamed from: a */
    private final int f57586a;

    /* renamed from: b */
    @NonNull
    private final String f57587b;

    public MediatedReward(int i2, @NonNull String str) {
        this.f57586a = i2;
        this.f57587b = str;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public int getAmount() {
        return this.f57586a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    @NonNull
    public String getType() {
        return this.f57587b;
    }
}
