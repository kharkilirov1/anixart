package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        zzwq zzwqVar = null;
        zzt zztVar = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        zzz zzzVar = null;
        com.google.firebase.auth.zze zzeVar = null;
        zzbb zzbbVar = null;
        boolean z = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzwqVar = (zzwq) SafeParcelReader.m8144g(parcel, readInt, zzwq.CREATOR);
                    break;
                case 2:
                    zztVar = (zzt) SafeParcelReader.m8144g(parcel, readInt, zzt.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m8149l(parcel, readInt, zzt.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.m8147j(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\b':
                    int m8157t = SafeParcelReader.m8157t(parcel, readInt);
                    if (m8157t != 0) {
                        SafeParcelReader.m8160w(parcel, readInt, m8157t, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case '\t':
                    zzzVar = (zzz) SafeParcelReader.m8144g(parcel, readInt, zzz.CREATOR);
                    break;
                case '\n':
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 11:
                    zzeVar = (com.google.firebase.auth.zze) SafeParcelReader.m8144g(parcel, readInt, com.google.firebase.auth.zze.CREATOR);
                    break;
                case '\f':
                    zzbbVar = (zzbb) SafeParcelReader.m8144g(parcel, readInt, zzbb.CREATOR);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzx(zzwqVar, zztVar, str, str2, arrayList, arrayList2, str3, bool, zzzVar, z, zzeVar, zzbbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzx[i2];
    }
}
