package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeFlatMapObservable<T, R> extends Observable<R> {

    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61262b;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f61263c = null;

        public FlatMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f61262b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61262b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61262b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            this.f61262b.onNext(r);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            try {
                ObservableSource<? extends R> apply = this.f61263c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                apply.mo31364c(this);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61262b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        observer.mo31373a(new FlatMapObserver(observer, null));
        throw null;
    }
}
