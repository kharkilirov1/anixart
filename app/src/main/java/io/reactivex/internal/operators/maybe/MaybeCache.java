package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* renamed from: b */
    public T f60961b;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60962b;

        public CacheDisposable(MaybeObserver<? super T> maybeObserver, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.f60962b = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(null) != null) {
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == null;
        }
    }

    @Override // io.reactivex.MaybeObserver
    /* renamed from: a */
    public void mo31355a(Disposable disposable) {
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(new CacheDisposable(maybeObserver, this));
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th) {
        throw null;
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        this.f60961b = t;
        throw null;
    }
}
