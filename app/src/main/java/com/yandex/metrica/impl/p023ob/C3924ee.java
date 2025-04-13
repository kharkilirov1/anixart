package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.ee */
/* loaded from: classes2.dex */
class C3924ee implements InterfaceC3898de {

    /* renamed from: a */
    private final boolean f45053a;

    public C3924ee(boolean z) {
        this.f45053a = z;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3898de
    /* renamed from: a */
    public boolean mo19653a(@NonNull String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f45053a;
        }
        return true;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LocationFlagStrategy{mEnabled=");
        m24u.append(this.f45053a);
        m24u.append('}');
        return m24u.toString();
    }
}
