package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: S0 */
    public final IObjectWrapper m8303S0(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(i2);
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper2);
        Parcel m8542i = m8542i(3, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }

    /* renamed from: t */
    public final IObjectWrapper m8304t(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(i2);
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper2);
        Parcel m8542i = m8542i(2, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }
}
