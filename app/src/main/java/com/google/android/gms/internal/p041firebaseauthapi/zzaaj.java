package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzaaj extends zzyf implements RandomAccess, zzaak {

    /* renamed from: c */
    public final List f16277c;

    static {
        new zzaaj(10).f17107b = false;
    }

    public zzaaj() {
        this(10);
    }

    /* renamed from: e */
    public static String m8588e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof zzyu)) {
            return new String((byte[]) obj, zzaad.f16259a);
        }
        zzyu zzyuVar = (zzyu) obj;
        return zzyuVar.mo9513d() == 0 ? "" : zzyuVar.mo9518s(zzaad.f16259a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: Z */
    public final Object mo8589Z(int i2) {
        return this.f16277c.get(i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        m9489b();
        this.f16277c.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        m9489b();
        if (collection instanceof zzaak) {
            collection = ((zzaak) collection).mo8593k();
        }
        boolean addAll = this.f16277c.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaac
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzaac mo8572c(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f16277c);
        return new zzaaj(arrayList);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m9489b();
        this.f16277c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.f16277c.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzyu) {
            zzyu zzyuVar = (zzyu) obj;
            String mo9518s = zzyuVar.mo9513d() == 0 ? "" : zzyuVar.mo9518s(zzaad.f16259a);
            if (zzyuVar.mo9520u()) {
                this.f16277c.set(i2, mo9518s);
            }
            return mo9518s;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzaad.f16259a);
        if (zzacu.f16362a.mo8805a(0, bArr, 0, bArr.length) == 0) {
            this.f16277c.set(i2, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: i */
    public final void mo8591i(zzyu zzyuVar) {
        m9489b();
        this.f16277c.add(zzyuVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: j */
    public final zzaak mo8592j() {
        return this.f17107b ? new zzack(this) : this;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaak
    /* renamed from: k */
    public final List mo8593k() {
        return Collections.unmodifiableList(this.f16277c);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m9489b();
        Object remove = this.f16277c.remove(i2);
        ((AbstractList) this).modCount++;
        return m8588e(remove);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        m9489b();
        return m8588e(this.f16277c.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16277c.size();
    }

    public zzaaj(int i2) {
        this.f16277c = new ArrayList(i2);
    }

    public zzaaj(ArrayList arrayList) {
        this.f16277c = arrayList;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyf, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
