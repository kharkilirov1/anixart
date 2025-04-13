package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v10 {

    /* renamed from: a */
    @NonNull
    private final e91 f55723a;

    public v10(@NonNull e91 e91Var) {
        this.f55723a = e91Var;
    }

    @NonNull
    /* renamed from: a */
    public final z10 m29168a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        z10 z10Var = new z10();
        Objects.requireNonNull(this.f55723a);
        z10Var.m30040b(e91.m24049a("url", jSONObject));
        z10Var.m30039b(jSONObject.getInt("w"));
        z10Var.m30035a(jSONObject.getInt("h"));
        if (jSONObject.has("smartCenterSettings")) {
            z10Var.m30036a(new o21().m26988a(jSONObject.getJSONObject("smartCenterSettings")));
        }
        String optString = jSONObject.optString("sizeType");
        if (!TextUtils.isEmpty(optString)) {
            z10Var.m30037a(optString);
        }
        return z10Var;
    }
}
