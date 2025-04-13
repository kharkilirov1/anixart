package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.sv0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ed0 {

    /* renamed from: a */
    @NonNull
    private final C5101g2 f49931a;

    /* renamed from: b */
    @NonNull
    private final C5841u4 f49932b = new C5841u4();

    /* renamed from: c */
    @Nullable
    private final AdResponse f49933c;

    public ed0(@NonNull C5101g2 c5101g2, @Nullable AdResponse adResponse) {
        this.f49931a = c5101g2;
        this.f49933c = adResponse;
    }

    /* renamed from: a */
    public final void m24119a(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54837e, qd0Var, hashMap);
    }

    /* renamed from: b */
    public final void m24122b(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54813A, qd0Var, hashMap);
    }

    /* renamed from: c */
    public final void m24124c(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54854v, qd0Var, hashMap);
        m24116a(context, sv0.EnumC5764b.f54855w, qd0Var, hashMap);
    }

    /* renamed from: d */
    public final void m24125d(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54836d, qd0Var, hashMap);
    }

    /* renamed from: e */
    public final void m24126e(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54839g, qd0Var, hashMap);
    }

    /* renamed from: f */
    public final void m24127f(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull HashMap hashMap) {
        m24116a(context, sv0.EnumC5764b.f54840h, qd0Var, hashMap);
    }

    /* renamed from: a */
    public final void m24118a(@NonNull Context context, @NonNull qd0 qd0Var, @Nullable AdResponse adResponse) {
        RewardData m21802C;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (adResponse != null && (m21802C = adResponse.m21802C()) != null) {
            hashMap2.put("rewarding_side", m21802C.m21930e() ? "server_side" : "client_side");
        }
        hashMap.put("reward_info", hashMap2);
        m24116a(context, sv0.EnumC5764b.f54824L, qd0Var, hashMap);
    }

    /* renamed from: b */
    public final void m24121b(@NonNull Context context, @NonNull qd0 qd0Var) {
        m24116a(context, sv0.EnumC5764b.f54838f, qd0Var, Collections.emptyMap());
    }

    /* renamed from: b */
    public final void m24123b(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull Map<String, Object> map) {
        m24116a(context, sv0.EnumC5764b.f54858z, qd0Var, map);
    }

    /* renamed from: a */
    public final void m24117a(@NonNull Context context, @NonNull qd0 qd0Var) {
        m24116a(context, sv0.EnumC5764b.f54853u, qd0Var, Collections.emptyMap());
    }

    /* renamed from: a */
    public final void m24120a(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull Map<String, Object> map) {
        m24116a(context, sv0.EnumC5764b.f54853u, qd0Var, map);
    }

    /* renamed from: a */
    private void m24116a(@NonNull Context context, @NonNull sv0.EnumC5764b enumC5764b, @NonNull qd0 qd0Var, @NonNull Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_unit_id", this.f49931a.m24779c());
        hashMap.put("block_id", this.f49931a.m24779c());
        hashMap.put("ad_type", this.f49931a.m24775b().m24033a());
        hashMap.put("adapter", qd0Var.m27676c());
        hashMap.put("adapter_parameters", qd0Var.m27680g());
        hashMap.putAll(this.f49932b.m28881a(this.f49931a.m24765a()));
        tv0 tv0Var = new tv0(hashMap);
        AdResponse adResponse = this.f49933c;
        tv0Var.m28761b(adResponse != null ? adResponse.m21823m() : null, "ad_source");
        Map<String, Object> m28756a = tv0Var.m28756a();
        m28756a.putAll(map);
        C5730s8.m28078a(context).mo23876a(new sv0(enumC5764b.m28361a(), m28756a));
    }
}
