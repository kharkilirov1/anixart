package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.C3115a;
import com.yandex.metrica.billing_interface.EnumC3119e;
import com.yandex.metrica.impl.p023ob.C3874cg;

/* renamed from: com.yandex.metrica.impl.ob.u3 */
/* loaded from: classes2.dex */
class C4329u3 implements InterfaceC3920ea<C3115a, C3874cg.a> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3874cg.a mo17818b(@NonNull C3115a c3115a) {
        C3874cg.a aVar = new C3874cg.a();
        int ordinal = c3115a.f42392a.ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            i2 = 2;
        } else if (ordinal == 1) {
            i2 = 3;
        }
        aVar.f44877b = i2;
        aVar.f44878c = c3115a.f42393b;
        aVar.f44879d = c3115a.f42394c;
        aVar.f44880e = c3115a.f42395d;
        aVar.f44881f = c3115a.f42396e;
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3115a mo17817a(@NonNull C3874cg.a aVar) {
        EnumC3119e enumC3119e;
        int i2 = aVar.f44877b;
        if (i2 == 2) {
            enumC3119e = EnumC3119e.INAPP;
        } else if (i2 != 3) {
            enumC3119e = EnumC3119e.UNKNOWN;
        } else {
            enumC3119e = EnumC3119e.SUBS;
        }
        return new C3115a(enumC3119e, aVar.f44878c, aVar.f44879d, aVar.f44880e, aVar.f44881f);
    }
}
