package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p041firebaseauthapi.zzxq;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f22451b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public final String f22452c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f22453d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final zzxq f22454e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final String f22455f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f22456g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f22457h;

    @SafeParcelable.Constructor
    public zze(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param zzxq zzxqVar, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param String str5, @Nullable @SafeParcelable.Param String str6) {
        this.f22451b = com.google.android.gms.internal.p041firebaseauthapi.zzag.m8816b(str);
        this.f22452c = str2;
        this.f22453d = str3;
        this.f22454e = zzxqVar;
        this.f22455f = str4;
        this.f22456g = str5;
        this.f22457h = str6;
    }

    /* renamed from: o */
    public static zze m12325o(zzxq zzxqVar) {
        Preconditions.m8132g(zzxqVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzxqVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    /* renamed from: m */
    public final String mo12229m() {
        return this.f22451b;
    }

    @Override // com.google.firebase.auth.AuthCredential
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new zze(this.f22451b, this.f22452c, this.f22453d, this.f22454e, this.f22455f, this.f22456g, this.f22457h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22451b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22452c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22453d, false);
        SafeParcelWriter.m8167f(parcel, 4, this.f22454e, i2, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f22455f, false);
        SafeParcelWriter.m8168g(parcel, 6, this.f22456g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f22457h, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
