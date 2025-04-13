package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16642b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16643c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f16644d;

    @SafeParcelable.Constructor
    public zzom(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f16642b = str;
        this.f16643c = str2;
        this.f16644d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16642b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16643c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16644d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
