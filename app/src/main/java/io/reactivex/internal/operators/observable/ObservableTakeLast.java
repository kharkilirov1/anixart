package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class ObservableTakeLast<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62085b;

        /* renamed from: c */
        public final int f62086c;

        /* renamed from: d */
        public Disposable f62087d;

        /* renamed from: e */
        public volatile boolean f62088e;

        public TakeLastObserver(Observer<? super T> observer, int i2) {
            this.f62085b = observer;
            this.f62086c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62087d, disposable)) {
                this.f62087d = disposable;
                this.f62085b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f62088e) {
                return;
            }
            this.f62088e = true;
            this.f62087d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Observer<? super T> observer = this.f62085b;
            while (!this.f62088e) {
                T poll = poll();
                if (poll == null) {
                    if (this.f62088e) {
                        return;
                    }
                    observer.onComplete();
                    return;
                }
                observer.onNext(poll);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62085b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62086c == size()) {
                poll();
            }
            offer(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62088e;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new TakeLastObserver(observer, 0));
    }
}
