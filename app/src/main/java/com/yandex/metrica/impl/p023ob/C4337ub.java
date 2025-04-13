package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ub */
/* loaded from: classes2.dex */
public class C4337ub implements InterfaceC3920ea<C3343Hb, C4311tb<C3596Rf.n, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C4155nb f46596a;

    /* renamed from: b */
    @NonNull
    private final C4051jb f46597b;

    /* renamed from: c */
    @NonNull
    private final C3679Un f46598c;

    /* renamed from: d */
    @NonNull
    private final C3679Un f46599d;

    public C4337ub() {
        this(new C4155nb(), new C4051jb(), new C3679Un(100), new C3679Un(1000));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3343Hb mo17817a(@NonNull C4311tb<C3596Rf.n, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4337ub(@NonNull C4155nb c4155nb, @NonNull C4051jb c4051jb, @NonNull C3679Un c3679Un, @NonNull C3679Un c3679Un2) {
        this.f46596a = c4155nb;
        this.f46597b = c4051jb;
        this.f46598c = c3679Un;
        this.f46599d = c3679Un2;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.n, InterfaceC3305Fn> mo17818b(@NonNull C3343Hb c3343Hb) {
        C4311tb<C3596Rf.d, InterfaceC3305Fn> c4311tb;
        C3596Rf.n nVar = new C3596Rf.n();
        C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f46598c.mo19058a(c3343Hb.f43048a);
        nVar.f43867b = C3509O2.m18658c(mo19058a.f43777a);
        List<String> list = c3343Hb.f43049b;
        C4311tb<C3596Rf.i, InterfaceC3305Fn> c4311tb2 = null;
        if (list != null) {
            c4311tb = this.f46597b.mo17818b(list);
            nVar.f43868c = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        C3580Qn<String, InterfaceC3305Fn> mo19058a2 = this.f46599d.mo19058a(c3343Hb.f43050c);
        nVar.f43869d = C3509O2.m18658c(mo19058a2.f43777a);
        Map<String, String> map = c3343Hb.f43051d;
        if (map != null) {
            c4311tb2 = this.f46596a.mo17818b(map);
            nVar.f43870e = c4311tb2.f46509a;
        }
        return new C4311tb<>(nVar, C3280En.m18019a(mo19058a, c4311tb, mo19058a2, c4311tb2));
    }
}
