package com.google.android.gms.internal.auth;

import androidx.room.util.C0576a;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
class zzdz extends zzdy {

    /* renamed from: d */
    public final byte[] f16082d;

    public zzdz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f16082d = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: a */
    public byte mo8369a(int i2) {
        return this.f16082d[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: b */
    public byte mo8370b(int i2) {
        return this.f16082d[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: d */
    public int mo8371d() {
        return this.f16082d.length;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: e */
    public final int mo8373e(int i2, int i3, int i4) {
        byte[] bArr = this.f16082d;
        Charset charset = zzev.f16107a;
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeb) || mo8371d() != ((zzeb) obj).mo8371d()) {
            return false;
        }
        if (mo8371d() == 0) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return obj.equals(this);
        }
        zzdz zzdzVar = (zzdz) obj;
        int i2 = this.f16084b;
        int i3 = zzdzVar.f16084b;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int mo8371d = mo8371d();
        if (mo8371d > zzdzVar.mo8371d()) {
            int mo8371d2 = mo8371d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(mo8371d);
            sb.append(mo8371d2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (mo8371d > zzdzVar.mo8371d()) {
            throw new IllegalArgumentException(C0576a.m4112k(59, "Ran off end of other: 0, ", mo8371d, ", ", zzdzVar.mo8371d()));
        }
        byte[] bArr = this.f16082d;
        byte[] bArr2 = zzdzVar.f16082d;
        zzdzVar.mo8372u();
        int i4 = 0;
        int i5 = 0;
        while (i4 < mo8371d) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: f */
    public final zzeb mo8374f(int i2, int i3) {
        int m8377s = zzeb.m8377s(0, i3, mo8371d());
        return m8377s == 0 ? zzeb.f16083c : new zzdw(this.f16082d, m8377s);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: g */
    public final String mo8375g(Charset charset) {
        return new String(this.f16082d, 0, mo8371d(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    /* renamed from: r */
    public final boolean mo8376r() {
        return zzhd.m8531b(this.f16082d, 0, mo8371d());
    }

    /* renamed from: u */
    public int mo8372u() {
        return 0;
    }
}
