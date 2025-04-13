package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.logging.Level;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdu {
    /* renamed from: a */
    public static boolean m8920a(int i2) {
        Boolean bool;
        if (i2 - 1 == 0) {
            return !zzdv.m8921a();
        }
        if (zzdv.m8921a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                zzdv.f16446a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
