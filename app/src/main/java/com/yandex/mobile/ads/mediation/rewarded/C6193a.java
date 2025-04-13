package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.InterfaceC5148gw;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.hp0;
import com.yandex.mobile.ads.impl.tx0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.yx0;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.a */
/* loaded from: classes3.dex */
public final class C6193a implements InterfaceC5148gw<tx0> {

    /* renamed from: a */
    @NonNull
    private final wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f57588a;

    /* renamed from: b */
    @NonNull
    private final C6195c f57589b;

    /* renamed from: c */
    @NonNull
    private final C6196d f57590c;

    public C6193a(@NonNull yx0 yx0Var, @NonNull AdResponse<String> adResponse, @NonNull MediationData mediationData) {
        C5101g2 m28616d = yx0Var.m28616d();
        gd0 gd0Var = new gd0(m28616d);
        ed0 ed0Var = new ed0(m28616d, adResponse);
        C6194b c6194b = new C6194b(new ad0(mediationData.m21924c(), gd0Var, ed0Var));
        C5724s3 m28617e = yx0Var.m28617e();
        hp0 hp0Var = new hp0(yx0Var, mediationData, m28617e);
        C6195c c6195c = new C6195c();
        this.f57589b = c6195c;
        wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var = new wc0<>(m28616d, m28617e, c6195c, ed0Var, c6194b, hp0Var);
        this.f57588a = wc0Var;
        this.f57590c = new C6196d(yx0Var, wc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24991a(@NonNull tx0 tx0Var) {
        tx0 tx0Var2 = tx0Var;
        MediatedRewardedAdapter m30441a = this.f57589b.m30441a();
        if (m30441a != null) {
            this.f57590c.m30442a(tx0Var2);
            m30441a.showRewardedAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24989a(@NonNull Context context) {
        this.f57588a.m29457a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24990a(@NonNull Context context, @NonNull AdResponse<String> adResponse) {
        this.f57588a.m29460a(context, (Context) this.f57590c);
    }
}
