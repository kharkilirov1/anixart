package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes3.dex */
public final class ci0 implements InterfaceC4832b0 {

    /* renamed from: a */
    @NonNull
    private final Handler f49279a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    @Nullable
    private NativeAdEventListener f49280b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m23280c() {
        NativeAdEventListener nativeAdEventListener = this.f49280b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked();
            nativeAdEventListener.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m23282d() {
        NativeAdEventListener nativeAdEventListener = this.f49280b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onReturnedToApplication();
        }
    }

    /* renamed from: a */
    public final void m23285a(@Nullable NativeAdEventListener nativeAdEventListener) {
        this.f49280b = nativeAdEventListener;
    }

    /* renamed from: b */
    public final void m23286b(@Nullable AdImpressionData adImpressionData) {
        this.f49279a.post(new hn1(this, adImpressionData, 7));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onLeftApplication() {
        this.f49279a.post(new kn1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4832b0
    public final void onReturnedToApplication() {
        this.f49279a.post(new kn1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m23276a(AdImpressionData adImpressionData) {
        NativeAdEventListener nativeAdEventListener = this.f49280b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onImpression(adImpressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m23278b() {
        NativeAdEventListener nativeAdEventListener = this.f49280b;
        if (nativeAdEventListener instanceof ClosableNativeAdEventListener) {
            ((ClosableNativeAdEventListener) nativeAdEventListener).closeNativeAd();
        }
    }

    /* renamed from: a */
    public final void m23284a() {
        this.f49279a.post(new kn1(this, 0));
    }
}
