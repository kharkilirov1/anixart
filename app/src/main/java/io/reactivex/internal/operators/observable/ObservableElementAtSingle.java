package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f61628b;

        /* renamed from: c */
        public final long f61629c;

        /* renamed from: d */
        public final T f61630d;

        /* renamed from: e */
        public Disposable f61631e;

        /* renamed from: f */
        public long f61632f;

        /* renamed from: g */
        public boolean f61633g;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61631e, disposable)) {
                this.f61631e = disposable;
                this.f61628b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61631e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61633g) {
                return;
            }
            this.f61633g = true;
            T t = this.f61630d;
            if (t != null) {
                this.f61628b.onSuccess(t);
            } else {
                this.f61628b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61633g) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61633g = true;
                this.f61628b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61633g) {
                return;
            }
            long j2 = this.f61632f;
            if (j2 != this.f61629c) {
                this.f61632f = j2 + 1;
                return;
            }
            this.f61633g = true;
            this.f61631e.mo31379f();
            this.f61628b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61631e.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}
