package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public interface zzat extends IInterface {
    /* renamed from: A */
    void mo7843A(Status status) throws RemoteException;

    /* renamed from: M */
    void mo7842M(DeviceMetaData deviceMetaData) throws RemoteException;

    /* renamed from: a */
    void mo7841a(byte[] bArr) throws RemoteException;

    /* renamed from: j */
    void mo7845j() throws RemoteException;
}
