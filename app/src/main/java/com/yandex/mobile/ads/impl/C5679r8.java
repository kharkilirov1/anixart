package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.r8 */
/* loaded from: classes3.dex */
public final class C5679r8 {
    @NotNull
    /* renamed from: a */
    public static HashMap m27862a(@NotNull String analyticsParametersValue) {
        Intrinsics.m32179h(analyticsParametersValue, "analyticsParametersValue");
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(analyticsParametersValue);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object obj = jSONObject.get(key);
                Intrinsics.m32178g(key, "key");
                hashMap.put(key, obj);
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }
}
