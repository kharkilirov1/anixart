package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableScan<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ScanSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60572b;

        /* renamed from: c */
        public final BiFunction<T, T, T> f60573c = null;

        /* renamed from: d */
        public Subscription f60574d;

        /* renamed from: e */
        public T f60575e;

        /* renamed from: f */
        public boolean f60576f;

        public ScanSubscriber(Subscriber<? super T> subscriber, BiFunction<T, T, T> biFunction) {
            this.f60572b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60574d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60574d, subscription)) {
                this.f60574d = subscription;
                this.f60572b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60576f) {
                return;
            }
            this.f60576f = true;
            this.f60572b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60576f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60576f = true;
                this.f60572b.onError(th);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60576f) {
                return;
            }
            Subscriber<? super T> subscriber = this.f60572b;
            T t2 = this.f60575e;
            if (t2 == null) {
                this.f60575e = t;
                subscriber.onNext(t);
                return;
            }
            try {
                T apply = this.f60573c.apply(t2, t);
                Objects.requireNonNull(apply, "The value returned by the accumulator is null");
                this.f60575e = apply;
                subscriber.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60574d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60574d.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new ScanSubscriber(subscriber, null));
    }
}
