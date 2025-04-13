package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {

        /* renamed from: b */
        public final WithLatestFromSubscriber<T, U, R> f60914b;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this.f60914b.f60919f, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber = this.f60914b;
            SubscriptionHelper.m31797a(withLatestFromSubscriber.f60917d);
            withLatestFromSubscriber.f60915b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            this.f60914b.lazySet(u);
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60915b;

        /* renamed from: d */
        public final AtomicReference<Subscription> f60917d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicLong f60918e = new AtomicLong();

        /* renamed from: f */
        public final AtomicReference<Subscription> f60919f = new AtomicReference<>();

        /* renamed from: c */
        public final BiFunction<? super T, ? super U, ? extends R> f60916c = null;

        public WithLatestFromSubscriber(Subscriber<? super R> subscriber, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f60915b = subscriber;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            U u = get();
            if (u != null) {
                try {
                    R apply = this.f60916c.apply(t, u);
                    Objects.requireNonNull(apply, "The combiner returned a null value");
                    this.f60915b.onNext(apply);
                    return true;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    cancel();
                    this.f60915b.onError(th);
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60917d);
            SubscriptionHelper.m31797a(this.f60919f);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60917d, this.f60918e, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            SubscriptionHelper.m31797a(this.f60919f);
            this.f60915b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60919f);
            this.f60915b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t)) {
                return;
            }
            this.f60917d.get().request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60917d, this.f60918e, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        serializedSubscriber.mo31352d(new WithLatestFromSubscriber(serializedSubscriber, null));
        throw null;
    }
}
