package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f17213b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final zat f17214c;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param int i2, @SafeParcelable.Param zat zatVar) {
        this.f17213b = i2;
        this.f17214c = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f17213b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f17214c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
