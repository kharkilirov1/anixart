package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableCollect<T, U> extends AbstractObservableWithUpstream<T, U> {

    public static final class CollectObserver<T, U> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super U> f61461b;

        /* renamed from: c */
        public final BiConsumer<? super U, ? super T> f61462c;

        /* renamed from: d */
        public final U f61463d;

        /* renamed from: e */
        public Disposable f61464e;

        /* renamed from: f */
        public boolean f61465f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61464e, disposable)) {
                this.f61464e = disposable;
                this.f61461b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61464e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61465f) {
                return;
            }
            this.f61465f = true;
            this.f61461b.onNext(this.f61463d);
            this.f61461b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61465f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61465f = true;
                this.f61461b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61465f) {
                return;
            }
            try {
                this.f61462c.mo31403a(this.f61463d, t);
            } catch (Throwable th) {
                this.f61464e.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61464e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super U> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
