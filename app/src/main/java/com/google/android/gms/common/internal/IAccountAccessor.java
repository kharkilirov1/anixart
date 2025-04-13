package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public interface IAccountAccessor extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @NonNull
        /* renamed from: q */
        public static IAccountAccessor m8120q(@NonNull IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzv(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* renamed from: i */
        public final boolean mo8121i(int i2, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i3) throws RemoteException {
            if (i2 != 2) {
                return false;
            }
            throw null;
        }
    }

    @NonNull
    /* renamed from: w */
    Account mo8085w() throws RemoteException;
}
