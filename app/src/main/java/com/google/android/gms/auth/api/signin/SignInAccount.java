package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();

    /* renamed from: b */
    @SafeParcelable.Field
    @Deprecated
    public String f15216b;

    /* renamed from: c */
    @SafeParcelable.Field
    public GoogleSignInAccount f15217c;

    /* renamed from: d */
    @SafeParcelable.Field
    @Deprecated
    public String f15218d;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param String str, @SafeParcelable.Param GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param String str2) {
        this.f15217c = googleSignInAccount;
        Preconditions.m8130e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f15216b = str;
        Preconditions.m8130e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f15218d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 4, this.f15216b, false);
        SafeParcelWriter.m8167f(parcel, 7, this.f15217c, i2, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f15218d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
