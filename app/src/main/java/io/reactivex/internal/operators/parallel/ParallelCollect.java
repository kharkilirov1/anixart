package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelCollect<T, C> extends ParallelFlowable<C> {

    public static final class ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {

        /* renamed from: e */
        public final BiConsumer<? super C, ? super T> f62320e;

        /* renamed from: f */
        public C f62321f;

        /* renamed from: g */
        public boolean f62322g;

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
            if (this.f62322g) {
                return;
            }
            this.f62322g = true;
            C c2 = this.f62321f;
            this.f62321f = null;
            m31789f(c2);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62322g) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62322g = true;
            this.f62321f = null;
            this.f62765b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62322g) {
                return;
            }
            try {
                this.f62320e.mo31403a(this.f62321f, t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                cancel();
                onError(th);
            }
        }
    }
}
