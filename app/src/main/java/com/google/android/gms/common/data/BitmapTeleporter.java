package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15620b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public ParcelFileDescriptor f15621c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15622d;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param int i2, @SafeParcelable.Param ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param int i3) {
        this.f15620b = i2;
        this.f15621c = parcelFileDescriptor;
        this.f15622d = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        if (this.f15621c == null) {
            Objects.requireNonNull((Object) null, "null reference");
            throw null;
        }
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15620b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8167f(parcel, 2, this.f15621c, i2 | 1, false);
        int i4 = this.f15622d;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
        this.f15621c = null;
    }
}
