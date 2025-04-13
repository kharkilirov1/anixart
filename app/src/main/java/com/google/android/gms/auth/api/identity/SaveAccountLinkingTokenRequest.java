package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbi();

    /* renamed from: b */
    @SafeParcelable.Field
    public final PendingIntent f15139b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15140c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f15141d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final List f15142e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final String f15143f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final int f15144g;

    /* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenRequest(@SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List list, @Nullable @SafeParcelable.Param String str3, @SafeParcelable.Param int i2) {
        this.f15139b = pendingIntent;
        this.f15140c = str;
        this.f15141d = str2;
        this.f15142e = list;
        this.f15143f = str3;
        this.f15144g = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.f15142e.size() == saveAccountLinkingTokenRequest.f15142e.size() && this.f15142e.containsAll(saveAccountLinkingTokenRequest.f15142e) && Objects.m8123a(this.f15139b, saveAccountLinkingTokenRequest.f15139b) && Objects.m8123a(this.f15140c, saveAccountLinkingTokenRequest.f15140c) && Objects.m8123a(this.f15141d, saveAccountLinkingTokenRequest.f15141d) && Objects.m8123a(this.f15143f, saveAccountLinkingTokenRequest.f15143f) && this.f15144g == saveAccountLinkingTokenRequest.f15144g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15139b, this.f15140c, this.f15141d, this.f15142e, this.f15143f});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f15139b, i2, false);
        SafeParcelWriter.m8168g(parcel, 2, this.f15140c, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15141d, false);
        SafeParcelWriter.m8170i(parcel, 4, this.f15142e, false);
        SafeParcelWriter.m8168g(parcel, 5, this.f15143f, false);
        int i3 = this.f15144g;
        parcel.writeInt(262150);
        parcel.writeInt(i3);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
