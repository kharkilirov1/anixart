package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeDelay<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DelayMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60990b;

        /* renamed from: c */
        public final long f60991c;

        /* renamed from: d */
        public final TimeUnit f60992d = null;

        /* renamed from: e */
        public final Scheduler f60993e = null;

        /* renamed from: f */
        public T f60994f;

        /* renamed from: g */
        public Throwable f60995g;

        public DelayMaybeObserver(MaybeObserver<? super T> maybeObserver, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            this.f60990b = maybeObserver;
            this.f60991c = j2;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                this.f60990b.mo31355a(this);
            }
        }

        /* renamed from: b */
        public void m31615b() {
            DisposableHelper.m31411c(this, this.f60993e.mo31377d(this, this.f60991c, this.f60992d));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            m31615b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60995g = th;
            m31615b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f60994f = t;
            m31615b();
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f60995g;
            if (th != null) {
                this.f60990b.onError(th);
                return;
            }
            T t = this.f60994f;
            if (t != null) {
                this.f60990b.onSuccess(t);
            } else {
                this.f60990b.onComplete();
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
        new DelayMaybeObserver(maybeObserver, 0L, null, null);
        throw null;
    }
}
