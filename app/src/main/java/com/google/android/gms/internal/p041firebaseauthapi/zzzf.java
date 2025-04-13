package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public abstract class zzzf extends zzyk {

    /* renamed from: b */
    public static final Logger f17142b = Logger.getLogger(zzzf.class.getName());

    /* renamed from: c */
    public static final boolean f17143c = zzacp.f16359e;

    /* renamed from: a */
    public zzzg f17144a;

    public zzzf() {
    }

    public /* synthetic */ zzzf(zzze zzzeVar) {
    }

    /* renamed from: b */
    public static int m9609b(zzabc zzabcVar, zzabo zzaboVar) {
        zzye zzyeVar = (zzye) zzabcVar;
        int mo9487e = zzyeVar.mo9487e();
        if (mo9487e == -1) {
            mo9487e = zzaboVar.mo8650a(zzyeVar);
            zzyeVar.mo9488f(mo9487e);
        }
        return m9612e(mo9487e) + mo9487e;
    }

    /* renamed from: c */
    public static int m9610c(String str) {
        int length;
        try {
            length = zzacu.m8808c(str);
        } catch (zzact unused) {
            length = str.getBytes(zzaad.f16259a).length;
        }
        return m9612e(length) + length;
    }

    /* renamed from: d */
    public static int m9611d(int i2) {
        return m9612e(i2 << 3);
    }

    /* renamed from: e */
    public static int m9612e(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: f */
    public static int m9613f(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    /* renamed from: x */
    public static int m9614x(zzyu zzyuVar) {
        int mo9513d = zzyuVar.mo9513d();
        return m9612e(mo9513d) + mo9513d;
    }

    @Deprecated
    /* renamed from: y */
    public static int m9615y(int i2, zzabc zzabcVar, zzabo zzaboVar) {
        int m9612e = m9612e(i2 << 3);
        int i3 = m9612e + m9612e;
        zzye zzyeVar = (zzye) zzabcVar;
        int mo9487e = zzyeVar.mo9487e();
        if (mo9487e == -1) {
            mo9487e = zzaboVar.mo8650a(zzyeVar);
            zzyeVar.mo9488f(mo9487e);
        }
        return i3 + mo9487e;
    }

    /* renamed from: z */
    public static int m9616z(int i2) {
        if (i2 >= 0) {
            return m9612e(i2);
        }
        return 10;
    }

    /* renamed from: g */
    public final void m9617g(String str, zzact zzactVar) throws IOException {
        f17142b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzactVar);
        byte[] bytes = str.getBytes(zzaad.f16259a);
        try {
            int length = bytes.length;
            mo9603u(length);
            mo9508a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(e2);
        }
    }

    /* renamed from: h */
    public abstract void mo9590h(byte b) throws IOException;

    /* renamed from: i */
    public abstract void mo9591i(int i2, boolean z) throws IOException;

    /* renamed from: j */
    public abstract void mo9592j(int i2, zzyu zzyuVar) throws IOException;

    /* renamed from: k */
    public abstract void mo9593k(int i2, int i3) throws IOException;

    /* renamed from: l */
    public abstract void mo9594l(int i2) throws IOException;

    /* renamed from: m */
    public abstract void mo9595m(int i2, long j2) throws IOException;

    /* renamed from: n */
    public abstract void mo9596n(long j2) throws IOException;

    /* renamed from: o */
    public abstract void mo9597o(int i2, int i3) throws IOException;

    /* renamed from: p */
    public abstract void mo9598p(int i2) throws IOException;

    /* renamed from: q */
    public abstract void mo9599q(int i2, zzabc zzabcVar, zzabo zzaboVar) throws IOException;

    /* renamed from: r */
    public abstract void mo9600r(int i2, String str) throws IOException;

    /* renamed from: s */
    public abstract void mo9601s(int i2, int i3) throws IOException;

    /* renamed from: t */
    public abstract void mo9602t(int i2, int i3) throws IOException;

    /* renamed from: u */
    public abstract void mo9603u(int i2) throws IOException;

    /* renamed from: v */
    public abstract void mo9604v(int i2, long j2) throws IOException;

    /* renamed from: w */
    public abstract void mo9605w(long j2) throws IOException;
}
