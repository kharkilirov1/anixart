package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public enum EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, Subscription, Disposable {
    INSTANCE;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        disposable.mo31379f();
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        subscription.cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        RxJavaPlugins.m31848b(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return true;
    }
}
