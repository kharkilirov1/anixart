package com.google.android.gms.internal.p040authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* loaded from: classes.dex */
final class zzu extends IStatusCallback.Stub {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16004a;

    public zzu(TaskCompletionSource taskCompletionSource) {
        this.f16004a = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    /* renamed from: v0 */
    public final void mo7991v0(Status status) {
        if (status.f15380c == 6) {
            this.f16004a.m9717c(ApiExceptionUtil.m8086a(status));
        } else {
            TaskUtil.m8010a(status, null, this.f16004a);
        }
    }
}
