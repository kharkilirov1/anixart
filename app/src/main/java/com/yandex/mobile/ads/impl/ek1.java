package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ek1 implements InterfaceC6021xc {

    /* renamed from: a */
    @NotNull
    private final C4637e f49988a;

    /* renamed from: b */
    @NotNull
    private final vk1<gk1> f49989b;

    /* renamed from: c */
    @NotNull
    private final ck1 f49990c;

    /* renamed from: com.yandex.mobile.ads.impl.ek1$a */
    public static final class C5031a implements wk1<gk1> {

        /* renamed from: a */
        @NotNull
        private final C4637e f49991a;

        public C5031a(@NotNull C4637e adViewController) {
            Intrinsics.m32179h(adViewController, "adViewController");
            this.f49991a = adViewController;
        }

        @Override // com.yandex.mobile.ads.impl.wk1
        /* renamed from: a */
        public final void mo24189a(gk1 gk1Var) {
            gk1 ad = gk1Var;
            Intrinsics.m32179h(ad, "ad");
            ad.m24913a(new dk1(this));
        }

        @Override // com.yandex.mobile.ads.impl.wk1
        /* renamed from: a */
        public final void mo24188a(@NotNull C5563p2 adFetchRequestError) {
            Intrinsics.m32179h(adFetchRequestError, "adFetchRequestError");
            this.f49991a.mo21797b(adFetchRequestError);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ek1(@NotNull C4637e adLoadController) {
        this(adLoadController, 0);
        Intrinsics.m32179h(adLoadController, "adLoadController");
    }

    @JvmOverloads
    public ek1(@NotNull C4637e adLoadController, @NotNull C5101g2 adConfiguration, @NotNull C5967wc bannerAdSizeValidator, @NotNull hk1 yandexBannerHtmlAdCreator, @NotNull vk1<gk1> adCreationHandler, @NotNull ck1 yandexAdapterReporter) {
        Intrinsics.m32179h(adLoadController, "adLoadController");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(bannerAdSizeValidator, "bannerAdSizeValidator");
        Intrinsics.m32179h(yandexBannerHtmlAdCreator, "yandexBannerHtmlAdCreator");
        Intrinsics.m32179h(adCreationHandler, "adCreationHandler");
        Intrinsics.m32179h(yandexAdapterReporter, "yandexAdapterReporter");
        this.f49988a = adLoadController;
        this.f49989b = adCreationHandler;
        this.f49990c = yandexAdapterReporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24186a(@NotNull Context context, @NotNull AdResponse<String> adResponse) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        this.f49990c.m23304a(context, adResponse, (aj0) null);
        this.f49990c.m23305a(context, adResponse, (bj0) null);
        this.f49989b.m29233a(context, adResponse, new C5031a(this.f49988a));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ek1(com.yandex.mobile.ads.banner.C4637e r8, int r9) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.g2 r2 = r8.m28616d()
            java.lang.String r9 = "adLoadController.adConfiguration"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r9)
            com.yandex.mobile.ads.impl.wc r3 = new com.yandex.mobile.ads.impl.wc
            r3.<init>()
            com.yandex.mobile.ads.impl.hk1 r4 = new com.yandex.mobile.ads.impl.hk1
            r4.<init>(r2, r8)
            com.yandex.mobile.ads.impl.vk1 r5 = new com.yandex.mobile.ads.impl.vk1
            r5.<init>(r2, r3, r4)
            com.yandex.mobile.ads.impl.ck1 r6 = new com.yandex.mobile.ads.impl.ck1
            r6.<init>(r2)
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ek1.<init>(com.yandex.mobile.ads.banner.e, int):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6021xc
    /* renamed from: a */
    public final void mo24185a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        n60.m26811d("YandexBannerController invalidate", new Object[0]);
        this.f49989b.m29232a();
    }
}
