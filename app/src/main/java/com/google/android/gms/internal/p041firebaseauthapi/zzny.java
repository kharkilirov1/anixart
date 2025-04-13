package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzny> CREATOR = new zznz();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16626b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16627c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f16628d;

    @SafeParcelable.Constructor
    public zzny(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3) {
        this.f16626b = str;
        this.f16627c = str2;
        this.f16628d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16626b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16627c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16628d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
