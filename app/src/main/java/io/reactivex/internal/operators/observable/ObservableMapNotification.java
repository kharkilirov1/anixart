package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ObservableMapNotification<T, R> extends AbstractObservableWithUpstream<T, ObservableSource<? extends R>> {

    public static final class MapNotificationObserver<T, R> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super ObservableSource<? extends R>> f61802b;

        /* renamed from: c */
        public final Function<? super T, ? extends ObservableSource<? extends R>> f61803c = null;

        /* renamed from: d */
        public final Function<? super Throwable, ? extends ObservableSource<? extends R>> f61804d = null;

        /* renamed from: e */
        public final Callable<? extends ObservableSource<? extends R>> f61805e = null;

        /* renamed from: f */
        public Disposable f61806f;

        public MapNotificationObserver(Observer<? super ObservableSource<? extends R>> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
            this.f61802b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61806f, disposable)) {
                this.f61806f = disposable;
                this.f61802b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61806f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            try {
                ObservableSource<? extends R> call = this.f61805e.call();
                Objects.requireNonNull(call, "The onComplete ObservableSource returned is null");
                this.f61802b.onNext(call);
                this.f61802b.onComplete();
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61802b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                ObservableSource<? extends R> apply = this.f61804d.apply(th);
                Objects.requireNonNull(apply, "The onError ObservableSource returned is null");
                this.f61802b.onNext(apply);
                this.f61802b.onComplete();
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61802b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                ObservableSource<? extends R> apply = this.f61803c.apply(t);
                Objects.requireNonNull(apply, "The onNext ObservableSource returned is null");
                this.f61802b.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61802b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61806f.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super ObservableSource<? extends R>> observer) {
        this.f61337b.mo31364c(new MapNotificationObserver(observer, null, null, null));
    }
}
