package androidx.lifecycle;

import androidx.annotation.MainThread;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;

/* compiled from: DispatchQueue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "lifecycle-runtime-ktx_release"}, m31885k = 1, m31886mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class DispatchQueue {

    /* renamed from: b */
    public boolean f4563b;

    /* renamed from: c */
    public boolean f4564c;

    /* renamed from: a */
    public boolean f4562a = true;

    /* renamed from: d */
    public final Queue<Runnable> f4565d = new ArrayDeque();

    @MainThread
    /* renamed from: a */
    public final boolean m3180a() {
        return this.f4563b || !this.f4562a;
    }

    @MainThread
    /* renamed from: b */
    public final void m3181b() {
        if (this.f4564c) {
            return;
        }
        try {
            this.f4564c = true;
            while ((!this.f4565d.isEmpty()) && m3180a()) {
                Runnable poll = this.f4565d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f4564c = false;
        }
    }

    @MainThread
    /* renamed from: c */
    public final void m3182c(Runnable runnable) {
        if (!this.f4565d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        m3181b();
    }
}
