package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzam extends zzal {

    /* renamed from: e */
    public static final zzal f16389e = new zzam(new Object[0]);

    /* renamed from: d */
    public final transient Object[] f16390d;

    public zzam(Object[] objArr) {
        this.f16390d = objArr;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzal, com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: a */
    public final int mo8819a(Object[] objArr, int i2) {
        System.arraycopy(this.f16390d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: b */
    public final int mo8820b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: d */
    public final int mo8821d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzai
    /* renamed from: f */
    public final Object[] mo8823f() {
        return this.f16390d;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzy.m9479a(i2, 0, "index");
        Object obj = this.f16390d[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
