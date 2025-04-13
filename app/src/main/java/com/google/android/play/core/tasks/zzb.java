package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb<ResultT> implements zzg<ResultT> {

    /* renamed from: a */
    public final Executor f20308a;

    /* renamed from: b */
    public final Object f20309b = new Object();

    /* renamed from: c */
    @Nullable
    @GuardedBy
    public final OnCompleteListener<ResultT> f20310c;

    public zzb(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f20308a = executor;
        this.f20310c = onCompleteListener;
    }

    @Override // com.google.android.play.core.tasks.zzg
    /* renamed from: a */
    public final void mo11009a(Task<ResultT> task) {
        synchronized (this.f20309b) {
            if (this.f20310c == null) {
                return;
            }
            this.f20308a.execute(new zza(this, task));
        }
    }
}
