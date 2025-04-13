package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzya implements zzue {

    /* renamed from: b */
    public final String f17103b;

    /* renamed from: c */
    public final String f17104c;

    public zzya(String str, String str2) {
        Preconditions.m8129d(str);
        this.f17103b = str;
        Preconditions.m8129d(str2);
        this.f17104c = str2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f17103b);
        jSONObject.put("mfaEnrollmentId", this.f17104c);
        return jSONObject.toString();
    }
}
