package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzce implements zzap {

    /* renamed from: a */
    public final zzbu f16431a;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: a */
    public final byte[] mo8826a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = this.f16431a.m8869a(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((zzap) ((zzbo) it.next()).f16410a).mo8826a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e2) {
                    zzcf.f16432a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e2.toString())));
                }
            }
        }
        Iterator it2 = this.f16431a.m8869a(zzas.f16392a).iterator();
        while (it2.hasNext()) {
            try {
                return ((zzap) ((zzbo) it2.next()).f16410a).mo8826a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzap
    /* renamed from: b */
    public final byte[] mo8827b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
