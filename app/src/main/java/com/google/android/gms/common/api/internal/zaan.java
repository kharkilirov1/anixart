package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaan extends zabg {

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f15468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaan(zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f15468b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @GuardedBy
    /* renamed from: a */
    public final void mo8019a() {
        this.f15468b.mo8025a(new ConnectionResult(16, null));
    }
}
