package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.messaging.FirebaseMessagingService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxt implements zzue {

    /* renamed from: b */
    public final String f17077b;

    /* renamed from: c */
    @Nullable
    public final String f17078c;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, this.f17077b);
        jSONObject.put("returnSecureToken", true);
        String str = this.f17078c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
