package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15771b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final Account f15772c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15773d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final GoogleSignInAccount f15774e;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param int i2, @SafeParcelable.Param Account account, @SafeParcelable.Param int i3, @Nullable @SafeParcelable.Param GoogleSignInAccount googleSignInAccount) {
        this.f15771b = i2;
        this.f15772c = account;
        this.f15773d = i3;
        this.f15774e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15771b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f15772c, i2, false);
        int i4 = this.f15773d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        SafeParcelWriter.m8167f(parcel, 4, this.f15774e, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zat(Account account, int i2, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f15771b = 2;
        this.f15772c = account;
        this.f15773d = i2;
        this.f15774e = googleSignInAccount;
    }
}
