package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzbm extends zzbd {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16051a;

    public zzbm(TaskCompletionSource taskCompletionSource) {
        this.f16051a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    /* renamed from: h0 */
    public final void mo8334h0(ProxyResponse proxyResponse) throws RemoteException {
        TaskUtil.m8010a(new Status(proxyResponse.f15167b, null), proxyResponse, this.f16051a);
    }
}
