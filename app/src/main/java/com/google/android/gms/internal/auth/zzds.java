package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzds extends zzdv {

    /* renamed from: b */
    public int f16078b = 0;

    /* renamed from: c */
    public final int f16079c;

    /* renamed from: d */
    public final /* synthetic */ zzeb f16080d;

    public zzds(zzeb zzebVar) {
        this.f16080d = zzebVar;
        this.f16079c = zzebVar.mo8371d();
    }

    /* renamed from: a */
    public final byte m8368a() {
        int i2 = this.f16078b;
        if (i2 >= this.f16079c) {
            throw new NoSuchElementException();
        }
        this.f16078b = i2 + 1;
        return this.f16080d.mo8370b(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16078b < this.f16079c;
    }
}
