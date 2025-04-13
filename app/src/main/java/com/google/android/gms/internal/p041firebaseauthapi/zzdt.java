package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdt implements zzap {

    /* renamed from: b */
    public static final ThreadLocal f16444b = new zzds();

    /* renamed from: a */
    public final SecretKey f16445a;

    public zzdt(byte[] bArr) throws GeneralSecurityException {
        zznm.m9340b(bArr.length);
        this.f16445a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } catch (ClassNotFoundException unused) {
            if (!zznl.m9338a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        ThreadLocal threadLocal = f16444b;
        ((Cipher) threadLocal.get()).init(2, this.f16445a, ivParameterSpec);
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
