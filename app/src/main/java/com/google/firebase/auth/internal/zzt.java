package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p041firebaseauthapi.zznp;
import com.google.android.gms.internal.p041firebaseauthapi.zzwj;
import com.google.android.gms.internal.p041firebaseauthapi.zzww;
import com.google.firebase.auth.UserInfo;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable implements UserInfo {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: b */
    @NonNull
    @SafeParcelable.Field
    public final String f22429b;

    /* renamed from: c */
    @NonNull
    @SafeParcelable.Field
    public final String f22430c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f22431d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public String f22432e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final String f22433f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f22434g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final boolean f22435h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f22436i;

    public zzt(zzwj zzwjVar, String str) {
        Preconditions.m8129d(CoreConstants.Transport.FIREBASE);
        String str2 = zzwjVar.f16948b;
        Preconditions.m8129d(str2);
        this.f22429b = str2;
        this.f22430c = CoreConstants.Transport.FIREBASE;
        this.f22433f = zzwjVar.f16949c;
        this.f22431d = zzwjVar.f16951e;
        Uri parse = !TextUtils.isEmpty(zzwjVar.f16952f) ? Uri.parse(zzwjVar.f16952f) : null;
        if (parse != null) {
            this.f22432e = parse.toString();
        }
        this.f22435h = zzwjVar.f16950d;
        this.f22436i = null;
        this.f22434g = zzwjVar.f16955i;
    }

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    /* renamed from: h */
    public final String mo12262h() {
        return this.f22430c;
    }

    @Nullable
    /* renamed from: m */
    public final String m12324m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f22429b);
            jSONObject.putOpt("providerId", this.f22430c);
            jSONObject.putOpt("displayName", this.f22431d);
            jSONObject.putOpt("photoUrl", this.f22432e);
            jSONObject.putOpt("email", this.f22433f);
            jSONObject.putOpt("phoneNumber", this.f22434g);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f22435h));
            jSONObject.putOpt("rawUserInfo", this.f22436i);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zznp(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22429b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22430c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22431d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f22432e, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f22433f, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f22434g, false);
        boolean z = this.f22435h;
        parcel.writeInt(262151);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 8, this.f22436i, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zzt(zzww zzwwVar) {
        Objects.requireNonNull(zzwwVar, "null reference");
        this.f22429b = zzwwVar.f16980b;
        String str = zzwwVar.f16983e;
        Preconditions.m8129d(str);
        this.f22430c = str;
        this.f22431d = zzwwVar.f16981c;
        Uri parse = !TextUtils.isEmpty(zzwwVar.f16982d) ? Uri.parse(zzwwVar.f16982d) : null;
        if (parse != null) {
            this.f22432e = parse.toString();
        }
        this.f22433f = zzwwVar.f16986h;
        this.f22434g = zzwwVar.f16985g;
        this.f22435h = false;
        this.f22436i = zzwwVar.f16984f;
    }

    @SafeParcelable.Constructor
    @VisibleForTesting
    public zzt(@NonNull @SafeParcelable.Param String str, @NonNull @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param String str5, @Nullable @SafeParcelable.Param String str6, @SafeParcelable.Param boolean z, @Nullable @SafeParcelable.Param String str7) {
        this.f22429b = str;
        this.f22430c = str2;
        this.f22433f = str3;
        this.f22434g = str4;
        this.f22431d = str5;
        this.f22432e = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(this.f22432e);
        }
        this.f22435h = z;
        this.f22436i = str7;
    }
}
