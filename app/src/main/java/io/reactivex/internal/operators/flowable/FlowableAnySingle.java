package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableAnySingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {

    public static final class AnySubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f59823b;

        /* renamed from: c */
        public final Predicate<? super T> f59824c;

        /* renamed from: d */
        public Subscription f59825d;

        /* renamed from: e */
        public boolean f59826e;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59825d, subscription)) {
                this.f59825d = subscription;
                this.f59823b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59825d.cancel();
            this.f59825d = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59826e) {
                return;
            }
            this.f59826e = true;
            this.f59825d = SubscriptionHelper.CANCELLED;
            this.f59823b.onSuccess(Boolean.FALSE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59826e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59826e = true;
            this.f59825d = SubscriptionHelper.CANCELLED;
            this.f59823b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (this.f59826e) {
                return;
            }
            try {
                if (this.f59824c.mo31407b(t)) {
                    this.f59826e = true;
                    this.f59825d.cancel();
                    this.f59825d = subscriptionHelper;
                    this.f59823b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59825d.cancel();
                this.f59825d = subscriptionHelper;
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59825d == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        throw null;
    }
}
