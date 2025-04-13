package com.google.android.gms.internal.p040authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
final class zzz extends zzi {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16005a;

    public zzz(TaskCompletionSource taskCompletionSource) {
        this.f16005a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p040authapiphone.zzj
    /* renamed from: o */
    public final void mo8316o(Status status) {
        TaskUtil.m8010a(status, null, this.f16005a);
    }
}
