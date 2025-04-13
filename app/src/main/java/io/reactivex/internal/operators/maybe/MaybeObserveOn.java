package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61103b;

        /* renamed from: c */
        public final Scheduler f61104c = null;

        /* renamed from: d */
        public T f61105d;

        /* renamed from: e */
        public Throwable f61106e;

        public ObserveOnMaybeObserver(MaybeObserver<? super T> maybeObserver, Scheduler scheduler) {
            this.f61103b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f61103b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.m31411c(this, this.f61104c.mo31376c(this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61106e = th;
            DisposableHelper.m31411c(this, this.f61104c.mo31376c(this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61105d = t;
            DisposableHelper.m31411c(this, this.f61104c.mo31376c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f61106e;
            if (th != null) {
                this.f61106e = null;
                this.f61103b.onError(th);
                return;
            }
            T t = this.f61105d;
            if (t == null) {
                this.f61103b.onComplete();
            } else {
                this.f61105d = null;
                this.f61103b.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        new ObserveOnMaybeObserver(maybeObserver, null);
        throw null;
    }
}
