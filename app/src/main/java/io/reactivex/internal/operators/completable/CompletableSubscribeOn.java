package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableSubscribeOn extends Completable {

    public static final class SubscribeOnObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* renamed from: b */
        public final CompletableObserver f59758b;

        /* renamed from: d */
        public final CompletableSource f59760d = null;

        /* renamed from: c */
        public final SequentialDisposable f59759c = new SequentialDisposable();

        public SubscribeOnObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f59758b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f59759c);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            this.f59758b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59758b.onError(th);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59760d.mo31345b(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new SubscribeOnObserver(completableObserver, null));
        throw null;
    }
}
