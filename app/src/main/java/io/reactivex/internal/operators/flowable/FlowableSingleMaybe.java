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
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60614b;

        /* renamed from: c */
        public Subscription f60615c;

        /* renamed from: d */
        public boolean f60616d;

        /* renamed from: e */
        public T f60617e;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60615c, subscription)) {
                this.f60615c = subscription;
                this.f60614b.mo31355a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60615c.cancel();
            this.f60615c = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60616d) {
                return;
            }
            this.f60616d = true;
            this.f60615c = SubscriptionHelper.CANCELLED;
            T t = this.f60617e;
            this.f60617e = null;
            if (t == null) {
                this.f60614b.onComplete();
            } else {
                this.f60614b.onSuccess(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60616d) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60616d = true;
            this.f60615c = SubscriptionHelper.CANCELLED;
            this.f60614b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60616d) {
                return;
            }
            if (this.f60617e == null) {
                this.f60617e = t;
                return;
            }
            this.f60616d = true;
            this.f60615c.cancel();
            this.f60615c = SubscriptionHelper.CANCELLED;
            this.f60614b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60615c == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
