package com.google.android.gms.internal.p041firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.ActionCodeSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwn implements zzue {

    /* renamed from: b */
    public final String f16962b;

    /* renamed from: c */
    public String f16963c;

    /* renamed from: d */
    public String f16964d;

    /* renamed from: e */
    public String f16965e;

    /* renamed from: f */
    public ActionCodeSettings f16966f;

    /* renamed from: g */
    @Nullable
    public String f16967g;

    public zzwn(int i2) {
        this.f16962b = i2 != 1 ? i2 != 4 ? i2 != 6 ? i2 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public zzwn(ActionCodeSettings actionCodeSettings, @Nullable String str, @Nullable String str2) {
        this.f16962b = "VERIFY_AND_CHANGE_EMAIL";
        this.f16966f = actionCodeSettings;
        this.f16963c = null;
        this.f16964d = str;
        this.f16965e = str2;
        this.f16967g = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        char c2;
        JSONObject jSONObject = new JSONObject();
        String str = this.f16962b;
        int i2 = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            i2 = 1;
        } else if (c2 == 1) {
            i2 = 4;
        } else if (c2 == 2) {
            i2 = 6;
        } else if (c2 == 3) {
            i2 = 7;
        }
        jSONObject.put("requestType", i2);
        String str2 = this.f16963c;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.f16964d;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.f16965e;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        ActionCodeSettings actionCodeSettings = this.f16966f;
        if (actionCodeSettings != null) {
            jSONObject.put("androidInstallApp", actionCodeSettings.f22291f);
            jSONObject.put("canHandleCodeInApp", this.f16966f.f22293h);
            String str5 = this.f16966f.f22287b;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.f16966f.f22288c;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.f16966f.f22289d;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.f16966f.f22290e;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.f16966f.f22292g;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.f16966f.f22296k;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
        }
        String str11 = this.f16967g;
        if (str11 != null) {
            jSONObject.put("tenantId", str11);
        }
        return jSONObject.toString();
    }
}
