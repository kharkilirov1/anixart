package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.Ga */
/* loaded from: classes2.dex */
public class C3317Ga implements InterfaceC3920ea<C3674Ui, C4082kg.r> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C4082kg.r mo17818b(@NonNull C3674Ui c3674Ui) {
        C4082kg.r rVar = new C4082kg.r();
        rVar.f45780b = c3674Ui.f44187a;
        return rVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3674Ui mo17817a(@NonNull C4082kg.r rVar) {
        return new C3674Ui(rVar.f45780b);
    }
}
