package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class zzy extends com.google.android.gms.internal.common.zzb implements zzz {

    /* renamed from: a */
    public static final /* synthetic */ int f15833a = 0;

    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.internal.common.zzb
    /* renamed from: i */
    public final boolean mo8121i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper mo8203x = mo8203x();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.m8559b(parcel2, mo8203x);
        } else {
            if (i2 != 2) {
                return false;
            }
            int mo8202v = mo8202v();
            parcel2.writeNoException();
            parcel2.writeInt(mo8202v);
        }
        return true;
    }
}
