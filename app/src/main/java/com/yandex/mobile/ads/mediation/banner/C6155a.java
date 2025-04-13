package com.yandex.mobile.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5846u6;
import com.yandex.mobile.ads.impl.k20;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.mediation.banner.C6162h;
import com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.mediation.banner.a */
/* loaded from: classes3.dex */
final class C6155a implements MediatedBannerAdapter.MediatedBannerAdapterListener {

    /* renamed from: a */
    @NonNull
    private final WeakReference<C4637e> f57466a;

    /* renamed from: b */
    @NonNull
    private final C6162h f57467b;

    /* renamed from: c */
    @NonNull
    private final wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> f57468c;

    /* renamed from: d */
    @NonNull
    private final k20 f57469d;

    /* renamed from: e */
    private boolean f57470e;

    /* renamed from: com.yandex.mobile.ads.mediation.banner.a$a */
    public class a implements C6162h.a {
        private a() {
        }

        public /* synthetic */ a(C6155a c6155a, int i2) {
            this();
        }
    }

    public C6155a(@NonNull C4637e c4637e, @NonNull wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var, @NonNull C6162h c6162h) {
        this.f57468c = wc0Var;
        this.f57467b = c6162h;
        this.f57466a = new WeakReference<>(c4637e);
        this.f57469d = new k20(wc0Var);
    }

    /* renamed from: c */
    public static void m30413c(C6155a c6155a) {
        C4637e c4637e = c6155a.f57466a.get();
        if (c4637e != null) {
            Context m28621i = c4637e.m28621i();
            wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var = c6155a.f57468c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29465b(m28621i, new HashMap());
            c4637e.mo21778a(c6155a.f57469d.m26013a());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdClicked() {
        C4637e c4637e = this.f57466a.get();
        if (c4637e != null) {
            Context m28621i = c4637e.m28621i();
            wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var = this.f57468c;
            Objects.requireNonNull(wc0Var);
            wc0Var.m29461a(m28621i, new HashMap());
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(@NonNull AdRequestError adRequestError) {
        C4637e c4637e = this.f57466a.get();
        if (c4637e != null) {
            Context m28621i = c4637e.m28621i();
            C5563p2 c5563p2 = new C5563p2(adRequestError.getCode(), adRequestError.getDescription());
            if (this.f57470e) {
                this.f57468c.m29459a(m28621i, c5563p2, this);
            } else {
                this.f57468c.m29464b(m28621i, c5563p2, this);
            }
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdImpression() {
        C4637e c4637e;
        if (this.f57468c.m29467b() || (c4637e = this.f57466a.get()) == null) {
            return;
        }
        Context m28621i = c4637e.m28621i();
        wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var = this.f57468c;
        Objects.requireNonNull(wc0Var);
        wc0Var.m29465b(m28621i, new HashMap());
        c4637e.mo21778a(this.f57469d.m26013a());
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLeftApplication() {
        C4637e c4637e = this.f57466a.get();
        if (c4637e != null) {
            c4637e.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLoaded(@NonNull View view) {
        C4637e c4637e = this.f57466a.get();
        if (c4637e != null) {
            Context context = view.getContext();
            if (this.f57470e) {
                this.f57468c.m29463b(context);
            } else {
                this.f57470e = true;
                wc0<MediatedBannerAdapter, MediatedBannerAdapter.MediatedBannerAdapterListener> wc0Var = this.f57468c;
                Objects.requireNonNull(wc0Var);
                wc0Var.m29469c(context, new HashMap());
            }
            this.f57467b.m30416a(view, new a(this, 0));
            c4637e.m28614b(new C5846u6(this.f57468c).m28904a());
            c4637e.mo21780p();
        }
    }
}
