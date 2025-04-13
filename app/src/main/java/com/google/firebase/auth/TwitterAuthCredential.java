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
public class TwitterAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzai();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f22340b;

    /* renamed from: c */
    @SafeParcelable.Field
    public String f22341c;

    @SafeParcelable.Constructor
    public TwitterAuthCredential(@NonNull @SafeParcelable.Param String str, @NonNull @SafeParcelable.Param String str2) {
        Preconditions.m8129d(str);
        this.f22340b = str;
        Preconditions.m8129d(str2);
        this.f22341c = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new TwitterAuthCredential(this.f22340b, this.f22341c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22340b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22341c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
