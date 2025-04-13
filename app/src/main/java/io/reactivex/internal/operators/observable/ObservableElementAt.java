package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61616b;

        /* renamed from: c */
        public final long f61617c;

        /* renamed from: d */
        public final T f61618d = null;

        /* renamed from: e */
        public final boolean f61619e;

        /* renamed from: f */
        public Disposable f61620f;

        /* renamed from: g */
        public long f61621g;

        /* renamed from: h */
        public boolean f61622h;

        public ElementAtObserver(Observer<? super T> observer, long j2, T t, boolean z) {
            this.f61616b = observer;
            this.f61617c = j2;
            this.f61619e = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61620f, disposable)) {
                this.f61620f = disposable;
                this.f61616b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61620f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61622h) {
                return;
            }
            this.f61622h = true;
            T t = this.f61618d;
            if (t == null && this.f61619e) {
                this.f61616b.onError(new NoSuchElementException());
                return;
            }
            if (t != null) {
                this.f61616b.onNext(t);
            }
            this.f61616b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61622h) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61622h = true;
                this.f61616b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61622h) {
                return;
            }
            long j2 = this.f61621g;
            if (j2 != this.f61617c) {
                this.f61621g = j2 + 1;
                return;
            }
            this.f61622h = true;
            this.f61620f.mo31379f();
            this.f61616b.onNext(t);
            this.f61616b.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61620f.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new ElementAtObserver(observer, 0L, null, false));
    }
}
