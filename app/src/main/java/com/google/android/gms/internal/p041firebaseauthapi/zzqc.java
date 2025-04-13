package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzqc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqc> CREATOR = new zzqd();

    /* renamed from: b */
    @SafeParcelable.Field
    public final Status f16695b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final zze f16696c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f16697d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final String f16698e;

    @SafeParcelable.Constructor
    public zzqc(@SafeParcelable.Param Status status, @SafeParcelable.Param zze zzeVar, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f16695b = status;
        this.f16696c = zzeVar;
        this.f16697d = str;
        this.f16698e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f16695b, i2, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f16696c, i2, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16697d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f16698e, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
