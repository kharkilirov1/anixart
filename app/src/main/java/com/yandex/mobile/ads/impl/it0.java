package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class it0 implements InterfaceC5149gx {

    /* renamed from: a */
    @NotNull
    private final Handler f51437a;

    /* renamed from: b */
    @NotNull
    private final C5838u3 f51438b;

    /* renamed from: c */
    @Nullable
    private RewardedAdEventListener f51439c;

    public it0(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull Handler handler, @NotNull C5838u3 adLoadingResultReporter) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(handler, "handler");
        Intrinsics.m32179h(adLoadingResultReporter, "adLoadingResultReporter");
        this.f51437a = handler;
        this.f51438b = adLoadingResultReporter;
    }

    /* renamed from: a */
    public final void m25732a(@NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f51438b.m28846b(new C5618q4(adConfiguration));
    }

    public final void onAdFailedToLoad(@NotNull AdRequestError error) {
        Intrinsics.m32179h(error, "error");
        String description = error.getDescription();
        Intrinsics.m32178g(description, "error.description");
        this.f51438b.m28845a(description);
        this.f51437a.post(new hn1(this, error, 20));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5149gx
    public final void onAdLoaded() {
        this.f51438b.m28843a();
        this.f51437a.post(new gp1(this, 5));
    }

    /* renamed from: a */
    public final void m25733a(@NotNull sv0.InterfaceC5763a reportParameterManager) {
        Intrinsics.m32179h(reportParameterManager, "reportParameterManager");
        this.f51438b.m28844a(reportParameterManager);
    }

    public /* synthetic */ it0(Context context, C5724s3 c5724s3) {
        this(context, c5724s3, new Handler(Looper.getMainLooper()), new C5838u3(context, c5724s3));
    }

    /* renamed from: a */
    public final void m25734a(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f51439c = rewardedAdEventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25728a(it0 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51439c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m25729a(it0 this$0, AdRequestError error) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(error, "$error");
        RewardedAdEventListener rewardedAdEventListener = this$0.f51439c;
        if (rewardedAdEventListener != null) {
            rewardedAdEventListener.onAdFailedToLoad(error);
        }
    }
}
