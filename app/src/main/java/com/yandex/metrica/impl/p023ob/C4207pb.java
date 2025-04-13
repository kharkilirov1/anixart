package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pb */
/* loaded from: classes2.dex */
public class C4207pb implements InterfaceC3920ea<C3268Eb, C4311tb<C3596Rf.k, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C4155nb f46128a;

    /* renamed from: b */
    @NonNull
    private final C4181ob f46129b;

    /* renamed from: c */
    @NonNull
    private final C4051jb f46130c;

    /* renamed from: d */
    @NonNull
    private final C4233qb f46131d;

    /* renamed from: e */
    @NonNull
    private final C3679Un f46132e;

    /* renamed from: f */
    @NonNull
    private final C3679Un f46133f;

    public C4207pb() {
        this(new C4155nb(), new C4181ob(), new C4051jb(), new C4233qb(), new C3679Un(100), new C3679Un(1000));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3268Eb mo17817a(@NonNull C4311tb<C3596Rf.k, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4207pb(@NonNull C4155nb c4155nb, @NonNull C4181ob c4181ob, @NonNull C4051jb c4051jb, @NonNull C4233qb c4233qb, @NonNull C3679Un c3679Un, @NonNull C3679Un c3679Un2) {
        this.f46128a = c4155nb;
        this.f46129b = c4181ob;
        this.f46130c = c4051jb;
        this.f46131d = c4233qb;
        this.f46132e = c3679Un;
        this.f46133f = c3679Un2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.k, InterfaceC3305Fn> mo17818b(@NonNull C3268Eb c3268Eb) {
        C4311tb<C3596Rf.d, InterfaceC3305Fn> c4311tb;
        C4311tb<C3596Rf.i, InterfaceC3305Fn> c4311tb2;
        C4311tb<C3596Rf.j, InterfaceC3305Fn> c4311tb3;
        C4311tb<C3596Rf.j, InterfaceC3305Fn> c4311tb4;
        C3596Rf.k kVar = new C3596Rf.k();
        C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f46132e.mo19058a(c3268Eb.f42797a);
        kVar.f43855b = C3509O2.m18658c(mo19058a.f43777a);
        C3580Qn<String, InterfaceC3305Fn> mo19058a2 = this.f46133f.mo19058a(c3268Eb.f42798b);
        kVar.f43856c = C3509O2.m18658c(mo19058a2.f43777a);
        List<String> list = c3268Eb.f42799c;
        C4311tb<C3596Rf.l[], InterfaceC3305Fn> c4311tb5 = null;
        if (list != null) {
            c4311tb = this.f46130c.mo17818b(list);
            kVar.f43857d = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        Map<String, String> map = c3268Eb.f42800d;
        if (map != null) {
            c4311tb2 = this.f46128a.mo17818b(map);
            kVar.f43858e = c4311tb2.f46509a;
        } else {
            c4311tb2 = null;
        }
        C3243Db c3243Db = c3268Eb.f42801e;
        if (c3243Db != null) {
            c4311tb3 = this.f46129b.mo17818b(c3243Db);
            kVar.f43859f = c4311tb3.f46509a;
        } else {
            c4311tb3 = null;
        }
        C3243Db c3243Db2 = c3268Eb.f42802f;
        if (c3243Db2 != null) {
            c4311tb4 = this.f46129b.mo17818b(c3243Db2);
            kVar.f43860g = c4311tb4.f46509a;
        } else {
            c4311tb4 = null;
        }
        List<String> list2 = c3268Eb.f42803g;
        if (list2 != null) {
            c4311tb5 = this.f46131d.mo17818b(list2);
            kVar.f43861h = c4311tb5.f46509a;
        }
        return new C4311tb<>(kVar, C3280En.m18019a(mo19058a, mo19058a2, c4311tb, c4311tb2, c4311tb3, c4311tb4, c4311tb5));
    }
}
