package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f70 {
    @NotNull
    /* renamed from: a */
    public static HashMap m24322a(@NotNull JSONObject jsonObject) {
        Intrinsics.m32179h(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        Intrinsics.m32178g(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Intrinsics.m32178g(key, "key");
            Object m27582a = py0.m27582a(key, jsonObject);
            if (m27582a != null) {
                if (m27582a instanceof JSONObject) {
                    hashMap.put(key, m24322a((JSONObject) m27582a));
                } else {
                    hashMap.put(key, m27582a);
                }
            }
        }
        return hashMap;
    }
}
