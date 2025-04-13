package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yj0 {
    /* renamed from: a */
    public static boolean m29948a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
