package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableZipIterable<T, U, V> extends AbstractFlowableWithUpstream<T, V> {

    public static final class ZipIterableSubscriber<T, U, V> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super V> f60952b;

        /* renamed from: c */
        public final Iterator<U> f60953c;

        /* renamed from: d */
        public final BiFunction<? super T, ? super U, ? extends V> f60954d;

        /* renamed from: e */
        public Subscription f60955e;

        /* renamed from: f */
        public boolean f60956f;

        /* renamed from: a */
        public void m31611a(Throwable th) {
            Exceptions.m31402a(th);
            this.f60956f = true;
            this.f60955e.cancel();
            this.f60952b.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60955e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60955e, subscription)) {
                this.f60955e = subscription;
                this.f60952b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60956f) {
                return;
            }
            this.f60956f = true;
            this.f60952b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60956f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60956f = true;
                this.f60952b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60956f) {
                return;
            }
            try {
                U next = this.f60953c.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V apply = this.f60954d.apply(t, next);
                    Objects.requireNonNull(apply, "The zipper function returned a null value");
                    this.f60952b.onNext(apply);
                    try {
                        if (this.f60953c.hasNext()) {
                            return;
                        }
                        this.f60956f = true;
                        this.f60955e.cancel();
                        this.f60952b.onComplete();
                    } catch (Throwable th) {
                        m31611a(th);
                    }
                } catch (Throwable th2) {
                    m31611a(th2);
                }
            } catch (Throwable th3) {
                m31611a(th3);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60955e.request(j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super V> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
