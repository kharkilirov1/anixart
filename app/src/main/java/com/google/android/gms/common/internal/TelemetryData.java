package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15746b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public List<MethodInvocation> f15747c;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable List<MethodInvocation> list) {
        this.f15746b = i2;
        this.f15747c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15746b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8172k(parcel, 2, this.f15747c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
