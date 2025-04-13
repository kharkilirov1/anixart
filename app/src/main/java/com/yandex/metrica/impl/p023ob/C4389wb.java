package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3596Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wb */
/* loaded from: classes2.dex */
public class C4389wb implements InterfaceC4103lb<C3393Jb> {

    /* renamed from: a */
    @NonNull
    private final C4207pb f46861a;

    /* renamed from: b */
    @NonNull
    private final C4285sb f46862b;

    public C4389wb() {
        this(new C4207pb(), new C4285sb());
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
        C4311tb<C3596Rf.m, InterfaceC3305Fn> c4311tb;
        C3393Jb c3393Jb = (C3393Jb) obj;
        C3596Rf c3596Rf = new C3596Rf();
        c3596Rf.f43822b = 3;
        c3596Rf.f43825e = new C3596Rf.p();
        C4311tb<C3596Rf.k, InterfaceC3305Fn> mo17818b = this.f46861a.mo17818b(c3393Jb.f43239b);
        c3596Rf.f43825e.f43873b = mo17818b.f46509a;
        C3318Gb c3318Gb = c3393Jb.f43240c;
        if (c3318Gb != null) {
            c4311tb = this.f46862b.mo17818b(c3318Gb);
            c3596Rf.f43825e.f43874c = c4311tb.f46509a;
        } else {
            c4311tb = null;
        }
        return Collections.singletonList(new C4311tb(c3596Rf, C3280En.m18019a(mo17818b, c4311tb)));
    }

    @VisibleForTesting
    public C4389wb(@NonNull C4207pb c4207pb, @NonNull C4285sb c4285sb) {
        this.f46861a = c4207pb;
        this.f46862b = c4285sb;
    }
}
