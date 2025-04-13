package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.sv0;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class o20 {

    /* renamed from: a */
    @NonNull
    private final p20 f53134a;

    /* renamed from: b */
    private boolean f53135b;

    /* renamed from: c */
    private boolean f53136c;

    public o20(@NonNull p20 p20Var) {
        this.f53134a = p20Var;
    }

    /* renamed from: a */
    public final void m26985a() {
        this.f53135b = false;
        this.f53136c = false;
    }

    /* renamed from: b */
    public final void m26986b() {
        if (this.f53135b) {
            return;
        }
        this.f53135b = true;
        this.f53134a.m27150a(sv0.EnumC5764b.f54854v);
    }

    /* renamed from: c */
    public final void m26987c() {
        if (this.f53136c) {
            return;
        }
        this.f53136c = true;
        HashMap hashMap = new HashMap();
        hashMap.put("failure_tracked", Boolean.FALSE);
        this.f53134a.m27151a(sv0.EnumC5764b.f54855w, hashMap);
    }
}
