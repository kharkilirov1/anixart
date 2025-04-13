package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, Subscription {

    /* renamed from: b */
    public final Subscriber<? super T> f59675b;

    /* renamed from: c */
    public Disposable f59676c;

    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public void mo31347a(Disposable disposable) {
        if (DisposableHelper.m31414h(this.f59676c, disposable)) {
            this.f59676c = disposable;
            this.f59675b.mo31352d(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f59676c.mo31379f();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.f59675b.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.f59675b.onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
    }
}
