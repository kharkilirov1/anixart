package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* renamed from: j */
        public final Subscriber<? super T> f60425j;

        /* renamed from: k */
        public final Function<? super Throwable, ? extends Publisher<? extends T>> f60426k;

        /* renamed from: l */
        public final boolean f60427l;

        /* renamed from: m */
        public boolean f60428m;

        /* renamed from: n */
        public boolean f60429n;

        /* renamed from: o */
        public long f60430o;

        public OnErrorNextSubscriber(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends Publisher<? extends T>> function, boolean z) {
            super(false);
            this.f60425j = subscriber;
            this.f60426k = null;
            this.f60427l = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60429n) {
                return;
            }
            this.f60429n = true;
            this.f60428m = true;
            this.f60425j.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60428m) {
                if (this.f60429n) {
                    RxJavaPlugins.m31848b(th);
                    return;
                } else {
                    this.f60425j.onError(th);
                    return;
                }
            }
            this.f60428m = true;
            if (this.f60427l && !(th instanceof Exception)) {
                this.f60425j.onError(th);
                return;
            }
            try {
                Publisher<? extends T> apply = this.f60426k.apply(th);
                Objects.requireNonNull(apply, "The nextSupplier returned a null Publisher");
                Publisher<? extends T> publisher = apply;
                long j2 = this.f60430o;
                if (j2 != 0) {
                    m31795f(j2);
                }
                publisher.mo31351g(this);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f60425j.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60429n) {
                return;
            }
            if (!this.f60428m) {
                this.f60430o++;
            }
            this.f60425j.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(subscriber, null, false);
        subscriber.mo31352d(onErrorNextSubscriber);
        this.f59782c.m31349b(onErrorNextSubscriber);
    }
}
