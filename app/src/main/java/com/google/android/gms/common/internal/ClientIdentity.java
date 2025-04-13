package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class ClientIdentity extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();

    /* renamed from: b */
    @KeepForSdk
    @SafeParcelable.Field
    public final int f15679b;

    /* renamed from: c */
    @Nullable
    @KeepForSdk
    @SafeParcelable.Field
    public final String f15680c;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param String str) {
        this.f15679b = i2;
        this.f15680c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f15679b == this.f15679b && Objects.m8123a(clientIdentity.f15680c, this.f15680c);
    }

    public final int hashCode() {
        return this.f15679b;
    }

    @NonNull
    public final String toString() {
        int i2 = this.f15679b;
        String str = this.f15680c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15679b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15680c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
