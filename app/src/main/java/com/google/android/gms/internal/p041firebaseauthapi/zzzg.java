package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzg {

    /* renamed from: a */
    public final zzzf f17145a;

    public zzzg(zzzf zzzfVar) {
        Charset charset = zzaad.f16259a;
        this.f17145a = zzzfVar;
        zzzfVar.f17144a = this;
    }

    /* renamed from: a */
    public final void m9618a(int i2, int i3) throws IOException {
        this.f17145a.mo9602t(i2, (i3 >> 31) ^ (i3 + i3));
    }

    /* renamed from: b */
    public final void m9619b(int i2, long j2) throws IOException {
        this.f17145a.mo9604v(i2, (j2 >> 63) ^ (j2 + j2));
    }

    /* renamed from: c */
    public final void m9620c(int i2, double d) throws IOException {
        this.f17145a.mo9595m(i2, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void m9621d(int i2, float f2) throws IOException {
        this.f17145a.mo9593k(i2, Float.floatToRawIntBits(f2));
    }

    /* renamed from: e */
    public final void m9622e(int i2, Object obj, zzabo zzaboVar) throws IOException {
        zzzf zzzfVar = this.f17145a;
        zzzfVar.mo9601s(i2, 3);
        zzaboVar.mo8653d((zzabc) obj, zzzfVar.f17144a);
        zzzfVar.mo9601s(i2, 4);
    }

    /* renamed from: f */
    public final void m9623f(int i2, Object obj, zzabo zzaboVar) throws IOException {
        this.f17145a.mo9599q(i2, (zzabc) obj, zzaboVar);
    }
}
