package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.AbstractC4992dx;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rk1<T extends AbstractC4992dx<T>> implements InterfaceC5148gw<T> {

    /* renamed from: a */
    @NotNull
    private final AbstractC5462mw<T> f54337a;

    /* renamed from: b */
    @NotNull
    private final ck1 f54338b;

    /* renamed from: c */
    @NotNull
    private final vk1<sk1> f54339c;

    /* renamed from: d */
    @Nullable
    private sk1 f54340d;

    @JvmOverloads
    public rk1(@NotNull AbstractC5462mw<T> loadController, @NotNull C5101g2 adConfiguration, @NotNull Context context, @NotNull C4828ax fullscreenAdSizeValidator, @NotNull tk1 fullscreenHtmlAdCreateController, @NotNull ck1 yandexAdapterReporter, @NotNull vk1<sk1> htmlAdCreationHandler) {
        Intrinsics.m32179h(loadController, "loadController");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(fullscreenAdSizeValidator, "fullscreenAdSizeValidator");
        Intrinsics.m32179h(fullscreenHtmlAdCreateController, "fullscreenHtmlAdCreateController");
        Intrinsics.m32179h(yandexAdapterReporter, "yandexAdapterReporter");
        Intrinsics.m32179h(htmlAdCreationHandler, "htmlAdCreationHandler");
        this.f54337a = loadController;
        this.f54338b = yandexAdapterReporter;
        this.f54339c = htmlAdCreationHandler;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24989a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        n60.m26811d("YandexInterstitialController invalidate", new Object[0]);
        this.f54339c.m29232a();
        sk1 sk1Var = this.f54340d;
        if (sk1Var != null) {
            sk1Var.m28292d();
        }
        this.f54340d = null;
    }

    /* renamed from: com.yandex.mobile.ads.impl.rk1$a */
    public final class C5694a implements wk1<sk1> {
        public C5694a() {
        }

        @Override // com.yandex.mobile.ads.impl.wk1
        /* renamed from: a */
        public final void mo24189a(sk1 sk1Var) {
            sk1 ad = sk1Var;
            Intrinsics.m32179h(ad, "ad");
            ((rk1) rk1.this).f54340d = ad;
            ((rk1) rk1.this).f54337a.mo21780p();
        }

        @Override // com.yandex.mobile.ads.impl.wk1
        /* renamed from: a */
        public final void mo24188a(@NotNull C5563p2 adFetchRequestError) {
            Intrinsics.m32179h(adFetchRequestError, "adFetchRequestError");
            ((rk1) rk1.this).f54337a.mo21797b(adFetchRequestError);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ rk1(com.yandex.mobile.ads.impl.AbstractC5462mw r9) {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.g2 r2 = r9.m28616d()
            java.lang.String r0 = "loadController.adConfiguration"
            kotlin.jvm.internal.Intrinsics.m32178g(r2, r0)
            android.content.Context r3 = r9.m28621i()
            java.lang.String r0 = "loadController.context"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r0)
            com.yandex.mobile.ads.impl.ax r4 = new com.yandex.mobile.ads.impl.ax
            r4.<init>()
            com.yandex.mobile.ads.impl.tk1 r5 = new com.yandex.mobile.ads.impl.tk1
            r5.<init>(r3, r2)
            com.yandex.mobile.ads.impl.ck1 r6 = new com.yandex.mobile.ads.impl.ck1
            r6.<init>(r2)
            com.yandex.mobile.ads.impl.vk1 r7 = new com.yandex.mobile.ads.impl.vk1
            r7.<init>(r2, r4, r5)
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rk1.<init>(com.yandex.mobile.ads.impl.mw):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24991a(@NotNull T contentController) {
        Intrinsics.m32179h(contentController, "contentController");
        sk1 sk1Var = this.f54340d;
        Context m27310c = contentController.m27310c();
        Intrinsics.m32178g(m27310c, "contentController.context");
        if (sk1Var != null) {
            sk1Var.m28288a(m27310c, contentController.m30346h());
        }
        this.f54340d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5148gw
    /* renamed from: a */
    public final void mo24990a(@NotNull Context context, @NotNull AdResponse<String> adResponse) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        this.f54338b.m23304a(context, adResponse, (aj0) null);
        this.f54338b.m23305a(context, adResponse, (bj0) null);
        this.f54339c.m29233a(context, adResponse, new C5694a());
    }
}
