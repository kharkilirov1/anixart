package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oa1 {

    /* renamed from: a */
    private final boolean f53228a;

    /* renamed from: b */
    private final Float f53229b;

    /* renamed from: c */
    private final boolean f53230c = true;

    /* renamed from: d */
    private final pr0 f53231d;

    private oa1(boolean z, Float f2, pr0 pr0Var) {
        this.f53228a = z;
        this.f53229b = f2;
        this.f53231d = pr0Var;
    }

    /* renamed from: a */
    public static oa1 m27059a(float f2, pr0 pr0Var) {
        return new oa1(true, Float.valueOf(f2), pr0Var);
    }

    /* renamed from: a */
    public static oa1 m27060a(pr0 pr0Var) {
        return new oa1(false, null, pr0Var);
    }

    /* renamed from: a */
    public final JSONObject m27061a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f53228a);
            if (this.f53228a) {
                jSONObject.put("skipOffset", this.f53229b);
            }
            jSONObject.put("autoPlay", this.f53230c);
            jSONObject.put("position", this.f53231d);
        } catch (JSONException e2) {
            nm1.m26926a("VastProperties: JSON error", e2);
        }
        return jSONObject;
    }
}
