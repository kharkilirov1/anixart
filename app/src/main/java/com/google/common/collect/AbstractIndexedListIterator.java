package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* renamed from: b */
    public final int f20785b;

    /* renamed from: c */
    public int f20786c;

    public AbstractIndexedListIterator(int i2) {
        Preconditions.m11189m(0, i2);
        this.f20785b = i2;
        this.f20786c = 0;
    }

    /* renamed from: a */
    public abstract E mo11331a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20786c < this.f20785b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20786c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f20786c;
        this.f20786c = i2 + 1;
        return mo11331a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20786c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f20786c - 1;
        this.f20786c = i2;
        return mo11331a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20786c - 1;
    }

    public AbstractIndexedListIterator(int i2, int i3) {
        Preconditions.m11189m(i3, i2);
        this.f20785b = i2;
        this.f20786c = i3;
    }
}
