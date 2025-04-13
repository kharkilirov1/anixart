package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxy implements zzue {

    /* renamed from: b */
    public String f17091b;

    /* renamed from: c */
    public String f17092c;

    /* renamed from: d */
    public String f17093d;

    /* renamed from: e */
    public String f17094e;

    /* renamed from: f */
    public String f17095f;

    /* renamed from: g */
    public boolean f17096g;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f17094e)) {
            jSONObject.put("sessionInfo", this.f17092c);
            jSONObject.put("code", this.f17093d);
        } else {
            jSONObject.put("phoneNumber", this.f17091b);
            jSONObject.put("temporaryProof", this.f17094e);
        }
        String str = this.f17095f;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.f17096g) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
