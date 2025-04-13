package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new zzc();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15028b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final List<AccountChangeEvent> f15029c;

    @SafeParcelable.Constructor
    public AccountChangeEventsResponse(@SafeParcelable.Param int i2, @SafeParcelable.Param List<AccountChangeEvent> list) {
        this.f15028b = i2;
        Objects.requireNonNull(list, "null reference");
        this.f15029c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15028b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8172k(parcel, 2, this.f15029c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
