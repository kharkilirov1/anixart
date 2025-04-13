package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60317b;

        /* renamed from: c */
        public long f60318c;

        /* renamed from: d */
        public Subscription f60319d;

        public LimitSubscriber(Subscriber<? super T> subscriber, long j2) {
            this.f60317b = subscriber;
            this.f60318c = j2;
            lazySet(j2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60319d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60319d, subscription)) {
                if (this.f60318c == 0) {
                    subscription.cancel();
                    EmptySubscription.m31791a(this.f60317b);
                } else {
                    this.f60319d = subscription;
                    this.f60317b.mo31352d(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60318c > 0) {
                this.f60318c = 0L;
                this.f60317b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60318c <= 0) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60318c = 0L;
                this.f60317b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            long j2 = this.f60318c;
            if (j2 > 0) {
                long j3 = j2 - 1;
                this.f60318c = j3;
                this.f60317b.onNext(t);
                if (j3 == 0) {
                    this.f60319d.cancel();
                    this.f60317b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            long j3;
            long j4;
            if (SubscriptionHelper.m31803h(j2)) {
                do {
                    j3 = get();
                    if (j3 == 0) {
                        return;
                    } else {
                        j4 = j3 <= j2 ? j3 : j2;
                    }
                } while (!compareAndSet(j3, j3 - j4));
                this.f60319d.request(j4);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new LimitSubscriber(subscriber, 0L));
    }
}
