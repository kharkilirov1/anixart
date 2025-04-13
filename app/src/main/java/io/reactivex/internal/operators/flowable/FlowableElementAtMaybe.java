package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60103b;

        /* renamed from: c */
        public final long f60104c;

        /* renamed from: d */
        public Subscription f60105d;

        /* renamed from: e */
        public long f60106e;

        /* renamed from: f */
        public boolean f60107f;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60105d, subscription)) {
                this.f60105d = subscription;
                this.f60103b.mo31355a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60105d.cancel();
            this.f60105d = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60105d = SubscriptionHelper.CANCELLED;
            if (this.f60107f) {
                return;
            }
            this.f60107f = true;
            this.f60103b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60107f) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60107f = true;
            this.f60105d = SubscriptionHelper.CANCELLED;
            this.f60103b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60107f) {
                return;
            }
            long j2 = this.f60106e;
            if (j2 != this.f60104c) {
                this.f60106e = j2 + 1;
                return;
            }
            this.f60107f = true;
            this.f60105d.cancel();
            this.f60105d = SubscriptionHelper.CANCELLED;
            this.f60103b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60105d == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
