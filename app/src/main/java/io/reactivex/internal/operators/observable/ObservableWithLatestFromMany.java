package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractObservableWithUpstream<T, R> {

    public final class SingletonArrayFunc implements Function<T, R> {

        /* renamed from: b */
        public final /* synthetic */ ObservableWithLatestFromMany f62286b;

        @Override // io.reactivex.functions.Function
        public R apply(T t) throws Exception {
            Objects.requireNonNull(this.f62286b);
            throw null;
        }
    }

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f62287b;

        /* renamed from: c */
        public final Function<? super Object[], R> f62288c;

        /* renamed from: d */
        public final WithLatestInnerObserver[] f62289d;

        /* renamed from: e */
        public final AtomicReferenceArray<Object> f62290e;

        /* renamed from: f */
        public final AtomicReference<Disposable> f62291f;

        /* renamed from: g */
        public final AtomicThrowable f62292g;

        /* renamed from: h */
        public volatile boolean f62293h;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f62291f, disposable);
        }

        /* renamed from: b */
        public void m31738b(int i2) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.f62289d;
            for (int i3 = 0; i3 < withLatestInnerObserverArr.length; i3++) {
                if (i3 != i2) {
                    DisposableHelper.m31409a(withLatestInnerObserverArr[i3]);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f62291f);
            for (WithLatestInnerObserver withLatestInnerObserver : this.f62289d) {
                DisposableHelper.m31409a(withLatestInnerObserver);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62293h) {
                return;
            }
            this.f62293h = true;
            m31738b(-1);
            HalfSerializer.m31822a(this.f62287b, this, this.f62292g);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62293h) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62293h = true;
            m31738b(-1);
            HalfSerializer.m31824c(this.f62287b, th, this, this.f62292g);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62293h) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f62290e;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i2 = 0;
            objArr[0] = t;
            while (i2 < length) {
                Object obj = atomicReferenceArray.get(i2);
                if (obj == null) {
                    return;
                }
                i2++;
                objArr[i2] = obj;
            }
            try {
                R apply = this.f62288c.apply(objArr);
                Objects.requireNonNull(apply, "combiner returned a null value");
                HalfSerializer.m31826e(this.f62287b, apply, this, this.f62292g);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f62291f.get());
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {

        /* renamed from: b */
        public final WithLatestFromObserver<?, ?> f62294b;

        /* renamed from: c */
        public final int f62295c;

        /* renamed from: d */
        public boolean f62296d;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.f62294b;
            int i2 = this.f62295c;
            boolean z = this.f62296d;
            Objects.requireNonNull(withLatestFromObserver);
            if (z) {
                return;
            }
            withLatestFromObserver.f62293h = true;
            withLatestFromObserver.m31738b(i2);
            HalfSerializer.m31822a(withLatestFromObserver.f62287b, withLatestFromObserver, withLatestFromObserver.f62292g);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.f62294b;
            int i2 = this.f62295c;
            withLatestFromObserver.f62293h = true;
            DisposableHelper.m31409a(withLatestFromObserver.f62291f);
            withLatestFromObserver.m31738b(i2);
            HalfSerializer.m31824c(withLatestFromObserver.f62287b, th, withLatestFromObserver, withLatestFromObserver.f62292g);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (!this.f62296d) {
                this.f62296d = true;
            }
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.f62294b;
            withLatestFromObserver.f62290e.set(this.f62295c, obj);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
