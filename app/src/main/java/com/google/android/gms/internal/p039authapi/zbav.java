package com.google.android.gms.internal.p039authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbav extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16011a;

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    /* renamed from: v0 */
    public final void mo7991v0(Status status) throws RemoteException {
        TaskUtil.m8010a(status, null, this.f16011a);
    }
}
