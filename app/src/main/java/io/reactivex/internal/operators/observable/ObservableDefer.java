package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ObservableDefer<T> extends Observable<T> {

    /* renamed from: b */
    public final Callable<? extends ObservableSource<? extends T>> f61568b;

    public ObservableDefer(Callable<? extends ObservableSource<? extends T>> callable) {
        this.f61568b = callable;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        try {
            ObservableSource<? extends T> call = this.f61568b.call();
            Objects.requireNonNull(call, "null ObservableSource supplied");
            call.mo31364c(observer);
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
