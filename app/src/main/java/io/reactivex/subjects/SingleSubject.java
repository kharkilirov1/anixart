package io.reactivex.subjects;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* renamed from: f */
    public static final SingleDisposable[] f62969f = new SingleDisposable[0];

    /* renamed from: g */
    public static final SingleDisposable[] f62970g = new SingleDisposable[0];

    /* renamed from: d */
    public T f62973d;

    /* renamed from: e */
    public Throwable f62974e;

    /* renamed from: c */
    public final AtomicBoolean f62972c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<SingleDisposable<T>[]> f62971b = new AtomicReference<>(f62969f);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62975b;

        public SingleDisposable(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.f62975b = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31869d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == null;
        }
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(@NonNull Disposable disposable) {
        if (this.f62971b.get() == f62970g) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(@NonNull SingleObserver<? super T> singleObserver) {
        boolean z;
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(singleObserver, this);
        singleObserver.mo31388a(singleDisposable);
        while (true) {
            SingleDisposable<T>[] singleDisposableArr = this.f62971b.get();
            z = false;
            if (singleDisposableArr == f62970g) {
                break;
            }
            int length = singleDisposableArr.length;
            SingleDisposable<T>[] singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
            if (this.f62971b.compareAndSet(singleDisposableArr, singleDisposableArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (singleDisposable.mo31380s()) {
                m31869d(singleDisposable);
            }
        } else {
            Throwable th = this.f62974e;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.f62973d);
            }
        }
    }

    /* renamed from: d */
    public void m31869d(@NonNull SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable<T>[] singleDisposableArr2;
        do {
            singleDisposableArr = this.f62971b.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (singleDisposableArr[i2] == singleDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = f62969f;
            } else {
                SingleDisposable<T>[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i2);
                System.arraycopy(singleDisposableArr, i2 + 1, singleDisposableArr3, i2, (length - i2) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!this.f62971b.compareAndSet(singleDisposableArr, singleDisposableArr2));
    }

    @Override // io.reactivex.SingleObserver
    public void onError(@NonNull Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62972c.compareAndSet(false, true)) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62974e = th;
        for (SingleDisposable<T> singleDisposable : this.f62971b.getAndSet(f62970g)) {
            singleDisposable.f62975b.onError(th);
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(@NonNull T t) {
        Objects.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62972c.compareAndSet(false, true)) {
            this.f62973d = t;
            for (SingleDisposable<T> singleDisposable : this.f62971b.getAndSet(f62970g)) {
                singleDisposable.f62975b.onSuccess(t);
            }
        }
    }
}
