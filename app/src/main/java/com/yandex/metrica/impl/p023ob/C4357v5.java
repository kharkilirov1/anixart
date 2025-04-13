package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.v5 */
/* loaded from: classes2.dex */
public class C4357v5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3365I8 f46670b;

    public C4357v5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, c3940f4.m19891w());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        C3940f4 m20685a = m20685a();
        if (this.f46670b.m18270m()) {
            return false;
        }
        if (!this.f46670b.m18271n()) {
            m20685a.m19887r().m20857a(C4066k0.m20185b(c4066k0));
        }
        this.f46670b.m18253a(true);
        return false;
    }

    @VisibleForTesting
    public C4357v5(@NonNull C3940f4 c3940f4, @NonNull C3365I8 c3365i8) {
        super(c3940f4);
        this.f46670b = c3365i8;
    }
}
