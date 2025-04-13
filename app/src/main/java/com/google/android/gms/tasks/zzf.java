package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzf<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: b */
    public final Executor f17260b;

    /* renamed from: c */
    public final Continuation<TResult, Task<TContinuationResult>> f17261c;

    /* renamed from: d */
    public final zzw<TContinuationResult> f17262d;

    public zzf(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation, @NonNull zzw<TContinuationResult> zzwVar) {
        this.f17260b = executor;
        this.f17261c = continuation;
        this.f17262d = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        this.f17262d.m9731t(exc);
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        this.f17260b.execute(new zze(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: c */
    public final void mo9695c() {
        this.f17262d.m9733v();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f17262d.m9732u(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        throw new UnsupportedOperationException();
    }
}
