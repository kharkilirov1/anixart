package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gb */
/* loaded from: classes3.dex */
public final class C5116gb {

    /* renamed from: a */
    @NotNull
    private final List<k40> f50542a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5116gb(@NotNull List<? extends k40> assetViewConfigurators) {
        Intrinsics.m32179h(assetViewConfigurators, "assetViewConfigurators");
        this.f50542a = assetViewConfigurators;
    }

    /* renamed from: a */
    public final void m24834a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        Iterator<k40> it = this.f50542a.iterator();
        while (it.hasNext()) {
            it.next().mo22548a(uiElements);
        }
    }
}
