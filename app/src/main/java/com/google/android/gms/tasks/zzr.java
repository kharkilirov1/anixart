package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
final class zzr<TResult> {

    /* renamed from: a */
    public final Object f17287a = new Object();

    /* renamed from: b */
    @GuardedBy
    public Queue<zzq<TResult>> f17288b;

    /* renamed from: c */
    @GuardedBy
    public boolean f17289c;

    /* renamed from: a */
    public final void m9729a(@NonNull zzq<TResult> zzqVar) {
        synchronized (this.f17287a) {
            if (this.f17288b == null) {
                this.f17288b = new ArrayDeque();
            }
            this.f17288b.add(zzqVar);
        }
    }

    /* renamed from: b */
    public final void m9730b(@NonNull Task<TResult> task) {
        zzq<TResult> poll;
        synchronized (this.f17287a) {
            if (this.f17288b != null && !this.f17289c) {
                this.f17289c = true;
                while (true) {
                    synchronized (this.f17287a) {
                        poll = this.f17288b.poll();
                        if (poll == null) {
                            this.f17289c = false;
                            return;
                        }
                    }
                    poll.mo9727b(task);
                }
            }
        }
    }
}
