package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gk0 {

    /* renamed from: a */
    @NotNull
    private final bk0 f50632a;

    /* renamed from: b */
    @NotNull
    private final qk0 f50633b;

    /* renamed from: c */
    @NotNull
    private final C6035xp f50634c;

    /* renamed from: d */
    @NotNull
    private final C6086yp f50635d;

    @AnyThread
    /* renamed from: com.yandex.mobile.ads.impl.gk0$a */
    public interface InterfaceC5132a {
        /* renamed from: a */
        void mo24910a(@NotNull w10 w10Var);
    }

    @VisibleForTesting
    public gk0(@NotNull bk0 nativeMediaLoader, @NotNull qk0 nativeVerificationResourcesLoader, @NotNull C6035xp divKitInitializer, @NotNull C6086yp divKitIntegrationValidator) {
        Intrinsics.m32179h(nativeMediaLoader, "nativeMediaLoader");
        Intrinsics.m32179h(nativeVerificationResourcesLoader, "nativeVerificationResourcesLoader");
        Intrinsics.m32179h(divKitInitializer, "divKitInitializer");
        Intrinsics.m32179h(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f50632a = nativeMediaLoader;
        this.f50633b = nativeVerificationResourcesLoader;
        this.f50634c = divKitInitializer;
        this.f50635d = divKitIntegrationValidator;
    }

    /* renamed from: a */
    public final void m24908a() {
        this.f50632a.m22852a();
        this.f50633b.m27747a();
    }

    /* renamed from: a */
    public final void m24909a(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull kh0 nativeAdBlock, @NotNull InterfaceC5132a listener) {
        fk0 fk0Var;
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        Intrinsics.m32179h(listener, "listener");
        Objects.requireNonNull(this.f50635d);
        if (C6086yp.m29956a(context) && Intrinsics.m32174c(nativeAdBlock.m26127b().m21833w(), "divkit")) {
            Objects.requireNonNull(this.f50634c);
            C6035xp.m29781a(context);
        }
        if (adConfiguration.m24795q()) {
            sp0 sp0Var = new sp0();
            fk0Var = new fk0(listener, sp0Var, 2);
            this.f50632a.m22853a(context, nativeAdBlock, sp0Var, fk0Var);
        } else {
            fk0Var = new fk0(listener, new C5122gg(context), 1);
        }
        this.f50633b.m27748a(nativeAdBlock, fk0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gk0(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager) {
        this(new bk0(context, adLoadingPhasesManager), new qk0(context), new C6035xp(), new C6086yp());
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
    }
}
