package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.Z9 */
/* loaded from: classes2.dex */
public class C3790Z9 implements InterfaceC3920ea<C4195p, C4082kg.b> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C4082kg.b mo17818b(@NonNull C4195p c4195p) {
        C4195p c4195p2 = c4195p;
        C4082kg.b bVar = new C4082kg.b();
        bVar.f45671b = c4195p2.f46090a;
        bVar.f45672c = c4195p2.f46091b;
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C4195p mo17817a(@NonNull C4082kg.b bVar) {
        return new C4195p(bVar.f45671b, bVar.f45672c);
    }
}
