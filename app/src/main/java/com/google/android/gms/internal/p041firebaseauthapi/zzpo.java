package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new zzpp();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f16667b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f16668c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f16669d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final long f16670e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f16671f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f16672g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f16673h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f16674i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final boolean f16675j;

    @SafeParcelable.Constructor
    public zzpo(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str4, @Nullable @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z3) {
        this.f16667b = str;
        this.f16668c = str2;
        this.f16669d = str3;
        this.f16670e = j2;
        this.f16671f = z;
        this.f16672g = z2;
        this.f16673h = str4;
        this.f16674i = str5;
        this.f16675j = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f16667b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f16668c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f16669d, false);
        long j2 = this.f16670e;
        parcel.writeInt(524292);
        parcel.writeLong(j2);
        boolean z = this.f16671f;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f16672g;
        parcel.writeInt(262150);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 7, this.f16673h, false);
        SafeParcelWriter.m8168g(parcel, 8, this.f16674i, false);
        boolean z3 = this.f16675j;
        parcel.writeInt(262153);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
