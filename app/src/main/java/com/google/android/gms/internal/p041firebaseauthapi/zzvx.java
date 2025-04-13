package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvx implements zzue {

    /* renamed from: b */
    public final String f16920b;

    public zzvx(String str) {
        Preconditions.m8129d(str);
        this.f16920b = str;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f16920b);
        return jSONObject.toString();
    }
}
