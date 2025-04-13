package com.yandex.mobile.ads.mediation.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5846u6;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.k20;
import com.yandex.mobile.ads.impl.ld0;
import com.yandex.mobile.ads.impl.nd0;
import com.yandex.mobile.ads.impl.q10;
import com.yandex.mobile.ads.impl.qi0;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.tv0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.yc0;
import com.yandex.mobile.ads.mediation.nativeads.C6180h;
import com.yandex.mobile.ads.nativeads.C6226o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.nativeads.s */
/* loaded from: classes3.dex */
final class C6191s implements MediatedNativeAdapterListener {

    /* renamed from: a */
    @NonNull
    private final Context f57569a;

    /* renamed from: b */
    @NonNull
    private final AdResponse<qi0> f57570b;

    /* renamed from: c */
    @NonNull
    private final wc0<MediatedNativeAdapter, MediatedNativeAdapterListener> f57571c;

    /* renamed from: d */
    @NonNull
    private final WeakReference<C6226o> f57572d;

    /* renamed from: e */
    @NonNull
    private final C6178f f57573e;

    /* renamed from: f */
    @NonNull
    private final q10 f57574f;

    /* renamed from: g */
    @NonNull
    private final C6180h f57575g;

    /* renamed from: h */
    @NonNull
    private final HashMap f57576h;

    /* renamed from: i */
    @NonNull
    private final HashMap f57577i;

    /* renamed from: j */
    @NonNull
    private final C6182j f57578j;

    /* renamed from: k */
    @NonNull
    private final C6181i f57579k;

    /* renamed from: l */
    @NonNull
    private final k20 f57580l;

    /* renamed from: m */
    @NonNull
    private final ld0 f57581m;

    /* renamed from: n */
    private boolean f57582n;

    public C6191s(@NonNull AdResponse<qi0> adResponse, @NonNull C6226o c6226o, @NonNull wc0<MediatedNativeAdapter, MediatedNativeAdapterListener> wc0Var) {
        HashMap hashMap = new HashMap();
        this.f57576h = hashMap;
        this.f57577i = new HashMap();
        Context m28621i = c6226o.m28621i();
        Context applicationContext = m28621i.getApplicationContext();
        this.f57569a = applicationContext;
        this.f57570b = adResponse;
        this.f57571c = wc0Var;
        this.f57572d = new WeakReference<>(c6226o);
        this.f57573e = new C6178f();
        q10 q10Var = new q10(m28621i);
        this.f57574f = q10Var;
        this.f57578j = new C6182j();
        C6181i c6181i = new C6181i(m28621i);
        this.f57579k = c6181i;
        this.f57575g = new C6180h(m28621i, q10Var, c6181i);
        this.f57580l = new k20(wc0Var);
        this.f57581m = new ld0(applicationContext, wc0Var, hashMap);
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClicked() {
        this.f57571c.m29461a(this.f57569a, this.f57576h);
        Context context = this.f57569a;
        sv0.EnumC5764b enumC5764b = sv0.EnumC5764b.f54813A;
        tv0 tv0Var = new tv0(this.f57576h);
        tv0Var.m28761b(enumC5764b.m28361a(), "event_type");
        tv0Var.m28761b(this.f57577i, "ad_info");
        tv0Var.m28759a(this.f57570b.m21813c());
        Map<String, Object> m21829s = this.f57570b.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        this.f57571c.m29462a(context, tv0Var.m28756a());
        this.f57573e.m30423a();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdClosed() {
        this.f57573e.m30426b();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
        C6226o c6226o = this.f57572d.get();
        if (c6226o != null) {
            this.f57571c.m29464b(c6226o.m28621i(), new C5563p2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdImpression() {
        if (this.f57582n) {
            return;
        }
        this.f57582n = true;
        this.f57571c.m29465b(this.f57569a, this.f57576h);
        Context context = this.f57569a;
        sv0.EnumC5764b enumC5764b = sv0.EnumC5764b.f54855w;
        tv0 tv0Var = new tv0(this.f57576h);
        tv0Var.m28761b(enumC5764b.m28361a(), "event_type");
        tv0Var.m28761b(this.f57577i, "ad_info");
        tv0Var.m28759a(this.f57570b.m21813c());
        Map<String, Object> m21829s = this.f57570b.m21829s();
        if (m21829s != null) {
            tv0Var.m28760a(m21829s);
        }
        this.f57571c.m29462a(context, tv0Var.m28756a());
        this.f57573e.m30424a(this.f57580l.m26013a());
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdLeftApplication() {
        this.f57573e.m30427c();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAdOpened() {
        this.f57573e.m30428d();
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onAppInstallAdLoaded(@NonNull MediatedNativeAd mediatedNativeAd) {
        m30438a(mediatedNativeAd, 2);
    }

    @Override // com.yandex.mobile.ads.mediation.nativeads.MediatedNativeAdapterListener
    public final void onContentAdLoaded(@NonNull MediatedNativeAd mediatedNativeAd) {
        m30438a(mediatedNativeAd, 1);
    }

    /* renamed from: a */
    private void m30438a(@NonNull final MediatedNativeAd mediatedNativeAd, @NonNull int i2) {
        final C6226o c6226o = this.f57572d.get();
        if (c6226o != null) {
            Context m28621i = c6226o.m28621i();
            this.f57576h.put("native_ad_type", cx0.m23548a(i2));
            this.f57571c.m29469c(m28621i, this.f57576h);
            HashMap hashMap = new HashMap();
            hashMap.put("title", mediatedNativeAd.getMediatedNativeAdAssets().getTitle());
            this.f57577i.putAll(hashMap);
            Objects.requireNonNull(this.f57578j);
            MediatedNativeAdAssets mediatedNativeAdAssets = mediatedNativeAd.getMediatedNativeAdAssets();
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediatedNativeAdAssets.getFavicon());
            arrayList.add(mediatedNativeAdAssets.getIcon());
            arrayList.add(mediatedNativeAdAssets.getImage());
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediatedNativeAdImage mediatedNativeAdImage = (MediatedNativeAdImage) it.next();
                if (mediatedNativeAdImage != null) {
                    arrayList2.add(mediatedNativeAdImage);
                }
            }
            this.f57574f.m27595a(this.f57579k.m30433b(arrayList2));
            this.f57575g.m30430a(mediatedNativeAd, i2, arrayList2, new C6180h.a() { // from class: com.yandex.mobile.ads.mediation.nativeads.t
                @Override // com.yandex.mobile.ads.mediation.nativeads.C6180h.a
                /* renamed from: a */
                public final void mo30431a(AdResponse adResponse) {
                    C6191s.this.m30439a(mediatedNativeAd, c6226o, adResponse);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m30439a(MediatedNativeAd mediatedNativeAd, C6226o c6226o, AdResponse adResponse) {
        C6187o c6187o = new C6187o(mediatedNativeAd, this.f57581m);
        c6226o.m30595a((AdResponse<qi0>) adResponse, new di0(new yc0(this.f57570b, this.f57571c.m29456a()), new C6177e(new C6190r(this)), c6187o, new jd0(), new nd0()), new C5846u6(this.f57571c).m28904a());
    }
}
