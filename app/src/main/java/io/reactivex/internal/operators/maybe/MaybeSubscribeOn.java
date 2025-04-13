package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeSubscribeOn<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final SequentialDisposable f61121b = new SequentialDisposable();

        /* renamed from: c */
        public final MaybeObserver<? super T> f61122c;

        public SubscribeOnMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.f61122c = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f61121b);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61122c.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61122c.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61122c.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class SubscribeTask<T> implements Runnable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61123b;

        /* renamed from: c */
        public final MaybeSource<T> f61124c;

        @Override // java.lang.Runnable
        public void run() {
            this.f61124c.mo31353b(this.f61123b);
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(new SubscribeOnMaybeObserver(maybeObserver));
        throw null;
    }
}
