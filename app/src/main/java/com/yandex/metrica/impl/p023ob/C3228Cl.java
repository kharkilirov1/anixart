package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;

/* renamed from: com.yandex.metrica.impl.ob.Cl */
/* loaded from: classes2.dex */
public class C3228Cl implements InterfaceC4010hm {

    /* renamed from: a */
    private final int f42679a;

    public C3228Cl(int i2) {
        this.f42679a = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    /* renamed from: a */
    public boolean mo17941a(@NonNull Object obj) {
        return ((String) obj).length() > this.f42679a;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    @NonNull
    /* renamed from: a */
    public C3727Wl.b mo17940a() {
        return C3727Wl.b.TEXT_TOO_LONG;
    }
}
