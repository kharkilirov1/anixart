package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<IdToken> CREATOR = new zbf();

    /* renamed from: b */
    @NonNull
    @SafeParcelable.Field
    public final String f15114b;

    /* renamed from: c */
    @NonNull
    @SafeParcelable.Field
    public final String f15115c;

    @SafeParcelable.Constructor
    public IdToken(@NonNull @SafeParcelable.Param String str, @NonNull @SafeParcelable.Param String str2) {
        Preconditions.m8127b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        Preconditions.m8127b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f15114b = str;
        this.f15115c = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return Objects.m8123a(this.f15114b, idToken.f15114b) && Objects.m8123a(this.f15115c, idToken.f15115c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15114b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15115c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
