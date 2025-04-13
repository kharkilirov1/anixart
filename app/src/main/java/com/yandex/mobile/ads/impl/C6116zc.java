package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.div2.DivData;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zc */
/* loaded from: classes3.dex */
public final class C6116zc {

    /* renamed from: a */
    @NotNull
    private final DivData f57115a;

    public C6116zc(@NotNull DivData divData) {
        Intrinsics.m32179h(divData, "divData");
        this.f57115a = divData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30145a() {
    }

    @NotNull
    /* renamed from: a */
    public final o70 m30147a(@NotNull Context context, @NotNull AdResponse adResponse, @NotNull InterfaceC6256u nativeAdPrivate, @NotNull dj0 nativeAdEventListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.m32179h(nativeAdEventListener, "nativeAdEventListener");
        C5689rh c5689rh = new C5689rh();
        tq1 tq1Var = new InterfaceC5541ok() { // from class: com.yandex.mobile.ads.impl.tq1
            @Override // com.yandex.mobile.ads.impl.InterfaceC5541ok
            /* renamed from: c */
            public final void mo27088c() {
                C6116zc.m30145a();
            }
        };
        return new o70(C4632R.layout.yandex_ads_internal_divkit, NativeAdView.class, new C5540oj(new C5407lp(context, this.f57115a, c5689rh, tq1Var), new yh0(nativeAdPrivate, tq1Var, nativeAdEventListener, c5689rh)), new C5756sp(adResponse));
    }
}
