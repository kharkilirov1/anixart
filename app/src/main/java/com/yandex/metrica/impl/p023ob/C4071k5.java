package com.yandex.metrica.impl.p023ob;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.k5 */
/* loaded from: classes2.dex */
public class C4071k5 extends AbstractC3993h5 {
    public C4071k5(C3784Z3 c3784z3) {
        super(c3784z3);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3993h5
    /* renamed from: a */
    public boolean mo19997a(@NonNull C4066k0 c4066k0, @NonNull C3336H4 c3336h4) {
        Bundle m20209k = c4066k0.m20209k();
        m19996a().m19496a(m20209k != null ? (ResultReceiver) m20209k.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
