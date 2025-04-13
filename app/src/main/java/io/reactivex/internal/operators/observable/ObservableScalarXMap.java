package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {

        /* renamed from: b */
        public final Observer<? super T> f61973b;

        /* renamed from: c */
        public final T f61974c;

        public ScalarDisposable(Observer<? super T> observer, T t) {
            this.f61973b = observer;
            this.f61974c = t;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            set(3);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f61974c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f61973b.onNext(this.f61974c);
                if (get() == 2) {
                    lazySet(3);
                    this.f61973b.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == 3;
        }
    }

    public static final class ScalarXMapObservable<T, R> extends Observable<R> {
        @Override // io.reactivex.Observable
        /* renamed from: m */
        public void mo31371m(Observer<? super R> observer) {
            try {
                throw null;
            } catch (Throwable th) {
                observer.mo31373a(EmptyDisposable.INSTANCE);
                observer.onError(th);
            }
        }
    }

    public ObservableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, R> boolean m31717a(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            if (((Callable) observableSource).call() == null) {
                observer.mo31373a(emptyDisposable);
                observer.onComplete();
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                observer.mo31373a(emptyDisposable);
                observer.onError(th);
                return true;
            }
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            observer.mo31373a(emptyDisposable);
            observer.onError(th2);
            return true;
        }
    }
}
