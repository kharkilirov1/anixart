package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new zbu();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15223b;

    /* renamed from: c */
    @SafeParcelable.Field
    public GoogleSignInOptions f15224c;

    @SafeParcelable.Constructor
    public SignInConfiguration(@NonNull @SafeParcelable.Param String str, @NonNull @SafeParcelable.Param GoogleSignInOptions googleSignInOptions) {
        Preconditions.m8129d(str);
        this.f15223b = str;
        this.f15224c = googleSignInOptions;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f15223b.equals(signInConfiguration.f15223b)) {
            GoogleSignInOptions googleSignInOptions = this.f15224c;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f15224c;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.m7863a(this.f15223b);
        hashAccumulator.m7863a(this.f15224c);
        return hashAccumulator.f15222a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f15223b, false);
        SafeParcelWriter.m8167f(parcel, 5, this.f15224c, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
