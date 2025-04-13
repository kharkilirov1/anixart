package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class RunnableFutureTask<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b */
    public final ConditionVariable f14708b = new ConditionVariable();

    /* renamed from: c */
    public final ConditionVariable f14709c = new ConditionVariable();

    /* renamed from: d */
    public final Object f14710d = new Object();

    /* renamed from: e */
    @Nullable
    public Exception f14711e;

    /* renamed from: f */
    @Nullable
    public R f14712f;

    /* renamed from: g */
    @Nullable
    public Thread f14713g;

    /* renamed from: h */
    public boolean f14714h;

    /* renamed from: a */
    public void mo6753a() {
    }

    @UnknownNull
    /* renamed from: b */
    public abstract R mo6754b() throws Exception;

    @UnknownNull
    /* renamed from: c */
    public final R m7675c() throws ExecutionException {
        if (this.f14714h) {
            throw new CancellationException();
        }
        if (this.f14711e == null) {
            return this.f14712f;
        }
        throw new ExecutionException(this.f14711e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f14710d) {
            if (!this.f14714h && !this.f14709c.m7537d()) {
                this.f14714h = true;
                mo6753a();
                Thread thread = this.f14713g;
                if (thread == null) {
                    this.f14708b.m7538e();
                    this.f14709c.m7538e();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get() throws ExecutionException, InterruptedException {
        this.f14709c.m7534a();
        return m7675c();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14714h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14709c.m7537d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f14710d) {
            if (this.f14714h) {
                return;
            }
            this.f14713g = Thread.currentThread();
            this.f14708b.m7538e();
            try {
                try {
                    this.f14712f = mo6754b();
                    synchronized (this.f14710d) {
                        this.f14709c.m7538e();
                        this.f14713g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e2) {
                    this.f14711e = e2;
                    synchronized (this.f14710d) {
                        this.f14709c.m7538e();
                        this.f14713g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f14710d) {
                    this.f14709c.m7538e();
                    this.f14713g = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    @UnknownNull
    public final R get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        ConditionVariable conditionVariable = this.f14709c;
        synchronized (conditionVariable) {
            if (convert <= 0) {
                z = conditionVariable.f14623b;
            } else {
                long mo7527a = conditionVariable.f14622a.mo7527a();
                long j3 = convert + mo7527a;
                if (j3 < mo7527a) {
                    conditionVariable.m7534a();
                } else {
                    while (!conditionVariable.f14623b && mo7527a < j3) {
                        conditionVariable.wait(j3 - mo7527a);
                        mo7527a = conditionVariable.f14622a.mo7527a();
                    }
                }
                z = conditionVariable.f14623b;
            }
        }
        if (z) {
            return m7675c();
        }
        throw new TimeoutException();
    }
}
