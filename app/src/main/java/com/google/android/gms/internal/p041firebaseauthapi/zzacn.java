package com.google.android.gms.internal.p041firebaseauthapi;

import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzacn extends zzaco {
    public zzacn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: a */
    public final double mo8765a(Object obj, long j2) {
        return Double.longBitsToDouble(m8775k(obj, j2));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: b */
    public final float mo8766b(Object obj, long j2) {
        return Float.intBitsToFloat(m8774j(obj, j2));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: c */
    public final void mo8767c(Object obj, long j2, boolean z) {
        if (zzacp.f16361g) {
            zzacp.m8783c(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            zzacp.m8784d(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: d */
    public final void mo8768d(Object obj, long j2, byte b) {
        if (zzacp.f16361g) {
            zzacp.m8783c(obj, j2, b);
        } else {
            zzacp.m8784d(obj, j2, b);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: e */
    public final void mo8769e(Object obj, long j2, double d) {
        m8779o(obj, j2, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: f */
    public final void mo8770f(Object obj, long j2, float f2) {
        m8778n(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaco
    /* renamed from: g */
    public final boolean mo8771g(Object obj, long j2) {
        return zzacp.f16361g ? zzacp.m8798r(obj, j2) : zzacp.m8799s(obj, j2);
    }
}
