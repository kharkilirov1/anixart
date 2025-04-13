package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.E7 */
/* loaded from: classes2.dex */
public class C3264E7 implements InterfaceC3920ea<C4151n7, C3572Qf> {

    /* renamed from: a */
    @NonNull
    private final C3189B7 f42769a;

    public C3264E7() {
        this(new C3189B7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4151n7 mo17817a(@NonNull C3572Qf c3572Qf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3264E7(@NonNull C3189B7 c3189b7) {
        this.f42769a = c3189b7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3572Qf mo17818b(@NonNull C4151n7 c4151n7) {
        C3572Qf c3572Qf = new C3572Qf();
        String m20447b = c4151n7.m20447b();
        if (m20447b == null) {
            m20447b = "";
        }
        c3572Qf.f43707b = m20447b;
        String m20448c = c4151n7.m20448c();
        c3572Qf.f43708c = m20448c != null ? m20448c : "";
        c3572Qf.f43709d = this.f42769a.mo17818b(c4151n7.m20449d());
        if (c4151n7.m20446a() != null) {
            c3572Qf.f43710e = mo17818b(c4151n7.m20446a());
        }
        List<C4151n7> m20450e = c4151n7.m20450e();
        int i2 = 0;
        if (m20450e == null) {
            c3572Qf.f43711f = new C3572Qf[0];
        } else {
            c3572Qf.f43711f = new C3572Qf[m20450e.size()];
            Iterator<C4151n7> it = m20450e.iterator();
            while (it.hasNext()) {
                c3572Qf.f43711f[i2] = mo17818b(it.next());
                i2++;
            }
        }
        return c3572Qf;
    }
}
