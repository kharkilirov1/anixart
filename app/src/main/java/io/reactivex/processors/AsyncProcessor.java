package io.reactivex.processors;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class AsyncProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: f */
    public static final AsyncSubscription[] f62840f = new AsyncSubscription[0];

    /* renamed from: g */
    public static final AsyncSubscription[] f62841g = new AsyncSubscription[0];

    /* renamed from: c */
    public final AtomicReference<AsyncSubscription<T>[]> f62842c = new AtomicReference<>(f62840f);

    /* renamed from: d */
    public Throwable f62843d;

    /* renamed from: e */
    public T f62844e;

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {

        /* renamed from: d */
        public final AsyncProcessor<T> f62845d;

        public AsyncSubscription(Subscriber<? super T> subscriber, AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.f62845d = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(4) != 4) {
                this.f62845d.m31849h(this);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        boolean z;
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(subscriber, this);
        subscriber.mo31352d(asyncSubscription);
        while (true) {
            AsyncSubscription<T>[] asyncSubscriptionArr = this.f62842c.get();
            z = false;
            if (asyncSubscriptionArr == f62841g) {
                break;
            }
            int length = asyncSubscriptionArr.length;
            AsyncSubscription<T>[] asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
            if (this.f62842c.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (asyncSubscription.m31790h()) {
                m31849h(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th = this.f62843d;
        if (th != null) {
            subscriber.onError(th);
            return;
        }
        T t = this.f62844e;
        if (t != null) {
            asyncSubscription.m31789f(t);
        } else {
            if (asyncSubscription.m31790h()) {
                return;
            }
            asyncSubscription.f62765b.onComplete();
        }
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (this.f62842c.get() == f62841g) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: h */
    public void m31849h(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription<T>[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f62842c.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (asyncSubscriptionArr[i2] == asyncSubscription) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = f62840f;
            } else {
                AsyncSubscription<T>[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i2);
                System.arraycopy(asyncSubscriptionArr, i2 + 1, asyncSubscriptionArr3, i2, (length - i2) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!this.f62842c.compareAndSet(asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f62842c.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f62841g;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t = this.f62844e;
        AsyncSubscription<T>[] andSet = this.f62842c.getAndSet(asyncSubscriptionArr2);
        int i2 = 0;
        if (t != null) {
            int length = andSet.length;
            while (i2 < length) {
                andSet[i2].m31789f(t);
                i2++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i2 < length2) {
            AsyncSubscription<T> asyncSubscription = andSet[i2];
            if (!asyncSubscription.m31790h()) {
                asyncSubscription.f62765b.onComplete();
            }
            i2++;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f62842c.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f62841g;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62844e = null;
        this.f62843d = th;
        for (AsyncSubscription<T> asyncSubscription : this.f62842c.getAndSet(asyncSubscriptionArr2)) {
            if (asyncSubscription.m31790h()) {
                RxJavaPlugins.m31848b(th);
            } else {
                asyncSubscription.f62765b.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        Objects.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62842c.get() == f62841g) {
            return;
        }
        this.f62844e = t;
    }
}
