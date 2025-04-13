package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaab implements PendingResult.StatusListener {

    /* renamed from: a */
    public final /* synthetic */ BasePendingResult f15451a;

    /* renamed from: b */
    public final /* synthetic */ zaad f15452b;

    public zaab(zaad zaadVar, BasePendingResult basePendingResult) {
        this.f15452b = zaadVar;
        this.f15451a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    /* renamed from: a */
    public final void mo7957a(Status status) {
        this.f15452b.f15455a.remove(this.f15451a);
    }
}
