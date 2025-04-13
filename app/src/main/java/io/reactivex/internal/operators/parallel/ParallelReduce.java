package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {

        /* renamed from: e */
        public final BiFunction<R, ? super T, R> f62397e;

        /* renamed from: f */
        public R f62398f;

        /* renamed from: g */
        public boolean f62399g;

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f62732d.cancel();
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62732d, subscription)) {
                this.f62732d = subscription;
                this.f62765b.mo31352d(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62399g) {
                return;
            }
            this.f62399g = true;
            R r = this.f62398f;
            this.f62398f = null;
            m31789f(r);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62399g) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62399g = true;
            this.f62398f = null;
            this.f62765b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62399g) {
                return;
            }
            try {
                R apply = this.f62397e.apply(this.f62398f, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f62398f = apply;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                onError(th);
            }
        }
    }
}
