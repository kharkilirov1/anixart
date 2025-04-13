package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.common.zza implements ICancelToken {
    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        Parcel m8543q = m8543q();
        try {
            this.f16236a.transact(2, m8543q, null, 1);
        } finally {
            m8543q.recycle();
        }
    }
}
