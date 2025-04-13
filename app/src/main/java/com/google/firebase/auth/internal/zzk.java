package com.google.firebase.auth.internal;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p041firebaseauthapi.zzeh;
import com.google.android.gms.internal.p041firebaseauthapi.zzem;
import com.google.android.gms.internal.p041firebaseauthapi.zzff;
import com.google.android.gms.internal.p041firebaseauthapi.zzfh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzk {

    /* renamed from: c */
    public static zzk f22418c;

    /* renamed from: a */
    public final String f22419a;

    /* renamed from: b */
    @Nullable
    public final zzfh f22420b;

    public zzk(Context context, String str, boolean z) {
        zzfh zzfhVar;
        zzff zzffVar;
        String format;
        this.f22419a = str;
        try {
            zzeh.m8924a();
            zzffVar = new zzff();
            zzffVar.m8947b(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            zzffVar.m8946a(zzem.f16454a);
            format = String.format("android-keystore://firebear_master_key_id.%s", str);
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e2.getMessage())));
            zzfhVar = null;
        }
        if (!format.startsWith("android-keystore://")) {
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        zzffVar.f16490b = format;
        zzfhVar = zzffVar.m8948c();
        this.f22420b = zzfhVar;
    }

    /* renamed from: a */
    public static zzk m12321a(Context context, String str) {
        zzk zzkVar = f22418c;
        if (zzkVar == null || !com.google.android.gms.internal.p041firebaseauthapi.zzu.m9408a(zzkVar.f22419a, str)) {
            f22418c = new zzk(context, str, true);
        }
        return f22418c;
    }

    @Nullable
    /* renamed from: b */
    public final String m12322b(String str) {
        com.google.android.gms.internal.p041firebaseauthapi.zzbg m8860b;
        String str2;
        zzfh zzfhVar = this.f22420b;
        if (zzfhVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzfhVar) {
                zzfh zzfhVar2 = this.f22420b;
                synchronized (zzfhVar2) {
                    m8860b = zzfhVar2.f16497c.m8860b();
                }
                str2 = new String(((com.google.android.gms.internal.p041firebaseauthapi.zzau) m8860b.m8855c(com.google.android.gms.internal.p041firebaseauthapi.zzau.class)).mo8831a(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String m12323c() {
        com.google.android.gms.internal.p041firebaseauthapi.zzbg m8860b;
        if (this.f22420b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.internal.p041firebaseauthapi.zzaq zzaqVar = new com.google.android.gms.internal.p041firebaseauthapi.zzaq(byteArrayOutputStream);
        try {
            synchronized (this.f22420b) {
                zzfh zzfhVar = this.f22420b;
                synchronized (zzfhVar) {
                    m8860b = zzfhVar.f16497c.m8860b();
                }
                m8860b.m8854b().m8857e(zzaqVar);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e2.getMessage())));
            return null;
        }
    }
}
