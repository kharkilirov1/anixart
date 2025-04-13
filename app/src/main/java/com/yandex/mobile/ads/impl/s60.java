package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s60 implements InterfaceC6094yw<InterstitialAdEventListener> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC6094yw
    @NotNull
    /* renamed from: a */
    public final InterfaceC6044xw<InterstitialAdEventListener> mo23560a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return new C5749sj(context);
    }
}
