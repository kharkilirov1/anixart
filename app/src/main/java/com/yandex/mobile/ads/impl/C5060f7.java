package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.f7 */
/* loaded from: classes3.dex */
public final class C5060f7 implements InterfaceC5560p {

    /* renamed from: a */
    @NonNull
    private final e91 f50134a;

    public C5060f7(@NonNull e91 e91Var) {
        this.f50134a = e91Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5560p
    @NonNull
    /* renamed from: a */
    public final AbstractC5419m mo23517a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("type", jSONObject);
        Objects.requireNonNull(this.f50134a);
        String m24049a = e91.m24049a("url", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trackingUrls");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return new C4958d7(m29759a, m24049a, arrayList);
    }
}
