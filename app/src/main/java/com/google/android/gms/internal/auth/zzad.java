package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzad extends zzah {

    /* renamed from: a */
    public final /* synthetic */ zzae f16028a;

    public zzad(zzae zzaeVar) {
        this.f16028a = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    /* renamed from: g2 */
    public final void mo7834g2(Account account) {
        this.f16028a.mo7882a(new zzai(account != null ? Status.f15374g : zzal.f16035a, account));
    }
}
