package io.reactivex.internal.operators.maybe;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DelayMaybeObserver<T, U> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final OtherSubscriber<T> f60996b;

        /* renamed from: c */
        public final Publisher<U> f60997c = null;

        /* renamed from: d */
        public Disposable f60998d;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, Publisher<U> publisher) {
            this.f60996b = new OtherSubscriber<>(maybeObserver);
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f60998d, disposable)) {
                this.f60998d = disposable;
                this.f60996b.f60999b.mo31355a(this);
            }
        }

        /* renamed from: b */
        public void m31616b() {
            this.f60997c.mo31351g(this.f60996b);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60998d.mo31379f();
            this.f60998d = DisposableHelper.DISPOSED;
            SubscriptionHelper.m31797a(this.f60996b);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60998d = DisposableHelper.DISPOSED;
            m31616b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60998d = DisposableHelper.DISPOSED;
            this.f60996b.f61001d = th;
            m31616b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f60998d = DisposableHelper.DISPOSED;
            this.f60996b.f61000c = t;
            m31616b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60996b.get() == SubscriptionHelper.CANCELLED;
        }
    }

    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<Object> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60999b;

        /* renamed from: c */
        public T f61000c;

        /* renamed from: d */
        public Throwable f61001d;

        public OtherSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.f60999b = maybeObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31802f(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Throwable th = this.f61001d;
            if (th != null) {
                this.f60999b.onError(th);
                return;
            }
            T t = this.f61000c;
            if (t != null) {
                this.f60999b.onSuccess(t);
            } else {
                this.f60999b.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Throwable th2 = this.f61001d;
            if (th2 == null) {
                this.f60999b.onError(th);
            } else {
                this.f60999b.onError(new CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        new DelayMaybeObserver(maybeObserver, null);
        throw null;
    }
}
