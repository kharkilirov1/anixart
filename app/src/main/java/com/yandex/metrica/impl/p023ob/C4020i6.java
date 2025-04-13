package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.i6 */
/* loaded from: classes2.dex */
class C4020i6 implements InterfaceC3920ea<C3994h6, C3926eg> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3926eg mo17818b(@NonNull C3994h6 c3994h6) {
        C3926eg c3926eg = new C3926eg();
        c3926eg.f45057e = new int[c3994h6.m20001b().size()];
        Iterator<Integer> it = c3994h6.m20001b().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c3926eg.f45057e[i2] = it.next().intValue();
            i2++;
        }
        c3926eg.f45056d = c3994h6.m20003c();
        c3926eg.f45055c = c3994h6.m20004d();
        c3926eg.f45054b = c3994h6.m20005e();
        return c3926eg;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3994h6 mo17817a(@NonNull C3926eg c3926eg) {
        return new C3994h6(c3926eg.f45054b, c3926eg.f45055c, c3926eg.f45056d, C3658U2.m19206a(c3926eg.f45057e));
    }
}
