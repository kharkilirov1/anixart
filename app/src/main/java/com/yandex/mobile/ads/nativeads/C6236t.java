package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.motion.widget.RunnableC0207a;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C5101g2;
import com.yandex.mobile.ads.impl.C5563p2;
import com.yandex.mobile.ads.impl.C5618q4;
import com.yandex.mobile.ads.impl.C5667r2;
import com.yandex.mobile.ads.impl.C5724s3;
import com.yandex.mobile.ads.impl.C5838u3;
import com.yandex.mobile.ads.impl.EnumC5007e6;
import com.yandex.mobile.ads.impl.ki0;
import com.yandex.mobile.ads.impl.vi0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.nativeads.t */
/* loaded from: classes3.dex */
public final class C6236t {

    /* renamed from: a */
    @NotNull
    private final ki0 f57798a;

    /* renamed from: b */
    @NotNull
    private final Handler f57799b;

    /* renamed from: c */
    @NotNull
    private final C5838u3 f57800c;

    /* renamed from: d */
    @Nullable
    private NativeAdLoadListener f57801d;

    /* renamed from: e */
    @Nullable
    private NativeBulkAdLoadListener f57802e;

    /* renamed from: f */
    @Nullable
    private SliderAdLoadListener f57803f;

    public C6236t(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull ki0 nativeAdLoadingFinishedListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(nativeAdLoadingFinishedListener, "nativeAdLoadingFinishedListener");
        this.f57798a = nativeAdLoadingFinishedListener;
        this.f57799b = new Handler(Looper.getMainLooper());
        this.f57800c = new C5838u3(context, adLoadingPhasesManager);
    }

    /* renamed from: a */
    public final void m30647a(@NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f57800c.m28846b(new C5618q4(adConfiguration));
    }

    /* renamed from: b */
    public final void m30655b(@NotNull C5563p2 error) {
        Intrinsics.m32179h(error, "error");
        m30637a(error);
    }

    /* renamed from: a */
    public final void m30648a(@NotNull vi0 reportParameterManager) {
        Intrinsics.m32179h(reportParameterManager, "reportParameterManager");
        this.f57800c.m28844a(reportParameterManager);
    }

    /* renamed from: a */
    public final void m30650a(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f57801d = nativeAdLoadListener;
    }

    /* renamed from: a */
    public final void m30651a(@Nullable NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f57802e = nativeBulkAdLoadListener;
    }

    /* renamed from: a */
    public final void m30653a(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f57803f = sliderAdLoadListener;
    }

    /* renamed from: a */
    public final void m30646a() {
        this.f57799b.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void m30649a(@NotNull NativeAd nativeAd) {
        Intrinsics.m32179h(nativeAd, "nativeAd");
        String m24033a = EnumC5007e6.f49819e.m24033a();
        Intrinsics.m32178g(m24033a, "NATIVE.typeName");
        C5667r2.m27823a(m24033a);
        this.f57800c.m28843a();
        this.f57799b.post(new RunnableC0207a(this, nativeAd, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30639a(C6236t this$0, NativeAd nativeAd) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(nativeAd, "$nativeAd");
        NativeAdLoadListener nativeAdLoadListener = this$0.f57801d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdLoaded(nativeAd);
        }
        ((C6230q) this$0.f57798a).m30624b();
    }

    /* renamed from: a */
    public final void m30654a(@NotNull ArrayList nativeGenericAds) {
        Intrinsics.m32179h(nativeGenericAds, "nativeGenericAds");
        String m24033a = EnumC5007e6.f49819e.m24033a();
        Intrinsics.m32178g(m24033a, "NATIVE.typeName");
        C5667r2.m27823a(m24033a);
        this.f57800c.m28843a();
        this.f57799b.post(new RunnableC0207a(this, nativeGenericAds, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30641a(C6236t this$0, List nativeGenericAds) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(nativeGenericAds, "$nativeGenericAds");
        NativeBulkAdLoadListener nativeBulkAdLoadListener = this$0.f57802e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsLoaded(nativeGenericAds);
        }
        ((C6230q) this$0.f57798a).m30624b();
    }

    /* renamed from: a */
    public final void m30652a(@NotNull SliderAd sliderAd) {
        Intrinsics.m32179h(sliderAd, "sliderAd");
        String m24033a = EnumC5007e6.f49819e.m24033a();
        Intrinsics.m32178g(m24033a, "NATIVE.typeName");
        C5667r2.m27823a(m24033a);
        this.f57800c.m28843a();
        this.f57799b.post(new RunnableC0207a(this, sliderAd, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30640a(C6236t this$0, SliderAd sliderAd) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(sliderAd, "$sliderAd");
        SliderAdLoadListener sliderAdLoadListener = this$0.f57803f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdLoaded(sliderAd);
        }
        ((C6230q) this$0.f57798a).m30624b();
    }

    /* renamed from: a */
    private final void m30637a(C5563p2 c5563p2) {
        this.f57800c.m28845a(c5563p2.m27145b());
        this.f57799b.post(new RunnableC0207a(c5563p2, this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30638a(C5563p2 error, C6236t this$0) {
        Intrinsics.m32179h(error, "$error");
        Intrinsics.m32179h(this$0, "this$0");
        AdRequestError adRequestError = new AdRequestError(error.m27144a(), error.m27145b());
        NativeAdLoadListener nativeAdLoadListener = this$0.f57801d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        NativeBulkAdLoadListener nativeBulkAdLoadListener = this$0.f57802e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsFailedToLoad(adRequestError);
        }
        SliderAdLoadListener sliderAdLoadListener = this$0.f57803f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdFailedToLoad(adRequestError);
        }
        ((C6230q) this$0.f57798a).m30624b();
    }
}
