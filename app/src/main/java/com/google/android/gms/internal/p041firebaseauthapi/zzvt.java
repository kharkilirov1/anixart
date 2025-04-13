package com.google.android.gms.internal.p041firebaseauthapi;

import android.util.Log;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvt implements zzuf {

    /* renamed from: b */
    public String f16910b;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(@NonNull String str) throws zzry {
        m9465b(str);
        return this;
    }

    /* renamed from: b */
    public final zzvt m9465b(@NonNull String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f16910b = jSONObject.getString(ThrowableDeserializer.PROP_NAME_MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e2) {
            Log.e("com.google.android.gms.internal.firebase-auth-api.zzvt", "Failed to parse error for string [" + str + "] with exception: " + e2.getMessage());
            throw new zzry(C0000a.m16m("Failed to parse error for string [", str, "]"), e2);
        }
    }
}
