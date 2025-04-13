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
public final class zzok extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzok> CREATOR = new zzol();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16640b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f16641c;

    @SafeParcelable.Constructor
    public zzok(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f16640b = str;
        this.f16641c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16640b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16641c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
