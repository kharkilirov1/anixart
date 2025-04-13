package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.ga */
/* loaded from: classes2.dex */
public class C3972ga implements InterfaceC3920ea {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public Object mo17818b(@NonNull Object obj) {
        C3716Wa c3716Wa = (C3716Wa) obj;
        C4082kg.e eVar = new C4082kg.e();
        eVar.f45680b = c3716Wa.f44374a;
        eVar.f45681c = c3716Wa.f44375b;
        return eVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3716Wa mo17817a(@NonNull C4082kg.e eVar) {
        return new C3716Wa(eVar.f45680b, eVar.f45681c);
    }
}
