package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();

    /* renamed from: b */
    @SafeParcelable.Field
    public final RootTelemetryConfiguration f15693b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f15694c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15695d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final int[] f15696e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f15697f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final int[] f15698g;

    @SafeParcelable.Constructor
    public ConnectionTelemetryConfiguration(@NonNull @SafeParcelable.Param RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param int[] iArr, @SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param int[] iArr2) {
        this.f15693b = rootTelemetryConfiguration;
        this.f15694c = z;
        this.f15695d = z2;
        this.f15696e = iArr;
        this.f15697f = i2;
        this.f15698g = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15693b, i2, false);
        boolean z = this.f15694c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15695d;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.f15696e;
        if (iArr != null) {
            int m8173l2 = SafeParcelWriter.m8173l(parcel, 4);
            parcel.writeIntArray(iArr);
            SafeParcelWriter.m8174m(parcel, m8173l2);
        }
        int i3 = this.f15697f;
        parcel.writeInt(262149);
        parcel.writeInt(i3);
        int[] iArr2 = this.f15698g;
        if (iArr2 != null) {
            int m8173l3 = SafeParcelWriter.m8173l(parcel, 6);
            parcel.writeIntArray(iArr2);
            SafeParcelWriter.m8174m(parcel, m8173l3);
        }
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
