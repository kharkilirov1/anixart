package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzaj();

    /* renamed from: b */
    @Nullable
    @SafeParcelable.Field
    public String f22342b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public String f22343c;

    /* renamed from: d */
    @SafeParcelable.Field
    public boolean f22344d;

    /* renamed from: e */
    @SafeParcelable.Field
    public boolean f22345e;

    /* renamed from: f */
    @Nullable
    public Uri f22346f;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    public static class Builder {
    }

    @SafeParcelable.Constructor
    public UserProfileChangeRequest(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2) {
        this.f22342b = str;
        this.f22343c = str2;
        this.f22344d = z;
        this.f22345e = z2;
        this.f22346f = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 2, this.f22342b, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22343c, false);
        boolean z = this.f22344d;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f22345e;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
