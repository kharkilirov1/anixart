package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableCountSingle<T> extends Single<Long> implements FuseToFlowable<Long> {

    public static final class CountSubscriber implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Long> f60003b;

        /* renamed from: c */
        public Subscription f60004c;

        /* renamed from: d */
        public long f60005d;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60004c, subscription)) {
                this.f60004c = subscription;
                this.f60003b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60004c.cancel();
            this.f60004c = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60004c = SubscriptionHelper.CANCELLED;
            this.f60003b.onSuccess(Long.valueOf(this.f60005d));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60004c = SubscriptionHelper.CANCELLED;
            this.f60003b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            this.f60005d++;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60004c == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Long> singleObserver) {
        throw null;
    }
}
