package io.reactivex.internal.operators.single;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62458b;

        /* renamed from: c */
        public final SingleSource<T> f62459c = null;

        /* renamed from: d */
        public boolean f62460d;

        /* renamed from: e */
        public Subscription f62461e;

        public OtherSubscriber(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f62458b = singleObserver;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62461e, subscription)) {
                this.f62461e = subscription;
                this.f62458b.mo31388a(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62461e.cancel();
            DisposableHelper.m31409a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62460d) {
                return;
            }
            this.f62460d = true;
            this.f62459c.mo31385b(new ResumeSingleObserver(this, this.f62458b));
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62460d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62460d = true;
                this.f62458b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u) {
            this.f62461e.cancel();
            onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new OtherSubscriber(singleObserver, null);
        throw null;
    }
}
