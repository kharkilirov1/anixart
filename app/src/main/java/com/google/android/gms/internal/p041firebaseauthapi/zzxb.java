package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzxb extends AbstractSafeParcelable implements zzuf<zzxb> {
    public static final Parcelable.Creator<zzxb> CREATOR = new zzxc();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f16992b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f16993c;

    /* renamed from: d */
    @SafeParcelable.Field
    public String f16994d;

    /* renamed from: e */
    @SafeParcelable.Field
    public zzwu f16995e;

    public zzxb() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        String str2;
        char c2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16992b = Strings.m8247a(jSONObject.optString("email"));
            this.f16993c = Strings.m8247a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.f16994d = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                this.f16994d = (c2 == 0 || c2 == 1 || c2 == 2 || c2 == 3 || c2 == 4 || c2 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.f16995e = zzwu.m9472m(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxb", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f16992b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16993c, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f16994d, false);
        SafeParcelWriter.m8167f(parcel, 5, this.f16995e, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzxb(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param zzwu zzwuVar) {
        this.f16992b = str;
        this.f16993c = str2;
        this.f16994d = str3;
        this.f16995e = zzwuVar;
    }
}
