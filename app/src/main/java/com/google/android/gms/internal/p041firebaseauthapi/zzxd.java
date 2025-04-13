package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzxd extends AbstractSafeParcelable implements zzue {
    public static final Parcelable.Creator<zzxd> CREATOR = new zzxe();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16996b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final long f16997c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f16998d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final String f16999e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final String f17000f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f17001g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final boolean f17002h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final String f17003i;

    /* renamed from: j */
    @Nullable
    public zzvs f17004j;

    @SafeParcelable.Constructor
    public zzxd(@SafeParcelable.Param String str, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str5) {
        Preconditions.m8129d(str);
        this.f16996b = str;
        this.f16997c = j2;
        this.f16998d = z;
        this.f16999e = str2;
        this.f17000f = str3;
        this.f17001g = str4;
        this.f17002h = z2;
        this.f17003i = str5;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzue
    /* renamed from: u */
    public final String mo9411u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f16996b);
        String str = this.f17000f;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f17001g;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzvs zzvsVar = this.f17004j;
        if (zzvsVar != null) {
            jSONObject.put("autoRetrievalInfo", zzvsVar.m9464a());
        }
        String str3 = this.f17003i;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16996b, false);
        long j2 = this.f16997c;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        boolean z = this.f16998d;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 4, this.f16999e, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f17000f, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f17001g, false);
        boolean z2 = this.f17002h;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 8, this.f17003i, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
