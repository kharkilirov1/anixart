package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvz implements zzuf {

    /* renamed from: b */
    public String f16924b;

    /* renamed from: c */
    public String f16925c;

    /* renamed from: d */
    public boolean f16926d;

    /* renamed from: e */
    public long f16927e;

    /* renamed from: f */
    @Nullable
    public List f16928f;

    /* renamed from: g */
    @Nullable
    public String f16929g;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.f16924b = jSONObject.optString("idToken", null);
            this.f16925c = jSONObject.optString("refreshToken", null);
            this.f16926d = jSONObject.optBoolean("isNewUser", false);
            this.f16927e = jSONObject.optLong("expiresIn", 0L);
            this.f16928f = zzwu.m9473n(jSONObject.optJSONArray("mfaInfo"));
            this.f16929g = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzvz", str);
        }
    }
}
