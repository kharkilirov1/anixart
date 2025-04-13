package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3734X3;

/* renamed from: com.yandex.metrica.impl.ob.l5 */
/* loaded from: classes2.dex */
public class C4097l5 extends AbstractC3993h5 {

    /* renamed from: b */
    private final C3459M2 f45863b;

    /* renamed from: c */
    @NonNull
    private final C3245Dd f45864c;

    public C4097l5(@NonNull C3784Z3 c3784z3, @NonNull C3459M2 c3459m2, @NonNull C3245Dd c3245Dd) {
        super(c3784z3);
        this.f45863b = c3459m2;
        this.f45864c = c3245Dd;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3993h5
    /* renamed from: a */
    public boolean mo19997a(@NonNull C4066k0 c4066k0, @NonNull C3336H4 c3336h4) {
        C3734X3.a m19495a = c3336h4.m18188b().m19495a();
        this.f45863b.m18562a(m19495a.f44455l);
        Boolean bool = m19495a.f44448e;
        Boolean bool2 = m19495a.f44459p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f45864c.m17965a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f45864c.m17965a(false);
        }
        return false;
    }
}
