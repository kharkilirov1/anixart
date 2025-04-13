package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eu0 {

    /* renamed from: a */
    @NonNull
    private final C5435md f50060a = new C5435md();

    @NonNull
    /* renamed from: a */
    public final du0 m24267a(@NonNull String str) throws JSONException {
        Objects.requireNonNull(this.f50060a);
        JSONObject jSONObject = new JSONObject(C5435md.m26616a(str.getBytes()));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return new du0(string, hashMap);
    }
}
