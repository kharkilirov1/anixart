package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicQueueDisposable;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {

        /* renamed from: b */
        public final Observer<? super T> f61698b;

        /* renamed from: c */
        public final T[] f61699c = null;

        /* renamed from: d */
        public int f61700d;

        /* renamed from: e */
        public boolean f61701e;

        /* renamed from: f */
        public volatile boolean f61702f;

        public FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.f61698b = observer;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 1) == 0) {
                return 0;
            }
            this.f61701e = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61700d = this.f61699c.length;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61702f = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61700d == this.f61699c.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i2 = this.f61700d;
            T[] tArr = this.f61699c;
            if (i2 == tArr.length) {
                return null;
            }
            this.f61700d = i2 + 1;
            T t = tArr[i2];
            Objects.requireNonNull(t, "The array element is null");
            return t;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61702f;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        Object[] objArr = null;
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, null);
        observer.mo31373a(fromArrayDisposable);
        if (fromArrayDisposable.f61701e) {
            return;
        }
        if (objArr.length > 0 && !fromArrayDisposable.f61702f) {
            Object obj = objArr[0];
            fromArrayDisposable.f61698b.onError(new NullPointerException(C0000a.m8e("The element at index ", 0, " is null")));
        } else {
            if (fromArrayDisposable.f61702f) {
                return;
            }
            fromArrayDisposable.f61698b.onComplete();
        }
    }
}
