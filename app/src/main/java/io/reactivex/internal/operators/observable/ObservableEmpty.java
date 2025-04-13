package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* loaded from: classes3.dex */
public final class ObservableEmpty extends Observable<Object> implements ScalarCallable<Object> {

    /* renamed from: b */
    public static final Observable<Object> f61634b = new ObservableEmpty();

    @Override // java.util.concurrent.Callable
    public Object call() {
        return null;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Object> observer) {
        observer.mo31373a(EmptyDisposable.INSTANCE);
        observer.onComplete();
    }
}
