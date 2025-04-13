package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzh<ResultT> {

    /* renamed from: a */
    public final Object f20321a = new Object();

    /* renamed from: b */
    @GuardedBy
    public Queue<zzg<ResultT>> f20322b;

    /* renamed from: c */
    @GuardedBy
    public boolean f20323c;

    /* renamed from: a */
    public final void m11010a(zzg<ResultT> zzgVar) {
        synchronized (this.f20321a) {
            if (this.f20322b == null) {
                this.f20322b = new ArrayDeque();
            }
            this.f20322b.add(zzgVar);
        }
    }

    /* renamed from: b */
    public final void m11011b(Task<ResultT> task) {
        zzg<ResultT> poll;
        synchronized (this.f20321a) {
            if (this.f20322b != null && !this.f20323c) {
                this.f20323c = true;
                while (true) {
                    synchronized (this.f20321a) {
                        poll = this.f20322b.poll();
                        if (poll == null) {
                            this.f20323c = false;
                            return;
                        }
                    }
                    poll.mo11009a(task);
                }
            }
        }
    }
}
