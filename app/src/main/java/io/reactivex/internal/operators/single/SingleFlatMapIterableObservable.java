package io.reactivex.internal.operators.single;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {

        /* renamed from: b */
        public final Observer<? super R> f62513b;

        /* renamed from: c */
        public final Function<? super T, ? extends Iterable<? extends R>> f62514c = null;

        /* renamed from: d */
        public Disposable f62515d;

        /* renamed from: e */
        public volatile Iterator<? extends R> f62516e;

        /* renamed from: f */
        public volatile boolean f62517f;

        /* renamed from: g */
        public boolean f62518g;

        public FlatMapIterableObserver(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f62513b = observer;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f62518g = true;
            return 2;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62515d, disposable)) {
                this.f62515d = disposable;
                this.f62513b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f62516e = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62517f = true;
            this.f62515d.mo31379f();
            this.f62515d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f62516e == null;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62515d = DisposableHelper.DISPOSED;
            this.f62513b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            Observer<? super R> observer = this.f62513b;
            try {
                Iterator<? extends R> it = this.f62514c.apply(t).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                if (this.f62518g) {
                    this.f62516e = it;
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f62517f) {
                    try {
                        observer.onNext(it.next());
                        if (this.f62517f) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                observer.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            observer.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        observer.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                this.f62513b.onError(th3);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f62516e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f62516e = null;
            }
            return next;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62517f;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        new FlatMapIterableObserver(observer, null);
        throw null;
    }
}
