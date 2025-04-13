package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new zza();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15372b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15373c;

    @SafeParcelable.Constructor
    public Scope(@SafeParcelable.Param int i2, @SafeParcelable.Param String str) {
        Preconditions.m8130e(str, "scopeUri must not be null or empty");
        this.f15372b = i2;
        this.f15373c = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f15373c.equals(((Scope) obj).f15373c);
        }
        return false;
    }

    public int hashCode() {
        return this.f15373c.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f15373c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15372b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15373c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public Scope(@NonNull String str) {
        Preconditions.m8130e(str, "scopeUri must not be null or empty");
        this.f15372b = 1;
        this.f15373c = str;
    }
}
