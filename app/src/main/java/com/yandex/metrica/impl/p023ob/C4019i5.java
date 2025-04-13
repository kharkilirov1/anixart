package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.AbstractC3993h5;
import com.yandex.metrica.impl.p023ob.C3784Z3;
import com.yandex.metrica.impl.p023ob.C3811a5;

/* renamed from: com.yandex.metrica.impl.ob.i5 */
/* loaded from: classes2.dex */
public class C4019i5<T extends AbstractC3993h5, C extends C3784Z3> extends C3811a5<T, C> {

    /* renamed from: com.yandex.metrica.impl.ob.i5$a */
    public class a implements C3811a5.a<T> {

        /* renamed from: a */
        public final /* synthetic */ C3336H4 f45319a;

        public a(C4019i5 c4019i5, C3336H4 c3336h4) {
            this.f45319a = c3336h4;
        }

        @Override // com.yandex.metrica.impl.p023ob.C3811a5.a
        /* renamed from: a */
        public boolean mo19570a(Object obj, C4066k0 c4066k0) {
            return ((AbstractC3993h5) obj).mo19997a(c4066k0, this.f45319a);
        }
    }

    public C4019i5(@NonNull AbstractC3941f5<T> abstractC3941f5, @NonNull C c2) {
        super(abstractC3941f5, c2);
    }

    /* renamed from: a */
    public boolean m20050a(@NonNull C4066k0 c4066k0, @NonNull C3336H4 c3336h4) {
        return m19569a(c4066k0, new a(this, c3336h4));
    }
}
