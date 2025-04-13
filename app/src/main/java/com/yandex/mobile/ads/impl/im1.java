package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.jm1;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class im1 implements jm1.InterfaceC5294b {

    /* renamed from: a */
    private JSONObject f51345a;

    /* renamed from: b */
    private final om1 f51346b;

    public im1(om1 om1Var) {
        this.f51346b = om1Var;
    }

    /* renamed from: a */
    public final void m25568a() {
        this.f51346b.m27095a(new sm1(this));
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m25569a(JSONObject jSONObject) {
        this.f51345a = jSONObject;
    }

    /* renamed from: a */
    public final void m25570a(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f51346b.m27095a(new bn1(this, hashSet, jSONObject, j2));
    }

    @VisibleForTesting
    /* renamed from: b */
    public final JSONObject m25571b() {
        return this.f51345a;
    }

    /* renamed from: b */
    public final void m25572b(JSONObject jSONObject, HashSet<String> hashSet, long j2) {
        this.f51346b.m27095a(new ym1(this, hashSet, jSONObject, j2));
    }
}
