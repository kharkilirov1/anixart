package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61002b;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.f61002b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61002b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61002b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61002b.onSuccess(t);
        }
    }

    public static final class OtherSubscriber<T> implements FlowableSubscriber<Object>, Disposable {

        /* renamed from: b */
        public final DelayMaybeObserver<T> f61003b;

        /* renamed from: c */
        public MaybeSource<T> f61004c = null;

        /* renamed from: d */
        public Subscription f61005d;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f61003b = new DelayMaybeObserver<>(maybeObserver);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61005d, subscription)) {
                this.f61005d = subscription;
                this.f61003b.f61002b.mo31355a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61005d.cancel();
            this.f61005d = SubscriptionHelper.CANCELLED;
            DisposableHelper.m31409a(this.f61003b);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = this.f61005d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f61005d = subscriptionHelper;
                MaybeSource<T> maybeSource = this.f61004c;
                this.f61004c = null;
                maybeSource.mo31353b(this.f61003b);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Subscription subscription = this.f61005d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61005d = subscriptionHelper;
                this.f61003b.f61002b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = this.f61005d;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f61005d = subscriptionHelper;
                MaybeSource<T> maybeSource = this.f61004c;
                this.f61004c = null;
                maybeSource.mo31353b(this.f61003b);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61003b.get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        new OtherSubscriber(maybeObserver, null);
        throw null;
    }
}
