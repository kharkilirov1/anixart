package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzah extends zzao {

    /* renamed from: b */
    public final int f16381b;

    /* renamed from: c */
    public int f16382c;

    public zzah(int i2, int i3) {
        zzy.m9480b(i3, i2, "index");
        this.f16381b = i2;
        this.f16382c = i3;
    }

    /* renamed from: a */
    public abstract Object mo8818a(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16382c < this.f16381b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16382c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f16382c;
        this.f16382c = i2 + 1;
        return mo8818a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16382c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f16382c - 1;
        this.f16382c = i2;
        return mo8818a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16382c - 1;
    }
}
