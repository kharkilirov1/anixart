package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v21 {

    /* renamed from: a */
    @NonNull
    private final b80 f55736a;

    /* renamed from: b */
    @NonNull
    private final x21 f55737b;

    public v21(@NonNull b80 b80Var, @NonNull e91 e91Var) {
        this.f55736a = b80Var;
        this.f55737b = new x21(e91Var);
    }

    @NonNull
    /* renamed from: a */
    public final u21 m29178a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("name", jSONObject);
        return new u21(this.f55736a.m22740a(jSONObject.getJSONObject("link")), m29759a, this.f55737b.mo23010a(jSONObject.getJSONObject("value")));
    }
}
