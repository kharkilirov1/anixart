package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableAmb<T> extends Observable<T> {

    public static final class AmbCoordinator<T> implements Disposable {

        /* renamed from: b */
        public final AmbInnerObserver<T>[] f61366b;

        /* renamed from: c */
        public final AtomicInteger f61367c;

        /* renamed from: a */
        public boolean m31648a(int i2) {
            int i3 = this.f61367c.get();
            int i4 = 0;
            if (i3 != 0) {
                return i3 == i2;
            }
            if (!this.f61367c.compareAndSet(0, i2)) {
                return false;
            }
            AmbInnerObserver<T>[] ambInnerObserverArr = this.f61366b;
            int length = ambInnerObserverArr.length;
            while (i4 < length) {
                int i5 = i4 + 1;
                if (i5 != i2) {
                    DisposableHelper.m31409a(ambInnerObserverArr[i4]);
                }
                i4 = i5;
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61367c.get() != -1) {
                this.f61367c.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.f61366b) {
                    DisposableHelper.m31409a(ambInnerObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61367c.get() == -1;
        }
    }

    public static final class AmbInnerObserver<T> extends AtomicReference<Disposable> implements Observer<T> {

        /* renamed from: b */
        public final AmbCoordinator<T> f61368b;

        /* renamed from: c */
        public final int f61369c;

        /* renamed from: d */
        public final Observer<? super T> f61370d;

        /* renamed from: e */
        public boolean f61371e;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61371e) {
                this.f61370d.onComplete();
            } else if (this.f61368b.m31648a(this.f61369c)) {
                this.f61371e = true;
                this.f61370d.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61371e) {
                this.f61370d.onError(th);
            } else if (!this.f61368b.m31648a(this.f61369c)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61371e = true;
                this.f61370d.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61371e) {
                this.f61370d.onNext(t);
            } else if (!this.f61368b.m31648a(this.f61369c)) {
                get().mo31379f();
            } else {
                this.f61371e = true;
                this.f61370d.onNext(t);
            }
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
