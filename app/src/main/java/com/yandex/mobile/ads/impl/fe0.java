package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class fe0 {

    /* renamed from: a */
    @NonNull
    private final Context f50226a;

    /* renamed from: b */
    @NonNull
    private final C5898v1 f50227b;

    /* renamed from: c */
    @NonNull
    private final t30 f50228c;

    /* renamed from: d */
    @NonNull
    private final f40 f50229d;

    /* renamed from: e */
    @NonNull
    private final i40 f50230e;

    /* renamed from: f */
    @NonNull
    private final sb1 f50231f;

    /* renamed from: g */
    @NonNull
    private final HashMap f50232g = new HashMap();

    public fe0(@NonNull Context context, @NonNull C5898v1 c5898v1, @NonNull t30 t30Var, @NonNull f40 f40Var, @NonNull i40 i40Var, @NonNull tb1 tb1Var) {
        this.f50226a = context.getApplicationContext();
        this.f50227b = c5898v1;
        this.f50228c = t30Var;
        this.f50229d = f40Var;
        this.f50230e = i40Var;
        this.f50231f = tb1Var;
    }

    @NonNull
    /* renamed from: a */
    public final C5666r1 m24568a(@NonNull m50 m50Var) {
        C5666r1 c5666r1 = (C5666r1) this.f50232g.get(m50Var);
        if (c5666r1 != null) {
            return c5666r1;
        }
        C5666r1 c5666r12 = new C5666r1(this.f50226a, m50Var, this.f50228c, this.f50229d, this.f50230e, this.f50227b);
        c5666r12.m27812a(this.f50231f);
        this.f50232g.put(m50Var, c5666r12);
        return c5666r12;
    }
}
