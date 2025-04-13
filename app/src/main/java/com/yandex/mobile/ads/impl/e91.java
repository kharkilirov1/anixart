package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e91 {
    @NonNull
    /* renamed from: a */
    public static String m24049a(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a(str, jSONObject);
        if (TextUtils.isEmpty(m29759a)) {
            throw new ni0("Native Ad json has not required attributes");
        }
        return m29759a;
    }
}
