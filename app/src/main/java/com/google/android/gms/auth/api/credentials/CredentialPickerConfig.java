package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zbb();

    /* renamed from: b */
    @SafeParcelable.Field
    public final int f15093b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final boolean f15094c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final boolean f15095d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final int f15096e;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static class Builder {
        @NonNull
        /* renamed from: a */
        public CredentialPickerConfig m7850a() {
            return new CredentialPickerConfig(2, false, true, false, 1);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param int i3) {
        this.f15093b = i2;
        this.f15094c = z;
        this.f15095d = z2;
        if (i2 < 2) {
            this.f15096e = true == z3 ? 3 : 1;
        } else {
            this.f15096e = i3;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        boolean z = this.f15094c;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15095d;
        parcel.writeInt(262146);
        parcel.writeInt(z2 ? 1 : 0);
        int i3 = this.f15096e == 3 ? 1 : 0;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        int i4 = this.f15096e;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        int i5 = this.f15093b;
        parcel.writeInt(263144);
        parcel.writeInt(i5);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
