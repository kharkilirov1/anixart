package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hb */
/* loaded from: classes2.dex */
public class C3999hb implements InterfaceC4103lb<C4467zb> {

    /* renamed from: a */
    @NonNull
    private final C4025ib f45265a;

    public C3999hb() {
        this(new C4025ib());
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
        C4467zb c4467zb = (C4467zb) obj;
        C3596Rf c3596Rf = new C3596Rf();
        c3596Rf.f43826f = new C3596Rf.b();
        C4311tb<C3596Rf.c, InterfaceC3305Fn> mo17818b = this.f45265a.mo17818b(c4467zb.f47106c);
        c3596Rf.f43826f.f43831b = mo17818b.f46509a;
        c3596Rf.f43822b = c4467zb.f47105b;
        return Collections.singletonList(new C4311tb(c3596Rf, C3280En.m18019a(mo17818b)));
    }

    @VisibleForTesting
    public C3999hb(@NonNull C4025ib c4025ib) {
        this.f45265a = c4025ib;
    }
}
