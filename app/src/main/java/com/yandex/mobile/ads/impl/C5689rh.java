package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rh */
/* loaded from: classes3.dex */
public final class C5689rh {

    /* renamed from: a */
    @Nullable
    private C5572pa f54312a;

    /* renamed from: a */
    public final void m27923a(@NotNull C5572pa listener) {
        Intrinsics.m32179h(listener, "listener");
        this.f54312a = listener;
    }

    /* renamed from: a */
    public final void m27922a(@NotNull View view, @NotNull String assetName) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(assetName, "assetName");
        C5572pa c5572pa = this.f54312a;
        if (c5572pa != null) {
            c5572pa.m27197a(view, assetName);
        }
    }
}
