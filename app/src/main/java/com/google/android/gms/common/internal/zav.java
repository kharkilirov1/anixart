package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15775b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final IBinder f15776c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final ConnectionResult f15777d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15778e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f15779f;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param ConnectionResult connectionResult, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f15775b = i2;
        this.f15776c = iBinder;
        this.f15777d = connectionResult;
        this.f15778e = z;
        this.f15779f = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f15777d.equals(zavVar.f15777d) && Objects.m8123a(m8189m(), zavVar.m8189m());
    }

    @Nullable
    /* renamed from: m */
    public final IAccountAccessor m8189m() {
        IBinder iBinder = this.f15776c;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.m8120q(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15775b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8165d(parcel, 2, this.f15776c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15777d, i2, false);
        boolean z = this.f15778e;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15779f;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
