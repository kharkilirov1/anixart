package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15866b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String f15867c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final ArrayList<zam> f15868d;

    @SafeParcelable.Constructor
    public zal(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param ArrayList<zam> arrayList) {
        this.f15866b = i2;
        this.f15867c = str;
        this.f15868d = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15866b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15867c, false);
        SafeParcelWriter.m8172k(parcel, 3, this.f15868d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f15866b = 1;
        this.f15867c = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.f15868d = arrayList;
    }
}
