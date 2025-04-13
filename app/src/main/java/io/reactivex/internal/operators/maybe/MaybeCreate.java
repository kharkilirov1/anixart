package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeCreate<T> extends Maybe<T> {

    public static final class Emitter<T> extends AtomicReference<Disposable> implements MaybeEmitter<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f60989b;

        public Emitter(MaybeObserver<? super T> maybeObserver) {
            this.f60989b = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", Emitter.class.getSimpleName(), super.toString());
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        boolean z;
        Disposable andSet;
        Emitter emitter = new Emitter(maybeObserver);
        maybeObserver.mo31355a(emitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            Disposable disposable = emitter.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = emitter.getAndSet(disposableHelper)) == disposableHelper) {
                z = false;
            } else {
                try {
                    emitter.f60989b.onError(th);
                    z = true;
                } finally {
                    if (andSet != null) {
                        andSet.mo31379f();
                    }
                }
            }
            if (z) {
                return;
            }
            RxJavaPlugins.m31848b(th);
        }
    }
}
