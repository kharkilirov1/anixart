package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
abstract class zzz<E> extends zzak<E> {

    /* renamed from: b */
    public final int f16257b;

    /* renamed from: c */
    public int f16258c;

    public zzz(int i2, int i3) {
        zzs.m8563b(i3, i2, "index");
        this.f16257b = i2;
        this.f16258c = i3;
    }

    /* renamed from: a */
    public abstract E mo8551a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16258c < this.f16257b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16258c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f16258c;
        this.f16258c = i2 + 1;
        return mo8551a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16258c;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f16258c - 1;
        this.f16258c = i2;
        return mo8551a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16258c - 1;
    }
}
