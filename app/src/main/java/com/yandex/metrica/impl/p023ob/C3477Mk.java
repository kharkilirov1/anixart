package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Mk */
/* loaded from: classes2.dex */
class C3477Mk {

    /* renamed from: a */
    @NonNull
    private final C3291F9 f43446a;

    /* renamed from: b */
    private long f43447b;

    public C3477Mk(@NonNull C3291F9 c3291f9) {
        this.f43446a = c3291f9;
        this.f43447b = c3291f9.m18049c(-1L);
    }

    /* renamed from: a */
    public long m18597a() {
        C3291F9 c3291f9 = this.f43446a;
        long j2 = this.f43447b + 1;
        this.f43447b = j2;
        c3291f9.m18058f(j2);
        return this.f43447b;
    }
}
