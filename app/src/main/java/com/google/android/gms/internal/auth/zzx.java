package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzx extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16204a;

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.f16204a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    /* renamed from: v0 */
    public final void mo7991v0(Status status) {
        zzab.m8332e(status, null, this.f16204a);
    }
}
