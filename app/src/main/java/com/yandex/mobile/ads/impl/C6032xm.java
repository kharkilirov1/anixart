package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.xm */
/* loaded from: classes3.dex */
public final class C6032xm implements InterfaceC5560p<C5927vm> {

    /* renamed from: a */
    @NonNull
    private final as0 f56500a;

    /* renamed from: b */
    @NonNull
    private final e91 f56501b;

    public C6032xm(@NonNull e91 e91Var) {
        this.f56501b = e91Var;
        this.f56500a = new as0(e91Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5560p
    @NonNull
    /* renamed from: a */
    public final C5927vm mo23517a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        String m29759a = xj0.m29759a("type", jSONObject);
        Objects.requireNonNull(this.f56501b);
        return new C5927vm(m29759a, e91.m24049a("fallbackUrl", jSONObject), this.f56500a.m22620a(jSONObject.optJSONArray("preferredPackages")));
    }
}
