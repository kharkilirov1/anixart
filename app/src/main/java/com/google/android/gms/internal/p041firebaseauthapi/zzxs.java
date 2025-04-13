package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzxs implements zzuf {

    /* renamed from: b */
    public boolean f17061b;

    /* renamed from: c */
    public String f17062c;

    /* renamed from: d */
    public String f17063d;

    /* renamed from: e */
    public long f17064e;

    /* renamed from: f */
    public String f17065f;

    /* renamed from: g */
    public String f17066g;

    /* renamed from: h */
    public String f17067h;

    /* renamed from: i */
    public boolean f17068i;

    /* renamed from: j */
    public String f17069j;

    /* renamed from: k */
    public String f17070k;

    /* renamed from: l */
    public String f17071l;

    /* renamed from: m */
    public String f17072m;

    /* renamed from: n */
    public String f17073n;

    /* renamed from: o */
    public String f17074o;

    /* renamed from: p */
    public List f17075p;

    /* renamed from: q */
    public String f17076q;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17061b = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f17062c = Strings.m8247a(jSONObject.optString("idToken", null));
            this.f17063d = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17064e = jSONObject.optLong("expiresIn", 0L);
            Strings.m8247a(jSONObject.optString("localId", null));
            this.f17065f = Strings.m8247a(jSONObject.optString("email", null));
            Strings.m8247a(jSONObject.optString("displayName", null));
            Strings.m8247a(jSONObject.optString("photoUrl", null));
            this.f17066g = Strings.m8247a(jSONObject.optString("providerId", null));
            this.f17067h = Strings.m8247a(jSONObject.optString("rawUserInfo", null));
            this.f17068i = jSONObject.optBoolean("isNewUser", false);
            this.f17069j = jSONObject.optString("oauthAccessToken", null);
            this.f17070k = jSONObject.optString("oauthIdToken", null);
            this.f17072m = Strings.m8247a(jSONObject.optString("errorMessage", null));
            this.f17073n = Strings.m8247a(jSONObject.optString("pendingToken", null));
            this.f17074o = Strings.m8247a(jSONObject.optString("tenantId", null));
            this.f17075p = zzwu.m9473n(jSONObject.optJSONArray("mfaInfo"));
            this.f17076q = Strings.m8247a(jSONObject.optString("mfaPendingCredential", null));
            this.f17071l = Strings.m8247a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxs", str);
        }
    }

    @Nullable
    /* renamed from: b */
    public final zze m9478b() {
        if (TextUtils.isEmpty(this.f17069j) && TextUtils.isEmpty(this.f17070k)) {
            return null;
        }
        String str = this.f17066g;
        String str2 = this.f17070k;
        String str3 = this.f17069j;
        String str4 = this.f17073n;
        String str5 = this.f17071l;
        Preconditions.m8130e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, str4, str5, null);
    }
}
