package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zag<ResultT> extends zac {

    /* renamed from: b */
    public final TaskApiCall<Api.AnyClient, ResultT> f15585b;

    /* renamed from: c */
    public final TaskCompletionSource<ResultT> f15586c;

    /* renamed from: d */
    public final StatusExceptionMapper f15587d;

    public zag(int i2, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i2);
        this.f15586c = taskCompletionSource;
        this.f15585b = taskApiCall;
        this.f15587d = statusExceptionMapper;
        if (i2 == 2 && taskApiCall.f15434b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: a */
    public final void mo8072a(@NonNull Status status) {
        this.f15586c.m9717c(this.f15587d.mo7966a(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: b */
    public final void mo8073b(@NonNull Exception exc) {
        this.f15586c.m9717c(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: c */
    public final void mo8074c(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.f15585b.mo7844b(zabqVar.f15525b, this.f15586c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            this.f15586c.m9717c(this.f15587d.mo7966a(zai.m8078e(e3)));
        } catch (RuntimeException e4) {
            this.f15586c.m9717c(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    /* renamed from: d */
    public final void mo8075d(@NonNull zaad zaadVar, boolean z) {
        TaskCompletionSource<ResultT> taskCompletionSource = this.f15586c;
        zaadVar.f15456b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.f17240a.mo9698c(new zaac(zaadVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.zac
    /* renamed from: f */
    public final boolean mo8069f(zabq<?> zabqVar) {
        return this.f15585b.f15434b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    /* renamed from: g */
    public final Feature[] mo8070g(zabq<?> zabqVar) {
        return this.f15585b.f15433a;
    }
}
