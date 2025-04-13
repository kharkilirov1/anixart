package com.google.android.gms.internal.p039authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbaa extends zbb implements zbab {
    public zbaa() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) zbc.m8322a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) zbc.m8322a(parcel, PendingIntent.CREATOR);
        zbc.m8323b(parcel);
        TaskUtil.m8010a(status, pendingIntent, ((zbax) this).f16013a);
        return true;
    }
}
