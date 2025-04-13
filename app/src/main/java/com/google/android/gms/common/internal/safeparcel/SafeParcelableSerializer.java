package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class SafeParcelableSerializer {
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <T extends SafeParcelable> T m8176a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        Objects.requireNonNull(creator, "null reference");
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
