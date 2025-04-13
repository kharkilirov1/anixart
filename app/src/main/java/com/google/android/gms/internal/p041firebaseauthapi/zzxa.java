package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxa implements zzue {

    /* renamed from: b */
    public final String f16989b;

    /* renamed from: c */
    @Nullable
    public final String f16990c;

    /* renamed from: d */
    @Nullable
    public final String f16991d;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f16989b);
        String str = this.f16990c;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f16991d;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
