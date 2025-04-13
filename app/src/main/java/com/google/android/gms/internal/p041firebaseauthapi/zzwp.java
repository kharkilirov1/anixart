package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwp implements zzuf {

    /* renamed from: b */
    public List f16968b;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        m9466b(str);
        return this;
    }

    /* renamed from: b */
    public final zzwp m9466b(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16968b = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    this.f16968b.add(optJSONArray.getString(i2));
                }
            }
            return this;
        } catch (JSONException e2) {
            throw zzyc.m9483a(e2, "zzwp", str);
        }
    }
}
