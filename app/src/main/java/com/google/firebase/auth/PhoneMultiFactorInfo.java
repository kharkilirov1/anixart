package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p041firebaseauthapi.zznp;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {

    @NonNull
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new zzag();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f22335b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f22336c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final long f22337d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final String f22338e;

    @SafeParcelable.Constructor
    public PhoneMultiFactorInfo(@NonNull @SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param long j2, @NonNull @SafeParcelable.Param String str3) {
        Preconditions.m8129d(str);
        this.f22335b = str;
        this.f22336c = str2;
        this.f22337d = j2;
        Preconditions.m8129d(str3);
        this.f22338e = str3;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    @androidx.annotation.Nullable
    /* renamed from: m */
    public JSONObject mo12259m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f22335b);
            jSONObject.putOpt("displayName", this.f22336c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f22337d));
            jSONObject.putOpt("phoneNumber", this.f22338e);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zznp(e2);
        }
    }

    @Override // android.os.Parcelable
    @SuppressLint
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22335b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22336c, false);
        long j2 = this.f22337d;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        SafeParcelWriter.m8168g(parcel, 4, this.f22338e, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
