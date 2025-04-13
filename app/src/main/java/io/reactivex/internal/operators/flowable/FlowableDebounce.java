package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60017b;

        /* renamed from: d */
        public Subscription f60019d;

        /* renamed from: f */
        public volatile long f60021f;

        /* renamed from: g */
        public boolean f60022g;

        /* renamed from: e */
        public final AtomicReference<Disposable> f60020e = new AtomicReference<>();

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<U>> f60018c = null;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {

            /* renamed from: c */
            public final DebounceSubscriber<T, U> f60023c;

            /* renamed from: d */
            public final long f60024d;

            /* renamed from: e */
            public final T f60025e;

            /* renamed from: f */
            public boolean f60026f;

            /* renamed from: g */
            public final AtomicBoolean f60027g = new AtomicBoolean();

            public DebounceInnerSubscriber(DebounceSubscriber<T, U> debounceSubscriber, long j2, T t) {
                this.f60023c = debounceSubscriber;
                this.f60024d = j2;
                this.f60025e = t;
            }

            /* renamed from: a */
            public void m31484a() {
                if (this.f60027g.compareAndSet(false, true)) {
                    DebounceSubscriber<T, U> debounceSubscriber = this.f60023c;
                    long j2 = this.f60024d;
                    T t = this.f60025e;
                    if (j2 == debounceSubscriber.f60021f) {
                        if (debounceSubscriber.get() != 0) {
                            debounceSubscriber.f60017b.onNext(t);
                            BackpressureHelper.m31812e(debounceSubscriber, 1L);
                        } else {
                            debounceSubscriber.cancel();
                            debounceSubscriber.f60017b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                        }
                    }
                }
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                if (this.f60026f) {
                    return;
                }
                this.f60026f = true;
                m31484a();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                if (this.f60026f) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                this.f60026f = true;
                DebounceSubscriber<T, U> debounceSubscriber = this.f60023c;
                DisposableHelper.m31409a(debounceSubscriber.f60020e);
                debounceSubscriber.f60017b.onError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(U u) {
                if (this.f60026f) {
                    return;
                }
                this.f60026f = true;
                SubscriptionHelper.m31797a(this.f62988b);
                m31484a();
            }
        }

        public DebounceSubscriber(Subscriber<? super T> subscriber, Function<? super T, ? extends Publisher<U>> function) {
            this.f60017b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60019d.cancel();
            DisposableHelper.m31409a(this.f60020e);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60019d, subscription)) {
                this.f60019d = subscription;
                this.f60017b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60022g) {
                return;
            }
            this.f60022g = true;
            Disposable disposable = this.f60020e.get();
            if (DisposableHelper.m31410b(disposable)) {
                return;
            }
            ((DebounceInnerSubscriber) disposable).m31484a();
            DisposableHelper.m31409a(this.f60020e);
            this.f60017b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f60020e);
            this.f60017b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60022g) {
                return;
            }
            long j2 = this.f60021f + 1;
            this.f60021f = j2;
            Disposable disposable = this.f60020e.get();
            if (disposable != null) {
                disposable.mo31379f();
            }
            try {
                Publisher<U> apply = this.f60018c.apply(t);
                Objects.requireNonNull(apply, "The publisher supplied is null");
                Publisher<U> publisher = apply;
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j2, t);
                if (this.f60020e.compareAndSet(disposable, debounceInnerSubscriber)) {
                    publisher.mo31351g(debounceInnerSubscriber);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                this.f60017b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this, j2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new DebounceSubscriber(new SerializedSubscriber(subscriber), null));
    }
}
