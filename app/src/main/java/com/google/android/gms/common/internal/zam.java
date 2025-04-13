package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zam extends com.google.android.gms.internal.base.zaa {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: t */
    public final IObjectWrapper m8188t(IObjectWrapper iObjectWrapper, zax zaxVar) throws RemoteException {
        Parcel m8534i = m8534i();
        com.google.android.gms.internal.base.zac.m8538c(m8534i, iObjectWrapper);
        com.google.android.gms.internal.base.zac.m8537b(m8534i, zaxVar);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f16207a.transact(2, m8534i, obtain, 0);
                obtain.readException();
                m8534i.recycle();
                IObjectWrapper m8283q = IObjectWrapper.Stub.m8283q(obtain.readStrongBinder());
                obtain.recycle();
                return m8283q;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } catch (Throwable th) {
            m8534i.recycle();
            throw th;
        }
    }
}
