package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SavePasswordResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordResult> CREATOR = new zbl();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PendingIntent f15149b;

    @SafeParcelable.Constructor
    public SavePasswordResult(@NonNull @SafeParcelable.Param PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "null reference");
        this.f15149b = pendingIntent;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SavePasswordResult) {
            return com.google.android.gms.common.internal.Objects.m8123a(this.f15149b, ((SavePasswordResult) obj).f15149b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15149b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15149b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
