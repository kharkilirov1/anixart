package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.up */
/* loaded from: classes3.dex */
public final class C5876up {

    /* renamed from: a */
    @NonNull
    private final C5435md f55601a = new C5435md();

    @Nullable
    /* renamed from: a */
    public final C5600pp m29061a(@NonNull C5599po c5599po) {
        if ("divkit".equals(c5599po.m27357d())) {
            try {
                String m27356c = c5599po.m27356c();
                String m27355b = c5599po.m27355b();
                Objects.requireNonNull(this.f55601a);
                JSONObject jSONObject = new JSONObject(C5435md.m26616a(m27355b.getBytes()));
                return new C5600pp(m27356c, jSONObject.getJSONObject("card"), jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null, c5599po.m27354a());
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
