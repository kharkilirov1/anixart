package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: h */
    public volatile boolean f63001h;

    /* renamed from: g */
    public final Subscriber<? super T> f63000g = EmptySubscriber.INSTANCE;

    /* renamed from: i */
    public final AtomicReference<Subscription> f63002i = new AtomicReference<>();

    /* renamed from: j */
    public final AtomicLong f63003j = new AtomicLong(Long.MAX_VALUE);

    public enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f63001h) {
            return;
        }
        this.f63001h = true;
        SubscriptionHelper.m31797a(this.f63002i);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        Thread.currentThread();
        if (subscription == null) {
            this.f62810d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (this.f63002i.compareAndSet(null, subscription)) {
            this.f63000g.mo31352d(subscription);
            long andSet = this.f63003j.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
                return;
            }
            return;
        }
        subscription.cancel();
        if (this.f63002i.get() != SubscriptionHelper.CANCELLED) {
            this.f62810d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + subscription));
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f63002i.get() == null) {
                this.f62810d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f62811e++;
            this.f63000g.onComplete();
        } finally {
            this.f62808b.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f63002i.get() == null) {
                this.f62810d.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f62810d.add(th);
            if (th == null) {
                this.f62810d.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f63000g.onError(th);
        } finally {
            this.f62808b.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f63002i.get() == null) {
                this.f62810d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f62809c.add(t);
        if (t == null) {
            this.f62810d.add(new NullPointerException("onNext received a null value"));
        }
        this.f63000g.onNext(t);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
        SubscriptionHelper.m31798b(this.f63002i, this.f63003j, j2);
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f63001h;
    }
}
