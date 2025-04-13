package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {

    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, MaybeObserver<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f61264b;

        /* renamed from: d */
        public Disposable f61266d;

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<? extends R>> f61265c = null;

        /* renamed from: e */
        public final AtomicLong f61267e = new AtomicLong();

        public FlatMapPublisherSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f61264b = subscriber;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61266d, disposable)) {
                this.f61266d = disposable;
                this.f61264b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f61266d.mo31379f();
            SubscriptionHelper.m31797a(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this, this.f61267e, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61264b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f61264b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.f61264b.onNext(r);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                Publisher<? extends R> apply = this.f61265c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                apply.mo31351g(this);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61264b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this, this.f61267e, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        new FlatMapPublisherSubscriber(subscriber, null);
        throw null;
    }
}
