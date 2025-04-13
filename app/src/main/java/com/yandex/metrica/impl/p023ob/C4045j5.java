package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.j5 */
/* loaded from: classes2.dex */
public class C4045j5 extends AbstractC3993h5 {
    public C4045j5(C3784Z3 c3784z3) {
        super(c3784z3);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3993h5
    /* renamed from: a */
    public boolean mo19997a(@NonNull C4066k0 c4066k0, @NonNull C3336H4 c3336h4) {
        Bundle m20209k = c4066k0.m20209k();
        m19996a().m19500a(m20209k != null ? (C3937f1) m20209k.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null);
        return false;
    }
}
