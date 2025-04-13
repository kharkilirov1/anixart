package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzez extends zzdn<String> implements RandomAccess, zzfa {

    /* renamed from: c */
    public final List<Object> f16109c;

    static {
        new zzez(10).f16071b = false;
    }

    public zzez() {
        this(10);
    }

    /* renamed from: e */
    public static String m8418e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof zzeb)) {
            return new String((byte[]) obj, zzev.f16107a);
        }
        zzeb zzebVar = (zzeb) obj;
        return zzebVar.mo8371d() == 0 ? "" : zzebVar.mo8375g(zzev.f16107a);
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    /* renamed from: B */
    public final List<?> mo8419B() {
        return Collections.unmodifiableList(this.f16109c);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        m8346b();
        this.f16109c.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        m8346b();
        if (collection instanceof zzfa) {
            collection = ((zzfa) collection).mo8419B();
        }
        boolean addAll = this.f16109c.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzeu mo8364c(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f16109c);
        return new zzez((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8346b();
        this.f16109c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.f16109c.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            String mo8375g = zzebVar.mo8371d() == 0 ? "" : zzebVar.mo8375g(zzev.f16107a);
            if (zzebVar.mo8376r()) {
                this.f16109c.set(i2, mo8375g);
            }
            return mo8375g;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzev.f16107a);
        if (zzhd.f16185a.mo8529a(0, bArr, 0, bArr.length) == 0) {
            this.f16109c.set(i2, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    /* renamed from: j */
    public final zzfa mo8421j() {
        return this.f16071b ? new zzgu(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        m8346b();
        Object remove = this.f16109c.remove(i2);
        ((AbstractList) this).modCount++;
        return m8418e(remove);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        m8346b();
        return m8418e(this.f16109c.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16109c.size();
    }

    public zzez(int i2) {
        this.f16109c = new ArrayList(i2);
    }

    public zzez(ArrayList<Object> arrayList) {
        this.f16109c = arrayList;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
