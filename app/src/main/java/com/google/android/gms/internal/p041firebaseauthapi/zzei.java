package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzei implements zzau {

    /* renamed from: a */
    public final zzbu f16452a;

    public zzei(zzbu zzbuVar) {
        this.f16452a = zzbuVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzau
    /* renamed from: a */
    public final byte[] mo8831a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = this.f16452a.m8869a(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((zzau) ((zzbo) it.next()).f16410a).mo8831a(copyOfRange2, null);
                } catch (GeneralSecurityException e2) {
                    zzej.f16453a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e2.toString())));
                }
            }
        }
        Iterator it2 = this.f16452a.m8869a(zzas.f16392a).iterator();
        while (it2.hasNext()) {
            try {
                return ((zzau) ((zzbo) it2.next()).f16410a).mo8831a(bArr, null);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
