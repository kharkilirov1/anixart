package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class d30 {

    /* renamed from: a */
    @NonNull
    private final c30 f49553a = new c30();

    @NonNull
    /* renamed from: a */
    public final ArrayList m23797a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("installedPackages");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                Objects.requireNonNull(this.f49553a);
                if (!yj0.m29948a(jSONObject2, "name")) {
                    throw new ni0("Native Ad json has not required attributes");
                }
                String m29759a = xj0.m29759a("name", jSONObject2);
                int i3 = C5427m6.f52583b;
                int optInt = jSONObject2.optInt("minVersion", 0);
                if (optInt < 0) {
                    optInt = 0;
                }
                int i4 = Integer.MAX_VALUE;
                int optInt2 = jSONObject2.optInt("maxVersion", Integer.MAX_VALUE);
                if (optInt2 >= 0) {
                    i4 = optInt2;
                }
                arrayList.add(new b30(optInt, i4, m29759a));
            }
        }
        return arrayList;
    }
}
