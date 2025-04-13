package io.reactivex.subjects;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class CompletableSubject extends Completable implements CompletableObserver {

    /* renamed from: e */
    public static final CompletableDisposable[] f62941e = new CompletableDisposable[0];

    /* renamed from: f */
    public static final CompletableDisposable[] f62942f = new CompletableDisposable[0];

    /* renamed from: d */
    public Throwable f62945d;

    /* renamed from: c */
    public final AtomicBoolean f62944c = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicReference<CompletableDisposable[]> f62943b = new AtomicReference<>(f62941e);

    public static final class CompletableDisposable extends AtomicReference<CompletableSubject> implements Disposable {

        /* renamed from: b */
        public final CompletableObserver f62946b;

        public CompletableDisposable(CompletableObserver completableObserver, CompletableSubject completableSubject) {
            this.f62946b = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m31865d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == null;
        }
    }

    @Override // io.reactivex.CompletableObserver
    /* renamed from: a */
    public void mo31347a(Disposable disposable) {
        if (this.f62943b.get() == f62942f) {
            disposable.mo31379f();
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        boolean z;
        CompletableDisposable completableDisposable = new CompletableDisposable(completableObserver, this);
        completableObserver.mo31347a(completableDisposable);
        while (true) {
            CompletableDisposable[] completableDisposableArr = this.f62943b.get();
            z = false;
            if (completableDisposableArr == f62942f) {
                break;
            }
            int length = completableDisposableArr.length;
            CompletableDisposable[] completableDisposableArr2 = new CompletableDisposable[length + 1];
            System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
            if (this.f62943b.compareAndSet(completableDisposableArr, completableDisposableArr2)) {
                z = true;
                break;
            }
        }
        if (z) {
            if (completableDisposable.mo31380s()) {
                m31865d(completableDisposable);
            }
        } else {
            Throwable th = this.f62945d;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        }
    }

    /* renamed from: d */
    public void m31865d(CompletableDisposable completableDisposable) {
        CompletableDisposable[] completableDisposableArr;
        CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.f62943b.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (completableDisposableArr[i2] == completableDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr2 = f62941e;
            } else {
                CompletableDisposable[] completableDisposableArr3 = new CompletableDisposable[length - 1];
                System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i2);
                System.arraycopy(completableDisposableArr, i2 + 1, completableDisposableArr3, i2, (length - i2) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!this.f62943b.compareAndSet(completableDisposableArr, completableDisposableArr2));
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        if (this.f62944c.compareAndSet(false, true)) {
            for (CompletableDisposable completableDisposable : this.f62943b.getAndSet(f62942f)) {
                completableDisposable.f62946b.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        Objects.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f62944c.compareAndSet(false, true)) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f62945d = th;
        for (CompletableDisposable completableDisposable : this.f62943b.getAndSet(f62942f)) {
            completableDisposable.f62946b.onError(th);
        }
    }
}
