package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@Beta
/* loaded from: classes2.dex */
public final class ExecutionSequencer {

    /* renamed from: a */
    public ThreadConfinedTaskQueue f22172a;

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1 */
    class C20021 implements AsyncCallable<Object> {
        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2 */
    class C20032 implements AsyncCallable<Object> {
        public String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$3 */
    class RunnableC20043 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        /* renamed from: b */
        public Runnable f22177b;

        /* renamed from: c */
        public Thread f22178c;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                return;
            }
            this.f22178c = Thread.currentThread();
            try {
                throw null;
            } catch (Throwable th) {
                this.f22178c = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread currentThread = Thread.currentThread();
            if (currentThread == this.f22178c) {
                new ThreadConfinedTaskQueue(null).f22179a = currentThread;
                throw null;
            }
            Runnable runnable = this.f22177b;
            this.f22177b = null;
            runnable.run();
        }
    }

    public static final class ThreadConfinedTaskQueue {

        /* renamed from: a */
        public Thread f22179a;

        public ThreadConfinedTaskQueue() {
        }

        public ThreadConfinedTaskQueue(C20021 c20021) {
        }
    }

    public ExecutionSequencer() {
        new AtomicReference(ImmediateFuture.f22189c);
        this.f22172a = new ThreadConfinedTaskQueue(null);
    }
}
