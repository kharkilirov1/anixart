package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzj<TResult> implements zzq<TResult> {

    /* renamed from: b */
    public final Executor f17269b;

    /* renamed from: c */
    public final Object f17270c = new Object();

    /* renamed from: d */
    @GuardedBy
    @Nullable
    public OnCompleteListener<TResult> f17271d;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f17269b = executor;
        this.f17271d = onCompleteListener;
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: b */
    public final void mo9727b(@NonNull Task<TResult> task) {
        synchronized (this.f17270c) {
            if (this.f17271d == null) {
                return;
            }
            this.f17269b.execute(new zzi(this, task));
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    /* renamed from: v */
    public final void mo9728v() {
        synchronized (this.f17270c) {
            this.f17271d = null;
        }
    }
}
