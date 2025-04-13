package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class zzv extends zzl implements zzw {
    public zzv() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.internal.zzl
    /* renamed from: i */
    public final boolean mo10830i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                mo10700p2(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo10697d(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo10702y2(parcel.readInt(), (Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo10693J(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                mo10691E2((Bundle) zzm.m10914a(parcel, creator), (Bundle) zzm.m10914a(parcel, creator));
                return true;
            case 7:
                mo10698g((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo10703z1((Bundle) zzm.m10914a(parcel, creator2), (Bundle) zzm.m10914a(parcel, creator2));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo10694O1((Bundle) zzm.m10914a(parcel, creator3), (Bundle) zzm.m10914a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo10699k2((Bundle) zzm.m10914a(parcel, creator4), (Bundle) zzm.m10914a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo10701y((Bundle) zzm.m10914a(parcel, creator5), (Bundle) zzm.m10914a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo10695V0((Bundle) zzm.m10914a(parcel, creator6), (Bundle) zzm.m10914a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                mo10692G0((Bundle) zzm.m10914a(parcel, creator7), (Bundle) zzm.m10914a(parcel, creator7));
                return true;
            case 15:
                mo10696c((Bundle) zzm.m10914a(parcel, Bundle.CREATOR));
                return true;
        }
    }
}
