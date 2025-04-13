package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sj */
/* loaded from: classes3.dex */
public final class C5749sj implements InterfaceC6044xw<InterstitialAdEventListener>, InterfaceC5513nw<t60> {

    /* renamed from: a */
    @NotNull
    private final gt0 f54689a;

    /* renamed from: b */
    @NotNull
    private final ht0 f54690b;

    /* renamed from: c */
    @NotNull
    private final p60 f54691c;

    /* renamed from: d */
    @Nullable
    private t60 f54692d;

    public C5749sj(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull gt0 adLoadListener, @NotNull ht0 adShowListener, @NotNull C5097fz htmlAdResponseReportManager, @NotNull o60 adContentFactory, @NotNull q60 adLoadControllerFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(adLoadListener, "adLoadListener");
        Intrinsics.m32179h(adShowListener, "adShowListener");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(adContentFactory, "adContentFactory");
        Intrinsics.m32179h(adLoadControllerFactory, "adLoadControllerFactory");
        this.f54689a = adLoadListener;
        this.f54690b = adShowListener;
        p60 m27645a = q60.m27645a(context, adLoadingPhasesManager, htmlAdResponseReportManager, adContentFactory, this);
        this.f54691c = m27645a;
        C5101g2 m28616d = m27645a.m28616d();
        Intrinsics.m32178g(m28616d, "loadController.adConfiguration");
        adLoadListener.m24974a(m28616d);
        adLoadListener.m24975a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a */
    public final void mo23937a(AbstractC4992dx abstractC4992dx) {
        t60 ad = (t60) abstractC4992dx;
        Intrinsics.m32179h(ad, "ad");
        this.f54692d = ad;
        this.f54689a.onAdLoaded();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: b */
    public final void mo23545b() {
        t60 t60Var = this.f54692d;
        if (t60Var != null) {
            t60Var.m23953q();
        }
        this.f54691c.m28627r();
        this.f54692d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: c */
    public final void mo23546c() {
        this.f54691c.m26775u();
        t60 t60Var = this.f54692d;
        if (t60Var != null) {
            t60Var.m23950m();
        }
        this.f54690b.m25371a((InterstitialAdEventListener) null);
        this.f54689a.m24976a((InterstitialAdEventListener) null);
        this.f54692d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    @NotNull
    /* renamed from: d */
    public final EnumC5901v3 mo23547d() {
        EnumC5901v3 m28619g = this.f54691c.m28619g();
        Intrinsics.m32178g(m28619g, "loadController.adLoadingState");
        return m28619g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    public final void setShouldOpenLinksInApp(boolean z) {
        this.f54691c.m28610a(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23542a(InterstitialAdEventListener interstitialAdEventListener) {
        InterstitialAdEventListener interstitialAdEventListener2 = interstitialAdEventListener;
        this.f54689a.m24976a(interstitialAdEventListener2);
        this.f54690b.m25371a(interstitialAdEventListener2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5749sj(android.content.Context r9) {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.s3 r2 = new com.yandex.mobile.ads.impl.s3
            r2.<init>()
            com.yandex.mobile.ads.impl.gt0 r3 = new com.yandex.mobile.ads.impl.gt0
            r3.<init>(r9, r2)
            com.yandex.mobile.ads.impl.ht0 r4 = new com.yandex.mobile.ads.impl.ht0
            r4.<init>()
            com.yandex.mobile.ads.impl.fz r5 = new com.yandex.mobile.ads.impl.fz
            r5.<init>()
            com.yandex.mobile.ads.impl.o60 r6 = new com.yandex.mobile.ads.impl.o60
            r6.<init>(r9, r4)
            com.yandex.mobile.ads.impl.q60 r7 = new com.yandex.mobile.ads.impl.q60
            r7.<init>()
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5749sj.<init>(android.content.Context):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23543a(@Nullable String str) {
        this.f54691c.m28609a(str);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23541a(@NotNull AdRequest adRequest) {
        Intrinsics.m32179h(adRequest, "adRequest");
        this.f54691c.mo26773b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final boolean mo23544a() {
        return this.f54692d != null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a */
    public final void mo23938a(@NotNull C5563p2 error) {
        Intrinsics.m32179h(error, "error");
        this.f54689a.onAdFailedToLoad(new AdRequestError(error.m27144a(), error.m27145b()));
    }
}
