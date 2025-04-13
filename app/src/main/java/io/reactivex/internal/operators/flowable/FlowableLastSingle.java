package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableLastSingle<T> extends Single<T> {

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f60313b;

        /* renamed from: c */
        public final T f60314c;

        /* renamed from: d */
        public Subscription f60315d;

        /* renamed from: e */
        public T f60316e;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60315d, subscription)) {
                this.f60315d = subscription;
                this.f60313b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60315d.cancel();
            this.f60315d = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60315d = SubscriptionHelper.CANCELLED;
            T t = this.f60316e;
            if (t != null) {
                this.f60316e = null;
                this.f60313b.onSuccess(t);
                return;
            }
            T t2 = this.f60314c;
            if (t2 != null) {
                this.f60313b.onSuccess(t2);
            } else {
                this.f60313b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60315d = SubscriptionHelper.CANCELLED;
            this.f60316e = null;
            this.f60313b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60316e = t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60315d == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
