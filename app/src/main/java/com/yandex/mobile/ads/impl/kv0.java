package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class kv0 {

    /* renamed from: a */
    @NonNull
    private final zf1 f52173a;

    /* renamed from: c */
    @NonNull
    private final mv0 f52175c;

    /* renamed from: b */
    @NonNull
    private final C6073ye f52174b = new C6073ye();

    /* renamed from: d */
    @NonNull
    private final iv0 f52176d = new iv0();

    public kv0(@NonNull zf1 zf1Var, @NonNull qv0 qv0Var) {
        this.f52173a = zf1Var;
        this.f52175c = new mv0(zf1Var, qv0Var);
    }

    /* renamed from: a */
    public final void m26288a() {
        sl0 m23881b = this.f52173a.m23881b();
        if (m23881b != null) {
            lv0 m27940b = m23881b.m28319a().m27940b();
            this.f52175c.m26771a(m27940b);
            this.f52174b.m29919a(m23881b.m28321c().getBitmap(), new jv0(this, m23881b, m27940b));
        }
    }
}
