package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.q5 */
/* loaded from: classes3.dex */
public final class C5620q5 {

    /* renamed from: a */
    private final wo0 f53935a;

    /* renamed from: b */
    private final wo0 f53936b;

    /* renamed from: c */
    private final boolean f53937c;

    /* renamed from: d */
    private final EnumC5501nl f53938d;

    /* renamed from: e */
    private final r20 f53939e;

    private C5620q5() {
        EnumC5501nl enumC5501nl = EnumC5501nl.f53029b;
        r20 r20Var = r20.f54164b;
        wo0 wo0Var = wo0.f56171b;
        this.f53938d = enumC5501nl;
        this.f53939e = r20Var;
        this.f53935a = wo0Var;
        this.f53936b = wo0Var;
        this.f53937c = false;
    }

    /* renamed from: a */
    public static C5620q5 m27625a() {
        return new C5620q5();
    }

    /* renamed from: b */
    public final boolean m27626b() {
        return wo0.f56171b == this.f53935a;
    }

    /* renamed from: c */
    public final boolean m27627c() {
        return wo0.f56171b == this.f53936b;
    }

    /* renamed from: d */
    public final JSONObject m27628d() {
        JSONObject jSONObject = new JSONObject();
        gm1.m24946a(jSONObject, "impressionOwner", this.f53935a);
        gm1.m24946a(jSONObject, "mediaEventsOwner", this.f53936b);
        gm1.m24946a(jSONObject, "creativeType", this.f53938d);
        gm1.m24946a(jSONObject, "impressionType", this.f53939e);
        gm1.m24946a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f53937c));
        return jSONObject;
    }
}
