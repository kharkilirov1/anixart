package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfj implements zzbj {

    /* renamed from: a */
    @GuardedBy
    public KeyStore f16499a;

    public zzfj() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT < 23) {
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f16499a = keyStore;
        } catch (IOException | GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbj
    /* renamed from: a */
    public final synchronized zzap mo8864a(String str) throws GeneralSecurityException {
        zzfi zzfiVar;
        zzfiVar = new zzfi(zznm.m9339a("android-keystore://", str), this.f16499a);
        byte[] m9337a = zznk.m9337a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(m9337a, zzfiVar.mo8826a(zzfiVar.mo8827b(m9337a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzfiVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbj
    /* renamed from: b */
    public final synchronized boolean mo8865b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* renamed from: c */
    public final synchronized boolean m8953c(String str) throws GeneralSecurityException {
        String m9339a;
        m9339a = zznm.m9339a("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w("zzfj", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f16499a = keyStore;
                keyStore.load(null);
            } catch (IOException e2) {
                throw new GeneralSecurityException(e2);
            } catch (InterruptedException unused2) {
            }
            return this.f16499a.containsAlias(m9339a);
        }
        return this.f16499a.containsAlias(m9339a);
    }
}
