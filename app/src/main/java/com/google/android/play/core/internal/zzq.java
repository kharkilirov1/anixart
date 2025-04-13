package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzq extends zzl implements zzr {
    public zzq() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.internal.zzl
    /* renamed from: i */
    public final boolean mo10830i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            mo10663c((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        mo10664m((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
        return true;
    }
}
