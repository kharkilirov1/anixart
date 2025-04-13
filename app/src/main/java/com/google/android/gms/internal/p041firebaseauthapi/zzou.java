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
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16650b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final ActionCodeSettings f16651c;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param ActionCodeSettings actionCodeSettings) {
        this.f16650b = str;
        this.f16651c = actionCodeSettings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16650b, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f16651c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
