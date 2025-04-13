package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzqe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqe> CREATOR = new zzqf();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16699b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final List f16700c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final zze f16701d;

    @SafeParcelable.Constructor
    public zzqe(@SafeParcelable.Param String str, @SafeParcelable.Param List list, @Nullable @SafeParcelable.Param zze zzeVar) {
        this.f16699b = str;
        this.f16700c = list;
        this.f16701d = zzeVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16699b, false);
        SafeParcelWriter.m8172k(parcel, 2, this.f16700c, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f16701d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
