package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ck1 {

    /* renamed from: a */
    @NonNull
    private final C5841u4 f49293a = new C5841u4();

    /* renamed from: b */
    @NonNull
    private C5101g2 f49294b;

    public ck1(@NonNull C5101g2 c5101g2) {
        this.f49294b = c5101g2;
    }

    /* renamed from: a */
    public final void m23304a(@NonNull Context context, @NonNull AdResponse adResponse, @Nullable aj0 aj0Var) {
        HashMap hashMap = new HashMap();
        if (aj0Var != null) {
            hashMap.putAll(aj0Var.mo22529a());
        }
        m23302a(context, adResponse, sv0.EnumC5764b.f54838f, hashMap);
    }

    /* renamed from: a */
    public final void m23305a(@NonNull Context context, @NonNull AdResponse adResponse, @Nullable bj0 bj0Var) {
        HashMap hashMap = new HashMap();
        if (bj0Var != null) {
            hashMap.putAll(bj0Var.mo22529a());
        }
        hashMap.put("status", sv0.EnumC5765c.f54860b.m28362a());
        m23302a(context, adResponse, sv0.EnumC5764b.f54839g, hashMap);
    }

    /* renamed from: a */
    public final void m23303a(@NonNull Context context, @NonNull AdResponse adResponse) {
        RewardData m21802C;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (adResponse != null && (m21802C = adResponse.m21802C()) != null) {
            hashMap2.put("rewarding_side", m21802C.m21930e() ? "server_side" : "client_side");
        }
        hashMap.put("reward_info", hashMap2);
        m23302a(context, adResponse, sv0.EnumC5764b.f54824L, hashMap);
    }

    /* renamed from: a */
    private void m23302a(@NonNull Context context, @NonNull AdResponse adResponse, @NonNull sv0.EnumC5764b enumC5764b, @NonNull HashMap hashMap) {
        int m24174g;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("ad_unit_id", adResponse.m21826p());
        hashMap2.put("block_id", adResponse.m21826p());
        hashMap2.put("adapter", "Yandex");
        EnumC5007e6 m21824n = adResponse.m21824n();
        hashMap2.put("ad_type", m21824n != null ? m21824n.m24033a() : null);
        hashMap2.putAll(this.f49293a.m28881a(this.f49294b.m24765a()));
        if (adResponse.m21801B() instanceof qi0) {
            List<eh0> m27736d = ((qi0) adResponse.m21801B()).m27736d();
            hashMap2.put("native_ad_type", (m27736d == null || m27736d.isEmpty() || (m24174g = m27736d.get(0).m24174g()) == 0) ? "" : cx0.m23548a(m24174g));
        }
        tv0 tv0Var = new tv0(hashMap2);
        tv0Var.m28761b(adResponse.m21823m(), "ad_source");
        Map<String, Object> m28756a = tv0Var.m28756a();
        m28756a.putAll(hashMap);
        C5730s8.m28078a(context).mo23876a(new sv0(enumC5764b.m28361a(), m28756a));
    }
}
