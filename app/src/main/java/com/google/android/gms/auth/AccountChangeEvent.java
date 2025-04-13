package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15018b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final long f15019c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f15020d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final int f15021e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f15022f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f15023g;

    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param int i2, @SafeParcelable.Param long j2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4, @SafeParcelable.Param String str2) {
        this.f15018b = i2;
        this.f15019c = j2;
        Objects.requireNonNull(str, "null reference");
        this.f15020d = str;
        this.f15021e = i3;
        this.f15022f = i4;
        this.f15023g = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f15018b == accountChangeEvent.f15018b && this.f15019c == accountChangeEvent.f15019c && com.google.android.gms.common.internal.Objects.m8123a(this.f15020d, accountChangeEvent.f15020d) && this.f15021e == accountChangeEvent.f15021e && this.f15022f == accountChangeEvent.f15022f && com.google.android.gms.common.internal.Objects.m8123a(this.f15023g, accountChangeEvent.f15023g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15018b), Long.valueOf(this.f15019c), this.f15020d, Integer.valueOf(this.f15021e), Integer.valueOf(this.f15022f), this.f15023g});
    }

    @NonNull
    public String toString() {
        int i2 = this.f15021e;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f15020d;
        String str3 = this.f15023g;
        int i3 = this.f15022f;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        C0000a.m2C(sb, "AccountChangeEvent {accountName = ", str2, ", changeType = ", str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15018b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        long j2 = this.f15019c;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        SafeParcelWriter.m8168g(parcel, 3, this.f15020d, false);
        int i4 = this.f15021e;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        int i5 = this.f15022f;
        parcel.writeInt(262149);
        parcel.writeInt(i5);
        SafeParcelWriter.m8168g(parcel, 6, this.f15023g, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
