package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;

/* renamed from: com.yandex.metrica.impl.ob.gb */
/* loaded from: classes2.dex */
public class C3973gb implements InterfaceC3920ea<C4441yb, C4311tb<C3596Rf.a, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C4077kb f45196a;

    /* renamed from: b */
    @NonNull
    private final C3679Un f45197b;

    public C3973gb() {
        this(new C4077kb(), new C3679Un(20));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4441yb mo17817a(@NonNull C4311tb<C3596Rf.a, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3973gb(@NonNull C4077kb c4077kb, @NonNull C3679Un c3679Un) {
        this.f45196a = c4077kb;
        this.f45197b = c3679Un;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.a, InterfaceC3305Fn> mo17818b(@NonNull C4441yb c4441yb) {
        C3596Rf.a aVar = new C3596Rf.a();
        aVar.f43830c = this.f45196a.mo17818b(c4441yb.f46994a);
        C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f45197b.mo19058a(c4441yb.f46995b);
        aVar.f43829b = C3509O2.m18658c(mo19058a.f43777a);
        return new C4311tb<>(aVar, C3280En.m18019a(mo19058a));
    }
}
