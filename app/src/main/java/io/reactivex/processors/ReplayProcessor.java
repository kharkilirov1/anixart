package io.reactivex.processors;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: d */
    public static final Object[] f62871d = new Object[0];

    /* renamed from: c */
    public boolean f62872c;

    public static final class Node<T> extends AtomicReference<Node<T>> {
    }

    public interface ReplayBuffer<T> {
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62873b;

        /* renamed from: c */
        public final ReplayProcessor<T> f62874c;

        /* renamed from: d */
        public final AtomicLong f62875d = new AtomicLong();

        /* renamed from: e */
        public volatile boolean f62876e;

        public ReplaySubscription(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.f62873b = subscriber;
            this.f62874c = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f62876e) {
                return;
            }
            this.f62876e = true;
            Objects.requireNonNull(this.f62874c);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f62875d, j2);
                Objects.requireNonNull(this.f62874c);
                throw null;
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
    }

    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new ReplaySubscription(subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62872c) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62872c) {
            return;
        }
        this.f62872c = true;
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62872c) {
            RxJavaPlugins.m31848b(th);
        } else {
            this.f62872c = true;
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62872c) {
            throw null;
        }
    }
}
