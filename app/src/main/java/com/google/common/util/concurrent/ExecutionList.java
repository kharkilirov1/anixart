package com.google.common.util.concurrent;

import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class ExecutionList {

    /* renamed from: c */
    public static final Logger f22166c = Logger.getLogger(ExecutionList.class.getName());

    /* renamed from: a */
    @NullableDecl
    @GuardedBy
    public RunnableExecutorPair f22167a;

    /* renamed from: b */
    @GuardedBy
    public boolean f22168b;

    public static final class RunnableExecutorPair {

        /* renamed from: a */
        public final Runnable f22169a;

        /* renamed from: b */
        public final Executor f22170b;

        /* renamed from: c */
        @NullableDecl
        public RunnableExecutorPair f22171c;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f22169a = runnable;
            this.f22170b = executor;
            this.f22171c = runnableExecutorPair;
        }
    }

    /* renamed from: c */
    public static void m12183c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f22166c;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, C1008a.m6437d(valueOf2.length() + valueOf.length() + 57, "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }

    /* renamed from: a */
    public void m12184a(Runnable runnable, Executor executor) {
        Preconditions.m11187k(runnable, "Runnable was null.");
        Preconditions.m11187k(executor, "Executor was null.");
        synchronized (this) {
            if (this.f22168b) {
                m12183c(runnable, executor);
            } else {
                this.f22167a = new RunnableExecutorPair(runnable, executor, this.f22167a);
            }
        }
    }

    /* renamed from: b */
    public void m12185b() {
        synchronized (this) {
            if (this.f22168b) {
                return;
            }
            this.f22168b = true;
            RunnableExecutorPair runnableExecutorPair = this.f22167a;
            RunnableExecutorPair runnableExecutorPair2 = null;
            this.f22167a = null;
            while (runnableExecutorPair != null) {
                RunnableExecutorPair runnableExecutorPair3 = runnableExecutorPair.f22171c;
                runnableExecutorPair.f22171c = runnableExecutorPair2;
                runnableExecutorPair2 = runnableExecutorPair;
                runnableExecutorPair = runnableExecutorPair3;
            }
            while (runnableExecutorPair2 != null) {
                m12183c(runnableExecutorPair2.f22169a, runnableExecutorPair2.f22170b);
                runnableExecutorPair2 = runnableExecutorPair2.f22171c;
            }
        }
    }
}
