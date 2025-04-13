package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jm0 {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final th1 m25910a() {
        return new th1(new sh1(), new nm0());
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final uh1 m25911a(@NotNull Context context, @NotNull C5101g2 adConfiguration, @NotNull wh1 volleyResponseBodyParser) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(volleyResponseBodyParser, "volleyResponseBodyParser");
        return new uh1(context, adConfiguration, volleyResponseBodyParser);
    }
}
