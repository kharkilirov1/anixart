package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new zzm();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15030b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15031c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final Long f15032d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final boolean f15033e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final boolean f15034f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final List<String> f15035g;

    /* renamed from: h */
    @Nullable
    @SafeParcelable.Field
    public final String f15036h;

    @SafeParcelable.Constructor
    public TokenData(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param Long l2, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @Nullable @SafeParcelable.Param List<String> list, @Nullable @SafeParcelable.Param String str2) {
        this.f15030b = i2;
        Preconditions.m8129d(str);
        this.f15031c = str;
        this.f15032d = l2;
        this.f15033e = z;
        this.f15034f = z2;
        this.f15035g = list;
        this.f15036h = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f15031c, tokenData.f15031c) && Objects.m8123a(this.f15032d, tokenData.f15032d) && this.f15033e == tokenData.f15033e && this.f15034f == tokenData.f15034f && Objects.m8123a(this.f15035g, tokenData.f15035g) && Objects.m8123a(this.f15036h, tokenData.f15036h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15031c, this.f15032d, Boolean.valueOf(this.f15033e), Boolean.valueOf(this.f15034f), this.f15035g, this.f15036h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15030b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15031c, false);
        SafeParcelWriter.m8166e(parcel, 3, this.f15032d, false);
        boolean z = this.f15033e;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f15034f;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m8170i(parcel, 6, this.f15035g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f15036h, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
