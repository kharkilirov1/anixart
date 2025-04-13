package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {

    /* renamed from: l */
    public static final Waiter f8734l = new Waiter();

    /* renamed from: b */
    public final int f8735b;

    /* renamed from: c */
    public final int f8736c;

    /* renamed from: d */
    public final boolean f8737d;

    /* renamed from: e */
    public final Waiter f8738e;

    /* renamed from: f */
    @Nullable
    public R f8739f;

    /* renamed from: g */
    @Nullable
    public Request f8740g;

    /* renamed from: h */
    public boolean f8741h;

    /* renamed from: i */
    public boolean f8742i;

    /* renamed from: j */
    public boolean f8743j;

    /* renamed from: k */
    @Nullable
    public GlideException f8744k;

    @VisibleForTesting
    public static class Waiter {
    }

    public RequestFutureTarget(int i2, int i3) {
        Waiter waiter = f8734l;
        this.f8735b = i2;
        this.f8736c = i3;
        this.f8737d = true;
        this.f8738e = waiter;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: a */
    public void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public void mo4894b() {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: c */
    public synchronized void mo4877c(@NonNull R r, @Nullable Transition<? super R> transition) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        Request request;
        if (isDone()) {
            return false;
        }
        this.f8741h = true;
        Objects.requireNonNull(this.f8738e);
        notifyAll();
        if (z && (request = this.f8740g) != null) {
            request.clear();
            this.f8740g = null;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: d */
    public synchronized void mo5290d(@Nullable Request request) {
        this.f8740g = request;
    }

    @Override // com.bumptech.glide.request.RequestListener
    /* renamed from: e */
    public synchronized boolean mo5291e(@Nullable GlideException glideException, Object obj, Target<R> target, boolean z) {
        this.f8743j = true;
        this.f8744k = glideException;
        Objects.requireNonNull(this.f8738e);
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: f */
    public synchronized void mo5292f(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public void mo4896g() {
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m5297m(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.request.RequestListener
    /* renamed from: h */
    public synchronized boolean mo5293h(R r, Object obj, Target<R> target, DataSource dataSource, boolean z) {
        this.f8742i = true;
        this.f8739f = r;
        Objects.requireNonNull(this.f8738e);
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: i */
    public void mo5294i(@Nullable Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f8741h;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f8741h && !this.f8742i) {
            z = this.f8743j;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    /* renamed from: j */
    public synchronized Request mo5295j() {
        return this.f8740g;
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: k */
    public void mo5296k(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: l */
    public void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
        ((SingleRequest) sizeReadyCallback).mo5302e(this.f8735b, this.f8736c);
    }

    /* renamed from: m */
    public final synchronized R m5297m(Long l2) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f8737d && !isDone() && !Util.m5350g()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f8741h) {
            throw new CancellationException();
        }
        if (this.f8743j) {
            throw new ExecutionException(this.f8744k);
        }
        if (this.f8742i) {
            return this.f8739f;
        }
        if (l2 == null) {
            Objects.requireNonNull(this.f8738e);
            wait(0L);
        } else if (l2.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l2.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                Objects.requireNonNull(this.f8738e);
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f8743j) {
            throw new ExecutionException(this.f8744k);
        }
        if (this.f8741h) {
            throw new CancellationException();
        }
        if (!this.f8742i) {
            throw new TimeoutException();
        }
        return this.f8739f;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m5297m(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
