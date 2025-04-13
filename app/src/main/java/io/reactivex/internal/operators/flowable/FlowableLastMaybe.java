package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60310b;

        /* renamed from: c */
        public Subscription f60311c;

        /* renamed from: d */
        public T f60312d;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60311c, subscription)) {
                this.f60311c = subscription;
                this.f60310b.mo31355a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60311c.cancel();
            this.f60311c = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60311c = SubscriptionHelper.CANCELLED;
            T t = this.f60312d;
            if (t == null) {
                this.f60310b.onComplete();
            } else {
                this.f60312d = null;
                this.f60310b.onSuccess(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60311c = SubscriptionHelper.CANCELLED;
            this.f60312d = null;
            this.f60310b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60312d = t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60311c == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
