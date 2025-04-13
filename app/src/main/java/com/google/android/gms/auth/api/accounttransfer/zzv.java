package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzv extends zzbz {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();

    /* renamed from: i */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f15077i;

    /* renamed from: b */
    @SafeParcelable.Indicator
    public final Set<Integer> f15078b;

    /* renamed from: c */
    @SafeParcelable.VersionField
    public final int f15079c;

    /* renamed from: d */
    @SafeParcelable.Field
    public String f15080d;

    /* renamed from: e */
    @SafeParcelable.Field
    public int f15081e;

    /* renamed from: f */
    @SafeParcelable.Field
    public byte[] f15082f;

    /* renamed from: g */
    @SafeParcelable.Field
    public PendingIntent f15083g;

    /* renamed from: h */
    @SafeParcelable.Field
    public DeviceMetaData f15084h;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f15077i = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m8215n("accountType", 2));
        hashMap.put("status", new FastJsonResponse.Field<>(0, false, 0, false, "status", 3, null, null));
        hashMap.put("transferBytes", new FastJsonResponse.Field<>(8, false, 8, false, "transferBytes", 4, null, null));
    }

    public zzv() {
        this.f15078b = new ArraySet(3);
        this.f15079c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Map mo7846c() {
        return f15077i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public final Object mo7847d(FastJsonResponse.Field field) {
        int i2 = field.f15854h;
        if (i2 == 1) {
            return Integer.valueOf(this.f15079c);
        }
        if (i2 == 2) {
            return this.f15080d;
        }
        if (i2 == 3) {
            return Integer.valueOf(this.f15081e);
        }
        if (i2 == 4) {
            return this.f15082f;
        }
        throw new IllegalStateException(C0576a.m4111j(37, "Unknown SafeParcelable id=", field.f15854h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: g */
    public final boolean mo7848g(FastJsonResponse.Field field) {
        return this.f15078b.contains(Integer.valueOf(field.f15854h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        Set<Integer> set = this.f15078b;
        if (set.contains(1)) {
            int i3 = this.f15079c;
            parcel.writeInt(262145);
            parcel.writeInt(i3);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m8168g(parcel, 2, this.f15080d, true);
        }
        if (set.contains(3)) {
            int i4 = this.f15081e;
            parcel.writeInt(262147);
            parcel.writeInt(i4);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m8164c(parcel, 4, this.f15082f, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m8167f(parcel, 5, this.f15083g, i2, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.m8167f(parcel, 6, this.f15084h, i2, true);
        }
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param int i3, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param PendingIntent pendingIntent, @SafeParcelable.Param DeviceMetaData deviceMetaData) {
        this.f15078b = set;
        this.f15079c = i2;
        this.f15080d = str;
        this.f15081e = i3;
        this.f15082f = bArr;
        this.f15083g = pendingIntent;
        this.f15084h = deviceMetaData;
    }
}
