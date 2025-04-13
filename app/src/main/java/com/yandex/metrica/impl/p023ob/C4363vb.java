package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vb */
/* loaded from: classes2.dex */
public class C4363vb implements InterfaceC4103lb<C3368Ib> {

    /* renamed from: a */
    @NonNull
    private final C4337ub f46696a;

    /* renamed from: b */
    @NonNull
    private final C4207pb f46697b;

    public C4363vb() {
        this(new C4337ub(), new C4207pb());
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
        C3368Ib c3368Ib = (C3368Ib) obj;
        C3596Rf c3596Rf = new C3596Rf();
        c3596Rf.f43822b = 2;
        c3596Rf.f43824d = new C3596Rf.o();
        C4311tb<C3596Rf.n, InterfaceC3305Fn> mo17818b = this.f46696a.mo17818b(c3368Ib.f43119c);
        c3596Rf.f43824d.f43872c = mo17818b.f46509a;
        C4311tb<C3596Rf.k, InterfaceC3305Fn> mo17818b2 = this.f46697b.mo17818b(c3368Ib.f43118b);
        c3596Rf.f43824d.f43871b = mo17818b2.f46509a;
        return Collections.singletonList(new C4311tb(c3596Rf, C3280En.m18019a(mo17818b, mo17818b2)));
    }

    @VisibleForTesting
    public C4363vb(@NonNull C4337ub c4337ub, @NonNull C4207pb c4207pb) {
        this.f46696a = c4337ub;
        this.f46697b = c4207pb;
    }
}
