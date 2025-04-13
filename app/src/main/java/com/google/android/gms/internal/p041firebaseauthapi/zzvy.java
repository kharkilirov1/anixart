package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.ActionCodeUrl;
import com.google.firebase.auth.EmailAuthCredential;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvy implements zzue {

    /* renamed from: b */
    public final String f16921b;

    /* renamed from: c */
    public final String f16922c;

    /* renamed from: d */
    @Nullable
    public final String f16923d;

    static {
        new Logger("zzvy", new String[0]);
    }

    public zzvy(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        String str2 = emailAuthCredential.f22300b;
        Preconditions.m8129d(str2);
        this.f16921b = str2;
        String str3 = emailAuthCredential.f22302d;
        Preconditions.m8129d(str3);
        this.f16922c = str3;
        this.f16923d = str;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        ActionCodeUrl actionCodeUrl;
        String str = this.f16922c;
        Map map = ActionCodeUrl.f22297c;
        Preconditions.m8129d(str);
        try {
            actionCodeUrl = new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            actionCodeUrl = null;
        }
        String str2 = actionCodeUrl != null ? actionCodeUrl.f22298a : null;
        String str3 = actionCodeUrl != null ? actionCodeUrl.f22299b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f16921b);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f16923d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
