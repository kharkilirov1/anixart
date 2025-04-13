package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3196Be;
import com.yandex.metrica.impl.p023ob.C3978gg;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.De */
/* loaded from: classes2.dex */
public class C3246De implements InterfaceC3920ea<C3196Be, C3978gg> {

    /* renamed from: a */
    @NonNull
    private final C3471Me f42717a;

    /* renamed from: b */
    @NonNull
    private final C4470ze f42718b;

    public C3246De() {
        this(new C3471Me(), new C4470ze());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C3196Be mo17817a(@NonNull C3978gg c3978gg) {
        C3978gg c3978gg2 = c3978gg;
        ArrayList arrayList = new ArrayList(c3978gg2.f45209c.length);
        for (C3978gg.b bVar : c3978gg2.f45209c) {
            arrayList.add(this.f42718b.mo17817a(bVar));
        }
        C3978gg.a aVar = c3978gg2.f45208b;
        return new C3196Be(aVar == null ? this.f42717a.mo17817a(new C3978gg.a()) : this.f42717a.mo17817a(aVar), arrayList);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: b */
    public C3978gg mo17818b(@NonNull C3196Be c3196Be) {
        C3196Be c3196Be2 = c3196Be;
        C3978gg c3978gg = new C3978gg();
        c3978gg.f45208b = this.f42717a.mo17818b(c3196Be2.f42623a);
        c3978gg.f45209c = new C3978gg.b[c3196Be2.f42624b.size()];
        Iterator<C3196Be.a> it = c3196Be2.f42624b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c3978gg.f45209c[i2] = this.f42718b.mo17818b(it.next());
            i2++;
        }
        return c3978gg;
    }

    @VisibleForTesting
    public C3246De(@NonNull C3471Me c3471Me, @NonNull C4470ze c4470ze) {
        this.f42717a = c3471Me;
        this.f42718b = c4470ze;
    }
}
