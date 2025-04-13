package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ax */
/* loaded from: classes3.dex */
public final class C4828ax implements InterfaceC5903v5 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC5903v5
    /* renamed from: a */
    public final boolean mo22650a(@NotNull Context context, @NotNull SizeInfo sizeInfo) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(sizeInfo, "sizeInfo");
        return sizeInfo.m21916c(context) > 0 && sizeInfo.m21913a(context) > 0;
    }
}
