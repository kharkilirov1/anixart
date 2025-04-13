package io.reactivex.internal.operators.flowable;

import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableConcatWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {

        /* renamed from: f */
        public final AtomicReference<Disposable> f59999f;

        /* renamed from: g */
        public SingleSource<? extends T> f60000g;

        public ConcatWithSubscriber(Subscriber<? super T> subscriber, SingleSource<? extends T> singleSource) {
            super(subscriber);
            this.f60000g = null;
            this.f59999f = new AtomicReference<>();
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31413e(this.f59999f, disposable);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public void cancel() {
            this.f62752c.cancel();
            DisposableHelper.m31409a(this.f59999f);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62752c = SubscriptionHelper.CANCELLED;
            SingleSource<? extends T> singleSource = this.f60000g;
            this.f60000g = null;
            singleSource.mo31385b(this);
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

        @Override // io.reactivex.SingleObserver
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
