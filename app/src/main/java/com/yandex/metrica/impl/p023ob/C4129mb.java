package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.mb */
/* loaded from: classes2.dex */
public class C4129mb implements InterfaceC4103lb<C3193Bb> {

    /* renamed from: a */
    @NonNull
    private final C4155nb f45946a;

    /* renamed from: b */
    @NonNull
    private final C4025ib f45947b;

    /* renamed from: c */
    @NonNull
    private final C3679Un f45948c;

    /* renamed from: d */
    @NonNull
    private final C4259rb f45949d;

    public C4129mb() {
        this(new C4155nb(), new C4025ib(), new C3679Un(100), new C4259rb());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public Object mo17817a(@NonNull List<C4311tb<C3596Rf, InterfaceC3305Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public List<C4311tb<C3596Rf, InterfaceC3305Fn>> mo17818b(@NonNull Object obj) {
        C4311tb<C3596Rf.i, InterfaceC3305Fn> c4311tb;
        C3193Bb c3193Bb = (C3193Bb) obj;
        C3596Rf c3596Rf = new C3596Rf();
        c3596Rf.f43822b = c3193Bb.f42616b;
        c3596Rf.f43827g = new C3596Rf.h();
        C3218Cb c3218Cb = c3193Bb.f42617c;
        C3596Rf.f fVar = new C3596Rf.f();
        fVar.f43839b = C3509O2.m18658c(c3218Cb.f42669a);
        C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f45948c.mo19058a(c3218Cb.f42670b);
        fVar.f43840c = C3509O2.m18658c(mo19058a.f43777a);
        fVar.f43843f = c3218Cb.f42671c.size();
        Map<String, String> map = c3218Cb.f42672d;
        if (map != null) {
            c4311tb = this.f45946a.mo17818b(map);
            fVar.f43841d = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        c3596Rf.f43827g.f43847b = fVar;
        InterfaceC3305Fn m18019a = C3280En.m18019a(mo19058a, c4311tb);
        List<C3168Ab> list = c3218Cb.f42671c;
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(this.f45949d);
        int m19596a = c3596Rf.f43822b != new C3596Rf().f43822b ? C3831b.m19596a(1, c3596Rf.f43822b) + 0 : 0;
        C3596Rf.q qVar = c3596Rf.f43823c;
        if (qVar != null) {
            m19596a += C3831b.m19598a(2, qVar);
        }
        C3596Rf.o oVar = c3596Rf.f43824d;
        if (oVar != null) {
            m19596a += C3831b.m19598a(3, oVar);
        }
        C3596Rf.p pVar = c3596Rf.f43825e;
        int i2 = 4;
        if (pVar != null) {
            m19596a += C3831b.m19598a(4, pVar);
        }
        C3596Rf.b bVar = c3596Rf.f43826f;
        if (bVar != null) {
            m19596a += C3831b.m19598a(5, bVar);
        }
        C3596Rf.h hVar = c3596Rf.f43827g;
        if (hVar != null) {
            m19596a += C3831b.m19598a(6, hVar);
        }
        ArrayList arrayList2 = new ArrayList();
        C3596Rf m20397a = m20397a(c3596Rf);
        InterfaceC3305Fn interfaceC3305Fn = m18019a;
        int i3 = m19596a;
        int i4 = 0;
        while (i4 < list.size()) {
            C3168Ab c3168Ab = list.get(i4);
            C3596Rf.g gVar = new C3596Rf.g();
            gVar.f43845b = i4;
            C4311tb<C3596Rf.c, InterfaceC3305Fn> mo17818b = this.f45947b.mo17818b(c3168Ab);
            gVar.f43846c = mo17818b.f46509a;
            Objects.requireNonNull(this.f45949d);
            int m19609c = C3831b.m19609c(i2);
            int m19603a = C3831b.m19603a(gVar);
            int m19606b = m19609c + m19603a + ((m19603a & (-128)) == 0 ? 0 : C3831b.m19606b(m19603a));
            if (arrayList2.size() != 0 && i3 + m19606b > 204800) {
                m20397a.f43827g.f43847b.f43842e = (C3596Rf.g[]) arrayList2.toArray(new C3596Rf.g[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C4311tb(m20397a, interfaceC3305Fn));
                interfaceC3305Fn = m18019a;
                i3 = m19596a;
                m20397a = m20397a(c3596Rf);
                arrayList2 = arrayList3;
            }
            arrayList2.add(gVar);
            interfaceC3305Fn = C3280En.m18019a(interfaceC3305Fn, mo17818b);
            i3 += m19606b;
            i4++;
            i2 = 4;
        }
        m20397a.f43827g.f43847b.f43842e = (C3596Rf.g[]) arrayList2.toArray(new C3596Rf.g[arrayList2.size()]);
        arrayList.add(new C4311tb(m20397a, interfaceC3305Fn));
        return arrayList;
    }

    @VisibleForTesting
    public C4129mb(@NonNull C4155nb c4155nb, @NonNull C4025ib c4025ib, @NonNull C3679Un c3679Un, @NonNull C4259rb c4259rb) {
        this.f45946a = c4155nb;
        this.f45947b = c4025ib;
        this.f45948c = c3679Un;
        this.f45949d = c4259rb;
    }

    /* renamed from: a */
    private C3596Rf m20397a(@NonNull C3596Rf c3596Rf) {
        C3596Rf c3596Rf2 = new C3596Rf();
        c3596Rf2.f43822b = c3596Rf.f43822b;
        C3596Rf.h hVar = new C3596Rf.h();
        c3596Rf2.f43827g = hVar;
        hVar.f43847b = new C3596Rf.f();
        C3596Rf.f fVar = c3596Rf2.f43827g.f43847b;
        C3596Rf.f fVar2 = c3596Rf.f43827g.f43847b;
        fVar.f43840c = fVar2.f43840c;
        fVar.f43839b = fVar2.f43839b;
        fVar.f43843f = fVar2.f43843f;
        fVar.f43841d = fVar2.f43841d;
        return c3596Rf2;
    }
}
