package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.u5 */
/* loaded from: classes3.dex */
public abstract class AbstractC5843u5 {

    /* renamed from: a */
    private hm1 f55394a;

    /* renamed from: b */
    private C5263j2 f55395b;

    /* renamed from: c */
    private ib0 f55396c;

    /* renamed from: d */
    private int f55397d;

    /* renamed from: e */
    private long f55398e;

    public AbstractC5843u5() {
        m28897f();
        this.f55394a = new hm1(null);
    }

    /* renamed from: a */
    public void mo23315a() {
    }

    /* renamed from: a */
    public final void m28885a(WebView webView) {
        this.f55394a = new hm1(webView);
    }

    /* renamed from: a */
    public final void m28886a(ib0 ib0Var) {
        this.f55396c = ib0Var;
    }

    /* renamed from: a */
    public final void m28887a(C5263j2 c5263j2) {
        this.f55395b = c5263j2;
    }

    /* renamed from: a */
    public final void m28888a(C5620q5 c5620q5) {
        wm1.m29509a(m28896e(), c5620q5.m27628d());
    }

    /* renamed from: a */
    public void mo23316a(tl1 tl1Var, C5670r5 c5670r5) {
        m28889a(tl1Var, c5670r5, null);
    }

    /* renamed from: a */
    public final void m28889a(tl1 tl1Var, C5670r5 c5670r5, JSONObject jSONObject) {
        String m28681h = tl1Var.m28681h();
        JSONObject jSONObject2 = new JSONObject();
        gm1.m24946a(jSONObject2, "environment", "app");
        gm1.m24946a(jSONObject2, "adSessionType", c5670r5.m27835a());
        gm1.m24946a(jSONObject2, "deviceInfo", wl1.m29495a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        gm1.m24946a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        gm1.m24946a(jSONObject3, "partnerName", c5670r5.m27840f().m24721a());
        gm1.m24946a(jSONObject3, "partnerVersion", c5670r5.m27840f().m24722b());
        gm1.m24946a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        gm1.m24946a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        gm1.m24946a(jSONObject4, "appId", qm1.m27750a().m27752b().getApplicationContext().getPackageName());
        gm1.m24946a(jSONObject2, "app", jSONObject4);
        if (c5670r5.m27836b() != null) {
            gm1.m24946a(jSONObject2, "contentUrl", c5670r5.m27836b());
        }
        if (c5670r5.m27837c() != null) {
            gm1.m24946a(jSONObject2, "customReferenceData", c5670r5.m27837c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (gb1 gb1Var : c5670r5.m27841g()) {
            gm1.m24946a(jSONObject5, gb1Var.m24838b(), gb1Var.m24839c());
        }
        wm1.m29507a(m28896e(), m28681h, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public final void m28890a(String str) {
        wm1.m29506a(m28896e(), str, (JSONObject) null);
    }

    /* renamed from: a */
    public final void m28891a(String str, long j2) {
        if (j2 >= this.f55398e) {
            this.f55397d = 2;
            wm1.m29505a(m28896e(), str);
        }
    }

    /* renamed from: a */
    public final void m28892a(boolean z) {
        if (this.f55394a.get() != null) {
            wm1.m29511b(m28896e(), z ? "foregrounded" : "backgrounded");
        }
    }

    /* renamed from: b */
    public void mo23317b() {
        this.f55394a.clear();
    }

    /* renamed from: b */
    public final void m28893b(String str, long j2) {
        if (j2 < this.f55398e || this.f55397d == 3) {
            return;
        }
        this.f55397d = 3;
        wm1.m29505a(m28896e(), str);
    }

    /* renamed from: c */
    public final C5263j2 m28894c() {
        return this.f55395b;
    }

    /* renamed from: d */
    public final ib0 m28895d() {
        return this.f55396c;
    }

    /* renamed from: e */
    public final WebView m28896e() {
        return this.f55394a.get();
    }

    /* renamed from: f */
    public final void m28897f() {
        this.f55398e = System.nanoTime();
        this.f55397d = 1;
    }
}
