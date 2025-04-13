package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzyb implements zzuf {

    /* renamed from: b */
    public String f17105b;

    /* renamed from: c */
    public String f17106c;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17105b = Strings.m8247a(jSONObject.optString("idToken", null));
            this.f17106c = Strings.m8247a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzyb", str);
        }
    }
}
