package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxw implements zzue {

    /* renamed from: b */
    public final String f17083b;

    /* renamed from: c */
    public final String f17084c;

    /* renamed from: d */
    @Nullable
    public final String f17085d;

    public zzxw(String str, String str2, @Nullable String str3) {
        Preconditions.m8129d(str);
        this.f17083b = str;
        Preconditions.m8129d(str2);
        this.f17084c = str2;
        this.f17085d = str3;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f17083b);
        jSONObject.put("password", this.f17084c);
        jSONObject.put("returnSecureToken", true);
        String str = this.f17085d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
