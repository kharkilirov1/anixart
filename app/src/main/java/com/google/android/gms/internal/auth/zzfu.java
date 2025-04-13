package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfu<T> implements zzgb<T> {

    /* renamed from: a */
    public final zzfq f16135a;

    /* renamed from: b */
    public final zzgp<?, ?> f16136b;

    /* renamed from: c */
    public final zzeh<?> f16137c;

    public zzfu(zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfq zzfqVar) {
        this.f16136b = zzgpVar;
        zzehVar.mo8387c(zzfqVar);
        this.f16137c = zzehVar;
        this.f16135a = zzfqVar;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: a */
    public final int mo8448a(T t) {
        return this.f16136b.mo8484a(t).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: b */
    public final void mo8449b(T t) {
        this.f16136b.mo8488e(t);
        this.f16137c.mo8386b(t);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: c */
    public final void mo8450c(T t, T t2) {
        zzgp<?, ?> zzgpVar = this.f16136b;
        Class<?> cls = zzgd.f16149a;
        zzgpVar.mo8489f(t, zzgpVar.mo8485b(zzgpVar.mo8484a(t), zzgpVar.mo8484a(t2)));
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: d */
    public final boolean mo8451d(T t) {
        this.f16137c.mo8385a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: e */
    public final boolean mo8452e(T t, T t2) {
        return this.f16136b.mo8484a(t).equals(this.f16136b.mo8484a(t2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: f */
    public final void mo8453f(T t, byte[] bArr, int i2, int i3, zzdp zzdpVar) throws IOException {
        zzeq zzeqVar = (zzeq) t;
        if (zzeqVar.zzc == zzgq.f16170e) {
            zzeqVar.zzc = zzgq.m8490a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    /* renamed from: x */
    public final T mo8466x() {
        return (T) ((zzeo) ((zzeq) this.f16135a).mo8405d(5, null, null)).mo8398B();
    }
}
