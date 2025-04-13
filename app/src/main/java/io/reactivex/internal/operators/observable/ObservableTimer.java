package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableTimer extends Observable<Long> {

    public static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super Long> f62169b;

        public TimerObserver(Observer<? super Long> observer) {
            this.f62169b = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (mo31380s()) {
                return;
            }
            this.f62169b.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.f62169b.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Long> observer) {
        observer.mo31373a(new TimerObserver(observer));
        throw null;
    }
}
