package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzd<ResultT> implements zzg<ResultT> {

    /* renamed from: a */
    public final Executor f20313a;

    /* renamed from: b */
    public final Object f20314b = new Object();

    /* renamed from: c */
    @Nullable
    @GuardedBy
    public final OnFailureListener f20315c;

    public zzd(Executor executor, OnFailureListener onFailureListener) {
        this.f20313a = executor;
        this.f20315c = onFailureListener;
    }

    @Override // com.google.android.play.core.tasks.zzg
    /* renamed from: a */
    public final void mo11009a(Task<ResultT> task) {
        if (task.mo11004h()) {
            return;
        }
        synchronized (this.f20314b) {
            if (this.f20315c == null) {
                return;
            }
            this.f20313a.execute(new zzc(this, task));
        }
    }
}
