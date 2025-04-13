package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes3.dex */
public final class ObservableRange extends Observable<Integer> {

    public static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {

        /* renamed from: b */
        public final Observer<? super Integer> f61869b;

        /* renamed from: c */
        public final long f61870c;

        /* renamed from: d */
        public long f61871d;

        /* renamed from: e */
        public boolean f61872e;

        public RangeDisposable(Observer<? super Integer> observer, long j2, long j3) {
            this.f61869b = observer;
            this.f61871d = j2;
            this.f61870c = j3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f61872e = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61871d = this.f61870c;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61871d == this.f61870c;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            long j2 = this.f61871d;
            if (j2 != this.f61870c) {
                this.f61871d = 1 + j2;
                return Integer.valueOf((int) j2);
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
    public void mo31371m(Observer<? super Integer> observer) {
        RangeDisposable rangeDisposable = new RangeDisposable(observer, 0, 0L);
        observer.mo31373a(rangeDisposable);
        if (rangeDisposable.f61872e) {
            return;
        }
        Observer<? super Integer> observer2 = rangeDisposable.f61869b;
        long j2 = rangeDisposable.f61870c;
        for (long j3 = rangeDisposable.f61871d; j3 != j2 && rangeDisposable.get() == 0; j3++) {
            observer2.onNext(Integer.valueOf((int) j3));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
