package com.yandex.mobile.ads.nativeads;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.y */
/* loaded from: classes3.dex */
public final class C6266y {

    /* renamed from: a */
    @NonNull
    private final List<String> f57976a;

    public C6266y() {
        this(new ArrayList());
    }

    @NonNull
    /* renamed from: a */
    public final NativeAdViewBinder m30758a(@NonNull View view, @NonNull hh0 hh0Var) {
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(view);
        NativeAdViewBinder.Builder priceView = builder.setAgeView(hh0Var.mo24711g(view)).setBodyView(hh0Var.mo24705a(view)).setCallToActionView(hh0Var.mo24708d(view)).setDomainView(hh0Var.mo24716l(view)).setFaviconView(hh0Var.mo24710f(view)).setFeedbackView(hh0Var.mo24714j(view)).setIconView(hh0Var.mo24717m(view)).setMediaView(hh0Var.mo24706b(view)).setPriceView(hh0Var.mo24707c(view));
        View mo24712h = hh0Var.mo24712h(view);
        if (!(mo24712h instanceof Rating)) {
            mo24712h = null;
        }
        priceView.setRatingView(mo24712h).setReviewCountView(hh0Var.mo24718n(view)).setSponsoredView(hh0Var.mo24715k(view)).setTitleView(hh0Var.mo24713i(view)).setWarningView(hh0Var.mo24709e(view));
        for (String str : this.f57976a) {
            View mo24704a = hh0Var.mo24704a(view, str);
            if (mo24704a != null) {
                builder.m30487a(mo24704a, str);
            }
        }
        return builder.build();
    }

    public C6266y(@NonNull List<String> list) {
        this.f57976a = list;
    }
}
