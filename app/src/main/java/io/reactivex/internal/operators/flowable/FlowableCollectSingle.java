package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCollectSingle<T, U> extends Single<U> implements FuseToFlowable<U> {

    public static final class CollectSubscriber<T, U> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super U> f59927b;

        /* renamed from: c */
        public final BiConsumer<? super U, ? super T> f59928c;

        /* renamed from: d */
        public final U f59929d;

        /* renamed from: e */
        public Subscription f59930e;

        /* renamed from: f */
        public boolean f59931f;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59930e, subscription)) {
                this.f59930e = subscription;
                this.f59927b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59930e.cancel();
            this.f59930e = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59931f) {
                return;
            }
            this.f59931f = true;
            this.f59930e = SubscriptionHelper.CANCELLED;
            this.f59927b.onSuccess(this.f59929d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f59931f) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59931f = true;
            this.f59930e = SubscriptionHelper.CANCELLED;
            this.f59927b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f59931f) {
                return;
            }
            try {
                this.f59928c.mo31403a(this.f59929d, t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f59930e.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59930e == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super U> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
