package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableIntervalRange extends Observable<Long> {

    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super Long> f61772b;

        /* renamed from: c */
        public final long f61773c;

        /* renamed from: d */
        public long f61774d;

        public IntervalRangeObserver(Observer<? super Long> observer, long j2, long j3) {
            this.f61772b = observer;
            this.f61774d = j2;
            this.f61773c = j3;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (mo31380s()) {
                return;
            }
            long j2 = this.f61774d;
            this.f61772b.onNext(Long.valueOf(j2));
            if (j2 != this.f61773c) {
                this.f61774d = j2 + 1;
            } else {
                DisposableHelper.m31409a(this);
                this.f61772b.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == DisposableHelper.DISPOSED;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Long> observer) {
        observer.mo31373a(new IntervalRangeObserver(observer, 0L, 0L));
        throw null;
    }
}
