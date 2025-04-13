package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3811a5;
import com.yandex.metrica.impl.p023ob.C3940f4;
import com.yandex.metrica.impl.p023ob.InterfaceC4149n5;

/* renamed from: com.yandex.metrica.impl.ob.g5 */
/* loaded from: classes2.dex */
public class C3967g5<T extends InterfaceC4149n5, C extends C3940f4> extends C3811a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.g5$a */
    public class a implements C3811a5.a<T> {
        public a(C3967g5 c3967g5) {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3811a5.a
        /* renamed from: a */
        public boolean mo19570a(Object obj, C4066k0 c4066k0) {
            return ((InterfaceC4149n5) obj).mo17815a(c4066k0);
        }
    }

    public C3967g5(AbstractC3941f5<T> abstractC3941f5, C c2) {
        super(abstractC3941f5, c2);
    }

    /* renamed from: a */
    public boolean m19946a(C4066k0 c4066k0) {
        return m19569a(c4066k0, new a(this));
    }
}
