package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, CompletableObserver, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f61176b;

        /* renamed from: d */
        public Disposable f61178d;

        /* renamed from: c */
        public Publisher<? extends R> f61177c = null;

        /* renamed from: e */
        public final AtomicLong f61179e = new AtomicLong();

        public AndThenPublisherSubscriber(Subscriber<? super R> subscriber, Publisher<? extends R> publisher) {
            this.f61176b = subscriber;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61178d, disposable)) {
                this.f61178d = disposable;
                this.f61176b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61178d.mo31379f();
            SubscriptionHelper.m31797a(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this, this.f61179e, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Publisher<? extends R> publisher = this.f61177c;
            if (publisher == null) {
                this.f61176b.onComplete();
            } else {
                this.f61177c = null;
                publisher.mo31351g(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f61176b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.f61176b.onNext(r);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this, this.f61179e, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new AndThenPublisherSubscriber(subscriber, null);
        throw null;
    }
}
