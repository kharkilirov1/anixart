package io.reactivex.internal.disposables;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueDisposable;

/* loaded from: classes3.dex */
public enum EmptyDisposable implements QueueDisposable<Object> {
    INSTANCE,
    NEVER;

    /* renamed from: a */
    public static void m31415a(Observer<?> observer) {
        observer.mo31373a(INSTANCE);
        observer.onComplete();
    }

    /* renamed from: b */
    public static void m31416b(Throwable th, CompletableObserver completableObserver) {
        completableObserver.mo31347a(INSTANCE);
        completableObserver.onError(th);
    }

    /* renamed from: c */
    public static void m31417c(Throwable th, MaybeObserver<?> maybeObserver) {
        maybeObserver.mo31355a(INSTANCE);
        maybeObserver.onError(th);
    }

    /* renamed from: d */
    public static void m31418d(Throwable th, Observer<?> observer) {
        observer.mo31373a(INSTANCE);
        observer.onError(th);
    }

    /* renamed from: h */
    public static void m31419h(Throwable th, SingleObserver<?> singleObserver) {
        singleObserver.mo31388a(INSTANCE);
        singleObserver.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* renamed from: F */
    public int mo31420F(int i2) {
        return i2 & 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() throws Exception {
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this == INSTANCE;
    }
}
