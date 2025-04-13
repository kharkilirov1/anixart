package com.google.android.gms.internal.p041firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvs {

    /* renamed from: a */
    public final String f16909a;

    public zzvs(String str) {
        Preconditions.m8129d(str);
        this.f16909a = str;
    }

    /* renamed from: a */
    public final JSONObject m9464a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f16909a);
        return jSONObject;
    }
}
