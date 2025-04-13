package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.tc */
/* loaded from: classes2.dex */
public class C4312tc extends AbstractC3220Cd<C3269Ec> {

    /* renamed from: c */
    @NonNull
    private final String f46511c;

    public C4312tc(@NonNull InterfaceC3519Oc interfaceC3519Oc, @NonNull String str) {
        this(interfaceC3519Oc, str, new C3583R2());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4286sc
    /* renamed from: a */
    public boolean mo18159a(@NonNull Object obj) {
        C3244Dc c3244Dc = ((C3269Ec) obj).f42805b;
        return c3244Dc != null && m17936a(c3244Dc.f42711b);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4286sc
    /* renamed from: b */
    public boolean mo18160b(@NonNull Object obj) {
        return ((C3269Ec) obj).f42804a.f46999a;
    }

    @VisibleForTesting
    public C4312tc(@NonNull InterfaceC3519Oc interfaceC3519Oc, @NonNull String str, @NonNull C3583R2 c3583r2) {
        super(interfaceC3519Oc, c3583r2);
        this.f46511c = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3220Cd
    @NonNull
    /* renamed from: a */
    public String mo17935a() {
        return this.f46511c;
    }
}
