package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class MaybeDoAfterSuccess<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DoAfterObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61012b;

        /* renamed from: c */
        public final Consumer<? super T> f61013c;

        /* renamed from: d */
        public Disposable f61014d;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61014d, disposable)) {
                this.f61014d = disposable;
                this.f61012b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61014d.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61012b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61012b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61012b.onSuccess(t);
            try {
                this.f61013c.accept(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61014d.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}
