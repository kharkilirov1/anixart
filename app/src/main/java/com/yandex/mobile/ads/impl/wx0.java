package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* loaded from: classes3.dex */
public final class wx0 {

    /* renamed from: a */
    @NonNull
    private final xx0 f56286a;

    public wx0(@NonNull xx0 xx0Var) {
        this.f56286a = xx0Var;
    }

    @Nullable
    /* renamed from: a */
    public final vx0 m29584a(@NonNull Context context, @Nullable AdResponse adResponse, @NonNull C5101g2 c5101g2) {
        RewardData m21802C = adResponse != null ? adResponse.m21802C() : null;
        if (m21802C == null) {
            return null;
        }
        if (m21802C.m21930e()) {
            ServerSideReward m21929d = m21802C.m21929d();
            if (m21929d != null) {
                return new p01(context, c5101g2, m21929d);
            }
            return null;
        }
        ClientSideReward m21928c = m21802C.m21928c();
        if (m21928c != null) {
            return new C4867bi(m21928c, this.f56286a);
        }
        return null;
    }
}
