package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m21 {
    @NotNull
    /* renamed from: a */
    public static f21 m26560a(@NotNull JSONObject jsonValue) throws JSONException {
        Intrinsics.m32179h(jsonValue, "jsonValue");
        return new f21(jsonValue.getInt("x"), jsonValue.getInt("y"), jsonValue.getInt("w"), jsonValue.getInt("h"));
    }
}
