package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public final String f15012b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15013c;

    @SafeParcelable.Constructor
    public zza(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f15012b = str;
        this.f15013c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15012b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15013c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
