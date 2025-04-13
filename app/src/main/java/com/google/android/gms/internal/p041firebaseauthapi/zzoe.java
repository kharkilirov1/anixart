package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzof();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PhoneAuthCredential f16634b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16635c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f16636d;

    @SafeParcelable.Constructor
    public zzoe(@SafeParcelable.Param PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f16634b = phoneAuthCredential;
        this.f16635c = str;
        this.f16636d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16634b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16635c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16636d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
