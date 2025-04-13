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
public final class zzpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzpb();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public final String f16656b;

    @SafeParcelable.Constructor
    public zzpa(@Nullable @SafeParcelable.Param String str) {
        this.f16656b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16656b, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
