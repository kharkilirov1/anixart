package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableCreate extends Completable {

    public static final class Emitter extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59706b;

        public Emitter(CompletableObserver completableObserver) {
            this.f59706b = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.CompletableEmitter
        public void onComplete() {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                return;
            }
            try {
                this.f59706b.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.mo31379f();
                }
            }
        }

        @Override // io.reactivex.CompletableEmitter
        public void onError(Throwable th) {
            boolean z;
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                z = false;
            } else {
                try {
                    this.f59706b.onError(th);
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

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        Emitter emitter = new Emitter(completableObserver);
        completableObserver.mo31347a(emitter);
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            emitter.onError(th);
        }
    }
}
