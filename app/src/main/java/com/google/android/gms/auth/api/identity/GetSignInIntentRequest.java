package com.google.android.gms.auth.api.identity;

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
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbf();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15133b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15134c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public String f15135d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final String f15136e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f15137f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f15138g;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public GetSignInIntentRequest(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i2) {
        Objects.requireNonNull(str, "null reference");
        this.f15133b = str;
        this.f15134c = str2;
        this.f15135d = str3;
        this.f15136e = str4;
        this.f15137f = z;
        this.f15138g = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return com.google.android.gms.common.internal.Objects.m8123a(this.f15133b, getSignInIntentRequest.f15133b) && com.google.android.gms.common.internal.Objects.m8123a(this.f15136e, getSignInIntentRequest.f15136e) && com.google.android.gms.common.internal.Objects.m8123a(this.f15134c, getSignInIntentRequest.f15134c) && com.google.android.gms.common.internal.Objects.m8123a(Boolean.valueOf(this.f15137f), Boolean.valueOf(getSignInIntentRequest.f15137f)) && this.f15138g == getSignInIntentRequest.f15138g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15133b, this.f15134c, this.f15136e, Boolean.valueOf(this.f15137f), Integer.valueOf(this.f15138g)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15133b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15134c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15135d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f15136e, false);
        boolean z = this.f15137f;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.f15138g;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
