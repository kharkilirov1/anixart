package com.google.android.gms.auth.api.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
final class zbb implements PendingResultUtil.ResultConverter {
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    @Nullable
    /* renamed from: a */
    public final Object mo7839a(Result result) {
        return ((GoogleSignInResult) result).f15215c;
    }
}
