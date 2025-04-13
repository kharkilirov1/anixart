package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: F2 */
    public final IObjectWrapper m8299F2(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(i2);
        Parcel m8542i = m8542i(4, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }

    /* renamed from: G2 */
    public final IObjectWrapper m8300G2(IObjectWrapper iObjectWrapper, String str, boolean z, long j2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(z ? 1 : 0);
        m8543q.writeLong(j2);
        Parcel m8542i = m8542i(7, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }

    /* renamed from: S0 */
    public final IObjectWrapper m8301S0(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(i2);
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper2);
        Parcel m8542i = m8542i(8, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }

    /* renamed from: t */
    public final IObjectWrapper m8302t(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel m8543q = m8543q();
        com.google.android.gms.internal.common.zzc.m8559b(m8543q, iObjectWrapper);
        m8543q.writeString(str);
        m8543q.writeInt(i2);
        Parcel m8542i = m8542i(2, m8543q);
        IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(m8542i.readStrongBinder());
        m8542i.recycle();
        return m8283q;
    }
}
