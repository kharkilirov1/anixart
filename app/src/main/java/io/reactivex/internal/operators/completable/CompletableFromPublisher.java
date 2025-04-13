package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class CompletableFromPublisher<T> extends Completable {

    public static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59725b;

        /* renamed from: c */
        public Subscription f59726c;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59726c, subscription)) {
                this.f59726c = subscription;
                this.f59725b.mo31347a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59726c.cancel();
            this.f59726c = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59725b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f59725b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59726c == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        throw null;
    }
}
