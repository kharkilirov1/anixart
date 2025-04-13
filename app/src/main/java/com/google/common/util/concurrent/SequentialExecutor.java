package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: classes2.dex */
final class SequentialExecutor implements Executor {

    /* renamed from: b */
    public static final Logger f22212b = Logger.getLogger(SequentialExecutor.class.getName());

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$1 */
    public class RunnableC20211 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f22213b;

        @Override // java.lang.Runnable
        public void run() {
            this.f22213b.run();
        }

        public String toString() {
            return this.f22213b.toString();
        }
    }

    public final class QueueWorker implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Logger logger = SequentialExecutor.f22212b;
                Objects.requireNonNull(null);
                throw null;
            } finally {
            }
        }

        public String toString() {
            throw null;
        }
    }

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable);
        throw null;
    }

    public String toString() {
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder("null".length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
