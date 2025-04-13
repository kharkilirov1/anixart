package com.google.android.gms.internal.p039authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zbae extends zbb implements zbaf {
    public zbae() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p039authapi.zbb
    /* renamed from: i */
    public final boolean mo7889i(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) zbc.m8322a(parcel, Status.CREATOR);
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) zbc.m8322a(parcel, SaveAccountLinkingTokenResult.CREATOR);
        zbc.m8323b(parcel);
        zbam zbamVar = (zbam) this;
        if (status.m7964n()) {
            zbamVar.f16008a.m9716b(saveAccountLinkingTokenResult);
        } else {
            zbamVar.f16008a.m9715a(ApiExceptionUtil.m8086a(status));
        }
        return true;
    }
}
