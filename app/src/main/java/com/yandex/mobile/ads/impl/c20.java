package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c20 implements InterfaceC5908va<z10> {

    /* renamed from: a */
    @NonNull
    private final e91 f49075a = new e91();

    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final z10 mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            n60.m26810c("Image asset has not value", new Object[0]);
            throw new ni0("Native Ad json has not required attributes");
        }
        z10 z10Var = new z10();
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        Objects.requireNonNull(this.f49075a);
        z10Var.m30040b(e91.m24049a("url", jSONObject2));
        z10Var.m30039b(jSONObject2.getInt("w"));
        z10Var.m30035a(jSONObject2.getInt("h"));
        String optString = jSONObject2.optString("sizeType");
        if (!TextUtils.isEmpty(optString)) {
            z10Var.m30037a(optString);
        }
        return z10Var;
    }
}
