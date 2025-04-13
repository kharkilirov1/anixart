package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kc0 implements InterfaceC5908va<jc0> {

    /* renamed from: b */
    @NonNull
    private final re1 f51943b;

    /* renamed from: a */
    @NonNull
    private final ub0 f51942a = new ub0();

    /* renamed from: c */
    @NonNull
    private final v10 f51944c = new v10(new e91());

    /* renamed from: d */
    @NonNull
    private final f20 f51945d = new f20();

    public kc0(@NonNull Context context) {
        this.f51943b = new re1(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5908va
    @NonNull
    /* renamed from: a */
    public final jc0 mo23010a(@NonNull JSONObject jSONObject) throws JSONException, ni0 {
        if (!(jSONObject.has("value") && !jSONObject.isNull("value"))) {
            n60.m26810c("Media asset has not value", new Object[0]);
            throw new ni0("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        ka0 ka0Var = (ka0) (jSONObject2.has("media") && !jSONObject2.isNull("media") ? this.f51942a.m28928a(jSONObject2.getJSONObject("media")) : null);
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        ArrayList m24293a = optJSONArray != null ? this.f51945d.m24293a(optJSONArray) : null;
        z10 m29168a = jSONObject2.has("image") && !jSONObject2.isNull("image") ? this.f51944c.m29168a(jSONObject2.getJSONObject("image")) : null;
        if ((m24293a == null || m24293a.isEmpty()) && m29168a != null) {
            m24293a = new ArrayList();
            m24293a.add(m29168a);
        }
        ob1 ob1Var = (ob1) (jSONObject2.has("video") && !jSONObject2.isNull("video") ? this.f51943b.m27912a(jSONObject2.getJSONObject("video")) : null);
        if (ka0Var != null || ((m24293a != null && !m24293a.isEmpty()) || ob1Var != null)) {
            return new jc0(ka0Var, ob1Var, m24293a);
        }
        n60.m26810c("Media value has not sub values", new Object[0]);
        throw new ni0("Native Ad json has not required attributes");
    }
}
