package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.z9 */
/* loaded from: classes3.dex */
public final class C6112z9 {

    /* renamed from: a */
    private final Context f57085a;

    public C6112z9(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f57085a = context.getApplicationContext();
    }

    @NotNull
    /* renamed from: a */
    public final C6063y9 m30075a(@NotNull C4798aa appOpenAdContentController) {
        Intrinsics.m32179h(appOpenAdContentController, "appOpenAdContentController");
        Context appContext = this.f57085a;
        Intrinsics.m32178g(appContext, "appContext");
        return new C6063y9(appContext, appOpenAdContentController);
    }
}
