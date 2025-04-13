package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    public static final class LastObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61793b;

        /* renamed from: c */
        public Disposable f61794c;

        /* renamed from: d */
        public T f61795d;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61794c, disposable)) {
                this.f61794c = disposable;
                this.f61793b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61794c.mo31379f();
            this.f61794c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61794c = DisposableHelper.DISPOSED;
            T t = this.f61795d;
            if (t == null) {
                this.f61793b.onComplete();
            } else {
                this.f61795d = null;
                this.f61793b.onSuccess(t);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61794c = DisposableHelper.DISPOSED;
            this.f61795d = null;
            this.f61793b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61795d = t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61794c == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
