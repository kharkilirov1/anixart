package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableConcatIterable extends Completable {

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* renamed from: b */
        public final CompletableObserver f59703b;

        /* renamed from: c */
        public final Iterator<? extends CompletableSource> f59704c;

        /* renamed from: d */
        public final SequentialDisposable f59705d;

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31411c(this.f59705d, disposable);
        }

        /* renamed from: b */
        public void m31448b() {
            if (!this.f59705d.mo31380s() && getAndIncrement() == 0) {
                Iterator<? extends CompletableSource> it = this.f59704c;
                while (!this.f59705d.mo31380s()) {
                    try {
                        if (!it.hasNext()) {
                            this.f59703b.onComplete();
                            return;
                        }
                        try {
                            CompletableSource next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.mo31345b(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            this.f59703b.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f59703b.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            m31448b();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59703b.onError(th);
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            completableObserver.mo31347a(EmptyDisposable.INSTANCE);
            completableObserver.onError(th);
        }
    }
}
