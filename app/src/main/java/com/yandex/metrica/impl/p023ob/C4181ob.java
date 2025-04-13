package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ob */
/* loaded from: classes2.dex */
public class C4181ob implements InterfaceC3920ea<C3243Db, C4311tb<C3596Rf.j, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C3973gb f46065a;

    /* renamed from: b */
    @NonNull
    private final C3443Lb f46066b;

    public C4181ob() {
        this(new C3973gb(), new C3443Lb(30));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3243Db mo17817a(@NonNull C4311tb<C3596Rf.j, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4181ob(@NonNull C3973gb c3973gb, @NonNull C3443Lb c3443Lb) {
        this.f46065a = c3973gb;
        this.f46066b = c3443Lb;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.j, InterfaceC3305Fn> mo17818b(@NonNull C3243Db c3243Db) {
        int i2;
        C3596Rf.j jVar = new C3596Rf.j();
        C4311tb<C3596Rf.a, InterfaceC3305Fn> mo17818b = this.f46065a.mo17818b(c3243Db.f42708a);
        jVar.f43853b = mo17818b.f46509a;
        C3580Qn<List<Object>, C3355Hn> mo19058a = this.f46066b.mo19058a((List<Object>) c3243Db.f42709b);
        if (C3658U2.m19217b(mo19058a.f43777a)) {
            i2 = 0;
        } else {
            jVar.f43854c = new C3596Rf.a[mo19058a.f43777a.size()];
            i2 = 0;
            for (int i3 = 0; i3 < mo19058a.f43777a.size(); i3++) {
                C4311tb<C3596Rf.a, InterfaceC3305Fn> mo17818b2 = this.f46065a.mo17818b((C4441yb) mo19058a.f43777a.get(i3));
                jVar.f43854c[i3] = mo17818b2.f46509a;
                i2 += mo17818b2.f46510b.mo18020a();
            }
        }
        return new C4311tb<>(jVar, C3280En.m18019a(mo17818b, mo19058a, new C3280En(i2)));
    }
}
