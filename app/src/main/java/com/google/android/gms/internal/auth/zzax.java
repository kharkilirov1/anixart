package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f16042b = 1;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16043c;

    @SafeParcelable.Constructor
    public zzax(@SafeParcelable.Param String str) {
        Objects.requireNonNull(str, "null reference");
        this.f16043c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f16042b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f16043c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
