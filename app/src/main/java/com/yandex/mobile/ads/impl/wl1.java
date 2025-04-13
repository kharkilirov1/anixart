package com.yandex.mobile.ads.impl;

import android.os.Build;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wl1 {
    /* renamed from: a */
    public static JSONObject m29495a() {
        JSONObject jSONObject = new JSONObject();
        gm1.m24946a(jSONObject, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        gm1.m24946a(jSONObject, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        gm1.m24946a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
