package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15840b;

    /* renamed from: c */
    public final HashMap<String, Integer> f15841c;

    /* renamed from: d */
    public final SparseArray<String> f15842d;

    @KeepForSdk
    public StringToIntConverter() {
        this.f15840b = 1;
        this.f15841c = new HashMap<>();
        this.f15842d = new SparseArray<>();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ String mo8209g(@NonNull Integer num) {
        String str = this.f15842d.get(num.intValue());
        return (str == null && this.f15841c.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15840b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15841c.keySet()) {
            arrayList.add(new zac(str, this.f15841c.get(str).intValue()));
        }
        SafeParcelWriter.m8172k(parcel, 2, arrayList, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param int i2, @SafeParcelable.Param ArrayList<zac> arrayList) {
        this.f15840b = i2;
        this.f15841c = new HashMap<>();
        this.f15842d = new SparseArray<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zac zacVar = arrayList.get(i3);
            String str = zacVar.f15846c;
            int i4 = zacVar.f15847d;
            this.f15841c.put(str, Integer.valueOf(i4));
            this.f15842d.put(i4, str);
        }
    }
}
