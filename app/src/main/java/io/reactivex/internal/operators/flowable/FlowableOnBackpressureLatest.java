package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureLatest<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60418b;

        /* renamed from: c */
        public Subscription f60419c;

        /* renamed from: d */
        public volatile boolean f60420d;

        /* renamed from: e */
        public Throwable f60421e;

        /* renamed from: f */
        public volatile boolean f60422f;

        /* renamed from: g */
        public final AtomicLong f60423g = new AtomicLong();

        /* renamed from: h */
        public final AtomicReference<T> f60424h = new AtomicReference<>();

        public BackpressureLatestSubscriber(Subscriber<? super T> subscriber) {
            this.f60418b = subscriber;
        }

        /* renamed from: a */
        public boolean m31543a(boolean z, boolean z2, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.f60422f) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f60421e;
            if (th != null) {
                atomicReference.lazySet(null);
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* renamed from: b */
        public void m31544b() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f60418b;
            AtomicLong atomicLong = this.f60423g;
            AtomicReference<T> atomicReference = this.f60424h;
            int i2 = 1;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.f60420d;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (m31543a(z, z2, subscriber, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(andSet);
                    j2++;
                }
                if (j2 == atomicLong.get()) {
                    if (m31543a(this.f60420d, atomicReference.get() == null, subscriber, atomicReference)) {
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m31812e(atomicLong, j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60422f) {
                return;
            }
            this.f60422f = true;
            this.f60419c.cancel();
            if (getAndIncrement() == 0) {
                this.f60424h.lazySet(null);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60419c, subscription)) {
                this.f60419c = subscription;
                this.f60418b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60420d = true;
            m31544b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60421e = th;
            this.f60420d = true;
            m31544b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60424h.lazySet(t);
            m31544b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60423g, j2);
                m31544b();
            }
        }
    }

    public FlowableOnBackpressureLatest(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new BackpressureLatestSubscriber(subscriber));
    }
}
