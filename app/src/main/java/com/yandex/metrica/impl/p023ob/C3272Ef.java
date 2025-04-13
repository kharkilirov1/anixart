package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3822ag;

/* renamed from: com.yandex.metrica.impl.ob.Ef */
/* loaded from: classes2.dex */
public class C3272Ef extends AbstractC4315tf<String> {

    /* renamed from: g */
    private final InterfaceC3555Pn<String> f42809g;

    public C3272Ef(@NonNull String str, @NonNull String str2, @NonNull InterfaceC3555Pn<String> interfaceC3555Pn, @NonNull InterfaceC4350uo<String> interfaceC4350uo, @NonNull AbstractC4237qf abstractC4237qf) {
        super(0, str, str2, interfaceC4350uo, abstractC4237qf);
        this.f42809g = interfaceC3555Pn;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4315tf
    /* renamed from: a */
    public void mo18013a(@NonNull C3822ag.a aVar) {
        String mo17985a = this.f42809g.mo17985a(m20833f());
        aVar.f44749e.f44752b = mo17985a == null ? new byte[0] : mo17985a.getBytes();
    }
}
