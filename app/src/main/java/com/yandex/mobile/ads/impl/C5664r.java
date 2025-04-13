package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.r */
/* loaded from: classes3.dex */
public final class C5664r {

    /* renamed from: a */
    @NonNull
    private final e91 f54151a = new e91();

    /* renamed from: b */
    @Nullable
    private Map<String, InterfaceC5560p> f54152b;

    @Nullable
    /* renamed from: a */
    public final InterfaceC5560p m27801a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("type", jSONObject);
        if (this.f54152b == null) {
            this.f54152b = new C5611q(this);
        }
        return (InterfaceC5560p) ((HashMap) this.f54152b).get(m29759a);
    }
}
