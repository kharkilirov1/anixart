package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3672Ug;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Wg */
/* loaded from: classes2.dex */
public class C3722Wg implements C3672Ug.a {

    /* renamed from: a */
    @NonNull
    private final Set<InterfaceC3273Eg> f44391a;

    /* renamed from: b */
    private boolean f44392b;

    /* renamed from: c */
    @Nullable
    private C3298Fg f44393c;

    public C3722Wg() {
        this(C3532P0.m18696i().m18712o());
    }

    @Override // com.yandex.metrica.impl.p023ob.C3672Ug.a
    /* renamed from: a */
    public synchronized void mo19249a(@Nullable C3298Fg c3298Fg) {
        this.f44393c = c3298Fg;
        this.f44392b = true;
        Iterator<InterfaceC3273Eg> it = this.f44391a.iterator();
        while (it.hasNext()) {
            it.next().mo17971a(this.f44393c);
        }
        this.f44391a.clear();
    }

    @VisibleForTesting
    public C3722Wg(@NonNull C3672Ug c3672Ug) {
        this.f44391a = new HashSet();
        c3672Ug.m19247a(new C3823ah(this));
        c3672Ug.m19248b();
    }

    /* renamed from: a */
    public synchronized void m19360a(@NonNull InterfaceC3273Eg interfaceC3273Eg) {
        this.f44391a.add(interfaceC3273Eg);
        if (this.f44392b) {
            interfaceC3273Eg.mo17971a(this.f44393c);
            this.f44391a.remove(interfaceC3273Eg);
        }
    }
}
