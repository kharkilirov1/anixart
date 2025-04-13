package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GoogleAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new zzaa();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public final String f22325b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f22326c;

    @SafeParcelable.Constructor
    public GoogleAuthCredential(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f22325b = str;
        this.f22326c = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new GoogleAuthCredential(this.f22325b, this.f22326c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22325b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22326c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
