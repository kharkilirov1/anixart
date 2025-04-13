package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzgu extends AbstractList<String> implements RandomAccess, zzfa {

    /* renamed from: b */
    public final zzfa f16177b;

    public zzgu(zzfa zzfaVar) {
        this.f16177b = zzfaVar;
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    /* renamed from: B */
    public final List<?> mo8419B() {
        return this.f16177b.mo8419B();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return ((zzez) this.f16177b).get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzgt(this);
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    /* renamed from: j */
    public final zzfa mo8421j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i2) {
        return new zzgs(this, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16177b.size();
    }
}
