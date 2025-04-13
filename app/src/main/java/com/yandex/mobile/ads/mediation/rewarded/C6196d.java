package com.yandex.mobile.ads.mediation.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5846u6;
import com.yandex.mobile.ads.impl.k20;
import com.yandex.mobile.ads.impl.tx0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.yx0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.rewarded.d */
/* loaded from: classes3.dex */
final class C6196d implements MediatedRewardedAdapterListener {

    /* renamed from: a */
    @NonNull
    private final WeakReference<yx0> f57593a;

    /* renamed from: b */
    @NonNull
    private WeakReference<tx0> f57594b = new WeakReference<>(null);

    /* renamed from: c */
    @NonNull
    private final wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> f57595c;

    /* renamed from: d */
    @NonNull
    private final k20 f57596d;

    public C6196d(@NonNull yx0 yx0Var, @NonNull wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var) {
        this.f57593a = new WeakReference<>(yx0Var);
        this.f57595c = wc0Var;
        this.f57596d = new k20(wc0Var);
    }

    /* renamed from: a */
    public final void m30442a(@NonNull tx0 tx0Var) {
        this.f57594b = new WeakReference<>(tx0Var);
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onAdImpression() {
        tx0 tx0Var;
        if (this.f57595c.m29467b() || (tx0Var = this.f57594b.get()) == null) {
            return;
        }
        Context m27310c = tx0Var.m27310c();
        wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var = this.f57595c;
        Objects.requireNonNull(wc0Var);
        wc0Var.m29465b(m27310c, new HashMap());
        tx0Var.mo21751a(this.f57596d.m26013a());
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewarded(@Nullable MediatedReward mediatedReward) {
        tx0 tx0Var = this.f57594b.get();
        if (tx0Var != null) {
            this.f57595c.m29458a(tx0Var.m27310c(), tx0Var.m27309b());
            tx0Var.m28766r();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdClicked() {
        tx0 tx0Var = this.f57594b.get();
        if (tx0Var != null) {
            Context m27310c = tx0Var.m27310c();
            wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var = this.f57595c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29461a(m27310c, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdDismissed() {
        tx0 tx0Var = this.f57594b.get();
        if (tx0Var != null) {
            tx0Var.m23951o();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdFailedToLoad(@NonNull AdRequestError adRequestError) {
        yx0 yx0Var = this.f57593a.get();
        if (yx0Var != null) {
            this.f57595c.m29464b(yx0Var.m28621i(), new C5563p2(adRequestError.getCode(), adRequestError.getDescription()), this);
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLeftApplication() {
        tx0 tx0Var = this.f57594b.get();
        if (tx0Var != null) {
            tx0Var.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLoaded() {
        yx0 yx0Var = this.f57593a.get();
        if (yx0Var != null) {
            Context m28621i = yx0Var.m28621i();
            wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var = this.f57595c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29469c(m28621i, new HashMap());
            yx0Var.m28614b(new C5846u6(this.f57595c).m28904a());
            yx0Var.mo21780p();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdShown() {
        tx0 tx0Var;
        tx0 tx0Var2 = this.f57594b.get();
        if (tx0Var2 != null) {
            tx0Var2.m23952p();
            this.f57595c.m29468c(tx0Var2.m27310c());
        }
        if (!this.f57595c.m29467b() || (tx0Var = this.f57594b.get()) == null) {
            return;
        }
        Context m27310c = tx0Var.m27310c();
        wc0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> wc0Var = this.f57595c;
        Objects.requireNonNull(wc0Var);
        wc0Var.m29465b(m27310c, new HashMap());
        tx0Var.mo21751a(this.f57596d.m26013a());
    }
}
