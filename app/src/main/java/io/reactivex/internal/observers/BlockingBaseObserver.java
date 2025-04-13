package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public abstract class BlockingBaseObserver<T> extends CountDownLatch implements Observer<T>, Disposable {

    /* renamed from: b */
    public T f59636b;

    /* renamed from: c */
    public Disposable f59637c;

    /* renamed from: d */
    public volatile boolean f59638d;

    public BlockingBaseObserver() {
        super(1);
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public final void mo31373a(Disposable disposable) {
        this.f59637c = disposable;
        if (this.f59638d) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        this.f59638d = true;
        Disposable disposable = this.f59637c;
        if (disposable != null) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return this.f59638d;
    }
}
