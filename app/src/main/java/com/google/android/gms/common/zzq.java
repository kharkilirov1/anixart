package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* renamed from: b */
    @SafeParcelable.Field
    public final boolean f15939b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15940c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15941d;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param boolean z, @SafeParcelable.Param String str, @SafeParcelable.Param int i2) {
        int i3;
        this.f15939b = z;
        this.f15940c = str;
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i4 = 0;
        while (true) {
            if (i4 >= 6) {
                i3 = 1;
                break;
            }
            i3 = iArr[i4];
            int i5 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i5 == i2) {
                break;
            } else {
                i4++;
            }
        }
        this.f15941d = i3 - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        boolean z = this.f15939b;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 2, this.f15940c, false);
        int i3 = this.f15941d;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
