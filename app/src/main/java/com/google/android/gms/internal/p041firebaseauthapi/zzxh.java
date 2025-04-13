package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxh implements zzuf {

    /* renamed from: b */
    public String f17015b;

    /* renamed from: c */
    public zzwy f17016c;

    /* renamed from: d */
    public String f17017d;

    /* renamed from: e */
    public String f17018e;

    /* renamed from: f */
    public long f17019f;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17015b = Strings.m8247a(jSONObject.optString("email", null));
            Strings.m8247a(jSONObject.optString("passwordHash", null));
            jSONObject.optBoolean("emailVerified", false);
            Strings.m8247a(jSONObject.optString("displayName", null));
            Strings.m8247a(jSONObject.optString("photoUrl", null));
            this.f17016c = zzwy.m9474m(jSONObject.optJSONArray("providerUserInfo"));
            this.f17017d = Strings.m8247a(jSONObject.optString("idToken", null));
            this.f17018e = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17019f = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxh", str);
        }
    }
}
