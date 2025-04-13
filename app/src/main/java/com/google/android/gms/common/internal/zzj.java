package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* renamed from: b */
    @SafeParcelable.Field
    public Bundle f15805b;

    /* renamed from: c */
    @SafeParcelable.Field
    public Feature[] f15806c;

    /* renamed from: d */
    @SafeParcelable.Field
    public int f15807d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public ConnectionTelemetryConfiguration f15808e;

    public zzj() {
    }

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param Bundle bundle, @SafeParcelable.Param Feature[] featureArr, @SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f15805b = bundle;
        this.f15806c = featureArr;
        this.f15807d = i2;
        this.f15808e = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8163b(parcel, 1, this.f15805b, false);
        SafeParcelWriter.m8171j(parcel, 2, this.f15806c, i2, false);
        int i3 = this.f15807d;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 4, this.f15808e, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
