package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ResumeSingleObserver<T> implements SingleObserver<T> {

    /* renamed from: b */
    public final AtomicReference<Disposable> f59673b;

    /* renamed from: c */
    public final SingleObserver<? super T> f59674c;

    public ResumeSingleObserver(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f59673b = atomicReference;
        this.f59674c = singleObserver;
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
        DisposableHelper.m31411c(this.f59673b, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        this.f59674c.onError(th);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        this.f59674c.onSuccess(t);
    }
}
