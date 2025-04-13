package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableAmb<T> extends Flowable<T> {

    public static final class AmbCoordinator<T> implements Subscription {

        /* renamed from: b */
        public final AmbInnerSubscriber<T>[] f59813b;

        /* renamed from: c */
        public final AtomicInteger f59814c;

        /* renamed from: a */
        public boolean m31453a(int i2) {
            int i3 = 0;
            if (this.f59814c.get() != 0 || !this.f59814c.compareAndSet(0, i2)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.f59813b;
            int length = ambInnerSubscriberArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i2) {
                    SubscriptionHelper.m31797a(ambInnerSubscriberArr[i3]);
                }
                i3 = i4;
            }
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f59814c.get() != -1) {
                this.f59814c.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.f59813b) {
                    SubscriptionHelper.m31797a(ambInnerSubscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                int i2 = this.f59814c.get();
                if (i2 > 0) {
                    AmbInnerSubscriber<T> ambInnerSubscriber = this.f59813b[i2 - 1];
                    SubscriptionHelper.m31798b(ambInnerSubscriber, ambInnerSubscriber.f59819f, j2);
                } else if (i2 == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber2 : this.f59813b) {
                        SubscriptionHelper.m31798b(ambInnerSubscriber2, ambInnerSubscriber2.f59819f, j2);
                    }
                }
            }
        }
    }

    public static final class AmbInnerSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final AmbCoordinator<T> f59815b;

        /* renamed from: c */
        public final int f59816c;

        /* renamed from: d */
        public final Subscriber<? super T> f59817d;

        /* renamed from: e */
        public boolean f59818e;

        /* renamed from: f */
        public final AtomicLong f59819f;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this, this.f59819f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59818e) {
                this.f59817d.onComplete();
            } else if (!this.f59815b.m31453a(this.f59816c)) {
                get().cancel();
            } else {
                this.f59818e = true;
                this.f59817d.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59818e) {
                this.f59817d.onError(th);
            } else if (this.f59815b.m31453a(this.f59816c)) {
                this.f59818e = true;
                this.f59817d.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59818e) {
                this.f59817d.onNext(t);
            } else if (!this.f59815b.m31453a(this.f59816c)) {
                get().cancel();
            } else {
                this.f59818e = true;
                this.f59817d.onNext(t);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this, this.f59819f, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
