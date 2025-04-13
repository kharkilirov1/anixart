package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzach extends zzacf {
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: a */
    public final /* synthetic */ int mo8742a(Object obj) {
        return ((zzacg) obj).m8761a();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: b */
    public final int mo8743b(Object obj) {
        zzacg zzacgVar = (zzacg) obj;
        int i2 = zzacgVar.f16349d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < zzacgVar.f16346a; i4++) {
            int i5 = zzacgVar.f16347b[i4];
            zzyu zzyuVar = (zzyu) zzacgVar.f16348c[i4];
            int m9612e = zzzf.m9612e(8);
            int mo9513d = zzyuVar.mo9513d();
            i3 += zzzf.m9612e(mo9513d) + mo9513d + zzzf.m9612e(24) + zzzf.m9612e(i5 >>> 3) + zzzf.m9612e(16) + m9612e + m9612e;
        }
        zzacgVar.f16349d = i3;
        return i3;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo8744c(Object obj) {
        zzzx zzzxVar = (zzzx) obj;
        zzacg zzacgVar = zzzxVar.zzc;
        if (zzacgVar != zzacg.f16345f) {
            return zzacgVar;
        }
        zzacg m8760b = zzacg.m8760b();
        zzzxVar.zzc = m8760b;
        return m8760b;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: d */
    public final /* synthetic */ Object mo8745d(Object obj) {
        return ((zzzx) obj).zzc;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: e */
    public final Object mo8746e(Object obj, Object obj2) {
        zzacg zzacgVar = (zzacg) obj2;
        if (zzacgVar.equals(zzacg.f16345f)) {
            return obj;
        }
        zzacg zzacgVar2 = (zzacg) obj;
        int i2 = zzacgVar2.f16346a + zzacgVar.f16346a;
        int[] copyOf = Arrays.copyOf(zzacgVar2.f16347b, i2);
        System.arraycopy(zzacgVar.f16347b, 0, copyOf, zzacgVar2.f16346a, zzacgVar.f16346a);
        Object[] copyOf2 = Arrays.copyOf(zzacgVar2.f16348c, i2);
        System.arraycopy(zzacgVar.f16348c, 0, copyOf2, zzacgVar2.f16346a, zzacgVar.f16346a);
        return new zzacg(i2, copyOf, copyOf2, true);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: f */
    public final /* synthetic */ Object mo8747f() {
        return zzacg.m8760b();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: g */
    public final Object mo8748g(Object obj) {
        ((zzacg) obj).f16350e = false;
        return obj;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8749h(Object obj, int i2, int i3) {
        ((zzacg) obj).m8762c((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo8750i(Object obj, int i2, long j2) {
        ((zzacg) obj).m8762c((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo8751j(Object obj, int i2, Object obj2) {
        ((zzacg) obj).m8762c((i2 << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo8752k(Object obj, int i2, zzyu zzyuVar) {
        ((zzacg) obj).m8762c((i2 << 3) | 2, zzyuVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo8753l(Object obj, int i2, long j2) {
        ((zzacg) obj).m8762c(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: m */
    public final void mo8754m(Object obj) {
        ((zzzx) obj).zzc.f16350e = false;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: n */
    public final /* synthetic */ void mo8755n(Object obj, Object obj2) {
        ((zzzx) obj).zzc = (zzacg) obj2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: o */
    public final /* synthetic */ void mo8756o(Object obj, Object obj2) {
        ((zzzx) obj).zzc = (zzacg) obj2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: q */
    public final boolean mo8758q(zzabn zzabnVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzacf
    /* renamed from: r */
    public final /* synthetic */ void mo8759r(Object obj, zzzg zzzgVar) throws IOException {
        ((zzacg) obj).m8763d(zzzgVar);
    }
}
