package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
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
public final class zzxu extends AbstractSafeParcelable implements zzuf<zzxu> {
    public static final Parcelable.Creator<zzxu> CREATOR = new zzxv();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f17079b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f17080c;

    /* renamed from: d */
    @SafeParcelable.Field
    public long f17081d;

    /* renamed from: e */
    @SafeParcelable.Field
    public boolean f17082e;

    public zzxu() {
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f17079b = Strings.m8247a(jSONObject.optString("idToken", null));
            this.f17080c = Strings.m8247a(jSONObject.optString("refreshToken", null));
            this.f17081d = jSONObject.optLong("expiresIn", 0L);
            this.f17082e = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzxu", str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f17079b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f17080c, false);
        long j2 = this.f17081d;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        boolean z = this.f17082e;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzxu(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z) {
        this.f17079b = str;
        this.f17080c = str2;
        this.f17081d = j2;
        this.f17082e = z;
    }
}
