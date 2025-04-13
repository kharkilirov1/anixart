package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class x21 implements InterfaceC5908va<w21> {

    /* renamed from: a */
    @NonNull
    private final v10 f56349a;

    public x21(@NonNull e91 e91Var) {
        this.f56349a = new v10(e91Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w21 mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        return new w21(this.f56349a.m29168a(jSONObject.getJSONObject("image")), xj0.m29759a("title", jSONObject));
    }
}
