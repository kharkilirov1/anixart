package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzn<TResult> implements zzq<TResult> {

    /* renamed from: b */
    public final Executor f17279b;

    /* renamed from: c */
    public final Object f17280c = new Object();

    /* renamed from: d */
    @GuardedBy
    @Nullable
    public OnSuccessListener<? super TResult> f17281d;

    public zzn(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f17279b = executor;
        this.f17281d = onSuccessListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        if (task.mo9712q()) {
            synchronized (this.f17280c) {
                if (this.f17281d == null) {
                    return;
                }
                this.f17279b.execute(new zzm(this, task));
            }
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        synchronized (this.f17280c) {
            this.f17281d = null;
        }
    }
}
