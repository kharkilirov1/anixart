package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpk> CREATOR = new zzpl();

    /* renamed from: b */
    @SafeParcelable.Field
    public final EmailAuthCredential f16664b;

    @SafeParcelable.Constructor
    public zzpk(@SafeParcelable.Param EmailAuthCredential emailAuthCredential) {
        this.f16664b = emailAuthCredential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16664b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
