package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxz implements zzuf {

    /* renamed from: b */
    public String f17097b;

    /* renamed from: c */
    public String f17098c;

    /* renamed from: d */
    public long f17099d;

    /* renamed from: e */
    public boolean f17100e;

    /* renamed from: f */
    public String f17101f;

    /* renamed from: g */
    public String f17102g;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17097b = Strings.m8247a(jSONObject.optString("idToken", null));
            this.f17098c = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17099d = jSONObject.optLong("expiresIn", 0L);
            Strings.m8247a(jSONObject.optString("localId", null));
            this.f17100e = jSONObject.optBoolean("isNewUser", false);
            this.f17101f = Strings.m8247a(jSONObject.optString("temporaryProof", null));
            this.f17102g = Strings.m8247a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxz", str);
        }
    }
}
