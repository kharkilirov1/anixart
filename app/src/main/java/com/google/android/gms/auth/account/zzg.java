package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzg implements PendingResultUtil.ResultConverter<WorkAccountApi.AddAccountResult, Account> {
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Account mo7839a(WorkAccountApi.AddAccountResult addAccountResult) {
        return addAccountResult.mo7831c();
    }
}
