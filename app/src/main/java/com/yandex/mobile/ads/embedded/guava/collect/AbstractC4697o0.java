package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.o0 */
/* loaded from: classes2.dex */
abstract class AbstractC4697o0<F, T> implements Iterator<T> {

    /* renamed from: a */
    public final Iterator<? extends F> f47898a;

    public AbstractC4697o0(Iterator<? extends F> it) {
        this.f47898a = (Iterator) tr0.m28727a(it);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47898a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return (T) ((Map.Entry) this.f47898a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f47898a.remove();
    }
}
