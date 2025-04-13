package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzp implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f22422b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f22423c;

    /* renamed from: d */
    public final Map f22424d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f22425e;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z) {
        Preconditions.m8129d(str);
        Preconditions.m8129d(str2);
        this.f22422b = str;
        this.f22423c = str2;
        this.f22424d = zzaz.m12306c(str2);
        this.f22425e = z;
    }

    public zzp(boolean z) {
        this.f22425e = z;
        this.f22423c = null;
        this.f22422b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22422b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22423c, false);
        boolean z = this.f22425e;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
