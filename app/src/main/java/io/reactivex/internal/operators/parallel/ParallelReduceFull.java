package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {

    public static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final ParallelReduceFullMainSubscriber<T> f62400b;

        /* renamed from: c */
        public final BiFunction<T, T, T> f62401c;

        /* renamed from: d */
        public T f62402d;

        /* renamed from: e */
        public boolean f62403e;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            int i2;
            if (this.f62403e) {
                return;
            }
            this.f62403e = true;
            ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber = this.f62400b;
            T t = this.f62402d;
            if (t != null) {
                while (true) {
                    SlotPair<T> slotPair = parallelReduceFullMainSubscriber.f62406f.get();
                    if (slotPair == null) {
                        slotPair = new SlotPair<>();
                        if (!parallelReduceFullMainSubscriber.f62406f.compareAndSet(null, slotPair)) {
                            continue;
                        }
                    }
                    while (true) {
                        i2 = slotPair.get();
                        if (i2 >= 2) {
                            i2 = -1;
                            break;
                        } else if (slotPair.compareAndSet(i2, i2 + 1)) {
                            break;
                        }
                    }
                    if (i2 >= 0) {
                        if (i2 == 0) {
                            slotPair.f62409b = t;
                        } else {
                            slotPair.f62410c = t;
                        }
                        if (slotPair.f62411d.incrementAndGet() == 2) {
                            parallelReduceFullMainSubscriber.f62406f.compareAndSet(slotPair, null);
                        } else {
                            slotPair = null;
                        }
                        if (slotPair == null) {
                            break;
                        }
                        try {
                            t = parallelReduceFullMainSubscriber.f62405e.apply(slotPair.f62409b, slotPair.f62410c);
                            Objects.requireNonNull(t, "The reducer returned a null value");
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            parallelReduceFullMainSubscriber.m31754b(th);
                            return;
                        }
                    } else {
                        parallelReduceFullMainSubscriber.f62406f.compareAndSet(slotPair, null);
                    }
                }
            }
            if (parallelReduceFullMainSubscriber.f62407g.decrementAndGet() == 0) {
                SlotPair<T> slotPair2 = parallelReduceFullMainSubscriber.f62406f.get();
                parallelReduceFullMainSubscriber.f62406f.lazySet(null);
                if (slotPair2 != null) {
                    parallelReduceFullMainSubscriber.m31789f(slotPair2.f62409b);
                } else {
                    parallelReduceFullMainSubscriber.f62765b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62403e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62403e = true;
                this.f62400b.m31754b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62403e) {
                return;
            }
            T t2 = this.f62402d;
            if (t2 == null) {
                this.f62402d = t;
                return;
            }
            try {
                T apply = this.f62401c.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f62402d = apply;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                get().cancel();
                onError(th);
            }
        }
    }

    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {

        /* renamed from: d */
        public final ParallelReduceFullInnerSubscriber<T>[] f62404d;

        /* renamed from: e */
        public final BiFunction<T, T, T> f62405e;

        /* renamed from: f */
        public final AtomicReference<SlotPair<T>> f62406f;

        /* renamed from: g */
        public final AtomicInteger f62407g;

        /* renamed from: h */
        public final AtomicReference<Throwable> f62408h;

        /* renamed from: b */
        public void m31754b(Throwable th) {
            if (this.f62408h.compareAndSet(null, th)) {
                cancel();
                this.f62765b.onError(th);
            } else if (th != this.f62408h.get()) {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            for (ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.f62404d) {
                SubscriptionHelper.m31797a(parallelReduceFullInnerSubscriber);
            }
        }
    }

    public static final class SlotPair<T> extends AtomicInteger {

        /* renamed from: b */
        public T f62409b;

        /* renamed from: c */
        public T f62410c;

        /* renamed from: d */
        public final AtomicInteger f62411d = new AtomicInteger();
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        throw null;
    }
}
