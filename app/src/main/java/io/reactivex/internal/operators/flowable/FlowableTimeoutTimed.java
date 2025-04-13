package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60764b;

        /* renamed from: c */
        public final SubscriptionArbiter f60765c;

        public FallbackSubscriber(Subscriber<? super T> subscriber, SubscriptionArbiter subscriptionArbiter) {
            this.f60764b = subscriber;
            this.f60765c = subscriptionArbiter;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            this.f60765c.m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60764b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60764b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60764b.onNext(t);
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {

        /* renamed from: j */
        public final Subscriber<? super T> f60766j;

        /* renamed from: k */
        public final long f60767k;

        /* renamed from: l */
        public final TimeUnit f60768l;

        /* renamed from: m */
        public final Scheduler.Worker f60769m;

        /* renamed from: n */
        public final SequentialDisposable f60770n;

        /* renamed from: o */
        public final AtomicReference<Subscription> f60771o;

        /* renamed from: p */
        public final AtomicLong f60772p;

        /* renamed from: q */
        public long f60773q;

        /* renamed from: r */
        public Publisher<? extends T> f60774r;

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31595b(long j2) {
            if (this.f60772p.compareAndSet(j2, Long.MAX_VALUE)) {
                SubscriptionHelper.m31797a(this.f60771o);
                long j3 = this.f60773q;
                if (j3 != 0) {
                    m31795f(j3);
                }
                Publisher<? extends T> publisher = this.f60774r;
                this.f60774r = null;
                publisher.mo31351g(new FallbackSubscriber(this.f60766j, this));
                this.f60769m.mo31379f();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f60769m.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60771o, subscription)) {
                m31796g(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60772p.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f60770n);
                this.f60766j.onComplete();
                this.f60769m.mo31379f();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60772p.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f60770n);
            this.f60766j.onError(th);
            this.f60769m.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60772p.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.f60772p.compareAndSet(j2, j3)) {
                    this.f60770n.get().mo31379f();
                    this.f60773q++;
                    this.f60766j.onNext(t);
                    DisposableHelper.m31411c(this.f60770n, this.f60769m.mo31383c(new TimeoutTask(j3, this), this.f60767k, this.f60768l));
                }
            }
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, TimeoutSupport {

        /* renamed from: b */
        public final Subscriber<? super T> f60775b;

        /* renamed from: c */
        public final long f60776c;

        /* renamed from: d */
        public final TimeUnit f60777d;

        /* renamed from: e */
        public final Scheduler.Worker f60778e;

        /* renamed from: f */
        public final SequentialDisposable f60779f;

        /* renamed from: g */
        public final AtomicReference<Subscription> f60780g;

        /* renamed from: h */
        public final AtomicLong f60781h;

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31595b(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                SubscriptionHelper.m31797a(this.f60780g);
                this.f60775b.onError(new TimeoutException(ExceptionHelper.m31820d(this.f60776c, this.f60777d)));
                this.f60778e.mo31379f();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60780g);
            this.f60778e.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60780g, this.f60781h, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f60779f);
                this.f60775b.onComplete();
                this.f60778e.mo31379f();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f60779f);
            this.f60775b.onError(th);
            this.f60778e.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    this.f60779f.get().mo31379f();
                    this.f60775b.onNext(t);
                    DisposableHelper.m31411c(this.f60779f, this.f60778e.mo31383c(new TimeoutTask(j3, this), this.f60776c, this.f60777d));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60780g, this.f60781h, j2);
        }
    }

    public interface TimeoutSupport {
        /* renamed from: b */
        void mo31595b(long j2);
    }

    public static final class TimeoutTask implements Runnable {

        /* renamed from: b */
        public final TimeoutSupport f60782b;

        /* renamed from: c */
        public final long f60783c;

        public TimeoutTask(long j2, TimeoutSupport timeoutSupport) {
            this.f60783c = j2;
            this.f60782b = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60782b.mo31595b(this.f60783c);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
