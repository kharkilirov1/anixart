package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.sc */
/* loaded from: classes3.dex */
public final class C5739sc {
    @NotNull
    /* renamed from: a */
    public static C5683rc m28204a(@NotNull JSONObject jsonValue) {
        Intrinsics.m32179h(jsonValue, "jsonValue");
        Object opt = jsonValue.opt("top");
        String str = opt instanceof String ? (String) opt : null;
        Object opt2 = jsonValue.opt("right");
        String str2 = opt2 instanceof String ? (String) opt2 : null;
        Object opt3 = jsonValue.opt("left");
        String str3 = opt3 instanceof String ? (String) opt3 : null;
        Object opt4 = jsonValue.opt("bottom");
        return new C5683rc(str, str2, str3, opt4 instanceof String ? (String) opt4 : null);
    }
}
