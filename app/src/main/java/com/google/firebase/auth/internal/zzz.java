package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();

    /* renamed from: b */
    @SafeParcelable.Field
    public final long f22449b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final long f22450c;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param long j2, @SafeParcelable.Param long j3) {
        this.f22449b = j2;
        this.f22450c = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        long j2 = this.f22449b;
        parcel.writeInt(524289);
        parcel.writeLong(j2);
        long j3 = this.f22450c;
        parcel.writeInt(524290);
        parcel.writeLong(j3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
