package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zap implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ PendingResult f15767a;

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f15768b;

    /* renamed from: c */
    public final /* synthetic */ PendingResultUtil.ResultConverter f15769c;

    /* renamed from: d */
    public final /* synthetic */ zas f15770d;

    public zap(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.f15767a = pendingResult;
        this.f15768b = taskCompletionSource;
        this.f15769c = resultConverter;
        this.f15770d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* renamed from: a */
    public final void mo7957a(Status status) {
        if (!status.m7964n()) {
            this.f15768b.m9715a(ApiExceptionUtil.m8086a(status));
        } else {
            this.f15768b.m9716b(this.f15769c.mo7839a(this.f15767a.mo7956c(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
