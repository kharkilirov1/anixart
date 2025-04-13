package com.google.android.gms.auth.api.identity;

import android.net.Uri;
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
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbm();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f15150b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f15151c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f15152d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final String f15153e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final Uri f15154f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f15155g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15156h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f15157i;

    @SafeParcelable.Constructor
    public SignInCredential(@NonNull @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param Uri uri, @Nullable @SafeParcelable.Param String str5, @Nullable @SafeParcelable.Param String str6, @Nullable @SafeParcelable.Param String str7) {
        Preconditions.m8129d(str);
        this.f15150b = str;
        this.f15151c = str2;
        this.f15152d = str3;
        this.f15153e = str4;
        this.f15154f = uri;
        this.f15155g = str5;
        this.f15156h = str6;
        this.f15157i = str7;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return Objects.m8123a(this.f15150b, signInCredential.f15150b) && Objects.m8123a(this.f15151c, signInCredential.f15151c) && Objects.m8123a(this.f15152d, signInCredential.f15152d) && Objects.m8123a(this.f15153e, signInCredential.f15153e) && Objects.m8123a(this.f15154f, signInCredential.f15154f) && Objects.m8123a(this.f15155g, signInCredential.f15155g) && Objects.m8123a(this.f15156h, signInCredential.f15156h) && Objects.m8123a(this.f15157i, signInCredential.f15157i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15150b, this.f15151c, this.f15152d, this.f15153e, this.f15154f, this.f15155g, this.f15156h, this.f15157i});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f15150b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15151c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15152d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f15153e, false);
        SafeParcelWriter.m8167f(parcel, 5, this.f15154f, i2, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f15155g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15156h, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f15157i, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
