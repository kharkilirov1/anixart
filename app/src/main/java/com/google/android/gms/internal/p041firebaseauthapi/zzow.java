package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16652b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final ActionCodeSettings f16653c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f16654d;

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param String str, @SafeParcelable.Param ActionCodeSettings actionCodeSettings, @Nullable @SafeParcelable.Param String str2) {
        this.f16652b = str;
        this.f16653c = actionCodeSettings;
        this.f16654d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16652b, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f16653c, i2, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16654d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
