package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class as0 {

    /* renamed from: a */
    @NonNull
    private final zr0 f48649a;

    public as0(@NonNull e91 e91Var) {
        this.f48649a = new zr0(e91Var);
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m22620a(@Nullable JSONArray jSONArray) throws JSONException, ni0 {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    arrayList.add(this.f48649a.m30291a(optJSONObject));
                }
            }
        }
        return arrayList;
    }
}
