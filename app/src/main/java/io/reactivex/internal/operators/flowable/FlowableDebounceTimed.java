package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* renamed from: b */
        public final T f60028b;

        /* renamed from: c */
        public final long f60029c;

        /* renamed from: d */
        public final DebounceTimedSubscriber<T> f60030d;

        /* renamed from: e */
        public final AtomicBoolean f60031e = new AtomicBoolean();

        public DebounceEmitter(T t, long j2, DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.f60028b = t;
            this.f60029c = j2;
            this.f60030d = debounceTimedSubscriber;
        }

        /* renamed from: a */
        public void m31485a() {
            if (this.f60031e.compareAndSet(false, true)) {
                DebounceTimedSubscriber<T> debounceTimedSubscriber = this.f60030d;
                long j2 = this.f60029c;
                T t = this.f60028b;
                if (j2 == debounceTimedSubscriber.f60038h) {
                    if (debounceTimedSubscriber.get() == 0) {
                        debounceTimedSubscriber.cancel();
                        debounceTimedSubscriber.f60032b.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        debounceTimedSubscriber.f60032b.onNext(t);
                        BackpressureHelper.m31812e(debounceTimedSubscriber, 1L);
                        DisposableHelper.m31409a(this);
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            m31485a();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60032b;

        /* renamed from: c */
        public final long f60033c;

        /* renamed from: d */
        public final TimeUnit f60034d;

        /* renamed from: e */
        public final Scheduler.Worker f60035e;

        /* renamed from: f */
        public Subscription f60036f;

        /* renamed from: g */
        public Disposable f60037g;

        /* renamed from: h */
        public volatile long f60038h;

        /* renamed from: i */
        public boolean f60039i;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60036f.cancel();
            this.f60035e.mo31379f();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60036f, subscription)) {
                this.f60036f = subscription;
                this.f60032b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60039i) {
                return;
            }
            this.f60039i = true;
            Disposable disposable = this.f60037g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.m31485a();
            }
            this.f60032b.onComplete();
            this.f60035e.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60039i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60039i = true;
            Disposable disposable = this.f60037g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            this.f60032b.onError(th);
            this.f60035e.mo31379f();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60039i) {
                return;
            }
            long j2 = this.f60038h + 1;
            this.f60038h = j2;
            Disposable disposable = this.f60037g;
            if (disposable != null) {
                disposable.mo31379f();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t, j2, this);
            this.f60037g = debounceEmitter;
            DisposableHelper.m31411c(debounceEmitter, this.f60035e.mo31383c(debounceEmitter, this.f60033c, this.f60034d));
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
        throw null;
    }
}
