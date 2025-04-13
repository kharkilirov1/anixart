package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacv extends TaskApiCall {

    /* renamed from: d */
    public final /* synthetic */ TaskApiCall.Builder f15577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i2) {
        super(featureArr, z, i2);
        this.f15577d = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    /* renamed from: b */
    public final void mo7844b(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f15577d.f15436a.mo8007a(anyClient, taskCompletionSource);
    }
}
