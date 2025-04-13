package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvu implements zzue {

    /* renamed from: b */
    public final String f16911b;

    /* renamed from: c */
    public final String f16912c;

    /* renamed from: d */
    @Nullable
    public final String f16913d;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f16911b);
        jSONObject.put("continueUri", this.f16912c);
        String str = this.f16913d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
