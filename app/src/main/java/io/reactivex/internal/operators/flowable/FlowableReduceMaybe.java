package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableReduceMaybe<T> extends Maybe<T> implements HasUpstreamPublisher<T>, FuseToFlowable<T> {

    public static final class ReduceSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60474b;

        /* renamed from: c */
        public final BiFunction<T, T, T> f60475c;

        /* renamed from: d */
        public T f60476d;

        /* renamed from: e */
        public Subscription f60477e;

        /* renamed from: f */
        public boolean f60478f;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60477e, subscription)) {
                this.f60477e = subscription;
                this.f60474b.mo31355a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60477e.cancel();
            this.f60478f = true;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60478f) {
                return;
            }
            this.f60478f = true;
            T t = this.f60476d;
            if (t != null) {
                this.f60474b.onSuccess(t);
            } else {
                this.f60474b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60478f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60478f = true;
                this.f60474b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60478f) {
                return;
            }
            T t2 = this.f60476d;
            if (t2 == null) {
                this.f60476d = t;
                return;
            }
            try {
                T apply = this.f60475c.apply(t2, t);
                Objects.requireNonNull(apply, "The reducer returned a null value");
                this.f60476d = apply;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60477e.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60478f;
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
