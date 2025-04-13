package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.ListIterator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzaci implements ListIterator {

    /* renamed from: b */
    public final ListIterator f16351b;

    public zzaci(zzack zzackVar, int i2) {
        this.f16351b = zzackVar.f16353b.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f16351b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16351b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f16351b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16351b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f16351b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16351b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
