package com.google.android.gms.internal.auth;

import androidx.room.util.C0576a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdw extends zzdz {

    /* renamed from: e */
    public final int f16081e;

    public zzdw(byte[] bArr, int i2) {
        super(bArr);
        zzeb.m8377s(0, i2, bArr.length);
        this.f16081e = i2;
    }

    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    /* renamed from: a */
    public final byte mo8369a(int i2) {
        int i3 = this.f16081e;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f16082d[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C0576a.m4111j(22, "Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(C0576a.m4112k(40, "Index > length: ", i2, ", ", i3));
    }

    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    /* renamed from: b */
    public final byte mo8370b(int i2) {
        return this.f16082d[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzdz, com.google.android.gms.internal.auth.zzeb
    /* renamed from: d */
    public final int mo8371d() {
        return this.f16081e;
    }

    @Override // com.google.android.gms.internal.auth.zzdz
    /* renamed from: u */
    public final int mo8372u() {
        return 0;
    }
}
