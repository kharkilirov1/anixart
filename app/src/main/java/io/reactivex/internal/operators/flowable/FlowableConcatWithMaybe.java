package io.reactivex.internal.operators.flowable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableConcatWithMaybe<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements MaybeObserver<T> {

        /* renamed from: f */
        public final AtomicReference<Disposable> f59996f;

        /* renamed from: g */
        public MaybeSource<? extends T> f59997g;

        /* renamed from: h */
        public boolean f59998h;

        public ConcatWithSubscriber(Subscriber<? super T> subscriber, MaybeSource<? extends T> maybeSource) {
            super(subscriber);
            this.f59997g = null;
            this.f59996f = new AtomicReference<>();
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this.f59996f, disposable);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public void cancel() {
            this.f62752c.cancel();
            DisposableHelper.m31409a(this.f59996f);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f59998h) {
                this.f62751b.onComplete();
                return;
            }
            this.f59998h = true;
            this.f62752c = SubscriptionHelper.CANCELLED;
            MaybeSource<? extends T> maybeSource = this.f59997g;
            this.f59997g = null;
            maybeSource.mo31353b(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f62751b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62754e++;
            this.f62751b.onNext(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            m31788b(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new ConcatWithSubscriber(subscriber, null));
    }
}
