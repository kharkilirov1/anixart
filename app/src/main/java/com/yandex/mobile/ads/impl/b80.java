package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b80 {

    /* renamed from: a */
    @NonNull
    private final C5664r f48796a = new C5664r();

    @NonNull
    /* renamed from: a */
    public final a80 m22740a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        ArrayList arrayList;
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                InterfaceC5560p m27801a = this.f48796a.m27801a(jSONObject2);
                if (m27801a != null) {
                    arrayList2.add(m27801a.mo23517a(jSONObject2));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String m29759a = jSONObject.has("falseClickUrl") ? xj0.m29759a("falseClickUrl", jSONObject) : null;
        Long valueOf = Long.valueOf(jSONObject.optLong("falseClickInterval", 0L));
        return new a80(arrayList, (m29759a == null || valueOf == null) ? null : new FalseClick(m29759a, valueOf.longValue()), jSONObject.has("trackingUrl") ? xj0.m29759a("trackingUrl", jSONObject) : null, jSONObject.has("url") ? xj0.m29759a("url", jSONObject) : null, jSONObject.optLong("clickableDelay", 0L));
    }
}
