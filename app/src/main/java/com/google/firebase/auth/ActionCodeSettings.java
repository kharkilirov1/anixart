package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zzc();

    /* renamed from: b */
    @SafeParcelable.Field
    public final String f22287b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f22288c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f22289d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final String f22290e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f22291f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final String f22292g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final boolean f22293h;

    /* renamed from: i */
    @SafeParcelable.Field
    public String f22294i;

    /* renamed from: j */
    @SafeParcelable.Field
    public int f22295j;

    /* renamed from: k */
    @SafeParcelable.Field
    public String f22296k;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    public static class Builder {
    }

    @SafeParcelable.Constructor
    public ActionCodeSettings(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param boolean z, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str6, @SafeParcelable.Param int i2, @SafeParcelable.Param String str7) {
        this.f22287b = str;
        this.f22288c = str2;
        this.f22289d = str3;
        this.f22290e = str4;
        this.f22291f = z;
        this.f22292g = str5;
        this.f22293h = z2;
        this.f22294i = str6;
        this.f22295j = i2;
        this.f22296k = str7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8168g(parcel, 1, this.f22287b, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f22288c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22289d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f22290e, false);
        boolean z = this.f22291f;
        parcel.writeInt(262149);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 6, this.f22292g, false);
        boolean z2 = this.f22293h;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 8, this.f22294i, false);
        int i3 = this.f22295j;
        parcel.writeInt(262153);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 10, this.f22296k, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
