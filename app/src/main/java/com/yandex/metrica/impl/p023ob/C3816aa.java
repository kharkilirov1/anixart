package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3331H;
import com.yandex.metrica.impl.p023ob.C3848bg;

/* renamed from: com.yandex.metrica.impl.ob.aa */
/* loaded from: classes2.dex */
public class C3816aa implements InterfaceC3920ea<C3331H, C3848bg.a> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3848bg.a mo17818b(@NonNull C3331H c3331h) {
        C3848bg.a aVar = new C3848bg.a();
        C3331H.a aVar2 = c3331h.f43019a;
        if (aVar2 != null) {
            int ordinal = aVar2.ordinal();
            if (ordinal == 0) {
                aVar.f44833b = 1;
            } else if (ordinal == 1) {
                aVar.f44833b = 2;
            } else if (ordinal == 2) {
                aVar.f44833b = 3;
            } else if (ordinal == 3) {
                aVar.f44833b = 4;
            } else if (ordinal == 4) {
                aVar.f44833b = 5;
            }
        }
        Boolean bool = c3331h.f43020b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f44834c = 1;
            } else {
                aVar.f44834c = 0;
            }
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3331H mo17817a(@NonNull C3848bg.a aVar) {
        C3331H.a aVar2;
        int i2 = aVar.f44833b;
        Boolean bool = null;
        if (i2 == 1) {
            aVar2 = C3331H.a.ACTIVE;
        } else if (i2 == 2) {
            aVar2 = C3331H.a.WORKING_SET;
        } else if (i2 == 3) {
            aVar2 = C3331H.a.FREQUENT;
        } else if (i2 != 4) {
            aVar2 = i2 != 5 ? null : C3331H.a.RESTRICTED;
        } else {
            aVar2 = C3331H.a.RARE;
        }
        int i3 = aVar.f44834c;
        if (i3 == 0) {
            bool = Boolean.FALSE;
        } else if (i3 == 1) {
            bool = Boolean.TRUE;
        }
        return new C3331H(aVar2, bool);
    }
}
