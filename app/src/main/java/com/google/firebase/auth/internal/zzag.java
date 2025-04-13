package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorSession;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new zzah();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public String f22361b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public String f22362c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public List f22363d;

    public zzag() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22361b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22362c, false);
        SafeParcelWriter.m8172k(parcel, 3, this.f22363d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List list) {
        this.f22361b = str;
        this.f22362c = str2;
        this.f22363d = list;
    }
}
