package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwa implements zzue {

    /* renamed from: b */
    public final String f16930b;

    /* renamed from: c */
    public String f16931c;

    /* renamed from: d */
    @Nullable
    public final String f16932d;

    /* renamed from: e */
    @Nullable
    public final String f16933e;

    /* renamed from: f */
    @Nullable
    public final String f16934f;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f16931c);
        Objects.requireNonNull(this.f16930b);
        jSONObject.put("mfaProvider", 1);
        String str = this.f16933e;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f16932d;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f16934f;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
