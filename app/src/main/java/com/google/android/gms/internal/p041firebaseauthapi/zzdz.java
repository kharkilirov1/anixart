package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdz {

    /* renamed from: a */
    public static final String f16448a;

    static {
        new zzdy();
        f16448a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i2 = zzlu.f16560b;
        try {
            zzbz.m8880g(new zzeb());
            if (zzdv.m8921a()) {
                return;
            }
            zzbz.m8879f(new zzdy(), true);
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
