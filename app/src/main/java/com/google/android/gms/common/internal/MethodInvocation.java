package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15724b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15725c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15726d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final long f15727e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final long f15728f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f15729g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15730h;

    /* renamed from: i */
    @SafeParcelable.Field
    public final int f15731i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final int f15732j;

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param int i5, @SafeParcelable.Param int i6) {
        this.f15724b = i2;
        this.f15725c = i3;
        this.f15726d = i4;
        this.f15727e = j2;
        this.f15728f = j3;
        this.f15729g = str;
        this.f15730h = str2;
        this.f15731i = i5;
        this.f15732j = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15724b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f15725c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        int i5 = this.f15726d;
        parcel.writeInt(262147);
        parcel.writeInt(i5);
        long j2 = this.f15727e;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        long j3 = this.f15728f;
        parcel.writeInt(524293);
        parcel.writeLong(j3);
        SafeParcelWriter.m8168g(parcel, 6, this.f15729g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15730h, false);
        int i6 = this.f15731i;
        parcel.writeInt(262152);
        parcel.writeInt(i6);
        int i7 = this.f15732j;
        parcel.writeInt(262153);
        parcel.writeInt(i7);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
