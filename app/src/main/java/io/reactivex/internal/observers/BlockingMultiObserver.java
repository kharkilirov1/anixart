package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {

    /* renamed from: b */
    public T f59639b;

    /* renamed from: c */
    public Disposable f59640c;

    public BlockingMultiObserver() {
        super(1);
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
        this.f59640c = disposable;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f59639b = t;
        countDown();
    }
}
