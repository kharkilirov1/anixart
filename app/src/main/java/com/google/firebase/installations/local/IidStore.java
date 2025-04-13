package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class IidStore {

    /* renamed from: c */
    public static final String[] f23176c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    @GuardedBy
    public final SharedPreferences f23177a;

    /* renamed from: b */
    public final String f23178b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r0.isEmpty() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IidStore(@androidx.annotation.NonNull com.google.firebase.FirebaseApp r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.m12217a()
            android.content.Context r0 = r4.f22259a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f23177a = r0
            r4.m12217a()
            com.google.firebase.FirebaseOptions r0 = r4.f22261c
            java.lang.String r0 = r0.f22277e
            if (r0 == 0) goto L1b
            goto L49
        L1b:
            r4.m12217a()
            com.google.firebase.FirebaseOptions r4 = r4.f22261c
            java.lang.String r0 = r4.f22274b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L49
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
            goto L48
        L3f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L49
        L48:
            r0 = r2
        L49:
            r3.f23178b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.IidStore.<init>(com.google.firebase.FirebaseApp):void");
    }

    @Nullable
    /* renamed from: a */
    public final String m12599a() {
        PublicKey publicKey;
        synchronized (this.f23177a) {
            String str = null;
            String string = this.f23177a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                Log.w("ContentValues", "Invalid key stored " + e2);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) & KotlinVersion.MAX_COMPONENT_VALUE);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
