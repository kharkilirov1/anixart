package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.j */
/* loaded from: classes2.dex */
final class C4686j<T> extends AbstractC4675d0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final Comparator<T> f47885a;

    public C4686j(Comparator<T> comparator) {
        this.f47885a = (Comparator) tr0.m28727a(comparator);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4675d0, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.f47885a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4686j) {
            return this.f47885a.equals(((C4686j) obj).f47885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47885a.hashCode();
    }

    public final String toString() {
        return this.f47885a.toString();
    }
}
