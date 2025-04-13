package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgs implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f16175b;

    public zzgs(zzgu zzguVar, int i2) {
        this.f16175b = zzguVar.f16177b.listIterator(i2);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f16175b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16175b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f16175b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16175b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f16175b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16175b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
