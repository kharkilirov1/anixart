package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class en0 implements InterfaceC5908va<String> {

    /* renamed from: a */
    @NonNull
    private final hx0 f50020a = new hx0();

    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: a */
    public final String mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("name", jSONObject);
        String m29759a2 = xj0.m29759a("value", jSONObject);
        return "review_count".equals(m29759a) ? this.f50020a.m25379a(m29759a2) : m29759a2;
    }
}
