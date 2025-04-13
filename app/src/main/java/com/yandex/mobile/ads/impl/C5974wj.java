package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wj */
/* loaded from: classes3.dex */
public final class C5974wj implements InterfaceC6044xw<RewardedAdEventListener>, InterfaceC5513nw<tx0> {

    /* renamed from: a */
    @NotNull
    private final it0 f56140a;

    /* renamed from: b */
    @NotNull
    private final jt0 f56141b;

    /* renamed from: c */
    @NotNull
    private final yx0 f56142c;

    /* renamed from: d */
    @Nullable
    private tx0 f56143d;

    public C5974wj(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull it0 adLoadListener, @NotNull jt0 adShowListener, @NotNull C5097fz htmlAdResponseReportManager, @NotNull qx0 rewardedAdContentFactory, @NotNull zx0 rewardedLoadControllerFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(adLoadListener, "adLoadListener");
        Intrinsics.m32179h(adShowListener, "adShowListener");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(rewardedAdContentFactory, "rewardedAdContentFactory");
        Intrinsics.m32179h(rewardedLoadControllerFactory, "rewardedLoadControllerFactory");
        this.f56140a = adLoadListener;
        this.f56141b = adShowListener;
        yx0 m30345a = zx0.m30345a(context, this, adLoadingPhasesManager, htmlAdResponseReportManager, rewardedAdContentFactory);
        this.f56142c = m30345a;
        C5101g2 m28616d = m30345a.m28616d();
        Intrinsics.m32178g(m28616d, "loadController.adConfiguration");
        adLoadListener.m25732a(m28616d);
        adLoadListener.m25733a(htmlAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a */
    public final void mo23937a(AbstractC4992dx abstractC4992dx) {
        tx0 ad = (tx0) abstractC4992dx;
        Intrinsics.m32179h(ad, "ad");
        this.f56143d = ad;
        this.f56140a.onAdLoaded();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: b */
    public final void mo23545b() {
        tx0 tx0Var = this.f56143d;
        if (tx0Var != null) {
            tx0Var.m23953q();
        }
        this.f56142c.m28627r();
        this.f56143d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: c */
    public final void mo23546c() {
        this.f56142c.m26775u();
        tx0 tx0Var = this.f56143d;
        if (tx0Var != null) {
            tx0Var.m23950m();
        }
        this.f56140a.m25734a((RewardedAdEventListener) null);
        this.f56141b.m25952a((RewardedAdEventListener) null);
        this.f56143d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    @NotNull
    /* renamed from: d */
    public final EnumC5901v3 mo23547d() {
        EnumC5901v3 m28619g = this.f56142c.m28619g();
        Intrinsics.m32178g(m28619g, "loadController.adLoadingState");
        return m28619g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    public final void setShouldOpenLinksInApp(boolean z) {
        this.f56142c.m28610a(z);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23542a(RewardedAdEventListener rewardedAdEventListener) {
        RewardedAdEventListener rewardedAdEventListener2 = rewardedAdEventListener;
        this.f56140a.m25734a(rewardedAdEventListener2);
        this.f56141b.m25952a(rewardedAdEventListener2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C5974wj(android.content.Context r9) {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.s3 r2 = new com.yandex.mobile.ads.impl.s3
            r2.<init>()
            com.yandex.mobile.ads.impl.it0 r3 = new com.yandex.mobile.ads.impl.it0
            r3.<init>(r9, r2)
            com.yandex.mobile.ads.impl.jt0 r4 = new com.yandex.mobile.ads.impl.jt0
            r4.<init>()
            com.yandex.mobile.ads.impl.fz r5 = new com.yandex.mobile.ads.impl.fz
            r5.<init>()
            com.yandex.mobile.ads.impl.qx0 r6 = new com.yandex.mobile.ads.impl.qx0
            r6.<init>(r9, r4)
            com.yandex.mobile.ads.impl.zx0 r7 = new com.yandex.mobile.ads.impl.zx0
            r7.<init>()
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5974wj.<init>(android.content.Context):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23543a(@Nullable String str) {
        this.f56142c.m28609a(str);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final void mo23541a(@NotNull AdRequest adRequest) {
        Intrinsics.m32179h(adRequest, "adRequest");
        this.f56142c.mo26773b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6044xw
    /* renamed from: a */
    public final boolean mo23544a() {
        return this.f56143d != null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5513nw
    /* renamed from: a */
    public final void mo23938a(@NotNull C5563p2 error) {
        Intrinsics.m32179h(error, "error");
        this.f56140a.onAdFailedToLoad(new AdRequestError(error.m27144a(), error.m27145b()));
    }
}
