package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzd extends zzza {

    /* renamed from: h */
    public final OutputStream f17141h;

    public zzzd(OutputStream outputStream, int i2) {
        super(i2);
        this.f17141h = outputStream;
    }

    /* renamed from: E */
    public final void m9606E() throws IOException {
        this.f17141h.write(this.f17134d, 0, this.f17136f);
        this.f17136f = 0;
    }

    /* renamed from: F */
    public final void m9607F(int i2) throws IOException {
        if (this.f17135e - this.f17136f < i2) {
            m9606E();
        }
    }

    /* renamed from: G */
    public final void m9608G(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f17135e;
        int i5 = this.f17136f;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, 0, this.f17134d, i5, i3);
            this.f17136f += i3;
            this.f17137g += i3;
            return;
        }
        System.arraycopy(bArr, 0, this.f17134d, i5, i6);
        int i7 = i3 - i6;
        this.f17136f = this.f17135e;
        this.f17137g += i6;
        m9606E();
        if (i7 <= this.f17135e) {
            System.arraycopy(bArr, i6, this.f17134d, 0, i7);
            this.f17136f = i7;
        } else {
            this.f17141h.write(bArr, i6, i7);
        }
        this.f17137g += i7;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyk
    /* renamed from: a */
    public final void mo9508a(byte[] bArr, int i2, int i3) throws IOException {
        m9608G(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: h */
    public final void mo9590h(byte b) throws IOException {
        if (this.f17136f == this.f17135e) {
            m9606E();
        }
        byte[] bArr = this.f17134d;
        int i2 = this.f17136f;
        this.f17136f = i2 + 1;
        bArr[i2] = b;
        this.f17137g++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: i */
    public final void mo9591i(int i2, boolean z) throws IOException {
        m9607F(11);
        m9587C(i2 << 3);
        byte[] bArr = this.f17134d;
        int i3 = this.f17136f;
        this.f17136f = i3 + 1;
        bArr[i3] = z ? (byte) 1 : (byte) 0;
        this.f17137g++;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: j */
    public final void mo9592j(int i2, zzyu zzyuVar) throws IOException {
        mo9603u((i2 << 3) | 2);
        mo9603u(zzyuVar.mo9513d());
        zzyuVar.mo9519t(this);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: k */
    public final void mo9593k(int i2, int i3) throws IOException {
        m9607F(14);
        m9587C((i2 << 3) | 5);
        m9585A(i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: l */
    public final void mo9594l(int i2) throws IOException {
        m9607F(4);
        m9585A(i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: m */
    public final void mo9595m(int i2, long j2) throws IOException {
        m9607F(18);
        m9587C((i2 << 3) | 1);
        m9586B(j2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: n */
    public final void mo9596n(long j2) throws IOException {
        m9607F(8);
        m9586B(j2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: o */
    public final void mo9597o(int i2, int i3) throws IOException {
        m9607F(20);
        m9587C(i2 << 3);
        if (i3 >= 0) {
            m9587C(i3);
        } else {
            m9588D(i3);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: p */
    public final void mo9598p(int i2) throws IOException {
        if (i2 < 0) {
            mo9605w(i2);
        } else {
            m9607F(5);
            m9587C(i2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: q */
    public final void mo9599q(int i2, zzabc zzabcVar, zzabo zzaboVar) throws IOException {
        mo9603u((i2 << 3) | 2);
        zzye zzyeVar = (zzye) zzabcVar;
        int mo9487e = zzyeVar.mo9487e();
        if (mo9487e == -1) {
            mo9487e = zzaboVar.mo8650a(zzyeVar);
            zzyeVar.mo9488f(mo9487e);
        }
        mo9603u(mo9487e);
        zzaboVar.mo8653d(zzabcVar, this.f17144a);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: r */
    public final void mo9600r(int i2, String str) throws IOException {
        int m8808c;
        mo9603u((i2 << 3) | 2);
        try {
            int length = str.length() * 3;
            int m9612e = zzzf.m9612e(length);
            int i3 = m9612e + length;
            int i4 = this.f17135e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int m8807b = zzacu.m8807b(str, bArr, 0, length);
                mo9603u(m8807b);
                m9608G(bArr, 0, m8807b);
                return;
            }
            if (i3 > i4 - this.f17136f) {
                m9606E();
            }
            int m9612e2 = zzzf.m9612e(str.length());
            int i5 = this.f17136f;
            try {
                try {
                    if (m9612e2 == m9612e) {
                        int i6 = i5 + m9612e2;
                        this.f17136f = i6;
                        int m8807b2 = zzacu.m8807b(str, this.f17134d, i6, this.f17135e - i6);
                        this.f17136f = i5;
                        m8808c = (m8807b2 - i5) - m9612e2;
                        m9587C(m8808c);
                        this.f17136f = m8807b2;
                    } else {
                        m8808c = zzacu.m8808c(str);
                        m9587C(m8808c);
                        this.f17136f = zzacu.m8807b(str, this.f17134d, this.f17136f, m8808c);
                    }
                    this.f17137g += m8808c;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzzc(e2);
                }
            } catch (zzact e3) {
                this.f17137g -= this.f17136f - i5;
                this.f17136f = i5;
                throw e3;
            }
        } catch (zzact e4) {
            m9617g(str, e4);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: s */
    public final void mo9601s(int i2, int i3) throws IOException {
        mo9603u((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: t */
    public final void mo9602t(int i2, int i3) throws IOException {
        m9607F(20);
        m9587C(i2 << 3);
        m9587C(i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: u */
    public final void mo9603u(int i2) throws IOException {
        m9607F(5);
        m9587C(i2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: v */
    public final void mo9604v(int i2, long j2) throws IOException {
        m9607F(20);
        m9587C(i2 << 3);
        m9588D(j2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: w */
    public final void mo9605w(long j2) throws IOException {
        m9607F(10);
        m9588D(j2);
    }
}
