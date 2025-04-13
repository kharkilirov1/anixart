package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.InterfaceC4044j4;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.a5 */
/* loaded from: classes2.dex */
public class C3811a5<T, C extends InterfaceC4044j4> {

    /* renamed from: a */
    private final AbstractC3941f5<T> f44728a;

    /* renamed from: com.yandex.metrica.impl.ob.a5$a */
    public interface a<T> {
        /* renamed from: a */
        boolean mo19570a(T t, C4066k0 c4066k0);
    }

    public C3811a5(AbstractC3941f5<T> abstractC3941f5, C c2) {
        this.f44728a = abstractC3941f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public boolean m19569a(@NonNull C4066k0 c4066k0, @NonNull a<T> aVar) {
        Iterator<Object> it = this.f44728a.mo19647a(c4066k0.m20212n()).m19671a().iterator();
        while (it.hasNext()) {
            if (aVar.mo19570a(it.next(), c4066k0)) {
                return true;
            }
        }
        return false;
    }
}
