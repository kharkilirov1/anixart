package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y9 */
/* loaded from: classes3.dex */
public final class C6063y9 implements AppOpenAd {

    /* renamed from: a */
    @NotNull
    private final C4798aa f56691a;

    /* renamed from: b */
    @NotNull
    private final et0 f56692b;

    /* renamed from: c */
    @NotNull
    private final h90 f56693c;

    /* renamed from: d */
    @NotNull
    private final f90 f56694d;

    /* renamed from: e */
    @NotNull
    private final AtomicBoolean f56695e;

    public C6063y9(@NotNull Context context, @NotNull C4798aa appOpenAdContentController, @NotNull et0 proxyAppOpenAdShowListener, @NotNull h90 mainThreadUsageValidator, @NotNull f90 mainThreadExecutor) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(appOpenAdContentController, "appOpenAdContentController");
        Intrinsics.m32179h(proxyAppOpenAdShowListener, "proxyAppOpenAdShowListener");
        Intrinsics.m32179h(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.m32179h(mainThreadExecutor, "mainThreadExecutor");
        this.f56691a = appOpenAdContentController;
        this.f56692b = proxyAppOpenAdShowListener;
        this.f56693c = mainThreadUsageValidator;
        this.f56694d = mainThreadExecutor;
        this.f56695e = new AtomicBoolean(false);
        appOpenAdContentController.m22409a(proxyAppOpenAdShowListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29873a(C6063y9 this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        if (!this$0.f56695e.getAndSet(true)) {
            this$0.f56691a.m23953q();
            return;
        }
        et0 et0Var = this$0.f56692b;
        z01 FULLSCREEN_AD_WAS_ALREADY_PRESENTED = AbstractC5210i2.f51187a;
        Intrinsics.m32178g(FULLSCREEN_AD_WAS_ALREADY_PRESENTED, "FULLSCREEN_AD_WAS_ALREADY_PRESENTED");
        et0Var.m24265a(FULLSCREEN_AD_WAS_ALREADY_PRESENTED);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f56693c.m25094a();
        this.f56692b.m24264a(appOpenAdEventListener);
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.m32179h(activity, "activity");
        this.f56693c.m25094a();
        this.f56694d.m24373a(new gp1(this, 10));
    }

    public /* synthetic */ C6063y9(Context context, C4798aa c4798aa) {
        this(context, c4798aa, new et0(), new h90(context), new f90());
    }
}
