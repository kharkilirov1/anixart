package com.yandex.mobile.ads.mediation.interstitial;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.AbstractC4992dx;
import com.yandex.mobile.ads.impl.AbstractC5462mw;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5846u6;
import com.yandex.mobile.ads.impl.k20;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.interstitial.a */
/* loaded from: classes3.dex */
final class C6166a<T extends AbstractC4992dx<T>> implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {

    /* renamed from: a */
    @NonNull
    private final WeakReference<AbstractC5462mw<T>> f57490a;

    /* renamed from: b */
    @NonNull
    private WeakReference<AbstractC4992dx<T>> f57491b = new WeakReference<>(null);

    /* renamed from: c */
    @NonNull
    private final wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> f57492c;

    /* renamed from: d */
    @NonNull
    private final k20 f57493d;

    public C6166a(@NonNull AbstractC5462mw<T> abstractC5462mw, @NonNull wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var) {
        this.f57490a = new WeakReference<>(abstractC5462mw);
        this.f57492c = wc0Var;
        this.f57493d = new k20(wc0Var);
    }

    /* renamed from: a */
    public final void m30418a(@NonNull AbstractC4992dx<T> abstractC4992dx) {
        this.f57491b = new WeakReference<>(abstractC4992dx);
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        AbstractC4992dx<T> abstractC4992dx;
        if (this.f57492c.m29467b() || (abstractC4992dx = this.f57491b.get()) == null) {
            return;
        }
        Context m27310c = abstractC4992dx.m27310c();
        wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var = this.f57492c;
        Objects.requireNonNull(wc0Var);
        wc0Var.m29465b(m27310c, new HashMap());
        abstractC4992dx.mo21751a(this.f57493d.m26013a());
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        AbstractC4992dx<T> abstractC4992dx = this.f57491b.get();
        if (abstractC4992dx != null) {
            Context m27310c = abstractC4992dx.m27310c();
            wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var = this.f57492c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29461a(m27310c, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        AbstractC4992dx<T> abstractC4992dx = this.f57491b.get();
        if (abstractC4992dx != null) {
            abstractC4992dx.m23951o();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(@NonNull AdRequestError adRequestError) {
        AbstractC5462mw<T> abstractC5462mw = this.f57490a.get();
        if (abstractC5462mw != null) {
            this.f57492c.m29464b(abstractC5462mw.m28621i(), new C5563p2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLeftApplication() {
        AbstractC4992dx<T> abstractC4992dx = this.f57491b.get();
        if (abstractC4992dx != null) {
            abstractC4992dx.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        AbstractC5462mw<T> abstractC5462mw = this.f57490a.get();
        if (abstractC5462mw != null) {
            Context m28621i = abstractC5462mw.m28621i();
            wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var = this.f57492c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29469c(m28621i, new HashMap());
            abstractC5462mw.m28614b(new C5846u6(this.f57492c).m28904a());
            abstractC5462mw.mo21780p();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        AbstractC4992dx<T> abstractC4992dx;
        AbstractC4992dx<T> abstractC4992dx2 = this.f57491b.get();
        if (abstractC4992dx2 != null) {
            abstractC4992dx2.m23952p();
            this.f57492c.m29468c(abstractC4992dx2.m27310c());
        }
        if (!this.f57492c.m29467b() || (abstractC4992dx = this.f57491b.get()) == null) {
            return;
        }
        Context m27310c = abstractC4992dx.m27310c();
        wc0<MediatedInterstitialAdapter, MediatedInterstitialAdapter.MediatedInterstitialAdapterListener> wc0Var = this.f57492c;
        Objects.requireNonNull(wc0Var);
        wc0Var.m29465b(m27310c, new HashMap());
        abstractC4992dx.mo21751a(this.f57493d.m26013a());
    }
}
