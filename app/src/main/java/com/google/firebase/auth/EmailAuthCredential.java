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
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzg();

    /* renamed from: b */
    @SafeParcelable.Field
    public String f22300b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public String f22301c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f22302d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public String f22303e;

    /* renamed from: f */
    @SafeParcelable.Field
    public boolean f22304f;

    @SafeParcelable.Constructor
    public EmailAuthCredential(@SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z) {
        Preconditions.m8129d(str);
        this.f22300b = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f22301c = str2;
        this.f22302d = str3;
        this.f22303e = str4;
        this.f22304f = z;
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: m */
    public String mo12229m() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    @NonNull
    /* renamed from: n */
    public final AuthCredential mo12230n() {
        return new EmailAuthCredential(this.f22300b, this.f22301c, this.f22302d, this.f22303e, this.f22304f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22300b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22301c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22302d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f22303e, false);
        boolean z = this.f22304f;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
