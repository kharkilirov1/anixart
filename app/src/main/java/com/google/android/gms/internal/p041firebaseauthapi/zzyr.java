package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
class zzyr extends zzyq {

    /* renamed from: d */
    public final byte[] f17119d;

    public zzyr(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f17119d = bArr;
    }

    /* renamed from: D */
    public int mo9510D() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: a */
    public byte mo9511a(int i2) {
        return this.f17119d[i2];
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: b */
    public byte mo9512b(int i2) {
        return this.f17119d[i2];
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: d */
    public int mo9513d() {
        return this.f17119d.length;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: e */
    public void mo9514e(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f17119d, 0, bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzyu) || mo9513d() != ((zzyu) obj).mo9513d()) {
            return false;
        }
        if (mo9513d() == 0) {
            return true;
        }
        if (!(obj instanceof zzyr)) {
            return obj.equals(this);
        }
        zzyr zzyrVar = (zzyr) obj;
        int i2 = this.f17121b;
        int i3 = zzyrVar.f17121b;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int mo9513d = mo9513d();
        if (mo9513d > zzyrVar.mo9513d()) {
            throw new IllegalArgumentException("Length too large: " + mo9513d + mo9513d());
        }
        if (mo9513d > zzyrVar.mo9513d()) {
            throw new IllegalArgumentException(C0000a.m9f("Ran off end of other: 0, ", mo9513d, ", ", zzyrVar.mo9513d()));
        }
        byte[] bArr = this.f17119d;
        byte[] bArr2 = zzyrVar.f17119d;
        zzyrVar.mo9510D();
        int i4 = 0;
        int i5 = 0;
        while (i4 < mo9513d) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: f */
    public final int mo9515f(int i2, int i3, int i4) {
        byte[] bArr = this.f17119d;
        Charset charset = zzaad.f16259a;
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: g */
    public final zzyu mo9516g(int i2, int i3) {
        int m9521x = zzyu.m9521x(0, i3, mo9513d());
        return m9521x == 0 ? zzyu.f17120c : new zzyo(this.f17119d, m9521x);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: r */
    public final zzyy mo9517r() {
        byte[] bArr = this.f17119d;
        int mo9513d = mo9513d();
        zzyw zzywVar = new zzyw(bArr, mo9513d);
        try {
            zzywVar.mo9527b(mo9513d);
            return zzywVar;
        } catch (zzaaf e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: s */
    public final String mo9518s(Charset charset) {
        return new String(this.f17119d, 0, mo9513d(), charset);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: t */
    public final void mo9519t(zzyk zzykVar) throws IOException {
        zzykVar.mo9508a(this.f17119d, 0, mo9513d());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: u */
    public final boolean mo9520u() {
        return zzacu.m8810e(this.f17119d, 0, mo9513d());
    }
}
