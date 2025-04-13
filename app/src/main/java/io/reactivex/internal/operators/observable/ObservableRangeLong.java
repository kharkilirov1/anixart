package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes3.dex */
public final class ObservableRangeLong extends Observable<Long> {

    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {

        /* renamed from: b */
        public final Observer<? super Long> f61873b;

        /* renamed from: c */
        public final long f61874c;

        /* renamed from: d */
        public long f61875d;

        /* renamed from: e */
        public boolean f61876e;

        public RangeDisposable(Observer<? super Long> observer, long j2, long j3) {
            this.f61873b = observer;
            this.f61875d = j2;
            this.f61874c = j3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f61876e = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61875d = this.f61874c;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61875d == this.f61874c;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            long j2 = this.f61875d;
            if (j2 != this.f61874c) {
                this.f61875d = 1 + j2;
                return Long.valueOf(j2);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() != 0;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Long> observer) {
        RangeDisposable rangeDisposable = new RangeDisposable(observer, 0L, 0L);
        observer.mo31373a(rangeDisposable);
        if (rangeDisposable.f61876e) {
            return;
        }
        Observer<? super Long> observer2 = rangeDisposable.f61873b;
        long j2 = rangeDisposable.f61874c;
        for (long j3 = rangeDisposable.f61875d; j3 != j2 && rangeDisposable.get() == 0; j3++) {
            observer2.onNext(Long.valueOf(j3));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
