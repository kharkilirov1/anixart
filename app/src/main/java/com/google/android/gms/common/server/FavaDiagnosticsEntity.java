package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15837b;

    /* renamed from: c */
    @NonNull
    @SafeParcelable.Field
    public final String f15838c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15839d;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param int i2, @NonNull @SafeParcelable.Param String str, @SafeParcelable.Param int i3) {
        this.f15837b = i2;
        this.f15838c = str;
        this.f15839d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15837b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15838c, false);
        int i4 = this.f15839d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
