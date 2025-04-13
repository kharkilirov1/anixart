package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;

/* renamed from: com.yandex.metrica.impl.ob.Kk */
/* loaded from: classes2.dex */
class C3427Kk implements InterfaceC4010hm {

    /* renamed from: a */
    @NonNull
    private final String f43284a;

    public C3427Kk(@NonNull String str) {
        this.f43284a = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    /* renamed from: a */
    public boolean mo17941a(@NonNull Object obj) {
        return ((String) obj).contains(this.f43284a);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4010hm
    @NonNull
    /* renamed from: a */
    public C3727Wl.b mo17940a() {
        return C3727Wl.b.CONTAINS;
    }
}
