package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class SingleToFlowable<T> extends Flowable<T> {

    /* renamed from: c */
    public final SingleSource<? extends T> f62566c;

    public static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {

        /* renamed from: d */
        public Disposable f62567d;

        public SingleToFlowableObserver(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62567d, disposable)) {
                this.f62567d = disposable;
                this.f62765b.mo31352d(this);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f62567d.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62765b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            m31789f(t);
        }
    }

    public SingleToFlowable(SingleSource<? extends T> singleSource) {
        this.f62566c = singleSource;
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f62566c.mo31385b(new SingleToFlowableObserver(subscriber));
    }
}
