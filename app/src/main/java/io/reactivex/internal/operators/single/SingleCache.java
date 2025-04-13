package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* renamed from: b */
    public T f62439b;

    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62440b;

        /* renamed from: c */
        public final SingleCache<T> f62441c;

        public CacheDisposable(SingleObserver<? super T> singleObserver, SingleCache<T> singleCache) {
            this.f62440b = singleObserver;
            this.f62441c = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (compareAndSet(false, true)) {
                Objects.requireNonNull(this.f62441c);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get();
        }
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        singleObserver.mo31388a(new CacheDisposable(singleObserver, this));
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f62439b = t;
        throw null;
    }
}
