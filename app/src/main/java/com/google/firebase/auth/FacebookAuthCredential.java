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
public class FacebookAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new zzh();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f22305b;

    @SafeParcelable.Constructor
    public FacebookAuthCredential(@SafeParcelable.Param String str) {
        Preconditions.m8129d(str);
        this.f22305b = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new FacebookAuthCredential(this.f22305b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22305b, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
