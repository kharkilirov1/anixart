package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {

    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super R> f60479b;

        /* renamed from: c */
        public final BiFunction<R, ? super T, R> f60480c;

        /* renamed from: d */
        public R f60481d;

        /* renamed from: e */
        public Subscription f60482e;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60482e, subscription)) {
                this.f60482e = subscription;
                this.f60479b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60482e.cancel();
            this.f60482e = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            R r = this.f60481d;
            if (r != null) {
                this.f60481d = null;
                this.f60482e = SubscriptionHelper.CANCELLED;
                this.f60479b.onSuccess(r);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60481d == null) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60481d = null;
            this.f60482e = SubscriptionHelper.CANCELLED;
            this.f60479b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            R r = this.f60481d;
            if (r != null) {
                try {
                    R apply = this.f60480c.apply(r, t);
                    Objects.requireNonNull(apply, "The reducer returned a null value");
                    this.f60481d = apply;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f60482e.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60482e == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super R> singleObserver) {
        throw null;
    }
}
