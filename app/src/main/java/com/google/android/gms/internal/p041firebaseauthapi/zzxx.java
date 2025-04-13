package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxx implements zzuf {

    /* renamed from: b */
    public String f17086b;

    /* renamed from: c */
    public String f17087c;

    /* renamed from: d */
    public long f17088d;

    /* renamed from: e */
    public List f17089e;

    /* renamed from: f */
    public String f17090f;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Strings.m8247a(jSONObject.optString("localId", null));
            Strings.m8247a(jSONObject.optString("email", null));
            Strings.m8247a(jSONObject.optString("displayName", null));
            this.f17086b = Strings.m8247a(jSONObject.optString("idToken", null));
            Strings.m8247a(jSONObject.optString("photoUrl", null));
            this.f17087c = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17088d = jSONObject.optLong("expiresIn", 0L);
            this.f17089e = zzwu.m9473n(jSONObject.optJSONArray("mfaInfo"));
            this.f17090f = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxx", str);
        }
    }
}
