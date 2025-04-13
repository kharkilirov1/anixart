package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleCreate<T> extends Single<T> {

    /* renamed from: b */
    public final SingleOnSubscribe<T> f62444b;

    public static final class Emitter<T> extends AtomicReference<Disposable> implements SingleEmitter<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62445b;

        public Emitter(SingleObserver<? super T> singleObserver) {
            this.f62445b = singleObserver;
        }

        @Override // io.reactivex.SingleEmitter
        /* renamed from: a */
        public boolean mo31387a(Throwable th) {
            Disposable andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return false;
            }
            try {
                this.f62445b.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.mo31379f();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.SingleEmitter
        public void onError(Throwable th) {
            if (mo31387a(th)) {
                return;
            }
            RxJavaPlugins.m31848b(th);
        }

        @Override // io.reactivex.SingleEmitter
        public void onSuccess(T t) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                if (t == null) {
                    this.f62445b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f62445b.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.mo31379f();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.mo31379f();
                }
                throw th;
            }
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

    public SingleCreate(SingleOnSubscribe<T> singleOnSubscribe) {
        this.f62444b = singleOnSubscribe;
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        Emitter emitter = new Emitter(singleObserver);
        singleObserver.mo31388a(emitter);
        try {
            this.f62444b.mo4088a(emitter);
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (emitter.mo31387a(th)) {
                return;
            }
            RxJavaPlugins.m31848b(th);
        }
    }
}
