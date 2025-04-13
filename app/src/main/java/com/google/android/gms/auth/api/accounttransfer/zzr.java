package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.room.util.C0576a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzr extends zzbz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: h */
    public static final ArrayMap<String, FastJsonResponse.Field<?, ?>> f15063h;

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15064b;

    /* renamed from: c */
    @SafeParcelable.Field
    public List<String> f15065c;

    /* renamed from: d */
    @SafeParcelable.Field
    public List<String> f15066d;

    /* renamed from: e */
    @SafeParcelable.Field
    public List<String> f15067e;

    /* renamed from: f */
    @SafeParcelable.Field
    public List<String> f15068f;

    /* renamed from: g */
    @SafeParcelable.Field
    public List<String> f15069g;

    static {
        ArrayMap<String, FastJsonResponse.Field<?, ?>> arrayMap = new ArrayMap<>();
        f15063h = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.m8216o("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.m8216o("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.m8216o("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.m8216o("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.m8216o("escrowed", 6));
    }

    public zzr() {
        this.f15064b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo7846c() {
        return f15063h;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: d */
    public final Object mo7847d(FastJsonResponse.Field field) {
        switch (field.f15854h) {
            case 1:
                return Integer.valueOf(this.f15064b);
            case 2:
                return this.f15065c;
            case 3:
                return this.f15066d;
            case 4:
                return this.f15067e;
            case 5:
                return this.f15068f;
            case 6:
                return this.f15069g;
            default:
                throw new IllegalStateException(C0576a.m4111j(37, "Unknown SafeParcelable id=", field.f15854h));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: g */
    public final boolean mo7848g(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15064b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8170i(parcel, 2, this.f15065c, false);
        SafeParcelWriter.m8170i(parcel, 3, this.f15066d, false);
        SafeParcelWriter.m8170i(parcel, 4, this.f15067e, false);
        SafeParcelWriter.m8170i(parcel, 5, this.f15068f, false);
        SafeParcelWriter.m8170i(parcel, 6, this.f15069g, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param int i2, @Nullable @SafeParcelable.Param List<String> list, @Nullable @SafeParcelable.Param List<String> list2, @Nullable @SafeParcelable.Param List<String> list3, @Nullable @SafeParcelable.Param List<String> list4, @Nullable @SafeParcelable.Param List<String> list5) {
        this.f15064b = i2;
        this.f15065c = list;
        this.f15066d = list2;
        this.f15067e = list3;
        this.f15068f = list4;
        this.f15069g = list5;
    }
}
