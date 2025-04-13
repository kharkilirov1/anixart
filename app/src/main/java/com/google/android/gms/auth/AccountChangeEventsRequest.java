package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15024b;

    /* renamed from: c */
    @SafeParcelable.Field
    public int f15025c;

    /* renamed from: d */
    @SafeParcelable.Field
    @Deprecated
    public String f15026d;

    /* renamed from: e */
    @SafeParcelable.Field
    public Account f15027e;

    public AccountChangeEventsRequest() {
        this.f15024b = 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15024b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        int i4 = this.f15025c;
        parcel.writeInt(262146);
        parcel.writeInt(i4);
        SafeParcelWriter.m8168g(parcel, 3, this.f15026d, false);
        SafeParcelWriter.m8167f(parcel, 4, this.f15027e, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public AccountChangeEventsRequest(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param String str, @SafeParcelable.Param Account account) {
        this.f15024b = i2;
        this.f15025c = i3;
        this.f15026d = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f15027e = account;
        } else {
            this.f15027e = new Account(str, "com.google");
        }
    }
}
