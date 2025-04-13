package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ca */
/* loaded from: classes3.dex */
public final class C4911ca extends AbstractC5462mw<C4798aa> {

    /* renamed from: D */
    @NotNull
    private final dt0 f49188D;

    /* renamed from: com.yandex.mobile.ads.impl.ca$a */
    public static final class a implements InterfaceC5564p3 {

        /* renamed from: a */
        @NotNull
        private final InterfaceC5471n3<C4911ca> f49189a;

        /* renamed from: b */
        @NotNull
        private final C4911ca f49190b;

        public a(@NotNull InterfaceC5471n3<C4911ca> itemsFinishListener, @NotNull C4911ca loadController) {
            Intrinsics.m32179h(itemsFinishListener, "itemsFinishListener");
            Intrinsics.m32179h(loadController, "loadController");
            this.f49189a = itemsFinishListener;
            this.f49190b = loadController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5564p3
        /* renamed from: a */
        public final void mo23084a() {
            this.f49189a.mo23851a(this.f49190b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C4911ca(android.content.Context r8, com.yandex.mobile.ads.impl.InterfaceC5471n3 r9) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.s3 r3 = new com.yandex.mobile.ads.impl.s3
            r3.<init>()
            com.yandex.mobile.ads.impl.fz r4 = new com.yandex.mobile.ads.impl.fz
            r4.<init>()
            com.yandex.mobile.ads.impl.ba r5 = new com.yandex.mobile.ads.impl.ba
            r5.<init>(r8)
            com.yandex.mobile.ads.impl.dt0 r6 = new com.yandex.mobile.ads.impl.dt0
            r6.<init>(r8, r3)
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4911ca.<init>(android.content.Context, com.yandex.mobile.ads.impl.n3):void");
    }

    /* renamed from: a */
    public final void m23083a(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f49188D.m23934a(appOpenAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5462mw
    @NotNull
    /* renamed from: a */
    public final InterfaceC5148gw<C4798aa> mo23082a(@NotNull InterfaceC5202hw controllerFactory) {
        Intrinsics.m32179h(controllerFactory, "controllerFactory");
        InterfaceC5148gw<C4798aa> mo25123b = controllerFactory.mo25123b(this);
        Intrinsics.m32178g(mo25123b, "controllerFactory.createAppOpenAdController(this)");
        return mo25123b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4911ca(@NotNull Context context, @NotNull InterfaceC5471n3<C4911ca> itemsLoadFinishListener, @NotNull C5724s3 adLoadingPhasesManager, @NotNull C5097fz htmlAdResponseReportManager, @NotNull C4848ba adContentControllerFactory, @NotNull dt0 proxyAppOpenAdLoadListener) {
        super(context, EnumC5007e6.f49822h, proxyAppOpenAdLoadListener, adLoadingPhasesManager, adContentControllerFactory, htmlAdResponseReportManager);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(adContentControllerFactory, "adContentControllerFactory");
        Intrinsics.m32179h(proxyAppOpenAdLoadListener, "proxyAppOpenAdLoadListener");
        this.f49188D = proxyAppOpenAdLoadListener;
        proxyAppOpenAdLoadListener.m23936a(new a(itemsLoadFinishListener, this));
    }
}
