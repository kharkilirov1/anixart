package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.AbstractC4992dx;
import com.yandex.mobile.ads.impl.AbstractC5462mw;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.InterfaceC5148gw;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.hp0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.d */
/* loaded from: classes3.dex */
public final class C6169d<T extends AbstractC4992dx<T>> implements InterfaceC5148gw<T> {

    /* renamed from: a */
    @NonNull
    private final wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f57496a;

    /* renamed from: b */
    @NonNull
    private final C6168c f57497b;

    /* renamed from: c */
    @NonNull
    private final C6166a<T> f57498c;

    public C6169d(@NonNull AbstractC5462mw<T> abstractC5462mw, @NonNull AdResponse<String> adResponse, @NonNull MediationData mediationData) {
        C5101g2 m28616d = abstractC5462mw.m28616d();
        gd0 gd0Var = new gd0(m28616d);
        ed0 ed0Var = new ed0(m28616d, adResponse);
        C6167b c6167b = new C6167b(new ad0(mediationData.m21924c(), gd0Var, ed0Var));
        C5724s3 m28617e = abstractC5462mw.m28617e();
        hp0 hp0Var = new hp0(abstractC5462mw, mediationData, m28617e);
        C6168c c6168c = new C6168c();
        this.f57497b = c6168c;
        wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var = new wc0<>(m28616d, m28617e, c6168c, ed0Var, c6167b, hp0Var);
        this.f57496a = wc0Var;
        this.f57498c = new C6166a<>(abstractC5462mw, wc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24989a(@NonNull Context context) {
        this.f57496a.m29457a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24990a(@NonNull Context context, @NonNull AdResponse<String> adResponse) {
        this.f57496a.m29460a(context, (Context) this.f57498c);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24991a(@NonNull T t) {
        MediatedInterstitialAdapter m30419a = this.f57497b.m30419a();
        if (m30419a != null) {
            this.f57498c.m30418a(t);
            m30419a.showInterstitial();
        }
    }
}
