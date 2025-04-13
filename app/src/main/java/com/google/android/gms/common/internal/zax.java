package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15780b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15781c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15782d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    @Deprecated
    public final Scope[] f15783e;

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @Nullable @SafeParcelable.Param Scope[] scopeArr) {
        this.f15780b = i2;
        this.f15781c = i3;
        this.f15782d = i4;
        this.f15783e = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15780b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f15781c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        int i5 = this.f15782d;
        parcel.writeInt(262147);
        parcel.writeInt(i5);
        SafeParcelWriter.m8171j(parcel, 4, this.f15783e, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
