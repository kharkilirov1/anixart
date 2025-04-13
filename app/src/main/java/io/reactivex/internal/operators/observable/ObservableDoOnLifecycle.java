package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.DisposableLambdaObserver;

/* loaded from: classes3.dex */
public final class ObservableDoOnLifecycle<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final Consumer<? super Disposable> f61614c;

    /* renamed from: d */
    public final Action f61615d;

    public ObservableDoOnLifecycle(Observable<T> observable, Consumer<? super Disposable> consumer, Action action) {
        super(observable);
        this.f61614c = consumer;
        this.f61615d = action;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DisposableLambdaObserver(observer, this.f61614c, this.f61615d));
    }
}
