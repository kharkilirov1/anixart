package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15219b;

    /* renamed from: c */
    @SafeParcelable.Field
    public int f15220c;

    /* renamed from: d */
    @SafeParcelable.Field
    public Bundle f15221d;

    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param Bundle bundle) {
        this.f15219b = i2;
        this.f15220c = i3;
        this.f15221d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15219b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f15220c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        SafeParcelWriter.m8163b(parcel, 3, this.f15221d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
