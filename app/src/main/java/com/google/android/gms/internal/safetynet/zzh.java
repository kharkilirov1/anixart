package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;

/* loaded from: classes.dex */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    /* renamed from: i */
    public final boolean mo9664i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo9669R((Status) zzc.m9665a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zza) zzc.m9665a(parcel, com.google.android.gms.safetynet.zza.CREATOR));
        } else {
            if (i2 == 2) {
                parcel.readString();
                throw new UnsupportedOperationException();
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    mo9672r2((Status) zzc.m9665a(parcel, Status.CREATOR), parcel.readInt() != 0);
                } else if (i2 == 6) {
                    mo9671d1((Status) zzc.m9665a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzf) zzc.m9665a(parcel, com.google.android.gms.safetynet.zzf.CREATOR));
                } else if (i2 == 8) {
                    mo9670S1((Status) zzc.m9665a(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzd) zzc.m9665a(parcel, com.google.android.gms.safetynet.zzd.CREATOR));
                } else {
                    if (i2 == 15) {
                        throw new UnsupportedOperationException();
                    }
                    if (i2 == 10) {
                        parcel.readInt();
                        throw new UnsupportedOperationException();
                    }
                    if (i2 != 11) {
                        return false;
                    }
                    mo9667H1((Status) zzc.m9665a(parcel, Status.CREATOR));
                }
            } else {
                mo9668I0((Status) zzc.m9665a(parcel, Status.CREATOR), (SafeBrowsingData) zzc.m9665a(parcel, SafeBrowsingData.CREATOR));
            }
        }
        return true;
    }
}
