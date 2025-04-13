package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwt {

    /* renamed from: a */
    public Long f16974a;

    /* renamed from: b */
    public Long f16975b;

    /* renamed from: a */
    public static zzwt m9471a(String str) throws UnsupportedEncodingException {
        try {
            zzwt zzwtVar = new zzwt();
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("iss");
            jSONObject.optString("aud");
            jSONObject.optString("sub");
            zzwtVar.f16974a = Long.valueOf(jSONObject.optLong("iat"));
            zzwtVar.f16975b = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzwtVar;
        } catch (JSONException e2) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e2.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e2.toString()));
        }
    }
}
