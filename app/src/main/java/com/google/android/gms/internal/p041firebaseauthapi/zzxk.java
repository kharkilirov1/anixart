package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxk implements zzue {

    /* renamed from: b */
    public final String f17026b;

    /* renamed from: c */
    public final String f17027c;

    /* renamed from: d */
    @Nullable
    public final String f17028d;

    /* renamed from: e */
    @Nullable
    public final String f17029e;

    /* renamed from: f */
    @Nullable
    public final String f17030f;

    /* renamed from: g */
    @Nullable
    public final String f17031g;

    /* renamed from: h */
    @Nullable
    public zzvs f17032h;

    public zzxk(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Preconditions.m8129d(str);
        this.f17026b = str;
        Preconditions.m8129d("phone");
        this.f17027c = "phone";
        this.f17028d = str2;
        this.f17029e = str3;
        this.f17030f = str4;
        this.f17031g = str5;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f17026b);
        Objects.requireNonNull(this.f17027c);
        jSONObject.put("mfaProvider", 1);
        if (this.f17028d != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f17028d);
            if (!TextUtils.isEmpty(this.f17030f)) {
                jSONObject2.put("recaptchaToken", this.f17030f);
            }
            if (!TextUtils.isEmpty(this.f17031g)) {
                jSONObject2.put("safetyNetToken", this.f17031g);
            }
            zzvs zzvsVar = this.f17032h;
            if (zzvsVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzvsVar.m9464a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
