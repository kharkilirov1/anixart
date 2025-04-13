package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
abstract class zad<T> extends zac {

    /* renamed from: b */
    public final TaskCompletionSource<T> f15580b;

    public zad(int i2, TaskCompletionSource<T> taskCompletionSource) {
        super(i2);
        this.f15580b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: a */
    public final void mo8072a(@NonNull Status status) {
        this.f15580b.m9717c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: b */
    public final void mo8073b(@NonNull Exception exc) {
        this.f15580b.m9717c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: c */
    public final void mo8074c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            mo8076h(zabqVar);
        } catch (DeadObjectException e2) {
            this.f15580b.m9717c(new ApiException(zai.m8078e(e2)));
            throw e2;
        } catch (RemoteException e3) {
            this.f15580b.m9717c(new ApiException(zai.m8078e(e3)));
        } catch (RuntimeException e4) {
            this.f15580b.m9717c(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: d */
    public void mo8075d(@NonNull zaad zaadVar, boolean z) {
    }

    /* renamed from: h */
    public abstract void mo8076h(zabq<?> zabqVar) throws RemoteException;
}
