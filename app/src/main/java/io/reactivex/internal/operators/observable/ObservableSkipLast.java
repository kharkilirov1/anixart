package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class ObservableSkipLast<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62028b;

        /* renamed from: c */
        public final int f62029c;

        /* renamed from: d */
        public Disposable f62030d;

        public SkipLastObserver(Observer<? super T> observer, int i2) {
            super(i2);
            this.f62028b = observer;
            this.f62029c = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62030d, disposable)) {
                this.f62030d = disposable;
                this.f62028b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62030d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62028b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62028b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62029c == size()) {
                this.f62028b.onNext(poll());
            }
            offer(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62030d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SkipLastObserver(observer, 0));
    }
}
