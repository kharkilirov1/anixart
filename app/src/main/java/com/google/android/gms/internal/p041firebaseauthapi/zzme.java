package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzme extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return (Cipher) zzmt.f16596e.m9325a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
