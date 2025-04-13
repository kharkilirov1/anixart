package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.a */
/* loaded from: classes2.dex */
abstract class AbstractC4668a<E> extends AbstractC4701q0<E> {

    /* renamed from: a */
    private final int f47814a;

    /* renamed from: b */
    private int f47815b;

    public AbstractC4668a(int i2, int i3) {
        tr0.m28733b(i3, i2);
        this.f47814a = i2;
        this.f47815b = i3;
    }

    /* renamed from: a */
    public abstract E mo21978a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f47815b < this.f47814a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f47815b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f47815b;
        this.f47815b = i2 + 1;
        return mo21978a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f47815b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f47815b - 1;
        this.f47815b = i2;
        return mo21978a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f47815b - 1;
    }
}
