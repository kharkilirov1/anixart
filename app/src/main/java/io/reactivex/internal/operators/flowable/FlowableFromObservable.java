package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {

    /* renamed from: c */
    public final Observable<T> f60210c;

    public static final class SubscriberObserver<T> implements Observer<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60211b;

        /* renamed from: c */
        public Disposable f60212c;

        public SubscriberObserver(Subscriber<? super T> subscriber) {
            this.f60211b = subscriber;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f60212c = disposable;
            this.f60211b.mo31352d(this);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60212c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f60211b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f60211b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f60211b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.f60210c = observable;
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f60210c.mo31364c(new SubscriberObserver(subscriber));
    }
}
