package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzn extends zzbz {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();

    /* renamed from: g */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f15056g;

    /* renamed from: b */
    @SafeParcelable.Indicator
    public final Set<Integer> f15057b;

    /* renamed from: c */
    @SafeParcelable.VersionField
    public final int f15058c;

    /* renamed from: d */
    @SafeParcelable.Field
    public ArrayList<zzt> f15059d;

    /* renamed from: e */
    @SafeParcelable.Field
    public int f15060e;

    /* renamed from: f */
    @SafeParcelable.Field
    public zzr f15061f;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f15056g = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse.Field<>(11, true, 11, true, "authenticatorData", 2, zzt.class, null));
        hashMap.put("progress", FastJsonResponse.Field.m8214m("progress", 4, zzr.class));
    }

    public zzn() {
        this.f15057b = new HashSet(1);
        this.f15058c = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Map mo7846c() {
        return f15056g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public final Object mo7847d(FastJsonResponse.Field field) {
        int i2 = field.f15854h;
        if (i2 == 1) {
            return Integer.valueOf(this.f15058c);
        }
        if (i2 == 2) {
            return this.f15059d;
        }
        if (i2 == 4) {
            return this.f15061f;
        }
        throw new IllegalStateException(C0576a.m4111j(37, "Unknown SafeParcelable id=", field.f15854h));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: g */
    public final boolean mo7848g(FastJsonResponse.Field field) {
        return this.f15057b.contains(Integer.valueOf(field.f15854h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        Set<Integer> set = this.f15057b;
        if (set.contains(1)) {
            int i3 = this.f15058c;
            parcel.writeInt(262145);
            parcel.writeInt(i3);
        }
        if (set.contains(2)) {
            SafeParcelWriter.m8172k(parcel, 2, this.f15059d, true);
        }
        if (set.contains(3)) {
            int i4 = this.f15060e;
            parcel.writeInt(262147);
            parcel.writeInt(i4);
        }
        if (set.contains(4)) {
            SafeParcelWriter.m8167f(parcel, 4, this.f15061f, i2, true);
        }
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param int i2, @SafeParcelable.Param ArrayList<zzt> arrayList, @SafeParcelable.Param int i3, @SafeParcelable.Param zzr zzrVar) {
        this.f15057b = set;
        this.f15058c = i2;
        this.f15059d = arrayList;
        this.f15060e = i3;
        this.f15061f = zzrVar;
    }
}
