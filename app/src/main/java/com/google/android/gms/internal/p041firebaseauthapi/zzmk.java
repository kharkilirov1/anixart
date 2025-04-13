package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmk implements zzap {

    /* renamed from: a */
    public final zzdn f16579a;

    public zzmk(byte[] bArr) throws GeneralSecurityException {
        this.f16579a = new zzdn(bArr);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f16579a.m8916b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
