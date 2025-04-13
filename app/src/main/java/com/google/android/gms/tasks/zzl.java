package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzl<TResult> implements zzq<TResult> {

    /* renamed from: b */
    public final Executor f17274b;

    /* renamed from: c */
    public final Object f17275c = new Object();

    /* renamed from: d */
    @GuardedBy
    @Nullable
    public OnFailureListener f17276d;

    public zzl(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f17274b = executor;
        this.f17276d = onFailureListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        if (task.mo9712q() || task.mo9710o()) {
            return;
        }
        synchronized (this.f17275c) {
            if (this.f17276d == null) {
                return;
            }
            this.f17274b.execute(new zzk(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        synchronized (this.f17275c) {
            this.f17276d = null;
        }
    }
}
