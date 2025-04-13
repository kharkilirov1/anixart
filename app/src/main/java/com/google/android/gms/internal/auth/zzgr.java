package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgr extends zzgp<zzgq, zzgq> {
    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzgq mo8484a(Object obj) {
        return ((zzeq) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: b */
    public final zzgq mo8485b(zzgq zzgqVar, zzgq zzgqVar2) {
        zzgq zzgqVar3 = zzgqVar2;
        if (zzgqVar3.equals(zzgq.f16170e)) {
            return zzgqVar;
        }
        zzgq zzgqVar4 = zzgqVar;
        int i2 = zzgqVar4.f16171a + zzgqVar3.f16171a;
        int[] copyOf = Arrays.copyOf(zzgqVar4.f16172b, i2);
        System.arraycopy(zzgqVar3.f16172b, 0, copyOf, zzgqVar4.f16171a, zzgqVar3.f16171a);
        Object[] copyOf2 = Arrays.copyOf(zzgqVar4.f16173c, i2);
        System.arraycopy(zzgqVar3.f16173c, 0, copyOf2, zzgqVar4.f16171a, zzgqVar3.f16171a);
        return new zzgq(i2, copyOf, copyOf2, true);
    }

    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzgq mo8486c() {
        return zzgq.m8490a();
    }

    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8487d(zzgq zzgqVar, int i2, long j2) {
        zzgqVar.m8491b(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: e */
    public final void mo8488e(Object obj) {
        ((zzeq) obj).zzc.f16174d = false;
    }

    @Override // com.google.android.gms.internal.auth.zzgp
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo8489f(Object obj, zzgq zzgqVar) {
        ((zzeq) obj).zzc = zzgqVar;
    }
}
