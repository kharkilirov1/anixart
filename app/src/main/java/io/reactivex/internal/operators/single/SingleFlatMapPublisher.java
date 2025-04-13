package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {

    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62523b;

        /* renamed from: c */
        public final Function<? super S, ? extends Publisher<? extends T>> f62524c = null;

        /* renamed from: d */
        public final AtomicReference<Subscription> f62525d = new AtomicReference<>();

        /* renamed from: e */
        public Disposable f62526e;

        public SingleFlatMapPublisherObserver(Subscriber<? super T> subscriber, Function<? super S, ? extends Publisher<? extends T>> function) {
            this.f62523b = subscriber;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            this.f62526e = disposable;
            this.f62523b.mo31352d(this);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62526e.mo31379f();
            SubscriptionHelper.m31797a(this.f62525d);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f62525d, this, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62523b.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62523b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62523b.onNext(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s) {
            try {
                Publisher<? extends T> apply = this.f62524c.apply(s);
                Objects.requireNonNull(apply, "the mapper returned a null Publisher");
                apply.mo31351g(this);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62523b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f62525d, this, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new SingleFlatMapPublisherObserver(subscriber, null);
        throw null;
    }
}
