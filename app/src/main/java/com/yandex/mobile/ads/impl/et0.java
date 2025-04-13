package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class et0 implements InterfaceC5607pw {

    /* renamed from: a */
    @NotNull
    private final Handler f50057a;

    /* renamed from: b */
    @Nullable
    private AppOpenAdEventListener f50058b;

    public et0(@NotNull Handler handler) {
        Intrinsics.m32179h(handler, "handler");
        this.f50057a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24256b(et0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = this$0.f50058b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m24257c(et0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = this$0.f50058b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    /* renamed from: a */
    public final void mo24263a() {
    }

    /* renamed from: a */
    public final void m24264a(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f50058b = appOpenAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdClicked() {
        this.f50057a.post(new go1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdDismissed() {
        this.f50057a.post(new go1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdShown() {
        this.f50057a.post(new go1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onImpression(@Nullable ImpressionData impressionData) {
        this.f50057a.post(new hn1(this, impressionData, 12));
    }

    /* renamed from: a */
    public final void m24265a(@NotNull z01 adError) {
        Intrinsics.m32179h(adError, "adError");
        this.f50057a.post(new hn1(this, adError, 13));
    }

    public /* synthetic */ et0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24254a(et0 this$0, AdError adError) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(adError, "$adError");
        AppOpenAdEventListener appOpenAdEventListener = this$0.f50058b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdFailedToPresent(adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24255a(et0 this$0, ImpressionData impressionData) {
        Intrinsics.m32179h(this$0, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = this$0.f50058b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m24253a(et0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        AppOpenAdEventListener appOpenAdEventListener = this$0.f50058b;
        if (appOpenAdEventListener != null) {
            appOpenAdEventListener.onAdClicked();
        }
    }
}
