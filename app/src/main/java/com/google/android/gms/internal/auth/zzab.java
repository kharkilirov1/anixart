package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzab extends GoogleApi<Api.ApiOptions.NoOptions> implements zzg {

    /* renamed from: k */
    public static final Logger f16027k = new Logger("Auth", "GoogleAuthServiceClient");

    /* renamed from: e */
    public static void m8332e(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m7964n() ? taskCompletionSource.m9718d(obj) : taskCompletionSource.m9717c(new ApiException(status))) {
            return;
        }
        Logger logger = f16027k;
        Log.w(logger.f15834a, logger.m8206c("The task is already complete.", new Object[0]));
    }
}
