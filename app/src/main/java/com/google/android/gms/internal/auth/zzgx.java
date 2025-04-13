package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgx extends zzgy {
    public zzgx(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: a */
    public final double mo8493a(Object obj, long j2) {
        return Double.longBitsToDouble(m8502j(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: b */
    public final float mo8494b(Object obj, long j2) {
        return Float.intBitsToFloat(m8501i(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: c */
    public final void mo8495c(Object obj, long j2, boolean z) {
        if (zzgz.f16184f) {
            zzgz.m8516i(obj, j2, z);
        } else {
            zzgz.m8517j(obj, j2, z);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: d */
    public final void mo8496d(Object obj, long j2, double d) {
        m8506n(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: e */
    public final void mo8497e(Object obj, long j2, float f2) {
        m8505m(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.auth.zzgy
    /* renamed from: f */
    public final boolean mo8498f(Object obj, long j2) {
        return zzgz.f16184f ? zzgz.m8520m(obj, j2) : zzgz.m8521n(obj, j2);
    }
}
