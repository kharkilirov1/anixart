package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzcb {

    /* renamed from: a */
    public static final String f16427a;

    /* renamed from: b */
    public static final String f16428b;

    static {
        new zzci();
        f16427a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzcr();
        f16428b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzcu();
        new zzco();
        new zzda();
        new zzde();
        new zzcx();
        new zzdh();
        int i2 = zzlu.f16560b;
        try {
            m8885a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m8885a() throws GeneralSecurityException {
        boolean z;
        zzbz.m8880g(new zzcf());
        zzfy.m8962a();
        zzbz.m8879f(new zzci(), true);
        zzbz.m8879f(new zzcr(), true);
        if (zzdv.m8921a()) {
            return;
        }
        zzbz.m8879f(new zzco(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            zzbz.m8879f(new zzcu(), true);
        }
        zzbz.m8879f(new zzcx(), true);
        zzbz.m8879f(new zzda(), true);
        zzbz.m8879f(new zzde(), true);
        zzbz.m8879f(new zzdh(), true);
    }
}
