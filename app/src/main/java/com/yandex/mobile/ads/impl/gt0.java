package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gt0 implements InterfaceC5149gx {

    /* renamed from: a */
    @NotNull
    private final Handler f50730a;

    /* renamed from: b */
    @NotNull
    private final C5838u3 f50731b;

    /* renamed from: c */
    @Nullable
    private InterstitialAdEventListener f50732c;

    public gt0(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull Handler handler, @NotNull C5838u3 adLoadingResultReporter) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(handler, "handler");
        Intrinsics.m32179h(adLoadingResultReporter, "adLoadingResultReporter");
        this.f50730a = handler;
        this.f50731b = adLoadingResultReporter;
    }

    /* renamed from: a */
    public final void m24974a(@NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f50731b.m28846b(new C5618q4(adConfiguration));
    }

    public final void onAdFailedToLoad(@NotNull AdRequestError error) {
        Intrinsics.m32179h(error, "error");
        String description = error.getDescription();
        Intrinsics.m32178g(description, "error.description");
        this.f50731b.m28845a(description);
        this.f50730a.post(new hn1(this, error, 14));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5149gx
    public final void onAdLoaded() {
        this.f50731b.m28843a();
        this.f50730a.post(new gp1(this, 4));
    }

    /* renamed from: a */
    public final void m24975a(@NotNull sv0.InterfaceC5763a reportParameterManager) {
        Intrinsics.m32179h(reportParameterManager, "reportParameterManager");
        this.f50731b.m28844a(reportParameterManager);
    }

    public /* synthetic */ gt0(Context context, C5724s3 c5724s3) {
        this(context, c5724s3, new Handler(Looper.getMainLooper()), new C5838u3(context, c5724s3));
    }

    /* renamed from: a */
    public final void m24976a(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f50732c = interstitialAdEventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24970a(gt0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f50732c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24971a(gt0 this$0, AdRequestError error) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(error, "$error");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f50732c;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdFailedToLoad(error);
        }
    }
}
