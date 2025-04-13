package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzms implements zzap {

    /* renamed from: a */
    public final zzne f16590a;

    /* renamed from: b */
    public final zzbl f16591b;

    /* renamed from: c */
    public final int f16592c;

    public zzms(zzne zzneVar, zzbl zzblVar, int i2) {
        this.f16590a = zzneVar;
        this.f16591b = zzblVar;
        this.f16592c = i2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f16592c;
        if (length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i2);
        this.f16591b.mo8867a(Arrays.copyOfRange(bArr, length - this.f16592c, length), zzmj.m9315c(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)));
        return this.f16590a.mo9307a(copyOfRange);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
