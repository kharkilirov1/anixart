package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSamplePublisher<T> extends Flowable<T> {

    public static final class SampleMainEmitLast<T> extends SamplePublisherSubscriber<T> {

        /* renamed from: g */
        public final AtomicInteger f60556g;

        /* renamed from: h */
        public volatile boolean f60557h;

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* renamed from: a */
        public void mo31573a() {
            this.f60557h = true;
            if (this.f60556g.getAndIncrement() == 0) {
                m31575b();
                this.f60558b.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* renamed from: c */
        public void mo31574c() {
            if (this.f60556g.getAndIncrement() == 0) {
                do {
                    boolean z = this.f60557h;
                    m31575b();
                    if (z) {
                        this.f60558b.onComplete();
                        return;
                    }
                } while (this.f60556g.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SamplePublisherSubscriber<T> {
        public SampleMainNoLast(Subscriber<? super T> subscriber, Publisher<?> publisher) {
            super(subscriber, null);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* renamed from: a */
        public void mo31573a() {
            this.f60558b.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        /* renamed from: c */
        public void mo31574c() {
            m31575b();
        }
    }

    public static abstract class SamplePublisherSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60558b;

        /* renamed from: c */
        public final Publisher<?> f60559c;

        /* renamed from: d */
        public final AtomicLong f60560d = new AtomicLong();

        /* renamed from: e */
        public final AtomicReference<Subscription> f60561e = new AtomicReference<>();

        /* renamed from: f */
        public Subscription f60562f;

        public SamplePublisherSubscriber(Subscriber<? super T> subscriber, Publisher<?> publisher) {
            this.f60558b = subscriber;
            this.f60559c = publisher;
        }

        /* renamed from: a */
        public abstract void mo31573a();

        /* renamed from: b */
        public void m31575b() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f60560d.get() != 0) {
                    this.f60558b.onNext(andSet);
                    BackpressureHelper.m31812e(this.f60560d, 1L);
                } else {
                    cancel();
                    this.f60558b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        /* renamed from: c */
        public abstract void mo31574c();

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60561e);
            this.f60562f.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60562f, subscription)) {
                this.f60562f = subscription;
                this.f60558b.mo31352d(this);
                if (this.f60561e.get() == null) {
                    this.f60559c.mo31351g(new SamplerSubscriber(this));
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f60561e);
            mo31573a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60561e);
            this.f60558b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60560d, j2);
            }
        }
    }

    public static final class SamplerSubscriber<T> implements FlowableSubscriber<Object> {

        /* renamed from: b */
        public final SamplePublisherSubscriber<T> f60563b;

        public SamplerSubscriber(SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.f60563b = samplePublisherSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this.f60563b.f60561e, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SamplePublisherSubscriber<T> samplePublisherSubscriber = this.f60563b;
            samplePublisherSubscriber.f60562f.cancel();
            samplePublisherSubscriber.mo31573a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SamplePublisherSubscriber<T> samplePublisherSubscriber = this.f60563b;
            samplePublisherSubscriber.f60562f.cancel();
            samplePublisherSubscriber.f60558b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f60563b.mo31574c();
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        new SampleMainNoLast(new SerializedSubscriber(subscriber), null);
        throw null;
    }
}
