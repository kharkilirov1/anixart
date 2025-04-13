package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();

    /* renamed from: b */
    @SafeParcelable.Field
    public final List<String> f17211b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f17212c;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param List<String> list, @Nullable @SafeParcelable.Param String str) {
        this.f17211b = list;
        this.f17212c = str;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f17212c != null ? Status.f15374g : Status.f15378k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8170i(parcel, 1, this.f17211b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f17212c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
