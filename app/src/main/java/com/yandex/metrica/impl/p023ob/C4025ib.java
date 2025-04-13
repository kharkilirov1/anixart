package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;

/* renamed from: com.yandex.metrica.impl.ob.ib */
/* loaded from: classes2.dex */
public class C4025ib implements InterfaceC3920ea<C3168Ab, C4311tb<C3596Rf.c, InterfaceC3305Fn>> {

    /* renamed from: a */
    @NonNull
    private final C4207pb f45327a;

    /* renamed from: b */
    @NonNull
    private final C4077kb f45328b;

    /* renamed from: c */
    @NonNull
    private final C4181ob f45329c;

    /* renamed from: d */
    @NonNull
    private final C4285sb f45330d;

    public C4025ib() {
        this(new C4207pb(), new C4077kb(), new C4181ob(), new C4285sb());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3168Ab mo17817a(@NonNull C4311tb<C3596Rf.c, InterfaceC3305Fn> c4311tb) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C4025ib(@NonNull C4207pb c4207pb, @NonNull C4077kb c4077kb, @NonNull C4181ob c4181ob, @NonNull C4285sb c4285sb) {
        this.f45327a = c4207pb;
        this.f45328b = c4077kb;
        this.f45329c = c4181ob;
        this.f45330d = c4285sb;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4311tb<C3596Rf.c, InterfaceC3305Fn> mo17818b(@NonNull C3168Ab c3168Ab) {
        C4311tb<C3596Rf.m, InterfaceC3305Fn> c4311tb;
        C3596Rf.c cVar = new C3596Rf.c();
        C4311tb<C3596Rf.k, InterfaceC3305Fn> mo17818b = this.f45327a.mo17818b(c3168Ab.f42534a);
        cVar.f43832b = mo17818b.f46509a;
        cVar.f43834d = this.f45328b.mo17818b(c3168Ab.f42535b);
        C4311tb<C3596Rf.j, InterfaceC3305Fn> mo17818b2 = this.f45329c.mo17818b(c3168Ab.f42536c);
        cVar.f43835e = mo17818b2.f46509a;
        C3318Gb c3318Gb = c3168Ab.f42537d;
        if (c3318Gb != null) {
            c4311tb = this.f45330d.mo17818b(c3318Gb);
            cVar.f43833c = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        return new C4311tb<>(cVar, C3280En.m18019a(mo17818b, mo17818b2, c4311tb));
    }
}
