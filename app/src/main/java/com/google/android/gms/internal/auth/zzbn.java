package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzbn extends zzbd {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16052a;

    public zzbn(TaskCompletionSource taskCompletionSource) {
        this.f16052a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    /* renamed from: g0 */
    public final void mo8333g0(String str) throws RemoteException {
        TaskUtil.m8010a(str != null ? Status.f15374g : new Status(3006, null), str, this.f16052a);
    }
}
