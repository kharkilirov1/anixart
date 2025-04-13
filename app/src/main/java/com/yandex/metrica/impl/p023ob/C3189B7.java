package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.B7 */
/* loaded from: classes2.dex */
public class C3189B7 implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private C3214C7 f42615a = new C3214C7();

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public Object mo17817a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3522Of[] mo17818b(@NonNull List<C4099l7> list) {
        C3522Of[] c3522OfArr = new C3522Of[list.size()];
        Iterator<C4099l7> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c3522OfArr[i2] = this.f42615a.mo17818b(it.next());
            i2++;
        }
        return c3522OfArr;
    }
}
