package com.google.android.gms.internal.auth;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzy extends zzj {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f16205a;

    public zzy(TaskCompletionSource taskCompletionSource) {
        this.f16205a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    /* renamed from: f2 */
    public final void mo8331f2(Status status, @Nullable Bundle bundle) {
        zzab.m8332e(status, bundle, this.f16205a);
    }
}
