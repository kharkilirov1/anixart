package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzb extends zzzf {

    /* renamed from: d */
    public final byte[] f17138d;

    /* renamed from: e */
    public final int f17139e;

    /* renamed from: f */
    public int f17140f;

    public zzzb(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.f17138d = bArr;
        this.f17140f = 0;
        this.f17139e = i3;
    }

    /* renamed from: A */
    public final int m9589A() {
        return this.f17139e - this.f17140f;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyk
    /* renamed from: a */
    public final void mo9508a(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f17138d, this.f17140f, i3);
            this.f17140f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), Integer.valueOf(i3)), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: h */
    public final void mo9590h(byte b) throws IOException {
        try {
            byte[] bArr = this.f17138d;
            int i2 = this.f17140f;
            this.f17140f = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: i */
    public final void mo9591i(int i2, boolean z) throws IOException {
        mo9603u(i2 << 3);
        mo9590h(z ? (byte) 1 : (byte) 0);
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
        mo9603u((i2 << 3) | 5);
        mo9594l(i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: l */
    public final void mo9594l(int i2) throws IOException {
        try {
            byte[] bArr = this.f17138d;
            int i3 = this.f17140f;
            int i4 = i3 + 1;
            this.f17140f = i4;
            bArr[i3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.f17140f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            this.f17140f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f17140f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: m */
    public final void mo9595m(int i2, long j2) throws IOException {
        mo9603u((i2 << 3) | 1);
        mo9596n(j2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: n */
    public final void mo9596n(long j2) throws IOException {
        try {
            byte[] bArr = this.f17138d;
            int i2 = this.f17140f;
            int i3 = i2 + 1;
            this.f17140f = i3;
            bArr[i2] = (byte) (((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            this.f17140f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.f17140f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            this.f17140f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i6 + 1;
            this.f17140f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i7 + 1;
            this.f17140f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i9 = i8 + 1;
            this.f17140f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f17140f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: o */
    public final void mo9597o(int i2, int i3) throws IOException {
        mo9603u(i2 << 3);
        if (i3 >= 0) {
            mo9603u(i3);
        } else {
            mo9605w(i3);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: p */
    public final void mo9598p(int i2) throws IOException {
        if (i2 >= 0) {
            mo9603u(i2);
        } else {
            mo9605w(i2);
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
        mo9603u((i2 << 3) | 2);
        int i3 = this.f17140f;
        try {
            int m9612e = zzzf.m9612e(str.length() * 3);
            int m9612e2 = zzzf.m9612e(str.length());
            if (m9612e2 == m9612e) {
                int i4 = i3 + m9612e2;
                this.f17140f = i4;
                int m8807b = zzacu.m8807b(str, this.f17138d, i4, this.f17139e - i4);
                this.f17140f = i3;
                mo9603u((m8807b - i3) - m9612e2);
                this.f17140f = m8807b;
            } else {
                mo9603u(zzacu.m8808c(str));
                byte[] bArr = this.f17138d;
                int i5 = this.f17140f;
                this.f17140f = zzacu.m8807b(str, bArr, i5, this.f17139e - i5);
            }
        } catch (zzact e2) {
            this.f17140f = i3;
            m9617g(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzzc(e3);
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
        mo9603u(i2 << 3);
        mo9603u(i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: u */
    public final void mo9603u(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.f17138d;
                int i3 = this.f17140f;
                this.f17140f = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), 1), e2);
            }
        }
        byte[] bArr2 = this.f17138d;
        int i4 = this.f17140f;
        this.f17140f = i4 + 1;
        bArr2[i4] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: v */
    public final void mo9604v(int i2, long j2) throws IOException {
        mo9603u(i2 << 3);
        mo9605w(j2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzf
    /* renamed from: w */
    public final void mo9605w(long j2) throws IOException {
        if (zzzf.f17143c && this.f17139e - this.f17140f >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f17138d;
                int i2 = this.f17140f;
                this.f17140f = i2 + 1;
                zzacp.m8793m(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f17138d;
            int i3 = this.f17140f;
            this.f17140f = i3 + 1;
            zzacp.m8793m(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f17138d;
                int i4 = this.f17140f;
                this.f17140f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f17140f), Integer.valueOf(this.f17139e), 1), e2);
            }
        }
        byte[] bArr4 = this.f17138d;
        int i5 = this.f17140f;
        this.f17140f = i5 + 1;
        bArr4[i5] = (byte) j2;
    }
}
