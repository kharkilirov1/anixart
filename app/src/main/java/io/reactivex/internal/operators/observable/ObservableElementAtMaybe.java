package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61623b;

        /* renamed from: c */
        public final long f61624c;

        /* renamed from: d */
        public Disposable f61625d;

        /* renamed from: e */
        public long f61626e;

        /* renamed from: f */
        public boolean f61627f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61625d, disposable)) {
                this.f61625d = disposable;
                this.f61623b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61625d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61627f) {
                return;
            }
            this.f61627f = true;
            this.f61623b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61627f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61627f = true;
                this.f61623b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61627f) {
                return;
            }
            long j2 = this.f61626e;
            if (j2 != this.f61624c) {
                this.f61626e = j2 + 1;
                return;
            }
            this.f61627f = true;
            this.f61625d.mo31379f();
            this.f61623b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61625d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
