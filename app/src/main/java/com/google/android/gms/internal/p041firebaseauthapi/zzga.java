package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzga implements zzbl {

    /* renamed from: a */
    public final zzbu f16509a;

    /* renamed from: b */
    public final byte[] f16510b = {0};

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbl
    /* renamed from: a */
    public final void mo8867a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzbo zzboVar : this.f16509a.m8869a(copyOf)) {
            try {
                if (zzboVar.f16412c == 4) {
                    ((zzbl) zzboVar.f16410a).mo8867a(copyOfRange, zzmj.m9315c(bArr2, this.f16510b));
                    return;
                } else {
                    ((zzbl) zzboVar.f16410a).mo8867a(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e2) {
                zzgb.f16511a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e2.toString()));
            }
        }
        Iterator it = this.f16509a.m8869a(zzas.f16392a).iterator();
        while (it.hasNext()) {
            try {
                ((zzbl) ((zzbo) it.next()).f16410a).mo8867a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
