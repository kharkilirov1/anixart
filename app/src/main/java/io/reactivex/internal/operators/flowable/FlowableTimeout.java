package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {

    public static final class TimeoutConsumer extends AtomicReference<Subscription> implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final TimeoutSelectorSupport f60750b;

        /* renamed from: c */
        public final long f60751c;

        public TimeoutConsumer(long j2, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.f60751c = j2;
            this.f60750b = timeoutSelectorSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f60750b.mo31595b(this.f60751c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj == subscriptionHelper) {
                RxJavaPlugins.m31848b(th);
            } else {
                lazySet(subscriptionHelper);
                this.f60750b.mo31596c(this.f60751c, th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = (Subscription) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                lazySet(subscriptionHelper);
                this.f60750b.mo31595b(this.f60751c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == SubscriptionHelper.CANCELLED;
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {

        /* renamed from: j */
        public final Subscriber<? super T> f60752j;

        /* renamed from: k */
        public final Function<? super T, ? extends Publisher<?>> f60753k;

        /* renamed from: l */
        public final SequentialDisposable f60754l;

        /* renamed from: m */
        public final AtomicReference<Subscription> f60755m;

        /* renamed from: n */
        public final AtomicLong f60756n;

        /* renamed from: o */
        public Publisher<? extends T> f60757o;

        /* renamed from: p */
        public long f60758p;

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31595b(long j2) {
            if (this.f60756n.compareAndSet(j2, Long.MAX_VALUE)) {
                SubscriptionHelper.m31797a(this.f60755m);
                Publisher<? extends T> publisher = this.f60757o;
                this.f60757o = null;
                long j3 = this.f60758p;
                if (j3 != 0) {
                    m31795f(j3);
                }
                publisher.mo31351g(new FlowableTimeoutTimed.FallbackSubscriber(this.f60752j, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        /* renamed from: c */
        public void mo31596c(long j2, Throwable th) {
            if (!this.f60756n.compareAndSet(j2, Long.MAX_VALUE)) {
                RxJavaPlugins.m31848b(th);
            } else {
                SubscriptionHelper.m31797a(this.f60755m);
                this.f60752j.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            DisposableHelper.m31409a(this.f60754l);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60755m, subscription)) {
                m31796g(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60756n.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f60754l);
                this.f60752j.onComplete();
                DisposableHelper.m31409a(this.f60754l);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60756n.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            DisposableHelper.m31409a(this.f60754l);
            this.f60752j.onError(th);
            DisposableHelper.m31409a(this.f60754l);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60756n.get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 + 1;
                if (this.f60756n.compareAndSet(j2, j3)) {
                    Disposable disposable = this.f60754l.get();
                    if (disposable != null) {
                        disposable.mo31379f();
                    }
                    this.f60758p++;
                    this.f60752j.onNext(t);
                    try {
                        Publisher<?> apply = this.f60753k.apply(t);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null Publisher.");
                        Publisher<?> publisher = apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j3, this);
                        if (DisposableHelper.m31411c(this.f60754l, timeoutConsumer)) {
                            publisher.mo31351g(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60755m.get().cancel();
                        this.f60756n.getAndSet(Long.MAX_VALUE);
                        this.f60752j.onError(th);
                    }
                }
            }
        }
    }

    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        /* renamed from: c */
        void mo31596c(long j2, Throwable th);
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription, TimeoutSelectorSupport {

        /* renamed from: b */
        public final Subscriber<? super T> f60759b;

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<?>> f60760c = null;

        /* renamed from: d */
        public final SequentialDisposable f60761d = new SequentialDisposable();

        /* renamed from: e */
        public final AtomicReference<Subscription> f60762e = new AtomicReference<>();

        /* renamed from: f */
        public final AtomicLong f60763f = new AtomicLong();

        public TimeoutSubscriber(Subscriber<? super T> subscriber, Function<? super T, ? extends Publisher<?>> function) {
            this.f60759b = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        /* renamed from: b */
        public void mo31595b(long j2) {
            if (compareAndSet(j2, Long.MAX_VALUE)) {
                SubscriptionHelper.m31797a(this.f60762e);
                this.f60759b.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        /* renamed from: c */
        public void mo31596c(long j2, Throwable th) {
            if (!compareAndSet(j2, Long.MAX_VALUE)) {
                RxJavaPlugins.m31848b(th);
            } else {
                SubscriptionHelper.m31797a(this.f60762e);
                this.f60759b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60762e);
            DisposableHelper.m31409a(this.f60761d);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60762e, this.f60763f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                DisposableHelper.m31409a(this.f60761d);
                this.f60759b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f60761d);
                this.f60759b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = get();
            if (j2 != Long.MAX_VALUE) {
                long j3 = 1 + j2;
                if (compareAndSet(j2, j3)) {
                    Disposable disposable = this.f60761d.get();
                    if (disposable != null) {
                        disposable.mo31379f();
                    }
                    this.f60759b.onNext(t);
                    try {
                        Publisher<?> apply = this.f60760c.apply(t);
                        Objects.requireNonNull(apply, "The itemTimeoutIndicator returned a null Publisher.");
                        Publisher<?> publisher = apply;
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j3, this);
                        if (DisposableHelper.m31411c(this.f60761d, timeoutConsumer)) {
                            publisher.mo31351g(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        this.f60762e.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f60759b.onError(th);
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60762e, this.f60763f, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(subscriber, null);
        subscriber.mo31352d(timeoutSubscriber);
        this.f59782c.m31349b(timeoutSubscriber);
    }
}
