package com.google.android.gms.internal.p041firebaseauthapi;

import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzyo extends zzyr {

    /* renamed from: e */
    public final int f17118e;

    public zzyo(byte[] bArr, int i2) {
        super(bArr);
        zzyu.m9521x(0, i2, bArr.length);
        this.f17118e = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyr
    /* renamed from: D */
    public final int mo9510D() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyr, com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: a */
    public final byte mo9511a(int i2) {
        int i3 = this.f17118e;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f17119d[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(C0000a.m7d("Index < 0: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(C0000a.m9f("Index > length: ", i2, ", ", i3));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyr, com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: b */
    public final byte mo9512b(int i2) {
        return this.f17119d[i2];
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyr, com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: d */
    public final int mo9513d() {
        return this.f17118e;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzyr, com.google.android.gms.internal.p041firebaseauthapi.zzyu
    /* renamed from: e */
    public final void mo9514e(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f17119d, 0, bArr, 0, i4);
    }
}
