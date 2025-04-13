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
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f16044b = 1;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16045c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final byte[] f16046d;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param String str, @SafeParcelable.Param byte[] bArr) {
        Objects.requireNonNull(str, "null reference");
        this.f16045c = str;
        Objects.requireNonNull(bArr, "null reference");
        this.f16046d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f16044b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f16045c, false);
        SafeParcelWriter.m8164c(parcel, 3, this.f16046d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
