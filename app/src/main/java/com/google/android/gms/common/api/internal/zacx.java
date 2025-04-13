package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacx implements Continuation<Boolean, Void> {
    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Void mo7340e(@NonNull Task<Boolean> task) throws Exception {
        if (task.mo9708m().booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
