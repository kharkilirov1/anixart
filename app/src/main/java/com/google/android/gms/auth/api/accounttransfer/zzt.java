package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzt extends zzbz {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* renamed from: h */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f15070h;

    /* renamed from: b */
    @SafeParcelable.Indicator
    public final Set<Integer> f15071b;

    /* renamed from: c */
    @SafeParcelable.VersionField
    public final int f15072c;

    /* renamed from: d */
    @SafeParcelable.Field
    public zzv f15073d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f15074e;

    /* renamed from: f */
    @SafeParcelable.Field
    public String f15075f;

    /* renamed from: g */
    @SafeParcelable.Field
    public String f15076g;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f15070h = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m8214m("authenticatorInfo", 2, zzv.class));
        hashMap.put("signature", FastJsonResponse.Field.m8215n("signature", 3));
        hashMap.put("package", FastJsonResponse.Field.m8215n("package", 4));
    }

    public zzt() {
        this.f15071b = new HashSet(3);
        this.f15072c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Map mo7846c() {
        return f15070h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public final Object mo7847d(FastJsonResponse.Field field) {
        int i2 = field.f15854h;
        if (i2 == 1) {
            return Integer.valueOf(this.f15072c);
        }
        if (i2 == 2) {
            return this.f15073d;
        }
        if (i2 == 3) {
            return this.f15074e;
        }
        if (i2 == 4) {
            return this.f15075f;
        }
        throw new IllegalStateException(C0576a.m4111j(37, "Unknown SafeParcelable id=", field.f15854h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: g */
    public final boolean mo7848g(FastJsonResponse.Field field) {
        return this.f15071b.contains(Integer.valueOf(field.f15854h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        Set<Integer> set = this.f15071b;
        if (set.contains(1)) {
            int i3 = this.f15072c;
            parcel.writeInt(262145);
            parcel.writeInt(i3);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m8167f(parcel, 2, this.f15073d, i2, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.m8168g(parcel, 3, this.f15074e, true);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m8168g(parcel, 4, this.f15075f, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.m8168g(parcel, 5, this.f15076g, true);
        }
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i2, @SafeParcelable.Param zzv zzvVar, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param String str3) {
        this.f15071b = set;
        this.f15072c = i2;
        this.f15073d = zzvVar;
        this.f15074e = str;
        this.f15075f = str2;
        this.f15076g = str3;
    }
}
