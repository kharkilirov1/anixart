package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zbo();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15158b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15159c;

    @SafeParcelable.Constructor
    public SignInPassword(@NonNull @SafeParcelable.Param String str, @NonNull @SafeParcelable.Param String str2) {
        Preconditions.m8132g(str, "Account identifier cannot be null");
        String trim = str.trim();
        Preconditions.m8130e(trim, "Account identifier cannot be empty");
        this.f15158b = trim;
        Preconditions.m8129d(str2);
        this.f15159c = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return Objects.m8123a(this.f15158b, signInPassword.f15158b) && Objects.m8123a(this.f15159c, signInPassword.f15159c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15158b, this.f15159c});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15158b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15159c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
