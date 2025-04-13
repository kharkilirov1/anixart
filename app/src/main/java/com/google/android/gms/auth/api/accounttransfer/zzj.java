package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
class zzj<T> extends zzan {

    /* renamed from: a */
    public final zzk<T> f15054a;

    public zzj(zzk<T> zzkVar) {
        this.f15054a = zzkVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    /* renamed from: A */
    public final void mo7843A(Status status) {
        this.f15054a.f15055d.m9715a(new AccountTransferException(status));
    }
}
