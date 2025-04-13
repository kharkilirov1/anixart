package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzai();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15739b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f15740c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15741d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final int f15742e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f15743f;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4) {
        this.f15739b = i2;
        this.f15740c = z;
        this.f15741d = z2;
        this.f15742e = i3;
        this.f15743f = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15739b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        boolean z = this.f15740c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15741d;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.f15742e;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        int i5 = this.f15743f;
        parcel.writeInt(262149);
        parcel.writeInt(i5);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
