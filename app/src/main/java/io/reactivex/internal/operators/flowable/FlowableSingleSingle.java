package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f60618b;

        /* renamed from: c */
        public final T f60619c;

        /* renamed from: d */
        public Subscription f60620d;

        /* renamed from: e */
        public boolean f60621e;

        /* renamed from: f */
        public T f60622f;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60620d, subscription)) {
                this.f60620d = subscription;
                this.f60618b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60620d.cancel();
            this.f60620d = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60621e) {
                return;
            }
            this.f60621e = true;
            this.f60620d = SubscriptionHelper.CANCELLED;
            T t = this.f60622f;
            this.f60622f = null;
            if (t == null) {
                t = this.f60619c;
            }
            if (t != null) {
                this.f60618b.onSuccess(t);
            } else {
                this.f60618b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60621e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60621e = true;
            this.f60620d = SubscriptionHelper.CANCELLED;
            this.f60618b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60621e) {
                return;
            }
            if (this.f60622f == null) {
                this.f60622f = t;
                return;
            }
            this.f60621e = true;
            this.f60620d.cancel();
            this.f60620d = SubscriptionHelper.CANCELLED;
            this.f60618b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60620d == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
