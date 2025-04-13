package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C4911ca;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dt0 implements InterfaceC5513nw<C4798aa> {

    /* renamed from: a */
    @NotNull
    private final Handler f49737a;

    /* renamed from: b */
    @NotNull
    private final C5838u3 f49738b;

    /* renamed from: c */
    @NotNull
    private final C6112z9 f49739c;

    /* renamed from: d */
    @Nullable
    private AppOpenAdLoadListener f49740d;

    /* renamed from: e */
    @Nullable
    private InterfaceC5564p3 f49741e;

    public dt0(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull Handler handler, @NotNull C5838u3 adLoadingResultReporter, @NotNull C6112z9 appOpenAdApiControllerFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(handler, "handler");
        Intrinsics.m32179h(adLoadingResultReporter, "adLoadingResultReporter");
        Intrinsics.m32179h(appOpenAdApiControllerFactory, "appOpenAdApiControllerFactory");
        this.f49737a = handler;
        this.f49738b = adLoadingResultReporter;
        this.f49739c = appOpenAdApiControllerFactory;
    }

    /* renamed from: a */
    public final void m23934a(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f49740d = appOpenAdLoadListener;
    }

    /* renamed from: a */
    public final void m23936a(@NotNull C4911ca.a listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f49741e = listener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a */
    public final void mo23938a(@NotNull C5563p2 error) {
        Intrinsics.m32179h(error, "error");
        String m27145b = error.m27145b();
        Intrinsics.m32178g(m27145b, "error.description");
        this.f49738b.m28845a(m27145b);
        this.f49737a.post(new hn1(error, this, 11));
    }

    public /* synthetic */ dt0(Context context, C5724s3 c5724s3) {
        this(context, c5724s3, new Handler(Looper.getMainLooper()), new C5838u3(context, c5724s3), new C6112z9(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23931a(C5563p2 error, dt0 this$0) {
        Intrinsics.m32179h(error, "$error");
        Intrinsics.m32179h(this$0, "this$0");
        AdRequestError adRequestError = new AdRequestError(error.m27144a(), error.m27145b());
        AppOpenAdLoadListener appOpenAdLoadListener = this$0.f49740d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        InterfaceC5564p3 interfaceC5564p3 = this$0.f49741e;
        if (interfaceC5564p3 != null) {
            interfaceC5564p3.mo23084a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo23937a(@NotNull C4798aa ad) {
        Intrinsics.m32179h(ad, "ad");
        this.f49738b.m28843a();
        this.f49737a.post(new hn1(this, this.f49739c.m30075a(ad), 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m23930a(dt0 this$0, C6063y9 appOpenAdApiController) {
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(appOpenAdApiController, "$appOpenAdApiController");
        AppOpenAdLoadListener appOpenAdLoadListener = this$0.f49740d;
        if (appOpenAdLoadListener != null) {
            appOpenAdLoadListener.onAdLoaded(appOpenAdApiController);
        }
        InterfaceC5564p3 interfaceC5564p3 = this$0.f49741e;
        if (interfaceC5564p3 != null) {
            interfaceC5564p3.mo23084a();
        }
    }
}
