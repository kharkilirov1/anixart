package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class zzww extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzww> CREATOR = new zzwx();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f16980b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f16981c;

    /* renamed from: d */
    @SafeParcelable.Field
    public String f16982d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f16983e;

    /* renamed from: f */
    @SafeParcelable.Field
    public String f16984f;

    /* renamed from: g */
    @SafeParcelable.Field
    public String f16985g;

    /* renamed from: h */
    @SafeParcelable.Field
    public String f16986h;

    public zzww() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f16980b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16981c, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f16982d, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f16983e, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f16984f, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f16985g, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f16986h, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzww(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param String str5, @SafeParcelable.Param String str6, @SafeParcelable.Param String str7) {
        this.f16980b = str;
        this.f16981c = str2;
        this.f16982d = str3;
        this.f16983e = str4;
        this.f16984f = str5;
        this.f16985g = str6;
        this.f16986h = str7;
    }
}
