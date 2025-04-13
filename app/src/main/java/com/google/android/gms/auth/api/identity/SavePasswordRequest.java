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
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbk();

    /* renamed from: b */
    @SafeParcelable.Field
    public final SignInPassword f15146b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15147c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final int f15148d;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param SignInPassword signInPassword, @Nullable @SafeParcelable.Param String str, @SafeParcelable.Param int i2) {
        Objects.requireNonNull(signInPassword, "null reference");
        this.f15146b = signInPassword;
        this.f15147c = str;
        this.f15148d = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return com.google.android.gms.common.internal.Objects.m8123a(this.f15146b, savePasswordRequest.f15146b) && com.google.android.gms.common.internal.Objects.m8123a(this.f15147c, savePasswordRequest.f15147c) && this.f15148d == savePasswordRequest.f15148d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15146b, this.f15147c});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15146b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15147c, false);
        int i3 = this.f15148d;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
