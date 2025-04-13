package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableWithLatestFrom<T, U, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f62281b;

        /* renamed from: d */
        public final AtomicReference<Disposable> f62283d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicReference<Disposable> f62284e = new AtomicReference<>();

        /* renamed from: c */
        public final BiFunction<? super T, ? super U, ? extends R> f62282c = null;

        public WithLatestFromObserver(Observer<? super R> observer, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f62281b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62283d, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62283d);
            DisposableHelper.m31409a(this.f62284e);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f62284e);
            this.f62281b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f62284e);
            this.f62281b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    R apply = this.f62282c.apply(t, u);
                    Objects.requireNonNull(apply, "The combiner returned a null value");
                    this.f62281b.onNext(apply);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    mo31379f();
                    this.f62281b.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f62283d.get());
        }
    }

    public final class WithLatestFromOtherObserver implements Observer<U> {

        /* renamed from: b */
        public final WithLatestFromObserver<T, U, R> f62285b;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62285b.f62284e, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            WithLatestFromObserver<T, U, R> withLatestFromObserver = this.f62285b;
            DisposableHelper.m31409a(withLatestFromObserver.f62283d);
            withLatestFromObserver.f62281b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            this.f62285b.lazySet(u);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        serializedObserver.mo31373a(new WithLatestFromObserver(serializedObserver, null));
        throw null;
    }
}
