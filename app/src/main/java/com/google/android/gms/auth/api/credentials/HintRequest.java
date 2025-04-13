package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<HintRequest> CREATOR = new zbe();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15106b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final CredentialPickerConfig f15107c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15108d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15109e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final String[] f15110f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f15111g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15112h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f15113i;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        public Builder() {
            new CredentialPickerConfig.Builder().m7850a();
        }
    }

    @SafeParcelable.Constructor
    public HintRequest(@SafeParcelable.Param int i2, @SafeParcelable.Param CredentialPickerConfig credentialPickerConfig, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param boolean z3, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2) {
        this.f15106b = i2;
        Objects.requireNonNull(credentialPickerConfig, "null reference");
        this.f15107c = credentialPickerConfig;
        this.f15108d = z;
        this.f15109e = z2;
        Objects.requireNonNull(strArr, "null reference");
        this.f15110f = strArr;
        if (i2 < 2) {
            this.f15111g = true;
            this.f15112h = null;
            this.f15113i = null;
        } else {
            this.f15111g = z3;
            this.f15112h = str;
            this.f15113i = str2;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15107c, i2, false);
        boolean z = this.f15108d;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15109e;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8169h(parcel, 4, this.f15110f, false);
        boolean z3 = this.f15111g;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 6, this.f15112h, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15113i, false);
        int i3 = this.f15106b;
        parcel.writeInt(263144);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
