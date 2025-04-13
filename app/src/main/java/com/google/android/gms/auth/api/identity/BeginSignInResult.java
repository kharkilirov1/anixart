package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbb();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PendingIntent f15131b;

    @SafeParcelable.Constructor
    public BeginSignInResult(@NonNull @SafeParcelable.Param PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "null reference");
        this.f15131b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15131b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
