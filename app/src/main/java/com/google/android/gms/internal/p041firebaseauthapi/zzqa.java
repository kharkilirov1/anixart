package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqa> CREATOR = new zzqb();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16692b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16693c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final ActionCodeSettings f16694d;

    @SafeParcelable.Constructor
    public zzqa(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param ActionCodeSettings actionCodeSettings) {
        this.f16692b = str;
        this.f16693c = str2;
        this.f16694d = actionCodeSettings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16692b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16693c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f16694d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
