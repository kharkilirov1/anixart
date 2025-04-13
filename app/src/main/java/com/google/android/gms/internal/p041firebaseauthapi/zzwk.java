package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.auth.zze;
import java.util.ArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzwk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int m8159v = SafeParcelReader.m8159v(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzwy zzwyVar = null;
        String str5 = null;
        String str6 = null;
        zze zzeVar = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m8159v) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case 7:
                    zzwyVar = (zzwy) SafeParcelReader.m8144g(parcel, readInt, zzwy.CREATOR);
                    break;
                case '\b':
                    str5 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\t':
                    str6 = SafeParcelReader.m8145h(parcel, readInt);
                    break;
                case '\n':
                    j2 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case 11:
                    j3 = SafeParcelReader.m8155r(parcel, readInt);
                    break;
                case '\f':
                    z2 = SafeParcelReader.m8151n(parcel, readInt);
                    break;
                case '\r':
                    zzeVar = (zze) SafeParcelReader.m8144g(parcel, readInt, zze.CREATOR);
                    break;
                case 14:
                    arrayList = SafeParcelReader.m8149l(parcel, readInt, zzwu.CREATOR);
                    break;
                default:
                    SafeParcelReader.m8158u(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.m8150m(parcel, m8159v);
        return new zzwj(str, str2, z, str3, str4, zzwyVar, str5, str6, j2, j3, z2, zzeVar, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzwj[i2];
    }
}
