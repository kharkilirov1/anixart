package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.internal.zzi;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzxq extends AbstractSafeParcelable implements zzue {
    public static final Parcelable.Creator<zzxq> CREATOR = new zzxr();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f17045b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f17046c;

    /* renamed from: d */
    @SafeParcelable.Field
    public String f17047d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f17048e;

    /* renamed from: f */
    @SafeParcelable.Field
    public String f17049f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public String f17050g;

    /* renamed from: h */
    @SafeParcelable.Field
    public String f17051h;

    /* renamed from: i */
    @SafeParcelable.Field
    public String f17052i;

    /* renamed from: j */
    @SafeParcelable.Field
    public boolean f17053j;

    /* renamed from: k */
    @SafeParcelable.Field
    public boolean f17054k;

    /* renamed from: l */
    @SafeParcelable.Field
    public String f17055l;

    /* renamed from: m */
    @SafeParcelable.Field
    public String f17056m;

    /* renamed from: n */
    @SafeParcelable.Field
    public String f17057n;

    /* renamed from: o */
    @SafeParcelable.Field
    public String f17058o;

    /* renamed from: p */
    @SafeParcelable.Field
    public boolean f17059p;

    /* renamed from: q */
    @Nullable
    @SafeParcelable.Field
    public String f17060q;

    public zzxq() {
        this.f17053j = true;
        this.f17054k = true;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.f17054k);
        jSONObject.put("returnSecureToken", this.f17053j);
        String str = this.f17046c;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f17051h;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.f17058o;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f17060q;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.f17056m)) {
            jSONObject.put("sessionId", this.f17056m);
        }
        if (TextUtils.isEmpty(this.f17057n)) {
            String str5 = this.f17045b;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        } else {
            jSONObject.put("requestUri", this.f17057n);
        }
        jSONObject.put("returnIdpCredential", this.f17059p);
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f17045b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f17046c, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f17047d, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f17048e, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f17049f, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f17050g, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f17051h, false);
        SafeParcelWriter.m8168g(parcel, 9, this.f17052i, false);
        boolean z = this.f17053j;
        parcel.writeInt(262154);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f17054k;
        parcel.writeInt(262155);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 12, this.f17055l, false);
        SafeParcelWriter.m8168g(parcel, 13, this.f17056m, false);
        SafeParcelWriter.m8168g(parcel, 14, this.f17057n, false);
        SafeParcelWriter.m8168g(parcel, 15, this.f17058o, false);
        boolean z3 = this.f17059p;
        parcel.writeInt(262160);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 17, this.f17060q, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zzxq(zzi zziVar, String str) {
        Objects.requireNonNull(zziVar, "null reference");
        String str2 = zziVar.f22412a;
        Preconditions.m8129d(str2);
        this.f17056m = str2;
        Preconditions.m8129d(str);
        this.f17057n = str;
        String str3 = zziVar.f22414c;
        Preconditions.m8129d(str3);
        this.f17049f = str3;
        this.f17053j = true;
        this.f17051h = "providerId=".concat(String.valueOf(str3));
    }

    public zzxq(@Nullable String str, @Nullable String str2, String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.f17045b = "http://localhost";
        this.f17047d = str;
        this.f17048e = str2;
        this.f17052i = str4;
        this.f17055l = str5;
        this.f17058o = str6;
        this.f17060q = str7;
        this.f17053j = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f17048e) && TextUtils.isEmpty(this.f17055l)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        Preconditions.m8129d(str3);
        this.f17049f = str3;
        this.f17050g = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f17047d)) {
            sb.append("id_token=");
            sb.append(this.f17047d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17048e)) {
            sb.append("access_token=");
            sb.append(this.f17048e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17050g)) {
            sb.append("identifier=");
            sb.append(this.f17050g);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17052i)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f17052i);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f17055l)) {
            sb.append("code=");
            sb.append(this.f17055l);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str8)) {
            C0000a.m1B(sb, "nonce=", str8, "&");
        }
        sb.append("providerId=");
        sb.append(this.f17049f);
        this.f17051h = sb.toString();
        this.f17054k = true;
    }

    @SafeParcelable.Constructor
    public zzxq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str9, @SafeParcelable.Param String str10, @SafeParcelable.Param String str11, @SafeParcelable.Param String str12, @SafeParcelable.Param boolean z3, @SafeParcelable.Param String str13) {
        this.f17045b = str;
        this.f17046c = str2;
        this.f17047d = str3;
        this.f17048e = str4;
        this.f17049f = str5;
        this.f17050g = str6;
        this.f17051h = str7;
        this.f17052i = str8;
        this.f17053j = z;
        this.f17054k = z2;
        this.f17055l = str9;
        this.f17056m = str10;
        this.f17057n = str11;
        this.f17058o = str12;
        this.f17059p = z3;
        this.f17060q = str13;
    }
}
