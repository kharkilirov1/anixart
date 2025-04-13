package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public enum DisposableHelper implements Disposable {
    DISPOSED;

    /* renamed from: a */
    public static boolean m31409a(AtomicReference<Disposable> atomicReference) {
        Disposable andSet;
        Disposable disposable = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.mo31379f();
        return true;
    }

    /* renamed from: b */
    public static boolean m31410b(Disposable disposable) {
        return disposable == DISPOSED;
    }

    /* renamed from: c */
    public static boolean m31411c(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable == null) {
                    return false;
                }
                disposable.mo31379f();
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        return true;
    }

    /* renamed from: d */
    public static boolean m31412d(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable == null) {
                    return false;
                }
                disposable.mo31379f();
                return false;
            }
        } while (!atomicReference.compareAndSet(disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.mo31379f();
        return true;
    }

    /* renamed from: e */
    public static boolean m31413e(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        Objects.requireNonNull(disposable, "d is null");
        if (atomicReference.compareAndSet(null, disposable)) {
            return true;
        }
        disposable.mo31379f();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        RxJavaPlugins.m31848b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    /* renamed from: h */
    public static boolean m31414h(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.m31848b(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.mo31379f();
        RxJavaPlugins.m31848b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return true;
    }
}
