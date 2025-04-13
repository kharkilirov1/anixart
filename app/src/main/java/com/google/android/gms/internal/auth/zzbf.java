package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    /* renamed from: i */
    public final boolean mo7832i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            mo8334h0((ProxyResponse) zzc.m8337a(parcel, ProxyResponse.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            mo8333g0(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
