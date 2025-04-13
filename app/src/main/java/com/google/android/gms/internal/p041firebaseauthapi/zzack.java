package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzack extends AbstractList implements RandomAccess, zzaak {

    /* renamed from: b */
    public final zzaak f16353b;

    public zzack(zzaak zzaakVar) {
        this.f16353b = zzaakVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: Z */
    public final Object mo8589Z(int i2) {
        return this.f16353b.mo8589Z(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((zzaaj) this.f16353b).get(i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: i */
    public final void mo8591i(zzyu zzyuVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzacj(this);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: j */
    public final zzaak mo8592j() {
        return this;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: k */
    public final List mo8593k() {
        return this.f16353b.mo8593k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        return new zzaci(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16353b.size();
    }
}
