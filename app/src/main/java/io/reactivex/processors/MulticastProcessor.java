package io.reactivex.processors;

import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

@SchedulerSupport
@BackpressureSupport
/* loaded from: classes3.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {

    public static final class MulticastSubscription<T> extends AtomicLong implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62863b;

        /* renamed from: c */
        public final MulticastProcessor<T> f62864c;

        public MulticastSubscription(Subscriber<? super T> subscriber, MulticastProcessor<T> multicastProcessor) {
            this.f62863b = subscriber;
            this.f62864c = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            Objects.requireNonNull(this.f62864c);
            throw null;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            long j3;
            long j4;
            if (SubscriptionHelper.m31803h(j2)) {
                do {
                    j3 = get();
                    if (j3 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j3 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j4 = j3 + j2;
                    }
                } while (!compareAndSet(j3, j4 >= 0 ? j4 : Long.MAX_VALUE));
                Objects.requireNonNull(this.f62864c);
                throw null;
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        subscriber.mo31352d(new MulticastSubscription(subscriber, this));
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        SubscriptionHelper.m31801e(null, subscription);
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        throw null;
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        throw null;
    }
}
