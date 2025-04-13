package com.google.android.gms.internal.p041firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwb implements zzuf {

    /* renamed from: b */
    public String f16935b;

    /* renamed from: c */
    public String f16936c;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16935b = jSONObject.optString("idToken", null);
            this.f16936c = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzwb", str);
        }
    }
}
