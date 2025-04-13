package com.yandex.metrica.impl.p023ob;

/* renamed from: com.yandex.metrica.impl.ob.do */
/* loaded from: classes2.dex */
public abstract class AbstractC3908do<T> {

    /* renamed from: a */
    public final T f44975a;

    public AbstractC3908do(T t) {
        this.f44975a = t;
    }

    /* renamed from: a */
    public abstract boolean mo19488a(AbstractC3908do<T> abstractC3908do);

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3908do) {
            try {
                return mo19488a((AbstractC3908do) obj);
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
