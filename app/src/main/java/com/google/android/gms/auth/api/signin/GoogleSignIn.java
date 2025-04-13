package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class GoogleSignIn {
    @NonNull
    /* renamed from: a */
    public static Task<GoogleSignInAccount> m7852a(@Nullable Intent intent) {
        GoogleSignInResult googleSignInResult;
        Logger logger = zbm.f15244a;
        if (intent == null) {
            googleSignInResult = new GoogleSignInResult(null, Status.f15376i);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount == null) {
                if (status == null) {
                    status = Status.f15376i;
                }
                googleSignInResult = new GoogleSignInResult(null, status);
            } else {
                googleSignInResult = new GoogleSignInResult(googleSignInAccount, Status.f15374g);
            }
        }
        GoogleSignInAccount googleSignInAccount2 = googleSignInResult.f15215c;
        return (!googleSignInResult.f15214b.m7964n() || googleSignInAccount2 == null) ? Tasks.m9722d(ApiExceptionUtil.m8086a(googleSignInResult.f15214b)) : Tasks.m9723e(googleSignInAccount2);
    }
}
