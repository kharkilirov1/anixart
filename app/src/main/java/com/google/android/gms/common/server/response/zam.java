package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15869b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15870c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final FastJsonResponse.Field<?, ?> f15871d;

    @SafeParcelable.Constructor
    public zam(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param FastJsonResponse.Field<?, ?> field) {
        this.f15869b = i2;
        this.f15870c = str;
        this.f15871d = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15869b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15870c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15871d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f15869b = 1;
        this.f15870c = str;
        this.f15871d = field;
    }
}
