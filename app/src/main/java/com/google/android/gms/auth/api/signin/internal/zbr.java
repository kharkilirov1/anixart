package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public interface zbr extends IInterface {
    /* renamed from: U0 */
    void mo7873U0(Status status) throws RemoteException;

    /* renamed from: Y0 */
    void mo7874Y0(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    /* renamed from: b */
    void mo7875b(Status status) throws RemoteException;
}
