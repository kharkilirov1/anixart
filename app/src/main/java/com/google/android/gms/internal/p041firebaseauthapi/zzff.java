package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzff {

    /* renamed from: e */
    @GuardedBy
    public zzbh f16493e;

    /* renamed from: f */
    public zzfk f16494f = null;

    /* renamed from: a */
    public zzbi f16489a = null;

    /* renamed from: b */
    public String f16490b = null;

    /* renamed from: c */
    public zzap f16491c = null;

    /* renamed from: d */
    public zzbe f16492d = null;

    @Deprecated
    /* renamed from: a */
    public final zzff m8946a(zzkq zzkqVar) {
        String m9235u = zzkqVar.m9235u();
        byte[] m9525C = zzkqVar.m9234t().m9525C();
        int m9236x = zzkqVar.m9236x() - 2;
        int i2 = 4;
        if (m9236x == 1) {
            i2 = 1;
        } else if (m9236x == 2) {
            i2 = 2;
        } else if (m9236x == 3) {
            i2 = 3;
        } else if (m9236x != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f16492d = zzbe.m8850a(m9235u, m9525C, i2);
        return this;
    }

    /* renamed from: b */
    public final zzff m8947b(Context context, String str, String str2) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("need an Android context");
        }
        this.f16494f = new zzfk(context, str2);
        this.f16489a = new zzfl(context, str2);
        return this;
    }

    /* renamed from: c */
    public final synchronized zzfh m8948c() throws GeneralSecurityException, IOException {
        zzbh zzbhVar;
        if (this.f16490b != null) {
            this.f16491c = m8949d();
        }
        try {
            zzbhVar = m8950e();
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("zzfh", 4)) {
                Log.i("zzfh", String.format("keyset not found, will generate a new one. %s", e2.getMessage()));
            }
            if (this.f16492d == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            zzbhVar = new zzbh(zzky.m9249s());
            zzbe zzbeVar = this.f16492d;
            synchronized (zzbhVar) {
                zzbhVar.m8859a(zzbeVar.f16402a);
                zzbhVar.m8861c(zzca.m8884a(zzbhVar.m8860b().f16403a).m9269r().m9264q());
                if (this.f16491c != null) {
                    zzbhVar.m8860b().m8856d(this.f16489a, this.f16491c);
                } else {
                    this.f16489a.mo8828a(zzbhVar.m8860b().f16403a);
                }
            }
        }
        this.f16493e = zzbhVar;
        return new zzfh(this);
    }

    /* renamed from: d */
    public final zzap m8949d() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("zzfh", "Android Keystore requires at least Android M");
            return null;
        }
        zzfj zzfjVar = new zzfj();
        boolean m8953c = zzfjVar.m8953c(this.f16490b);
        if (!m8953c) {
            try {
                String str = this.f16490b;
                if (new zzfj().m8953c(str)) {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
                }
                String m9339a = zznm.m9339a("android-keystore://", str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(m9339a, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w("zzfh", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }
        try {
            return zzfjVar.mo8864a(this.f16490b);
        } catch (GeneralSecurityException | ProviderException e3) {
            if (m8953c) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f16490b), e3);
            }
            Log.w("zzfh", "cannot use Android Keystore, it'll be disabled", e3);
            return null;
        }
    }

    /* renamed from: e */
    public final zzbh m8950e() throws GeneralSecurityException, IOException {
        zzap zzapVar = this.f16491c;
        if (zzapVar != null) {
            try {
                return zzbh.m8858d(zzbg.m8853f(this.f16494f, zzapVar));
            } catch (zzaaf | GeneralSecurityException e2) {
                Log.w("zzfh", "cannot decrypt keyset: ", e2);
            }
        }
        return zzbh.m8858d(zzbg.m8852a(zzky.m9251v(this.f16494f.m8954a(), zzzk.m9627a())));
    }
}
