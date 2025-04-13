package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfi implements zzap {

    /* renamed from: a */
    public final SecretKey f16498a;

    public zzfi(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f16498a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m8951c(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("zzfi", "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m8951c(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m8952d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w("zzfi", "encountered a potentially transient KeyStore error, will wait and retry", e2);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m8952d(bArr, bArr2);
        }
    }

    /* renamed from: c */
    public final byte[] m8951c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f16498a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, length - 12);
    }

    /* renamed from: d */
    public final byte[] m8952d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f16498a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
