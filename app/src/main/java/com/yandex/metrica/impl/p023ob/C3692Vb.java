package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.Vb */
/* loaded from: classes2.dex */
public class C3692Vb {

    /* renamed from: a */
    @NonNull
    private final List<InterfaceC3642Tb> f44225a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3717Wb f44226b;

    /* renamed from: c */
    private final AtomicBoolean f44227c = new AtomicBoolean(true);

    public C3692Vb(@NonNull List<InterfaceC3642Tb> list, @NonNull InterfaceC3717Wb interfaceC3717Wb) {
        this.f44225a = list;
        this.f44226b = interfaceC3717Wb;
    }

    /* renamed from: a */
    public void m19271a() {
        this.f44227c.set(false);
    }

    /* renamed from: b */
    public void m19272b() {
        this.f44227c.set(true);
    }

    /* renamed from: c */
    public void m19273c() {
        if (this.f44227c.get()) {
            if (this.f44225a.isEmpty()) {
                ((C3940f4) this.f44226b).m19872c();
                return;
            }
            boolean z = false;
            Iterator<InterfaceC3642Tb> it = this.f44225a.iterator();
            while (it.hasNext()) {
                z |= it.next().mo19082a();
            }
            if (z) {
                ((C3940f4) this.f44226b).m19872c();
            }
        }
    }
}
