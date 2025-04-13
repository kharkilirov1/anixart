package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super U> f62173b;

        /* renamed from: c */
        public U f62174c;

        /* renamed from: d */
        public Disposable f62175d;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62175d, disposable)) {
                this.f62175d = disposable;
                this.f62173b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62175d.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            U u = this.f62174c;
            this.f62174c = null;
            this.f62173b.onSuccess(u);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62174c = null;
            this.f62173b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62174c.add(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62175d.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super U> singleObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            singleObserver.mo31388a(EmptyDisposable.INSTANCE);
            singleObserver.onError(th);
        }
    }
}
