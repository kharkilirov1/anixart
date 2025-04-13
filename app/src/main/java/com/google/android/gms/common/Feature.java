package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15321b;

    /* renamed from: c */
    @SafeParcelable.Field
    @Deprecated
    public final int f15322c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final long f15323d;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param String str, @SafeParcelable.Param int i2, @SafeParcelable.Param long j2) {
        this.f15321b = str;
        this.f15322c = i2;
        this.f15323d = j2;
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j2) {
        this.f15321b = str;
        this.f15323d = j2;
        this.f15322c = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f15321b;
            if (((str != null && str.equals(feature.f15321b)) || (this.f15321b == null && feature.f15321b == null)) && m7915m() == feature.m7915m()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15321b, Long.valueOf(m7915m())});
    }

    @KeepForSdk
    /* renamed from: m */
    public long m7915m() {
        long j2 = this.f15323d;
        return j2 == -1 ? this.f15322c : j2;
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("name", this.f15321b);
        toStringHelper.m8124a("version", Long.valueOf(m7915m()));
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15321b, false);
        int i3 = this.f15322c;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        long m7915m = m7915m();
        parcel.writeInt(524291);
        parcel.writeLong(m7915m);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
