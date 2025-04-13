package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15640b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final Uri f15641c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15642d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final int f15643e;

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param int i2, @SafeParcelable.Param Uri uri, @SafeParcelable.Param int i3, @SafeParcelable.Param int i4) {
        this.f15640b = i2;
        this.f15641c = uri;
        this.f15642d = i3;
        this.f15643e = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.m8123a(this.f15641c, webImage.f15641c) && this.f15642d == webImage.f15642d && this.f15643e == webImage.f15643e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15641c, Integer.valueOf(this.f15642d), Integer.valueOf(this.f15643e)});
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f15642d), Integer.valueOf(this.f15643e), this.f15641c.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15640b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f15641c, i2, false);
        int i4 = this.f15642d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        int i5 = this.f15643e;
        parcel.writeInt(262148);
        parcel.writeInt(i5);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
