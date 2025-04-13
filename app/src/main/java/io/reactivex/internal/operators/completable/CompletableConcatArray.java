package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class CompletableConcatArray extends Completable {

    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {

        /* renamed from: b */
        public final CompletableObserver f59699b;

        /* renamed from: d */
        public int f59701d;

        /* renamed from: c */
        public final CompletableSource[] f59700c = null;

        /* renamed from: e */
        public final SequentialDisposable f59702e = new SequentialDisposable();

        public ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.f59699b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31411c(this.f59702e, disposable);
        }

        /* renamed from: b */
        public void m31447b() {
            if (!this.f59702e.mo31380s() && getAndIncrement() == 0) {
                CompletableSource[] completableSourceArr = this.f59700c;
                while (!this.f59702e.mo31380s()) {
                    int i2 = this.f59701d;
                    this.f59701d = i2 + 1;
                    if (i2 == completableSourceArr.length) {
                        this.f59699b.onComplete();
                        return;
                    } else {
                        completableSourceArr[i2].mo31345b(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            m31447b();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            this.f59699b.onError(th);
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, null);
        completableObserver.mo31347a(concatInnerObserver.f59702e);
        concatInnerObserver.m31447b();
    }
}
