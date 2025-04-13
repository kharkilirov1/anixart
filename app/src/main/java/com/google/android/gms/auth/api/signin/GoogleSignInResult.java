package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public class GoogleSignInResult implements Result {

    /* renamed from: b */
    public Status f15214b;

    /* renamed from: c */
    @Nullable
    public GoogleSignInAccount f15215c;

    public GoogleSignInResult(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f15215c = googleSignInAccount;
        this.f15214b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    /* renamed from: k */
    public Status mo7862k() {
        return this.f15214b;
    }
}
