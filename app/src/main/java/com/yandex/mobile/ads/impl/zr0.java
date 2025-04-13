package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zr0 {

    /* renamed from: a */
    @NonNull
    private final C5656qt f57301a = new C5656qt();

    /* renamed from: b */
    @NonNull
    private final e91 f57302b;

    public zr0(@NonNull e91 e91Var) {
        this.f57302b = e91Var;
    }

    @NonNull
    /* renamed from: a */
    public final xr0 m30291a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        HashMap hashMap;
        String m29759a = xj0.m29759a("package", jSONObject);
        Objects.requireNonNull(this.f57302b);
        String m24049a = e91.m24049a("url", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("extras");
        Objects.requireNonNull(this.f57301a);
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            if (keys.hasNext()) {
                hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!optJSONObject.isNull(next)) {
                        hashMap.put(next, optJSONObject.get(next));
                    }
                }
                return new xr0(m29759a, m24049a, hashMap);
            }
        }
        hashMap = null;
        return new xr0(m29759a, m24049a, hashMap);
    }
}
