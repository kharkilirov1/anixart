package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
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
public final class zzwq extends AbstractSafeParcelable implements zzuf<zzwq> {
    public static final Parcelable.Creator<zzwq> CREATOR = new zzwr();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f16969b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f16970c;

    /* renamed from: d */
    @SafeParcelable.Field
    public Long f16971d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f16972e;

    /* renamed from: f */
    @SafeParcelable.Field
    public Long f16973f;

    public zzwq() {
        this.f16973f = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: m */
    public static zzwq m9467m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzwq zzwqVar = new zzwq();
            zzwqVar.f16969b = jSONObject.optString("refresh_token", null);
            zzwqVar.f16970c = jSONObject.optString("access_token", null);
            zzwqVar.f16971d = Long.valueOf(jSONObject.optLong("expires_in"));
            zzwqVar.f16972e = jSONObject.optString("token_type", null);
            zzwqVar.f16973f = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzwqVar;
        } catch (JSONException e2) {
            Log.d("zzwq", "Failed to read GetTokenResponse from JSONObject");
            throw new zznp(e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuf
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzuf mo9412a(String str) throws zzry {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16969b = Strings.m8247a(jSONObject.optString("refresh_token"));
            this.f16970c = Strings.m8247a(jSONObject.optString("access_token"));
            this.f16971d = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f16972e = Strings.m8247a(jSONObject.optString("token_type"));
            this.f16973f = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzyc.m9483a(e2, "zzwq", str);
        }
    }

    /* renamed from: n */
    public final String m9468n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f16969b);
            jSONObject.put("access_token", this.f16970c);
            jSONObject.put("expires_in", this.f16971d);
            jSONObject.put("token_type", this.f16972e);
            jSONObject.put("issued_at", this.f16973f);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("zzwq", "Failed to convert GetTokenResponse to JSON");
            throw new zznp(e2);
        }
    }

    /* renamed from: o */
    public final boolean m9469o() {
        return System.currentTimeMillis() + 300000 < (this.f16971d.longValue() * 1000) + this.f16973f.longValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f16969b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16970c, false);
        Long l2 = this.f16971d;
        SafeParcelWriter.m8166e(parcel, 4, Long.valueOf(l2 == null ? 0L : l2.longValue()), false);
        SafeParcelWriter.m8168g(parcel, 5, this.f16972e, false);
        SafeParcelWriter.m8166e(parcel, 6, Long.valueOf(this.f16973f.longValue()), false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zzwq(String str, String str2, Long l2, String str3) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f16969b = str;
        this.f16970c = str2;
        this.f16971d = l2;
        this.f16972e = str3;
        this.f16973f = valueOf;
    }

    @SafeParcelable.Constructor
    public zzwq(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param Long l2, @SafeParcelable.Param String str3, @SafeParcelable.Param Long l3) {
        this.f16969b = str;
        this.f16970c = str2;
        this.f16971d = l2;
        this.f16972e = str3;
        this.f16973f = l3;
    }
}
