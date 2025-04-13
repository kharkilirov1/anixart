package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final InnerQueuedObserverSupport<T> f59658b;

    /* renamed from: c */
    public final int f59659c;

    /* renamed from: d */
    public SimpleQueue<T> f59660d;

    /* renamed from: e */
    public volatile boolean f59661e;

    /* renamed from: f */
    public int f59662f;

    public InnerQueuedObserver(InnerQueuedObserverSupport<T> innerQueuedObserverSupport, int i2) {
        this.f59658b = innerQueuedObserverSupport;
        this.f59659c = i2;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        if (DisposableHelper.m31413e(this, disposable)) {
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int mo31420F = queueDisposable.mo31420F(3);
                if (mo31420F == 1) {
                    this.f59662f = mo31420F;
                    this.f59660d = queueDisposable;
                    this.f59661e = true;
                    this.f59658b.mo31435e(this);
                    return;
                }
                if (mo31420F == 2) {
                    this.f59662f = mo31420F;
                    this.f59660d = queueDisposable;
                    return;
                }
            }
            this.f59660d = QueueDrainHelper.m31842b(-this.f59659c);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        DisposableHelper.m31409a(this);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f59658b.mo31435e(this);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        this.f59658b.mo31434d(this, th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f59662f == 0) {
            this.f59658b.mo31436g(this, t);
        } else {
            this.f59658b.mo31433c();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return DisposableHelper.m31410b(get());
    }
}
