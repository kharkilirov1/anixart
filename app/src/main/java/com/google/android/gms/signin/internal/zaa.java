package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f17208b;

    /* renamed from: c */
    @SafeParcelable.Field
    public int f17209c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public Intent f17210d;

    public zaa() {
        this.f17208b = 2;
        this.f17209c = 0;
        this.f17210d = null;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f17209c == 0 ? Status.f15374g : Status.f15378k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f17208b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f17209c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        SafeParcelWriter.m8167f(parcel, 3, this.f17210d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @Nullable @SafeParcelable.Param Intent intent) {
        this.f17208b = i2;
        this.f17209c = i3;
        this.f17210d = intent;
    }
}
