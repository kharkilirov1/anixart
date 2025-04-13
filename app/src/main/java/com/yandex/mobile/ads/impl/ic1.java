package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ic1<T> {

    /* renamed from: a */
    @NonNull
    private final vc1<T> f51278a;

    public ic1(@NonNull vc1<T> vc1Var) {
        this.f51278a = vc1Var;
    }

    @NonNull
    /* renamed from: a */
    public final hc1<T> m25523a(@NonNull va1 va1Var, int i2, int i3) {
        pb1 m29205d = va1Var.m29205d();
        C5083fl m29202a = va1Var.m29202a();
        jb0 m29203b = va1Var.m29203b();
        d31 m29204c = va1Var.m29204c();
        String m29206e = va1Var.m29206e();
        JSONObject m29207f = va1Var.m29207f();
        return new hc1<>(m29202a, m29205d, m29203b, this.f51278a.mo25904a(m29205d, m29202a, m29203b, new gd1(i2, i3 + 1), m29206e, m29207f), m29204c);
    }
}
