package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableTakeUntilCompletable extends Completable {

    public static final class TakeUntilMainObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59761b;

        /* renamed from: c */
        public final OtherObserver f59762c = new OtherObserver(this);

        /* renamed from: d */
        public final AtomicBoolean f59763d = new AtomicBoolean();

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final TakeUntilMainObserver f59764b;

            public OtherObserver(TakeUntilMainObserver takeUntilMainObserver) {
                this.f59764b = takeUntilMainObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                TakeUntilMainObserver takeUntilMainObserver = this.f59764b;
                if (takeUntilMainObserver.f59763d.compareAndSet(false, true)) {
                    DisposableHelper.m31409a(takeUntilMainObserver);
                    takeUntilMainObserver.f59761b.onComplete();
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                TakeUntilMainObserver takeUntilMainObserver = this.f59764b;
                if (!takeUntilMainObserver.f59763d.compareAndSet(false, true)) {
                    RxJavaPlugins.m31848b(th);
                } else {
                    DisposableHelper.m31409a(takeUntilMainObserver);
                    takeUntilMainObserver.f59761b.onError(th);
                }
            }
        }

        public TakeUntilMainObserver(CompletableObserver completableObserver) {
            this.f59761b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        /* renamed from: a */
        public void mo31347a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f59763d.compareAndSet(false, true)) {
                DisposableHelper.m31409a(this);
                DisposableHelper.m31409a(this.f59762c);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            if (this.f59763d.compareAndSet(false, true)) {
                DisposableHelper.m31409a(this.f59762c);
                this.f59761b.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th) {
            if (!this.f59763d.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f59762c);
                this.f59761b.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f59763d.get();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        completableObserver.mo31347a(new TakeUntilMainObserver(completableObserver));
        throw null;
    }
}
