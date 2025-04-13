package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* renamed from: j */
        public final Subscriber<? super T> f59951j;

        /* renamed from: k */
        public final Publisher<? extends T>[] f59952k;

        /* renamed from: l */
        public final boolean f59953l;

        /* renamed from: m */
        public final AtomicInteger f59954m;

        /* renamed from: n */
        public int f59955n;

        /* renamed from: o */
        public List<Throwable> f59956o;

        /* renamed from: p */
        public long f59957p;

        public ConcatArraySubscriber(Publisher<? extends T>[] publisherArr, boolean z, Subscriber<? super T> subscriber) {
            super(false);
            this.f59951j = subscriber;
            this.f59952k = null;
            this.f59953l = z;
            this.f59954m = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59954m.getAndIncrement() == 0) {
                Publisher<? extends T>[] publisherArr = this.f59952k;
                int length = publisherArr.length;
                int i2 = this.f59955n;
                while (i2 != length) {
                    Publisher<? extends T> publisher = publisherArr[i2];
                    if (publisher == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f59953l) {
                            this.f59951j.onError(nullPointerException);
                            return;
                        }
                        List list = this.f59956o;
                        if (list == null) {
                            list = new ArrayList((length - i2) + 1);
                            this.f59956o = list;
                        }
                        list.add(nullPointerException);
                        i2++;
                    } else {
                        long j2 = this.f59957p;
                        if (j2 != 0) {
                            this.f59957p = 0L;
                            m31795f(j2);
                        }
                        publisher.mo31351g(this);
                        i2++;
                        this.f59955n = i2;
                        if (this.f59954m.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.f59956o;
                if (list2 == null) {
                    this.f59951j.onComplete();
                } else if (list2.size() == 1) {
                    this.f59951j.onError(list2.get(0));
                } else {
                    this.f59951j.onError(new CompositeException(list2));
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.f59953l) {
                this.f59951j.onError(th);
                return;
            }
            List list = this.f59956o;
            if (list == null) {
                list = new ArrayList((this.f59952k.length - this.f59955n) + 1);
                this.f59956o = list;
            }
            list.add(th);
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f59957p++;
            this.f59951j.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(null, false, subscriber);
        subscriber.mo31352d(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
