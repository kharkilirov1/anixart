package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.xb */
/* loaded from: classes2.dex */
public class C4415xb implements InterfaceC4103lb<C3418Kb> {

    /* renamed from: a */
    @NonNull
    private final C4337ub f46929a;

    public C4415xb() {
        this(new C4337ub());
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
        C3596Rf c3596Rf = new C3596Rf();
        c3596Rf.f43822b = 1;
        c3596Rf.f43823c = new C3596Rf.q();
        C4311tb<C3596Rf.n, InterfaceC3305Fn> mo17818b = this.f46929a.mo17818b(((C3418Kb) obj).f43274b);
        c3596Rf.f43823c.f43875b = mo17818b.f46509a;
        return Collections.singletonList(new C4311tb(c3596Rf, C3280En.m18019a(mo17818b)));
    }

    @VisibleForTesting
    public C4415xb(@NonNull C4337ub c4337ub) {
        this.f46929a = c4337ub;
    }
}
