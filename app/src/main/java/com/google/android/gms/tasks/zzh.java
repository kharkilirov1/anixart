package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzh<TResult> implements zzq<TResult> {

    /* renamed from: b */
    public final Executor f17264b;

    /* renamed from: c */
    public final Object f17265c = new Object();

    /* renamed from: d */
    @GuardedBy
    @Nullable
    public OnCanceledListener f17266d;

    public zzh(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f17264b = executor;
        this.f17266d = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        if (task.mo9710o()) {
            synchronized (this.f17265c) {
                if (this.f17266d == null) {
                    return;
                }
                this.f17264b.execute(new zzg(this));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        synchronized (this.f17265c) {
            this.f17266d = null;
        }
    }
}
