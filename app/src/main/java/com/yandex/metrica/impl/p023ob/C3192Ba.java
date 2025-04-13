package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.Ba */
/* loaded from: classes2.dex */
public class C3192Ba implements InterfaceC3920ea<C3250Di, C4082kg.o> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.o mo17818b(@NonNull C3250Di c3250Di) {
        C4082kg.o oVar = new C4082kg.o();
        oVar.f45765b = c3250Di.f42742a;
        oVar.f45766c = c3250Di.f42743b;
        oVar.f45767d = c3250Di.f42744c;
        oVar.f45768e = c3250Di.f42745d;
        return oVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3250Di mo17817a(@NonNull C4082kg.o oVar) {
        return new C3250Di(oVar.f45765b, oVar.f45766c, oVar.f45767d, oVar.f45768e);
    }
}
