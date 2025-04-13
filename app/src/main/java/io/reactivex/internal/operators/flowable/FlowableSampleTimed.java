package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {

        /* renamed from: i */
        public final AtomicInteger f60564i;

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* renamed from: a */
        public void mo31576a() {
            m31577b();
            if (this.f60564i.decrementAndGet() == 0) {
                this.f60565b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60564i.incrementAndGet() == 2) {
                m31577b();
                if (this.f60564i.decrementAndGet() == 0) {
                    this.f60565b.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        public SampleTimedNoLast(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            super(subscriber, j2, null, null);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        /* renamed from: a */
        public void mo31576a() {
            this.f60565b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m31577b();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription, Runnable {

        /* renamed from: b */
        public final Subscriber<? super T> f60565b;

        /* renamed from: c */
        public final long f60566c;

        /* renamed from: d */
        public final TimeUnit f60567d;

        /* renamed from: e */
        public final Scheduler f60568e;

        /* renamed from: f */
        public final AtomicLong f60569f = new AtomicLong();

        /* renamed from: g */
        public final SequentialDisposable f60570g = new SequentialDisposable();

        /* renamed from: h */
        public Subscription f60571h;

        public SampleTimedSubscriber(Subscriber<? super T> subscriber, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            this.f60565b = subscriber;
            this.f60566c = j2;
            this.f60567d = timeUnit;
            this.f60568e = scheduler;
        }

        /* renamed from: a */
        public abstract void mo31576a();

        /* renamed from: b */
        public void m31577b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f60569f.get() != 0) {
                    this.f60565b.onNext(andSet);
                    BackpressureHelper.m31812e(this.f60569f, 1L);
                } else {
                    cancel();
                    this.f60565b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            DisposableHelper.m31409a(this.f60570g);
            this.f60571h.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60571h, subscription)) {
                this.f60571h = subscription;
                this.f60565b.mo31352d(this);
                SequentialDisposable sequentialDisposable = this.f60570g;
                Scheduler scheduler = this.f60568e;
                long j2 = this.f60566c;
                DisposableHelper.m31411c(sequentialDisposable, scheduler.mo31378e(this, j2, j2, this.f60567d));
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            DisposableHelper.m31409a(this.f60570g);
            mo31576a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f60570g);
            this.f60565b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60569f, j2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new SampleTimedNoLast(new SerializedSubscriber(subscriber), 0L, null, null));
    }
}
