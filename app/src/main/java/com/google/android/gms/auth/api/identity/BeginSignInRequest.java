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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zba();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PasswordRequestOptions f15116b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final GoogleIdTokenRequestOptions f15117c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f15118d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15119e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f15120f;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        public Builder() {
            new PasswordRequestOptions.Builder().f15130a = false;
            new PasswordRequestOptions(false);
            new GoogleIdTokenRequestOptions.Builder().f15128a = false;
            new GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @SafeParcelable.Class
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbg();

        /* renamed from: b */
        @SafeParcelable.Field
        public final boolean f15121b;

        /* renamed from: c */
        @Nullable
        @SafeParcelable.Field
        public final String f15122c;

        /* renamed from: d */
        @Nullable
        @SafeParcelable.Field
        public final String f15123d;

        /* renamed from: e */
        @SafeParcelable.Field
        public final boolean f15124e;

        /* renamed from: f */
        @Nullable
        @SafeParcelable.Field
        public final String f15125f;

        /* renamed from: g */
        @Nullable
        @SafeParcelable.Field
        public final List f15126g;

        /* renamed from: h */
        @SafeParcelable.Field
        public final boolean f15127h;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        public static final class Builder {

            /* renamed from: a */
            public boolean f15128a = false;
        }

        @SafeParcelable.Constructor
        public GoogleIdTokenRequestOptions(@SafeParcelable.Param boolean z, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param List list, @SafeParcelable.Param boolean z3) {
            Preconditions.m8127b((z2 && z3) ? false : true, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f15121b = z;
            if (z) {
                Preconditions.m8132g(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f15122c = str;
            this.f15123d = str2;
            this.f15124e = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f15126g = arrayList;
            this.f15125f = str3;
            this.f15127h = z3;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f15121b == googleIdTokenRequestOptions.f15121b && Objects.m8123a(this.f15122c, googleIdTokenRequestOptions.f15122c) && Objects.m8123a(this.f15123d, googleIdTokenRequestOptions.f15123d) && this.f15124e == googleIdTokenRequestOptions.f15124e && Objects.m8123a(this.f15125f, googleIdTokenRequestOptions.f15125f) && Objects.m8123a(this.f15126g, googleIdTokenRequestOptions.f15126g) && this.f15127h == googleIdTokenRequestOptions.f15127h;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15121b), this.f15122c, this.f15123d, Boolean.valueOf(this.f15124e), this.f15125f, this.f15126g, Boolean.valueOf(this.f15127h)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
            boolean z = this.f15121b;
            parcel.writeInt(262145);
            parcel.writeInt(z ? 1 : 0);
            SafeParcelWriter.m8168g(parcel, 2, this.f15122c, false);
            SafeParcelWriter.m8168g(parcel, 3, this.f15123d, false);
            boolean z2 = this.f15124e;
            parcel.writeInt(262148);
            parcel.writeInt(z2 ? 1 : 0);
            SafeParcelWriter.m8168g(parcel, 5, this.f15125f, false);
            SafeParcelWriter.m8170i(parcel, 6, this.f15126g, false);
            boolean z3 = this.f15127h;
            parcel.writeInt(262151);
            parcel.writeInt(z3 ? 1 : 0);
            SafeParcelWriter.m8174m(parcel, m8173l);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @SafeParcelable.Class
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbh();

        /* renamed from: b */
        @SafeParcelable.Field
        public final boolean f15129b;

        /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
        public static final class Builder {

            /* renamed from: a */
            public boolean f15130a = false;
        }

        @SafeParcelable.Constructor
        public PasswordRequestOptions(@SafeParcelable.Param boolean z) {
            this.f15129b = z;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f15129b == ((PasswordRequestOptions) obj).f15129b;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15129b)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
            boolean z = this.f15129b;
            parcel.writeInt(262145);
            parcel.writeInt(z ? 1 : 0);
            SafeParcelWriter.m8174m(parcel, m8173l);
        }
    }

    @SafeParcelable.Constructor
    public BeginSignInRequest(@SafeParcelable.Param PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @Nullable @SafeParcelable.Param String str, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i2) {
        java.util.Objects.requireNonNull(passwordRequestOptions, "null reference");
        this.f15116b = passwordRequestOptions;
        java.util.Objects.requireNonNull(googleIdTokenRequestOptions, "null reference");
        this.f15117c = googleIdTokenRequestOptions;
        this.f15118d = str;
        this.f15119e = z;
        this.f15120f = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.m8123a(this.f15116b, beginSignInRequest.f15116b) && Objects.m8123a(this.f15117c, beginSignInRequest.f15117c) && Objects.m8123a(this.f15118d, beginSignInRequest.f15118d) && this.f15119e == beginSignInRequest.f15119e && this.f15120f == beginSignInRequest.f15120f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15116b, this.f15117c, this.f15118d, Boolean.valueOf(this.f15119e)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15116b, i2, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f15117c, i2, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15118d, false);
        boolean z = this.f15119e;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        int i3 = this.f15120f;
        parcel.writeInt(262149);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
