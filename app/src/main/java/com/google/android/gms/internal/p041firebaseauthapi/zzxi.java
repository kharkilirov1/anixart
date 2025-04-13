package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxi implements zzue {

    /* renamed from: b */
    public String f17020b;

    /* renamed from: c */
    public String f17021c;

    /* renamed from: d */
    @Nullable
    public final String f17022d;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f17020b;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f17021c;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f17022d;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
