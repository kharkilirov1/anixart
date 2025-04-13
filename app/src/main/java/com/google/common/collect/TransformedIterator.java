package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;
import java.util.Objects;

@GwtCompatible
/* loaded from: classes.dex */
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* renamed from: b */
    public final Iterator<? extends F> f21577b;

    public TransformedIterator(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f21577b = it;
    }

    /* renamed from: a */
    public abstract T mo11415a(F f2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21577b.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo11415a(this.f21577b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21577b.remove();
    }
}
