package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class y21 implements InterfaceC5560p<r21> {

    /* renamed from: a */
    @NonNull
    private final v21 f56643a;

    public y21(@NonNull e91 e91Var) {
        this.f56643a = new v21(new b80(), e91Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5560p
    @NonNull
    /* renamed from: a */
    public final r21 mo23517a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("type", jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(this.f56643a.m29178a(jSONArray.getJSONObject(i2)));
        }
        if (arrayList.isEmpty()) {
            throw new ni0("Native Ad json has not required attributes");
        }
        return new r21(m29759a, arrayList);
    }
}
