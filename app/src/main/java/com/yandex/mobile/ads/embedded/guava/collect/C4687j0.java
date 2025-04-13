package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.j0 */
/* loaded from: classes2.dex */
final class C4687j0<T> extends AbstractC4675d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final AbstractC4675d0<? super T> f47886a;

    public C4687j0(AbstractC4675d0<? super T> abstractC4675d0) {
        this.f47886a = (AbstractC4675d0) tr0.m28727a(abstractC4675d0);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0
    /* renamed from: b */
    public final <S extends T> AbstractC4675d0<S> mo21983b() {
        return this.f47886a;
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f47886a.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4687j0) {
            return this.f47886a.equals(((C4687j0) obj).f47886a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f47886a.hashCode();
    }

    public final String toString() {
        return this.f47886a + ".reverse()";
    }
}
