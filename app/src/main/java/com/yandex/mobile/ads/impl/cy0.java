package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cy0 implements InterfaceC6094yw<RewardedAdEventListener> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC6094yw
    @NotNull
    /* renamed from: a */
    public final InterfaceC6044xw<RewardedAdEventListener> mo23560a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        return new C5974wj(context);
    }
}
