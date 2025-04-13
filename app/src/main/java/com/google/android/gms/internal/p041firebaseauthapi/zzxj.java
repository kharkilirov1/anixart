package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxj implements zzuf {

    /* renamed from: b */
    public String f17023b;

    /* renamed from: c */
    public String f17024c;

    /* renamed from: d */
    public long f17025d;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17023b = Strings.m8247a(jSONObject.optString("idToken", null));
            Strings.m8247a(jSONObject.optString("displayName", null));
            Strings.m8247a(jSONObject.optString("email", null));
            this.f17024c = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17025d = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxj", str);
        }
    }
}
