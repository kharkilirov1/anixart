package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.model.reward.RewardData;

/* loaded from: classes3.dex */
public final class mx0 {
    /* renamed from: a */
    public static boolean m26778a(@Nullable RewardData rewardData) {
        if (rewardData == null) {
            return false;
        }
        if (rewardData.m21930e()) {
            if (rewardData.m21929d() == null) {
                return false;
            }
        } else if (rewardData.m21928c() == null) {
            return false;
        }
        return true;
    }
}
