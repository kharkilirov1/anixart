package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.f59636b = null;
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        this.f59636b = t;
    }
}
