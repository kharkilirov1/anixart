package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ib0 {

    /* renamed from: a */
    private final tl1 f51268a;

    private ib0(tl1 tl1Var) {
        this.f51268a = tl1Var;
    }

    /* renamed from: a */
    public final void m25489a() {
        i60 i60Var = i60.f51226b;
        xm1.m29768a(this.f51268a);
        JSONObject jSONObject = new JSONObject();
        gm1.m24946a(jSONObject, "interactionType", i60Var);
        wm1.m29506a(this.f51268a.m28682i().m28896e(), "adUserInteraction", jSONObject);
    }

    /* renamed from: b */
    public final void m25491b() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("bufferFinish");
    }

    /* renamed from: b */
    public final void m25492b(float f2) {
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        xm1.m29768a(this.f51268a);
        JSONObject jSONObject = new JSONObject();
        gm1.m24946a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        gm1.m24946a(jSONObject, "deviceVolume", Float.valueOf(cn1.m23491a().m23496d()));
        wm1.m29506a(this.f51268a.m28682i().m28896e(), "volumeChange", jSONObject);
    }

    /* renamed from: c */
    public final void m25493c() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("bufferStart");
    }

    /* renamed from: d */
    public final void m25494d() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("complete");
    }

    /* renamed from: e */
    public final void m25495e() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("firstQuartile");
    }

    /* renamed from: f */
    public final void m25496f() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("midpoint");
    }

    /* renamed from: g */
    public final void m25497g() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("pause");
    }

    /* renamed from: h */
    public final void m25498h() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("resume");
    }

    /* renamed from: i */
    public final void m25499i() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("skipped");
    }

    /* renamed from: j */
    public final void m25500j() {
        xm1.m29768a(this.f51268a);
        this.f51268a.m28682i().m28890a("thirdQuartile");
    }

    /* renamed from: a */
    public static ib0 m25488a(tl1 tl1Var) {
        if (tl1Var.m28685l()) {
            if (!tl1Var.m28680g()) {
                if (!tl1Var.m28683j()) {
                    if (tl1Var.m28682i().m28895d() == null) {
                        ib0 ib0Var = new ib0(tl1Var);
                        tl1Var.m28682i().m28886a(ib0Var);
                        return ib0Var;
                    }
                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: a */
    public final void m25490a(float f2) {
        if (f2 > 0.0f) {
            xm1.m29768a(this.f51268a);
            JSONObject jSONObject = new JSONObject();
            gm1.m24946a(jSONObject, "duration", Float.valueOf(f2));
            gm1.m24946a(jSONObject, "mediaPlayerVolume", Float.valueOf(0.0f));
            gm1.m24946a(jSONObject, "deviceVolume", Float.valueOf(cn1.m23491a().m23496d()));
            wm1.m29506a(this.f51268a.m28682i().m28896e(), "start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }
}
