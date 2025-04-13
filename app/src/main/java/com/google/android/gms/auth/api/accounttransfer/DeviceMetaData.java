package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzx();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15048b;

    /* renamed from: c */
    @SafeParcelable.Field
    public boolean f15049c;

    /* renamed from: d */
    @SafeParcelable.Field
    public long f15050d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15051e;

    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z2) {
        this.f15048b = i2;
        this.f15049c = z;
        this.f15050d = j2;
        this.f15051e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15048b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        boolean z = this.f15049c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        long j2 = this.f15050d;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        boolean z2 = this.f15051e;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
