package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxm implements zzue {

    /* renamed from: b */
    public final String f17034b;

    /* renamed from: c */
    public final String f17035c;

    /* renamed from: d */
    public final String f17036d;

    /* renamed from: e */
    @Nullable
    public final String f17037e;

    /* renamed from: f */
    @Nullable
    public final String f17038f;

    /* renamed from: g */
    @Nullable
    public final String f17039g;

    /* renamed from: h */
    @Nullable
    public final String f17040h;

    /* renamed from: i */
    @Nullable
    public zzvs f17041i;

    public zzxm(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Preconditions.m8129d("phone");
        this.f17034b = "phone";
        Preconditions.m8129d(str);
        this.f17035c = str;
        Preconditions.m8129d(str2);
        this.f17036d = str2;
        this.f17038f = str3;
        this.f17037e = str4;
        this.f17039g = str5;
        this.f17040h = str6;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f17035c);
        jSONObject.put("mfaEnrollmentId", this.f17036d);
        Objects.requireNonNull(this.f17034b);
        jSONObject.put("mfaProvider", 1);
        if (this.f17038f != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f17038f);
            if (!TextUtils.isEmpty(this.f17039g)) {
                jSONObject2.put("recaptchaToken", this.f17039g);
            }
            if (!TextUtils.isEmpty(this.f17040h)) {
                jSONObject2.put("safetyNetToken", this.f17040h);
            }
            zzvs zzvsVar = this.f17041i;
            if (zzvsVar != null) {
                jSONObject2.put("autoRetrievalInfo", zzvsVar.m9464a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
