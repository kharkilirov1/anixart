package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzm extends com.google.android.gms.internal.safetynet.zze {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f17200a;

    public zzm(TaskCompletionSource taskCompletionSource) {
        this.f17200a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.safetynet.zze, com.google.android.gms.internal.safetynet.zzg
    /* renamed from: H1 */
    public final void mo9667H1(Status status) {
        TaskUtil.m8010a(status, null, this.f17200a);
    }
}
