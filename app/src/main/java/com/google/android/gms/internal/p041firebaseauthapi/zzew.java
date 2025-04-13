package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzew {
    /* renamed from: a */
    public static zzes m8938a(zzkc zzkcVar) throws GeneralSecurityException {
        if (zzkcVar.m9192t() == 3) {
            return new zzep(16);
        }
        if (zzkcVar.m9192t() == 4) {
            return new zzep(32);
        }
        if (zzkcVar.m9192t() == 5) {
            return new zzeq();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    public static zzer m8939b(zzkc zzkcVar) {
        if (zzkcVar.m9193u() == 3) {
            return new zzer();
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    /* renamed from: c */
    public static zzfd m8940c(zzkc zzkcVar) {
        if (zzkcVar.m9194v() == 3) {
            return new zzfd(new zzer());
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
