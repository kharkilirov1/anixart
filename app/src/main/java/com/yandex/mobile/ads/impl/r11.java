package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r11 {
    @JvmStatic
    /* renamed from: a */
    public static final boolean m27822a(@NotNull Context context, @NotNull AdResponse<?> adResponse, @NotNull SizeInfo responseSizeInfo, @NotNull InterfaceC5903v5 adSizeValidator, @NotNull SizeInfo containerSizeInfo) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(responseSizeInfo, "responseSizeInfo");
        Intrinsics.m32179h(adSizeValidator, "adSizeValidator");
        Intrinsics.m32179h(containerSizeInfo, "containerSizeInfo");
        return adResponse.m21806G() || (adSizeValidator.mo22650a(context, responseSizeInfo) && C5526o6.m27006a(context, responseSizeInfo, containerSizeInfo));
    }
}
