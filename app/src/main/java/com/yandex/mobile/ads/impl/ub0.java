package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ub0 {

    /* renamed from: a */
    @NonNull
    private final C5534od f55439a = new C5534od();

    @NonNull
    /* renamed from: a */
    public final Object m28928a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m27077a = this.f55439a.m27077a("html", jSONObject);
        float f2 = (float) jSONObject.getDouble("aspectRatio");
        if (f2 == 0.0f) {
            f2 = 1.7777778f;
        }
        return new ka0(m27077a, f2);
    }
}
