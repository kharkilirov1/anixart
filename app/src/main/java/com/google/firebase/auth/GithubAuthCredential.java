package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class GithubAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new zzz();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f22324b;

    @SafeParcelable.Constructor
    public GithubAuthCredential(@SafeParcelable.Param String str) {
        Preconditions.m8129d(str);
        this.f22324b = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new GithubAuthCredential(this.f22324b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22324b, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
