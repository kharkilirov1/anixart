package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new zbj();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public final PendingIntent f15145b;

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenResult(@Nullable @SafeParcelable.Param PendingIntent pendingIntent) {
        this.f15145b = pendingIntent;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SaveAccountLinkingTokenResult) {
            return Objects.m8123a(this.f15145b, ((SaveAccountLinkingTokenResult) obj).f15145b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15145b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15145b, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
