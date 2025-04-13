package com.google.android.gms.auth.api.proxy;

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
public class ProxyRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();

    /* renamed from: b */
    @NonNull
    @SafeParcelable.Field
    public final String f15161b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15162c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final long f15163d;

    /* renamed from: e */
    @NonNull
    @SafeParcelable.Field
    public final byte[] f15164e;

    /* renamed from: f */
    @SafeParcelable.VersionField
    public final int f15165f;

    /* renamed from: g */
    @SafeParcelable.Field
    public Bundle f15166g;

    /* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
    @ShowFirstParty
    @KeepForSdkWithMembers
    public static class Builder {
    }

    @SafeParcelable.Constructor
    public ProxyRequest(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3, @SafeParcelable.Param long j2, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param Bundle bundle) {
        this.f15165f = i2;
        this.f15161b = str;
        this.f15162c = i3;
        this.f15163d = j2;
        this.f15164e = bArr;
        this.f15166g = bundle;
    }

    @NonNull
    public String toString() {
        String str = this.f15161b;
        int i2 = this.f15162c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i2);
        sb.append(" ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15161b, false);
        int i3 = this.f15162c;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        long j2 = this.f15163d;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        SafeParcelWriter.m8164c(parcel, 4, this.f15164e, false);
        SafeParcelWriter.m8163b(parcel, 5, this.f15166g, false);
        int i4 = this.f15165f;
        parcel.writeInt(263144);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
