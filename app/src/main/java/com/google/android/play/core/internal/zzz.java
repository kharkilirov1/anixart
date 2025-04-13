package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzz extends zzk {
    public zzz(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* renamed from: g */
    public final void m10925g(Bundle bundle) throws RemoteException {
        Parcel m10912i = m10912i();
        int i2 = zzm.f20158a;
        m10912i.writeInt(1);
        bundle.writeToParcel(m10912i, 0);
        m10913q(3, m10912i);
    }
}
