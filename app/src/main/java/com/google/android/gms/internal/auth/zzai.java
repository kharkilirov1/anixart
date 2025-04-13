package com.google.android.gms.internal.auth;

import android.accounts.Account;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzai implements WorkAccountApi.AddAccountResult {

    /* renamed from: d */
    public static final Account f16030d = new Account("DUMMY_NAME", "com.google");

    /* renamed from: b */
    public final Status f16031b;

    /* renamed from: c */
    public final Account f16032c;

    public zzai(Status status, @Nullable Account account) {
        this.f16031b = status;
        this.f16032c = account == null ? f16030d : account;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    /* renamed from: c */
    public final Account mo7831c() {
        return this.f16032c;
    }

    @Override // com.google.android.gms.common.api.Result
    /* renamed from: k */
    public final Status mo7862k() {
        return this.f16031b;
    }
}
