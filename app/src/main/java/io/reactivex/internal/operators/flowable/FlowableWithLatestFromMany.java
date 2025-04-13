package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableWithLatestFromMany<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public final class SingletonArrayFunc implements Function<T, R> {

        /* renamed from: b */
        public final /* synthetic */ FlowableWithLatestFromMany f60920b;

        @Override // io.reactivex.functions.Function
        public R apply(T t) throws Exception {
            Objects.requireNonNull(this.f60920b);
            throw null;
        }
    }

    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60921b;

        /* renamed from: c */
        public final Function<? super Object[], R> f60922c;

        /* renamed from: d */
        public final WithLatestInnerSubscriber[] f60923d;

        /* renamed from: e */
        public final AtomicReferenceArray<Object> f60924e;

        /* renamed from: f */
        public final AtomicReference<Subscription> f60925f;

        /* renamed from: g */
        public final AtomicLong f60926g;

        /* renamed from: h */
        public final AtomicThrowable f60927h;

        /* renamed from: i */
        public volatile boolean f60928i;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f60928i) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f60924e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t;
            int i2 = 0;
            while (i2 < length) {
                Object obj = atomicReferenceArray.get(i2);
                if (obj == null) {
                    return false;
                }
                i2++;
                objArr[i2] = obj;
            }
            try {
                R apply = this.f60922c.apply(objArr);
                Objects.requireNonNull(apply, "The combiner returned a null value");
                HalfSerializer.m31827f(this.f60921b, apply, this, this.f60927h);
                return true;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                onError(th);
                return false;
            }
        }

        /* renamed from: a */
        public void m31608a(int i2) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.f60923d;
            for (int i3 = 0; i3 < withLatestInnerSubscriberArr.length; i3++) {
                if (i3 != i2) {
                    SubscriptionHelper.m31797a(withLatestInnerSubscriberArr[i3]);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60925f);
            for (WithLatestInnerSubscriber withLatestInnerSubscriber : this.f60923d) {
                SubscriptionHelper.m31797a(withLatestInnerSubscriber);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60925f, this.f60926g, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60928i) {
                return;
            }
            this.f60928i = true;
            m31608a(-1);
            HalfSerializer.m31823b(this.f60921b, this, this.f60927h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60928i) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60928i = true;
            m31608a(-1);
            HalfSerializer.m31825d(this.f60921b, th, this, this.f60927h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t) || this.f60928i) {
                return;
            }
            this.f60925f.get().request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60925f, this.f60926g, j2);
        }
    }

    public static final class WithLatestInnerSubscriber extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* renamed from: b */
        public final WithLatestFromSubscriber<?, ?> f60929b;

        /* renamed from: c */
        public final int f60930c;

        /* renamed from: d */
        public boolean f60931d;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.f60929b;
            int i2 = this.f60930c;
            boolean z = this.f60931d;
            Objects.requireNonNull(withLatestFromSubscriber);
            if (z) {
                return;
            }
            withLatestFromSubscriber.f60928i = true;
            SubscriptionHelper.m31797a(withLatestFromSubscriber.f60925f);
            withLatestFromSubscriber.m31608a(i2);
            HalfSerializer.m31823b(withLatestFromSubscriber.f60921b, withLatestFromSubscriber, withLatestFromSubscriber.f60927h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.f60929b;
            int i2 = this.f60930c;
            withLatestFromSubscriber.f60928i = true;
            SubscriptionHelper.m31797a(withLatestFromSubscriber.f60925f);
            withLatestFromSubscriber.m31608a(i2);
            HalfSerializer.m31825d(withLatestFromSubscriber.f60921b, th, withLatestFromSubscriber, withLatestFromSubscriber.f60927h);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            if (!this.f60931d) {
                this.f60931d = true;
            }
            WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.f60929b;
            withLatestFromSubscriber.f60924e.set(this.f60930c, obj);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
