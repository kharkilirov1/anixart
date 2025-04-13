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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@ShowFirstParty
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15872b;

    /* renamed from: c */
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f15873c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f15874d;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param int i2, @SafeParcelable.Param ArrayList<zal> arrayList, @SafeParcelable.Param String str) {
        this.f15872b = i2;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zal zalVar = arrayList.get(i3);
            String str2 = zalVar.f15867c;
            HashMap hashMap2 = new HashMap();
            ArrayList<zam> arrayList2 = zalVar.f15868d;
            Objects.requireNonNull(arrayList2, "null reference");
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                zam zamVar = zalVar.f15868d.get(i4);
                hashMap2.put(zamVar.f15870c, zamVar.f15871d);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f15873c = hashMap;
        Objects.requireNonNull(str, "null reference");
        this.f15874d = str;
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f15873c.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).f15857k = this;
            }
        }
    }

    @Nullable
    /* renamed from: m */
    public final Map<String, FastJsonResponse.Field<?, ?>> m8222m(String str) {
        return this.f15873c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f15873c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f15873c.get(str);
            for (String str2 : map.keySet()) {
                C0000a.m1B(sb, "  ", str2, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15872b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15873c.keySet()) {
            arrayList.add(new zal(str, this.f15873c.get(str)));
        }
        SafeParcelWriter.m8172k(parcel, 2, arrayList, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f15874d, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
