package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.fj0;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.hp0;
import com.yandex.mobile.ads.impl.qi0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.nativeads.C6226o;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.m */
/* loaded from: classes3.dex */
public final class C6185m implements fj0 {

    /* renamed from: a */
    @NonNull
    private final C6191s f57554a;

    /* renamed from: b */
    @NonNull
    private final wc0<MediatedNativeAdapter, MediatedNativeAdapterListener> f57555b;

    public C6185m(@NonNull C6226o c6226o, @NonNull AdResponse<qi0> adResponse, @NonNull MediationData mediationData) {
        C5101g2 m28616d = c6226o.m28616d();
        gd0 gd0Var = new gd0(m28616d);
        ed0 ed0Var = new ed0(m28616d, adResponse);
        C6183k c6183k = new C6183k(new ad0(mediationData.m21924c(), gd0Var, ed0Var));
        C5724s3 m28617e = c6226o.m28617e();
        wc0<MediatedNativeAdapter, MediatedNativeAdapterListener> wc0Var = new wc0<>(m28616d, m28617e, new C6184l(), ed0Var, c6183k, new hp0(c6226o, mediationData, m28617e));
        this.f57555b = wc0Var;
        this.f57554a = new C6191s(adResponse, c6226o, wc0Var);
    }

    @Override // com.yandex.mobile.ads.impl.fj0
    /* renamed from: a */
    public final void mo24610a(@NonNull Context context, @NonNull AdResponse<qi0> adResponse) {
        this.f57555b.m29460a(context, (Context) this.f57554a);
    }
}
