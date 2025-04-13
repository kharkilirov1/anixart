package com.google.android.gms.auth.api.identity;

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
public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new zbe();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15132b;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public GetPhoneNumberHintIntentRequest(@SafeParcelable.Param int i2) {
        this.f15132b = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof GetPhoneNumberHintIntentRequest) {
            return Objects.m8123a(Integer.valueOf(this.f15132b), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f15132b));
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15132b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15132b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
