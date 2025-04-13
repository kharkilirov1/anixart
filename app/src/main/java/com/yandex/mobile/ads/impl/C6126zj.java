package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.zj */
/* loaded from: classes3.dex */
public final class C6126zj {

    /* renamed from: a */
    @NonNull
    private final d30 f57206a = new d30();

    @NonNull
    /* renamed from: a */
    public final C5818tu m30195a(@NonNull String str, @NonNull JSONObject jSONObject) throws JSONException, ni0 {
        return new C5818tu(this.f57206a.m23797a(jSONObject.getJSONObject(str)));
    }
}
