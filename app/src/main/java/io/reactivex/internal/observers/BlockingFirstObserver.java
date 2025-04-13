package io.reactivex.internal.observers;

/* loaded from: classes3.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f59636b == null) {
            this.f59636b = t;
            this.f59637c.mo31379f();
            countDown();
        }
    }
}
