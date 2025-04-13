package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzx extends zzl implements zzy {
    public zzx() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.internal.zzl
    /* renamed from: i */
    public final boolean mo10830i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzz zzzVar = null;
        if (i2 == 2) {
            Bundle bundle = (Bundle) zzm.m10914a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                zzzVar = queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzz(readStrongBinder);
            }
            mo10717K1(bundle, zzzVar);
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) zzm.m10914a(parcel, Bundle.CREATOR);
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            zzzVar = queryLocalInterface2 instanceof zzz ? (zzz) queryLocalInterface2 : new zzz(readStrongBinder2);
        }
        mo10718v1(bundle2, zzzVar);
        return true;
    }
}
