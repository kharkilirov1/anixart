package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ht0 implements InterfaceC5607pw {

    /* renamed from: a */
    @NotNull
    private final Handler f51134a;

    /* renamed from: b */
    @Nullable
    private InterstitialAdEventListener f51135b;

    public ht0(@NotNull Handler handler) {
        Intrinsics.m32179h(handler, "handler");
        this.f51134a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25363b(ht0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f51135b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m25364c(ht0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f51135b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onReturnedToApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m25365d(ht0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f51135b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdShown();
        }
    }

    /* renamed from: a */
    public final void m25371a(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f51135b = interstitialAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdClicked() {
        this.f51134a.post(new wo1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdDismissed() {
        this.f51134a.post(new wo1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdShown() {
        this.f51134a.post(new wo1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onImpression(@Nullable ImpressionData impressionData) {
        this.f51134a.post(new hn1(this, impressionData, 18));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    /* renamed from: a */
    public final void mo24263a() {
        this.f51134a.post(new wo1(this, 3));
    }

    public /* synthetic */ ht0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25362a(ht0 this$0, ImpressionData impressionData) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f51135b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25361a(ht0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        InterstitialAdEventListener interstitialAdEventListener = this$0.f51135b;
        if (interstitialAdEventListener != null) {
            interstitialAdEventListener.onAdClicked();
        }
        InterstitialAdEventListener interstitialAdEventListener2 = this$0.f51135b;
        if (interstitialAdEventListener2 != null) {
            interstitialAdEventListener2.onLeftApplication();
        }
    }
}
