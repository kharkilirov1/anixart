package com.google.android.gms.internal.p039authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            Status status = (Status) zbc.m8322a(parcel, Status.CREATOR);
            Credential credential = (Credential) zbc.m8322a(parcel, Credential.CREATOR);
            zbc.m8323b(parcel);
            mo8327d2(status, credential);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    return false;
                }
                parcel.readString();
                zbc.m8323b(parcel);
                throw new UnsupportedOperationException();
            }
            Status status2 = (Status) zbc.m8322a(parcel, Status.CREATOR);
            zbc.m8323b(parcel);
            mo8326b(status2);
        }
        parcel2.writeNoException();
        return true;
    }
}
