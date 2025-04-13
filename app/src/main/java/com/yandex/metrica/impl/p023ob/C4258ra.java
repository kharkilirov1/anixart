package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.ra */
/* loaded from: classes2.dex */
public class C4258ra implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C4128ma f46301a;

    /* renamed from: b */
    @NonNull
    private final C4180oa f46302b;

    public C4258ra() {
        this(new C4128ma(), new C4180oa());
    }

    @VisibleForTesting
    public C4258ra(@NonNull C4128ma c4128ma, @NonNull C4180oa c4180oa) {
        this.f46301a = c4128ma;
        this.f46302b = c4180oa;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k.a mo17818b(@NonNull C3668Uc c3668Uc) {
        C4082kg.k.a aVar = new C4082kg.k.a();
        aVar.f45720b = c3668Uc.f44132a;
        aVar.f45721c = c3668Uc.f44133b;
        aVar.f45722d = c3668Uc.f44134c;
        aVar.f45723e = c3668Uc.f44135d;
        aVar.f45724f = c3668Uc.f44136e;
        aVar.f45725g = c3668Uc.f44137f;
        aVar.f45726h = c3668Uc.f44138g;
        aVar.f45729k = c3668Uc.f44139h;
        aVar.f45727i = c3668Uc.f44140i;
        aVar.f45728j = c3668Uc.f44141j;
        aVar.f45735q = c3668Uc.f44142k;
        aVar.f45736r = c3668Uc.f44143l;
        C3269Ec c3269Ec = c3668Uc.f44144m;
        if (c3269Ec != null) {
            aVar.f45730l = this.f46301a.mo17818b(c3269Ec);
        }
        C3269Ec c3269Ec2 = c3668Uc.f44145n;
        if (c3269Ec2 != null) {
            aVar.f45731m = this.f46301a.mo17818b(c3269Ec2);
        }
        C3269Ec c3269Ec3 = c3668Uc.f44146o;
        if (c3269Ec3 != null) {
            aVar.f45732n = this.f46301a.mo17818b(c3269Ec3);
        }
        C3269Ec c3269Ec4 = c3668Uc.f44147p;
        if (c3269Ec4 != null) {
            aVar.f45733o = this.f46301a.mo17818b(c3269Ec4);
        }
        C3394Jc c3394Jc = c3668Uc.f44148q;
        if (c3394Jc != null) {
            aVar.f45734p = this.f46302b.mo17818b(c3394Jc);
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3668Uc mo17817a(@NonNull C4082kg.k.a aVar) {
        C4082kg.k.a.C7004a c7004a = aVar.f45730l;
        C3269Ec mo17817a = c7004a != null ? this.f46301a.mo17817a(c7004a) : null;
        C4082kg.k.a.C7004a c7004a2 = aVar.f45731m;
        C3269Ec mo17817a2 = c7004a2 != null ? this.f46301a.mo17817a(c7004a2) : null;
        C4082kg.k.a.C7004a c7004a3 = aVar.f45732n;
        C3269Ec mo17817a3 = c7004a3 != null ? this.f46301a.mo17817a(c7004a3) : null;
        C4082kg.k.a.C7004a c7004a4 = aVar.f45733o;
        C3269Ec mo17817a4 = c7004a4 != null ? this.f46301a.mo17817a(c7004a4) : null;
        C4082kg.k.a.b bVar = aVar.f45734p;
        return new C3668Uc(aVar.f45720b, aVar.f45721c, aVar.f45722d, aVar.f45723e, aVar.f45724f, aVar.f45725g, aVar.f45726h, aVar.f45729k, aVar.f45727i, aVar.f45728j, aVar.f45735q, aVar.f45736r, mo17817a, mo17817a2, mo17817a3, mo17817a4, bVar != null ? this.f46302b.mo17817a(bVar) : null);
    }
}
