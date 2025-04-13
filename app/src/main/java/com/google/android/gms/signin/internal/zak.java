package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f17215b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final ConnectionResult f17216c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final zav f17217d;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param int i2, @SafeParcelable.Param ConnectionResult connectionResult, @Nullable @SafeParcelable.Param zav zavVar) {
        this.f17215b = i2;
        this.f17216c = connectionResult;
        this.f17217d = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f17215b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f17216c, i2, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f17217d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
