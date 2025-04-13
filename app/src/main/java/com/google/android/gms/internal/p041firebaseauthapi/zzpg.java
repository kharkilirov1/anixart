package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpg> CREATOR = new zzph();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16659b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f16660c;

    @SafeParcelable.Constructor
    public zzpg(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f16659b = str;
        this.f16660c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16659b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16660c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
