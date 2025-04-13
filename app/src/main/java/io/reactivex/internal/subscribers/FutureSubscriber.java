package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, Subscription {

    /* renamed from: b */
    public T f62734b;

    /* renamed from: c */
    public Throwable f62735c;

    /* renamed from: d */
    public final AtomicReference<Subscription> f62736d;

    public FutureSubscriber() {
        super(1);
        this.f62736d = new AtomicReference<>();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Subscription subscription;
        SubscriptionHelper subscriptionHelper;
        do {
            subscription = this.f62736d.get();
            if (subscription == this || subscription == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!this.f62736d.compareAndSet(subscription, subscriptionHelper));
        if (subscription != null) {
            subscription.cancel();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        SubscriptionHelper.m31802f(this.f62736d, subscription, Long.MAX_VALUE);
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f62735c;
        if (th == null) {
            return this.f62734b;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f62736d.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Subscription subscription;
        if (this.f62734b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            subscription = this.f62736d.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!this.f62736d.compareAndSet(subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Subscription subscription;
        do {
            subscription = this.f62736d.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62735c = th;
        } while (!this.f62736d.compareAndSet(subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62734b == null) {
            this.f62734b = t;
        } else {
            this.f62736d.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j2, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.m31820d(j2, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.f62735c;
            if (th == null) {
                return this.f62734b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
