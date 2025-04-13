package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzf<ResultT> implements zzg<ResultT> {

    /* renamed from: a */
    public final Executor f20318a;

    /* renamed from: b */
    public final Object f20319b = new Object();

    /* renamed from: c */
    @Nullable
    @GuardedBy
    public final OnSuccessListener<? super ResultT> f20320c;

    public zzf(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f20318a = executor;
        this.f20320c = onSuccessListener;
    }

    @Override // com.google.android.play.core.tasks.zzg
    /* renamed from: a */
    public final void mo11009a(Task<ResultT> task) {
        if (task.mo11004h()) {
            synchronized (this.f20319b) {
                if (this.f20320c == null) {
                    return;
                }
                this.f20318a.execute(new zze(this, task));
            }
        }
    }
}
