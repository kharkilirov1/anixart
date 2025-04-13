package io.reactivex.subjects;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {

    /* renamed from: f */
    public static final MaybeDisposable[] f62947f = new MaybeDisposable[0];

    /* renamed from: g */
    public static final MaybeDisposable[] f62948g = new MaybeDisposable[0];

    /* renamed from: d */
    public T f62951d;

    /* renamed from: e */
    public Throwable f62952e;

    /* renamed from: c */
    public final AtomicBoolean f62950c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<MaybeDisposable<T>[]> f62949b = new AtomicReference<>(f62947f);

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f62953b;

        public MaybeDisposable(MaybeObserver<? super T> maybeObserver, MaybeSubject<T> maybeSubject) {
            this.f62953b = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31866d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == null;
        }
    }

    @Override // io.reactivex.MaybeObserver
    /* renamed from: a */
    public void mo31355a(Disposable disposable) {
        if (this.f62949b.get() == f62948g) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        boolean z;
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(maybeObserver, this);
        maybeObserver.mo31355a(maybeDisposable);
        while (true) {
            MaybeDisposable<T>[] maybeDisposableArr = this.f62949b.get();
            z = false;
            if (maybeDisposableArr == f62948g) {
                break;
            }
            int length = maybeDisposableArr.length;
            MaybeDisposable<T>[] maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
            if (this.f62949b.compareAndSet(maybeDisposableArr, maybeDisposableArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (maybeDisposable.mo31380s()) {
                m31866d(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.f62952e;
        if (th != null) {
            maybeObserver.onError(th);
            return;
        }
        T t = this.f62951d;
        if (t == null) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(t);
        }
    }

    /* renamed from: d */
    public void m31866d(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        MaybeDisposable<T>[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.f62949b.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (maybeDisposableArr[i2] == maybeDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr2 = f62947f;
            } else {
                MaybeDisposable<T>[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i2);
                System.arraycopy(maybeDisposableArr, i2 + 1, maybeDisposableArr3, i2, (length - i2) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!this.f62949b.compareAndSet(maybeDisposableArr, maybeDisposableArr2));
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.f62950c.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.f62949b.getAndSet(f62948g)) {
                maybeDisposable.f62953b.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62950c.compareAndSet(false, true)) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62952e = th;
        for (MaybeDisposable<T> maybeDisposable : this.f62949b.getAndSet(f62948g)) {
            maybeDisposable.f62953b.onError(th);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        Objects.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f62950c.compareAndSet(false, true)) {
            this.f62951d = t;
            for (MaybeDisposable<T> maybeDisposable : this.f62949b.getAndSet(f62948g)) {
                maybeDisposable.f62953b.onSuccess(t);
            }
        }
    }
}
