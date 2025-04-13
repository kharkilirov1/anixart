package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzae();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public String f22327b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public String f22328c;

    /* renamed from: d */
    @SafeParcelable.Field
    public boolean f22329d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public String f22330e;

    /* renamed from: f */
    @SafeParcelable.Field
    public boolean f22331f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public String f22332g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public String f22333h;

    @SafeParcelable.Constructor
    public PhoneAuthCredential(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @Nullable @SafeParcelable.Param String str3, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param String str5) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        Preconditions.m8127b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f22327b = str;
        this.f22328c = str2;
        this.f22329d = z;
        this.f22330e = str3;
        this.f22331f = z2;
        this.f22332g = str4;
        this.f22333h = str5;
    }

    @NonNull
    /* renamed from: p */
    public static PhoneAuthCredential m12260p(@NonNull String str, @NonNull String str2) {
        return new PhoneAuthCredential(str, str2, false, null, true, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return clone();
    }

    @NonNull
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final PhoneAuthCredential clone() {
        return new PhoneAuthCredential(this.f22327b, this.f22328c, this.f22329d, this.f22330e, this.f22331f, this.f22332g, this.f22333h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22327b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22328c, false);
        boolean z = this.f22329d;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 4, this.f22330e, false);
        boolean z2 = this.f22331f;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 6, this.f22332g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f22333h, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
