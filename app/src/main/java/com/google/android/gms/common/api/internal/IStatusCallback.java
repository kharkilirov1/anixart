package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public interface IStatusCallback extends IInterface {

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        /* renamed from: F2 */
        public final boolean mo7992F2(int i2, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 1) {
                return false;
            }
            mo7991v0((Status) com.google.android.gms.internal.base.zac.m8536a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: v0 */
    void mo7991v0(@NonNull Status status) throws RemoteException;
}
