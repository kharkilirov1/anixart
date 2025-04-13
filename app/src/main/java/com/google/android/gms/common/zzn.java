package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15934b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f15935c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15936d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final Context f15937e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f15938f;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param IBinder iBinder, @SafeParcelable.Param boolean z3) {
        this.f15934b = str;
        this.f15935c = z;
        this.f15936d = z2;
        this.f15937e = (Context) ObjectWrapper.m8284t(IObjectWrapper.Stub.m8283q(iBinder));
        this.f15938f = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15934b, false);
        boolean z = this.f15935c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15936d;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8165d(parcel, 4, new ObjectWrapper(this.f15937e), false);
        boolean z3 = this.f15938f;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
