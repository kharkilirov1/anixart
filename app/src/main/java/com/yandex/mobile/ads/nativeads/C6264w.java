package com.yandex.mobile.ads.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5276ja;
import com.yandex.mobile.ads.impl.C5432ma;
import com.yandex.mobile.ads.impl.C5965wa;
import com.yandex.mobile.ads.impl.InterfaceC5330ka;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.l20;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.s01;
import com.yandex.mobile.ads.impl.w10;
import com.yandex.mobile.ads.impl.yi0;
import com.yandex.mobile.ads.impl.zj0;
import com.yandex.mobile.ads.impl.zl0;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.w */
/* loaded from: classes3.dex */
public final class C6264w<T extends View> {

    /* renamed from: a */
    @NonNull
    private final AbstractC6202c f57971a;

    /* renamed from: b */
    @NonNull
    private final w10 f57972b;

    /* renamed from: c */
    @NonNull
    private final C6201b0 f57973c;

    /* renamed from: d */
    @NonNull
    private final HashMap f57974d;

    /* renamed from: e */
    @NonNull
    private final C6265x f57975e;

    public C6264w(@NonNull T t, @NonNull yi0<T> yi0Var, @NonNull C5101g2 c5101g2, @NonNull w10 w10Var, @NonNull l20 l20Var, @NonNull AbstractC6202c abstractC6202c, @NonNull di0 di0Var, @NonNull C5965wa c5965wa, @NonNull zj0 zj0Var, @NonNull nj0 nj0Var, @NonNull zl0 zl0Var, @Nullable s01 s01Var) {
        this.f57971a = abstractC6202c;
        this.f57972b = w10Var;
        oc0 oc0Var = new oc0(c5965wa, c5101g2, l20Var, di0Var.m23890c(), s01Var);
        C6201b0 mo29945a = yi0Var.mo29945a(t);
        this.f57973c = mo29945a;
        this.f57974d = new C5432ma(mo29945a, w10Var, oc0Var, zj0Var, nj0Var, zl0Var).m26599a();
        this.f57975e = new C6265x();
    }

    /* renamed from: a */
    public final void m30750a() {
        for (InterfaceC5330ka interfaceC5330ka : this.f57974d.values()) {
            if (interfaceC5330ka != null) {
                interfaceC5330ka.mo23909a();
            }
        }
    }

    /* renamed from: b */
    public final void m30751b() {
        for (InterfaceC5330ka interfaceC5330ka : this.f57974d.values()) {
            if (interfaceC5330ka != null) {
                interfaceC5330ka.destroy();
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public final Map<String, InterfaceC5330ka<?>> m30752c() {
        return this.f57974d;
    }

    @NonNull
    /* renamed from: d */
    public final w10 m30753d() {
        return this.f57972b;
    }

    @Nullable
    /* renamed from: e */
    public final View m30754e() {
        return this.f57973c.m30513l();
    }

    @Nullable
    /* renamed from: f */
    public final NativeAdViewBinder m30755f() {
        View m30513l = this.f57973c.m30513l();
        if (m30513l == null) {
            return null;
        }
        C6265x c6265x = this.f57975e;
        C6201b0 c6201b0 = this.f57973c;
        Objects.requireNonNull(c6265x);
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(m30513l);
        try {
            NativeAdViewBinder.Builder priceView = builder.setAgeView(c6201b0.m30502a()).setBodyView(c6201b0.m30504c()).setCallToActionView(c6201b0.m30505d()).setDomainView(c6201b0.m30507f()).setFaviconView(c6201b0.m30508g()).setFeedbackView(c6201b0.m30509h()).setIconView(c6201b0.m30510i()).setMediaView(c6201b0.m30512k()).setPriceView(c6201b0.m30514m());
            View m30515n = c6201b0.m30515n();
            priceView.setRatingView(m30515n instanceof Rating ? m30515n : null).setReviewCountView(c6201b0.m30516o()).setSponsoredView(c6201b0.m30517p()).setTitleView(c6201b0.m30518q()).setWarningView(c6201b0.m30519r());
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
        }
        return builder.build();
    }

    @NonNull
    /* renamed from: g */
    public final AbstractC6202c m30756g() {
        return this.f57971a;
    }

    @NonNull
    /* renamed from: h */
    public final C6201b0 m30757h() {
        return this.f57973c;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC5330ka m30749a(@Nullable C5276ja c5276ja) {
        if (c5276ja != null) {
            return (InterfaceC5330ka) this.f57974d.get(c5276ja.m25824b());
        }
        return null;
    }
}
