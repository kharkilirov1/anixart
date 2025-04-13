package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Cd */
/* loaded from: classes2.dex */
public abstract class AbstractC3220Cd<T> implements InterfaceC4286sc<T> {

    /* renamed from: a */
    @NonNull
    private final C3583R2 f42674a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3519Oc f42675b;

    public AbstractC3220Cd(@NonNull InterfaceC3519Oc interfaceC3519Oc, @NonNull C3583R2 c3583r2) {
        this.f42675b = interfaceC3519Oc;
        this.f42674a = c3583r2;
    }

    @NonNull
    /* renamed from: a */
    public abstract String mo17935a();

    /* renamed from: a */
    public boolean m17936a(long j2) {
        C3583R2 c3583r2 = this.f42674a;
        long mo18500a = this.f42675b.mo18500a();
        StringBuilder m24u = C0000a.m24u("last ");
        m24u.append(mo17935a());
        m24u.append(" scan attempt");
        return c3583r2.m18938b(mo18500a, j2, m24u.toString());
    }
}
