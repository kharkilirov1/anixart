package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61859b;

        public InnerDisposable(Observer<? super T> observer) {
            this.f61859b = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((PublishObserver) andSet).m31691b(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == this;
        }
    }

    public static final class PublishObserver<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        public static final InnerDisposable[] f61860e = new InnerDisposable[0];

        /* renamed from: f */
        public static final InnerDisposable[] f61861f = new InnerDisposable[0];

        /* renamed from: b */
        public final AtomicReference<PublishObserver<T>> f61862b;

        /* renamed from: c */
        public final AtomicReference<InnerDisposable<T>[]> f61863c;

        /* renamed from: d */
        public final AtomicReference<Disposable> f61864d;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61864d, disposable);
        }

        /* renamed from: b */
        public void m31691b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable<T>[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f61863c.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerDisposableArr[i2].equals(innerDisposable)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f61860e;
                } else {
                    InnerDisposable<T>[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i2);
                    System.arraycopy(innerDisposableArr, i2 + 1, innerDisposableArr3, i2, (length - i2) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!this.f61863c.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.f61863c;
            InnerDisposable<T>[] innerDisposableArr = f61861f;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                this.f61862b.compareAndSet(this, null);
                DisposableHelper.m31409a(this.f61864d);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61862b.compareAndSet(this, null);
            for (InnerDisposable<T> innerDisposable : this.f61863c.getAndSet(f61861f)) {
                innerDisposable.f61859b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61862b.compareAndSet(this, null);
            InnerDisposable<T>[] andSet = this.f61863c.getAndSet(f61861f);
            if (andSet.length == 0) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            for (InnerDisposable<T> innerDisposable : andSet) {
                innerDisposable.f61859b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            for (InnerDisposable<T> innerDisposable : this.f61863c.get()) {
                innerDisposable.f61859b.onNext(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61863c.get() == f61861f;
        }
    }

    public static final class PublishSource<T> implements ObservableSource<T> {
        @Override // io.reactivex.ObservableSource
        /* renamed from: c */
        public void mo31364c(Observer<? super T> observer) {
            observer.mo31373a(new InnerDisposable(observer));
            throw null;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        throw null;
    }
}
