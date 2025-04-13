package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzp<TResult, TContinuationResult> implements OnSuccessListener<TContinuationResult>, OnFailureListener, OnCanceledListener, zzq {

    /* renamed from: b */
    public final Executor f17284b;

    /* renamed from: c */
    public final SuccessContinuation<TResult, TContinuationResult> f17285c;

    /* renamed from: d */
    public final zzw<TContinuationResult> f17286d;

    public zzp(@NonNull Executor executor, @NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation, @NonNull zzw<TContinuationResult> zzwVar) {
        this.f17284b = executor;
        this.f17285c = successContinuation;
        this.f17286d = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public final void mo7337a(@NonNull Exception exc) {
        this.f17286d.m9731t(exc);
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        this.f17284b.execute(new zzo(this, task));
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    /* renamed from: c */
    public final void mo9695c() {
        this.f17286d.m9733v();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f17286d.m9732u(tcontinuationresult);
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        throw new UnsupportedOperationException();
    }
}
