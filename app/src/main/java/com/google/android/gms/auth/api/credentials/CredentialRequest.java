package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class CredentialRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new zbc();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15097b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f15098c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String[] f15099d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final CredentialPickerConfig f15100e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final CredentialPickerConfig f15101f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final boolean f15102g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15103h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final String f15104i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final boolean f15105j;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
    }

    @SafeParcelable.Constructor
    public CredentialRequest(@SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param String[] strArr, @Nullable @SafeParcelable.Param CredentialPickerConfig credentialPickerConfig, @Nullable @SafeParcelable.Param CredentialPickerConfig credentialPickerConfig2, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param boolean z3) {
        this.f15097b = i2;
        this.f15098c = z;
        Objects.requireNonNull(strArr, "null reference");
        this.f15099d = strArr;
        this.f15100e = credentialPickerConfig == null ? new CredentialPickerConfig.Builder().m7850a() : credentialPickerConfig;
        this.f15101f = credentialPickerConfig2 == null ? new CredentialPickerConfig.Builder().m7850a() : credentialPickerConfig2;
        if (i2 < 3) {
            this.f15102g = true;
            this.f15103h = null;
            this.f15104i = null;
        } else {
            this.f15102g = z2;
            this.f15103h = str;
            this.f15104i = str2;
        }
        this.f15105j = z3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        boolean z = this.f15098c;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8169h(parcel, 2, this.f15099d, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15100e, i2, false);
        SafeParcelWriter.m8167f(parcel, 4, this.f15101f, i2, false);
        boolean z2 = this.f15102g;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8168g(parcel, 6, this.f15103h, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15104i, false);
        boolean z3 = this.f15105j;
        parcel.writeInt(262152);
        parcel.writeInt(z3 ? 1 : 0);
        int i3 = this.f15097b;
        parcel.writeInt(263144);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
