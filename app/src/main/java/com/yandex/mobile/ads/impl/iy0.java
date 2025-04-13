package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class iy0<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b */
    private final C4813ak f51462b = new C4813ak();

    /* renamed from: c */
    private final C4813ak f51463c = new C4813ak();

    /* renamed from: d */
    private final Object f51464d = new Object();

    /* renamed from: e */
    @Nullable
    private Exception f51465e;

    /* renamed from: f */
    @Nullable
    private Thread f51466f;

    /* renamed from: g */
    private boolean f51467g;

    /* renamed from: a */
    public final void m25748a() {
        this.f51463c.m22533b();
    }

    /* renamed from: b */
    public abstract void mo22320b();

    /* renamed from: c */
    public abstract void mo22321c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f51464d) {
            if (!this.f51467g && !this.f51463c.m22535d()) {
                this.f51467g = true;
                mo22320b();
                Thread thread = this.f51466f;
                if (thread == null) {
                    this.f51462b.m22536e();
                    this.f51463c.m22536e();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f51463c.m22531a();
        if (this.f51467g) {
            throw new CancellationException();
        }
        if (this.f51465e == null) {
            return null;
        }
        throw new ExecutionException(this.f51465e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f51467g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f51463c.m22535d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f51464d) {
            if (this.f51467g) {
                return;
            }
            this.f51466f = Thread.currentThread();
            this.f51462b.m22536e();
            try {
                try {
                    mo22321c();
                    synchronized (this.f51464d) {
                        this.f51463c.m22536e();
                        this.f51466f = null;
                        Thread.interrupted();
                    }
                } catch (Exception e2) {
                    this.f51465e = e2;
                    synchronized (this.f51464d) {
                        this.f51463c.m22536e();
                        this.f51466f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f51464d) {
                    this.f51463c.m22536e();
                    this.f51466f = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f51463c.m22532a(TimeUnit.MILLISECONDS.convert(j2, timeUnit))) {
            if (!this.f51467g) {
                if (this.f51465e == null) {
                    return null;
                }
                throw new ExecutionException(this.f51465e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
