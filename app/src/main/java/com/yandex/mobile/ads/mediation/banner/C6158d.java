package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.MediationData;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.InterfaceC6021xc;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.ed0;
import com.yandex.mobile.ads.impl.hp0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;

/* renamed from: com.yandex.mobile.ads.mediation.banner.d */
/* loaded from: classes3.dex */
public final class C6158d implements InterfaceC6021xc {

    /* renamed from: a */
    @NonNull
    private final C6155a f57473a;

    /* renamed from: b */
    @NonNull
    private final wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f57474b;

    public C6158d(@NonNull C4637e c4637e, @NonNull AdResponse<String> adResponse, @NonNull MediationData mediationData) {
        C5101g2 m28616d = c4637e.m28616d();
        C6159e c6159e = new C6159e(m28616d);
        ed0 ed0Var = new ed0(m28616d, adResponse);
        C6156b c6156b = new C6156b(new ad0(mediationData.m21924c(), c6159e, ed0Var));
        C5724s3 m28617e = c4637e.m28617e();
        wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var = new wc0<>(m28616d, m28617e, new C6157c(), ed0Var, c6156b, new hp0(c4637e, mediationData, m28617e));
        this.f57474b = wc0Var;
        this.f57473a = new C6155a(c4637e, wc0Var, new C6162h(c4637e.m21783y()));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24185a(@NonNull Context context) {
        this.f57474b.m29457a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24186a(@NonNull Context context, @NonNull AdResponse<String> adResponse) {
        this.f57474b.m29460a(context, (Context) this.f57473a);
    }
}
