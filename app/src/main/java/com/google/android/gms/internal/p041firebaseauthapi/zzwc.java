package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwc implements zzue {

    /* renamed from: b */
    public final String f16937b;

    /* renamed from: c */
    public final String f16938c;

    /* renamed from: d */
    @Nullable
    public final String f16939d;

    /* renamed from: e */
    @Nullable
    public final String f16940e;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Objects.requireNonNull(this.f16937b);
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f16938c);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f16939d;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f16940e;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
