package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: e */
    public static final PublishSubscription[] f62865e = new PublishSubscription[0];

    /* renamed from: f */
    public static final PublishSubscription[] f62866f = new PublishSubscription[0];

    /* renamed from: c */
    public final AtomicReference<PublishSubscription<T>[]> f62867c = new AtomicReference<>(f62866f);

    /* renamed from: d */
    public Throwable f62868d;

    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62869b;

        /* renamed from: c */
        public final PublishProcessor<T> f62870c;

        public PublishSubscription(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.f62869b = subscriber;
            this.f62870c = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f62870c.m31854h(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31809b(this, j2);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        boolean z;
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(subscriber, this);
        subscriber.mo31352d(publishSubscription);
        while (true) {
            PublishSubscription<T>[] publishSubscriptionArr = this.f62867c.get();
            if (publishSubscriptionArr == f62865e) {
                z = false;
                break;
            }
            int length = publishSubscriptionArr.length;
            PublishSubscription<T>[] publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
            if (this.f62867c.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (publishSubscription.get() == Long.MIN_VALUE) {
                m31854h(publishSubscription);
            }
        } else {
            Throwable th = this.f62868d;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62867c.get() == f62865e) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: h */
    public void m31854h(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription<T>[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f62867c.get();
            if (publishSubscriptionArr == f62865e || publishSubscriptionArr == f62866f) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (publishSubscriptionArr[i2] == publishSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = f62866f;
            } else {
                PublishSubscription<T>[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i2);
                System.arraycopy(publishSubscriptionArr, i2 + 1, publishSubscriptionArr3, i2, (length - i2) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!this.f62867c.compareAndSet(publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f62867c.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f62865e;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.f62867c.getAndSet(publishSubscriptionArr2)) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f62869b.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f62867c.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f62865e;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62868d = th;
        for (PublishSubscription<T> publishSubscription : this.f62867c.getAndSet(publishSubscriptionArr2)) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f62869b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.f62867c.get()) {
            long j2 = publishSubscription.get();
            if (j2 != Long.MIN_VALUE) {
                if (j2 != 0) {
                    publishSubscription.f62869b.onNext(t);
                    BackpressureHelper.m31813f(publishSubscription, 1L);
                } else {
                    publishSubscription.cancel();
                    publishSubscription.f62869b.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }
}
