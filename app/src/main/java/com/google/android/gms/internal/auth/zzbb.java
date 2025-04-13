package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f16047b = 1;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16048c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final PendingIntent f16049d;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param String str, @SafeParcelable.Param PendingIntent pendingIntent) {
        Objects.requireNonNull(str, "null reference");
        this.f16048c = str;
        Objects.requireNonNull(pendingIntent, "null reference");
        this.f16049d = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f16047b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f16048c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f16049d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
