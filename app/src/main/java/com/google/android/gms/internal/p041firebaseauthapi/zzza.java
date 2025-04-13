package com.google.android.gms.internal.p041firebaseauthapi;

import kotlin.KotlinVersion;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzza extends zzzf {

    /* renamed from: d */
    public final byte[] f17134d;

    /* renamed from: e */
    public final int f17135e;

    /* renamed from: f */
    public int f17136f;

    /* renamed from: g */
    public int f17137g;

    public zzza(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f17134d = new byte[max];
        this.f17135e = max;
    }

    /* renamed from: A */
    public final void m9585A(int i2) {
        byte[] bArr = this.f17134d;
        int i3 = this.f17136f;
        int i4 = i3 + 1;
        this.f17136f = i4;
        bArr[i3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i4 + 1;
        this.f17136f = i5;
        bArr[i4] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i6 = i5 + 1;
        this.f17136f = i6;
        bArr[i5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f17136f = i6 + 1;
        bArr[i6] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f17137g += 4;
    }

    /* renamed from: B */
    public final void m9586B(long j2) {
        byte[] bArr = this.f17134d;
        int i2 = this.f17136f;
        int i3 = i2 + 1;
        this.f17136f = i3;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i3 + 1;
        this.f17136f = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i4 + 1;
        this.f17136f = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i5 + 1;
        this.f17136f = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i6 + 1;
        this.f17136f = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i7 + 1;
        this.f17136f = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i8 + 1;
        this.f17136f = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f17136f = i9 + 1;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f17137g += 8;
    }

    /* renamed from: C */
    public final void m9587C(int i2) {
        if (!zzzf.f17143c) {
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.f17134d;
                int i3 = this.f17136f;
                this.f17136f = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                this.f17137g++;
                i2 >>>= 7;
            }
            byte[] bArr2 = this.f17134d;
            int i4 = this.f17136f;
            this.f17136f = i4 + 1;
            bArr2[i4] = (byte) i2;
            this.f17137g++;
            return;
        }
        long j2 = this.f17136f;
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.f17134d;
            int i5 = this.f17136f;
            this.f17136f = i5 + 1;
            zzacp.m8793m(bArr3, i5, (byte) ((i2 & 127) | 128));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.f17134d;
        int i6 = this.f17136f;
        this.f17136f = i6 + 1;
        zzacp.m8793m(bArr4, i6, (byte) i2);
        this.f17137g += (int) (this.f17136f - j2);
    }

    /* renamed from: D */
    public final void m9588D(long j2) {
        if (!zzzf.f17143c) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f17134d;
                int i2 = this.f17136f;
                this.f17136f = i2 + 1;
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                this.f17137g++;
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f17134d;
            int i3 = this.f17136f;
            this.f17136f = i3 + 1;
            bArr2[i3] = (byte) j2;
            this.f17137g++;
            return;
        }
        long j3 = this.f17136f;
        while ((j2 & (-128)) != 0) {
            byte[] bArr3 = this.f17134d;
            int i4 = this.f17136f;
            this.f17136f = i4 + 1;
            zzacp.m8793m(bArr3, i4, (byte) ((((int) j2) & 127) | 128));
            j2 >>>= 7;
        }
        byte[] bArr4 = this.f17134d;
        int i5 = this.f17136f;
        this.f17136f = i5 + 1;
        zzacp.m8793m(bArr4, i5, (byte) j2);
        this.f17137g += (int) (this.f17136f - j3);
    }
}
