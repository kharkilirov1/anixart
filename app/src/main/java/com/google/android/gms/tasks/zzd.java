package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzd<TResult, TContinuationResult> implements zzq<TResult> {

    /* renamed from: b */
    public final Executor f17255b;

    /* renamed from: c */
    public final Continuation<TResult, TContinuationResult> f17256c;

    /* renamed from: d */
    public final zzw<TContinuationResult> f17257d;

    public zzd(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation, @NonNull zzw<TContinuationResult> zzwVar) {
        this.f17255b = executor;
        this.f17256c = continuation;
        this.f17257d = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        this.f17255b.execute(new zzc(this, task));
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        throw new UnsupportedOperationException();
    }
}
