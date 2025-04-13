package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.b4 */
/* loaded from: classes2.dex */
public class C3836b4 {

    /* renamed from: a */
    @NonNull
    private final C4171o1 f44803a;

    public C3836b4() {
        this(C3532P0.m18696i().m18707j());
    }

    @NonNull
    /* renamed from: a */
    public C4019i5<AbstractC3993h5, C3784Z3> m19646a(@NonNull C3784Z3 c3784z3) {
        return new C4019i5<>(new C3837b5(c3784z3), c3784z3);
    }

    @VisibleForTesting
    public C3836b4(@NonNull C4171o1 c4171o1) {
        this.f44803a = c4171o1;
    }

    @NonNull
    /* renamed from: a */
    public C3559Q2<C3784Z3> m19645a(@NonNull C3784Z3 c3784z3, @NonNull C3624Si c3624Si) {
        C3559Q2<C3784Z3> c3559q2 = new C3559Q2<>(c3784z3, new C3774Yi(c3624Si));
        this.f44803a.m20469a(c3559q2);
        return c3559q2;
    }
}
