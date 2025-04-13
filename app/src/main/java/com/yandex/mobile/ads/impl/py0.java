package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class py0 {
    @Nullable
    /* renamed from: a */
    public static Object m27582a(@NotNull String key, @NotNull JSONObject jSONObject) {
        Intrinsics.m32179h(jSONObject, "<this>");
        Intrinsics.m32179h(key, "key");
        try {
            return jSONObject.get(key);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Object m27583a(@NotNull JSONArray jSONArray, int i2) {
        Intrinsics.m32179h(jSONArray, "<this>");
        try {
            return jSONArray.get(i2);
        } catch (JSONException unused) {
            return null;
        }
    }
}
