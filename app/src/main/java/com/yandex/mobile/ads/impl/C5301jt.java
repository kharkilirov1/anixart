package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div2.DivExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.jt */
/* loaded from: classes3.dex */
public final class C5301jt {
    @Nullable
    /* renamed from: a */
    public static String m25938a(@NonNull DivExtension divExtension) {
        JSONObject jSONObject = divExtension.f35662b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getString("view_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
