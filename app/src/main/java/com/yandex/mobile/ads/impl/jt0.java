package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jt0 implements InterfaceC5607pw, xx0 {

    /* renamed from: a */
    @NotNull
    private final Handler f51727a;

    /* renamed from: b */
    @Nullable
    private RewardedAdEventListener f51728b;

    public jt0(@NotNull Handler handler) {
        Intrinsics.m32179h(handler, "handler");
        this.f51727a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m25942b(jt0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m25944c(jt0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onReturnedToApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m25945d(jt0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdShown();
        }
    }

    /* renamed from: a */
    public final void m25952a(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f51728b = rewardedAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdClicked() {
        this.f51727a.post(new ip1(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdDismissed() {
        this.f51727a.post(new ip1(this, 1));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onAdShown() {
        this.f51727a.post(new ip1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    public final void onImpression(@Nullable ImpressionData impressionData) {
        this.f51727a.post(new hn1(this, impressionData, 21));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5607pw
    /* renamed from: a */
    public final void mo24263a() {
        this.f51727a.post(new ip1(this, 3));
    }

    public /* synthetic */ jt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25940a(jt0 this$0, ImpressionData impressionData) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onImpression(impressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25939a(jt0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdClicked();
        }
        RewardedAdEventListener rewardedAdEventListener2 = this$0.f51728b;
        if (rewardedAdEventListener2 != null) {
            rewardedAdEventListener2.onLeftApplication();
        }
    }

    @Override // com.yandex.mobile.ads.impl.xx0
    /* renamed from: a */
    public final void mo25951a(@NotNull ll1 reward) {
        Intrinsics.m32179h(reward, "reward");
        this.f51727a.post(new hn1(this, reward, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25941a(jt0 this$0, Reward reward) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(reward, "$reward");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51728b;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onRewarded(reward);
        }
    }
}
