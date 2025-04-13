package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class re1 {

    /* renamed from: a */
    @NonNull
    private final C5534od f54296a = new C5534od();

    /* renamed from: b */
    @NonNull
    private final kc1<il0> f54297b;

    /* renamed from: c */
    @NonNull
    private final ya1 f54298c;

    public re1(@NonNull Context context) {
        this.f54297b = new kc1<>(context, new jl0());
        this.f54298c = new ya1(context);
    }

    @NonNull
    /* renamed from: a */
    public final Object m27912a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        ca1 ca1Var;
        try {
            ca1Var = this.f54298c.m29912a(this.f54296a.m27077a("vast", jSONObject));
        } catch (Exception unused) {
            ca1Var = null;
        }
        if (ca1Var == null || ca1Var.m23087b().isEmpty()) {
            throw new ni0("Invalid VAST in response");
        }
        ArrayList m26105a = this.f54297b.m26105a(ca1Var.m23087b());
        if (m26105a.isEmpty()) {
            throw new ni0("Invalid VAST in response");
        }
        return new ob1(m26105a);
    }
}
