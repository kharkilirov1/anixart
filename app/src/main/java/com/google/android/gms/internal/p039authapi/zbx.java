package com.google.android.gms.internal.p039authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbx extends zbb implements zby {
    public zbx() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) zbc.m8322a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) zbc.m8322a(parcel, BeginSignInResult.CREATOR);
        zbc.m8323b(parcel);
        TaskUtil.m8010a(status, beginSignInResult, ((zbau) this).f16010a);
        return true;
    }
}
