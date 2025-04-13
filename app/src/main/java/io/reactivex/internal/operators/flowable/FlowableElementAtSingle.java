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
public final class FlowableElementAtSingle<T> extends Single<T> implements FuseToFlowable<T> {

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f60108b;

        /* renamed from: c */
        public final long f60109c;

        /* renamed from: d */
        public final T f60110d;

        /* renamed from: e */
        public Subscription f60111e;

        /* renamed from: f */
        public long f60112f;

        /* renamed from: g */
        public boolean f60113g;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60111e, subscription)) {
                this.f60111e = subscription;
                this.f60108b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60111e.cancel();
            this.f60111e = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60111e = SubscriptionHelper.CANCELLED;
            if (this.f60113g) {
                return;
            }
            this.f60113g = true;
            T t = this.f60110d;
            if (t != null) {
                this.f60108b.onSuccess(t);
            } else {
                this.f60108b.onError(new NoSuchElementException());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60113g) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60113g = true;
            this.f60111e = SubscriptionHelper.CANCELLED;
            this.f60108b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60113g) {
                return;
            }
            long j2 = this.f60112f;
            if (j2 != this.f60109c) {
                this.f60112f = j2 + 1;
                return;
            }
            this.f60113g = true;
            this.f60111e.cancel();
            this.f60111e = SubscriptionHelper.CANCELLED;
            this.f60108b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60111e == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
