package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {

    public static final class ToListSubscriber<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super U> f60787b;

        /* renamed from: c */
        public Subscription f60788c;

        /* renamed from: d */
        public U f60789d;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60788c, subscription)) {
                this.f60788c = subscription;
                this.f60787b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60788c.cancel();
            this.f60788c = SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60788c = SubscriptionHelper.CANCELLED;
            this.f60787b.onSuccess(this.f60789d);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f60789d = null;
            this.f60788c = SubscriptionHelper.CANCELLED;
            this.f60787b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60789d.add(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60788c == SubscriptionHelper.CANCELLED;
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super U> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
