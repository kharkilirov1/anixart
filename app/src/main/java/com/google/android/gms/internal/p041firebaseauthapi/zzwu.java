package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzwu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwu> CREATOR = new zzwv();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public final String f16976b;

    /* renamed from: c */
    @NonNull
    @SafeParcelable.Field
    public final String f16977c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f16978d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final long f16979e;

    @SafeParcelable.Constructor
    public zzwu(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param long j2) {
        this.f16976b = str;
        Preconditions.m8129d(str2);
        this.f16977c = str2;
        this.f16978d = str3;
        this.f16979e = j2;
    }

    /* renamed from: m */
    public static zzwu m9472m(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", null);
        String optString3 = jSONObject.optString("displayName", null);
        long j2 = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j2 = optJSONObject.optLong("seconds", 0L);
        }
        zzwu zzwuVar = new zzwu(optString, optString2, optString3, j2);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzwuVar;
    }

    /* renamed from: n */
    public static List m9473n(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(m9472m(jSONArray.getJSONObject(i2)));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16976b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16977c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16978d, false);
        long j2 = this.f16979e;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
