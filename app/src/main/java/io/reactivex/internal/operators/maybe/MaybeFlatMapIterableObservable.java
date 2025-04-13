package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MaybeFlatMapIterableObservable<T, R> extends Observable<R> {

    public static final class FlatMapIterableObserver<T, R> extends BasicQueueDisposable<R> implements MaybeObserver<T> {

        /* renamed from: b */
        public final Observer<? super R> f61049b;

        /* renamed from: c */
        public final Function<? super T, ? extends Iterable<? extends R>> f61050c;

        /* renamed from: d */
        public Disposable f61051d;

        /* renamed from: e */
        public volatile Iterator<? extends R> f61052e;

        /* renamed from: f */
        public volatile boolean f61053f;

        /* renamed from: g */
        public boolean f61054g;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f61054g = true;
            return 2;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61051d, disposable)) {
                this.f61051d = disposable;
                this.f61049b.mo31373a(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61052e = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61053f = true;
            this.f61051d.mo31379f();
            this.f61051d = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61052e == null;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61049b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61051d = DisposableHelper.DISPOSED;
            this.f61049b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            Observer<? super R> observer = this.f61049b;
            try {
                Iterator<? extends R> it = this.f61050c.apply(t).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                    return;
                }
                this.f61052e = it;
                if (this.f61054g) {
                    observer.onNext(null);
                    observer.onComplete();
                    return;
                }
                while (!this.f61053f) {
                    try {
                        observer.onNext(it.next());
                        if (this.f61053f) {
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
                observer.onError(th3);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f61052e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f61052e = null;
            }
            return next;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61053f;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        throw null;
    }
}
