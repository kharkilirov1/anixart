package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@ShowFirstParty
@KeepForSdkWithMembers
@SafeParcelable.Class
/* loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15167b;

    /* renamed from: c */
    @NonNull
    @SafeParcelable.Field
    public final PendingIntent f15168c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15169d;

    /* renamed from: e */
    @NonNull
    @SafeParcelable.Field
    public final byte[] f15170e;

    /* renamed from: f */
    @SafeParcelable.VersionField
    public final int f15171f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final Bundle f15172g;

    @SafeParcelable.Constructor
    public ProxyResponse(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param int i4, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param byte[] bArr) {
        this.f15171f = i2;
        this.f15167b = i3;
        this.f15169d = i4;
        this.f15172g = bundle;
        this.f15170e = bArr;
        this.f15168c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15167b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f15168c, i2, false);
        int i4 = this.f15169d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        SafeParcelWriter.m8163b(parcel, 4, this.f15172g, false);
        SafeParcelWriter.m8164c(parcel, 5, this.f15170e, false);
        int i5 = this.f15171f;
        parcel.writeInt(263144);
        parcel.writeInt(i5);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
