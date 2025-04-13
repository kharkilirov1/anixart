package androidx.room;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class TransactionExecutor implements Executor {

    /* renamed from: b */
    public final Executor f5890b;

    /* renamed from: c */
    public final ArrayDeque<Runnable> f5891c = new ArrayDeque<>();

    /* renamed from: d */
    public Runnable f5892d;

    public TransactionExecutor(@NonNull Executor executor) {
        this.f5890b = executor;
    }

    /* renamed from: a */
    public synchronized void m4091a() {
        Runnable poll = this.f5891c.poll();
        this.f5892d = poll;
        if (poll != null) {
            this.f5890b.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.f5891c.offer(new Runnable() { // from class: androidx.room.TransactionExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    TransactionExecutor.this.m4091a();
                }
            }
        });
        if (this.f5892d == null) {
            m4091a();
        }
    }
}
