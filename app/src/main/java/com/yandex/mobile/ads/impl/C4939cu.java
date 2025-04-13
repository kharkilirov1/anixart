package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.C4824au;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.cu */
/* loaded from: classes3.dex */
final class C4939cu implements InterfaceC5560p<C4824au> {

    /* renamed from: a */
    @NonNull
    private final e91 f49362a;

    public C4939cu(@NonNull e91 e91Var) {
        this.f49362a = e91Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5560p
    @NonNull
    /* renamed from: a */
    public final C4824au mo23517a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            String m29759a2 = xj0.m29759a("title", jSONObject2);
            Objects.requireNonNull(this.f49362a);
            arrayList.add(new C4824au.a(m29759a2, e91.m24049a("url", jSONObject2)));
        }
        if (arrayList.isEmpty()) {
            throw new ni0("Native Ad json has not required attributes");
        }
        return new C4824au(m29759a, arrayList);
    }
}
