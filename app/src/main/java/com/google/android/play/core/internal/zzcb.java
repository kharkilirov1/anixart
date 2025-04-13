package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzcb extends zzl implements zzcc {
    public zzcb() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.internal.zzl
    /* renamed from: i */
    public final boolean mo10830i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                mo10874A1(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo10878Z0(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo10882d(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo10879Z1(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                mo10885q1((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo10876H(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                mo10884i0((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                mo10881c((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                mo10880b1((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo10877M1((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                mo10883g((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo10875C0((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
