package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class SerializingExecutor implements Executor, Runnable {

    /* renamed from: e */
    public static final Logger f59077e = Logger.getLogger(SerializingExecutor.class.getName());

    /* renamed from: f */
    public static final AtomicHelper f59078f;

    /* renamed from: b */
    public Executor f59079b;

    /* renamed from: c */
    public final Queue<Runnable> f59080c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public volatile int f59081d = 0;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        /* renamed from: a */
        public abstract boolean mo31178a(SerializingExecutor serializingExecutor, int i2, int i3);

        /* renamed from: b */
        public abstract void mo31179b(SerializingExecutor serializingExecutor, int i2);

        public AtomicHelper(C64601 c64601) {
        }
    }

    public static final class FieldUpdaterAtomicHelper extends AtomicHelper {

        /* renamed from: a */
        public final AtomicIntegerFieldUpdater<SerializingExecutor> f59082a;

        public FieldUpdaterAtomicHelper(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C64601 c64601) {
            super(null);
            this.f59082a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        /* renamed from: a */
        public boolean mo31178a(SerializingExecutor serializingExecutor, int i2, int i3) {
            return this.f59082a.compareAndSet(serializingExecutor, i2, i3);
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        /* renamed from: b */
        public void mo31179b(SerializingExecutor serializingExecutor, int i2) {
            this.f59082a.set(serializingExecutor, i2);
        }
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        public SynchronizedAtomicHelper() {
            super(null);
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        /* renamed from: a */
        public boolean mo31178a(SerializingExecutor serializingExecutor, int i2, int i3) {
            synchronized (serializingExecutor) {
                if (serializingExecutor.f59081d != i2) {
                    return false;
                }
                serializingExecutor.f59081d = i3;
                return true;
            }
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        /* renamed from: b */
        public void mo31179b(SerializingExecutor serializingExecutor, int i2) {
            synchronized (serializingExecutor) {
                serializingExecutor.f59081d = i2;
            }
        }

        public SynchronizedAtomicHelper(C64601 c64601) {
            super(null);
        }
    }

    static {
        AtomicHelper synchronizedAtomicHelper;
        try {
            synchronizedAtomicHelper = new FieldUpdaterAtomicHelper(AtomicIntegerFieldUpdater.newUpdater(SerializingExecutor.class, "d"), null);
        } catch (Throwable th) {
            f59077e.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            synchronizedAtomicHelper = new SynchronizedAtomicHelper(null);
        }
        f59078f = synchronizedAtomicHelper;
    }

    public SerializingExecutor(Executor executor) {
        Preconditions.m11187k(executor, "'executor' must not be null.");
        this.f59079b = executor;
    }

    /* renamed from: a */
    public final void m31177a(@Nullable Runnable runnable) {
        if (f59078f.mo31178a(this, 0, -1)) {
            try {
                this.f59079b.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f59080c.remove(runnable);
                }
                f59078f.mo31179b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Queue<Runnable> queue = this.f59080c;
        Preconditions.m11187k(runnable, "'r' must not be null.");
        queue.add(runnable);
        m31177a(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f59079b;
            while (executor == this.f59079b && (poll = this.f59080c.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e2) {
                    f59077e.log(Level.SEVERE, "Exception while executing runnable " + poll, (Throwable) e2);
                }
            }
            f59078f.mo31179b(this, 0);
            if (this.f59080c.isEmpty()) {
                return;
            }
            m31177a(null);
        } catch (Throwable th) {
            f59078f.mo31179b(this, 0);
            throw th;
        }
    }
}
