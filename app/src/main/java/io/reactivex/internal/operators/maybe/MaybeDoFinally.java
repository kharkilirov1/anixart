package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class MaybeDoFinally<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DoFinallyObserver<T> extends AtomicInteger implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61015b;

        /* renamed from: c */
        public final Action f61016c = null;

        /* renamed from: d */
        public Disposable f61017d;

        public DoFinallyObserver(MaybeObserver<? super T> maybeObserver, Action action) {
            this.f61015b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61017d, disposable)) {
                this.f61017d = disposable;
                this.f61015b.mo31355a(this);
            }
        }

        /* renamed from: b */
        public void m31617b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f61016c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61017d.mo31379f();
            m31617b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61015b.onComplete();
            m31617b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61015b.onError(th);
            m31617b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61015b.onSuccess(t);
            m31617b();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61017d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        new DoFinallyObserver(maybeObserver, null);
        throw null;
    }
}
