package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableMaterialize<T> extends AbstractObservableWithUpstream<T, Notification<T>> {

    public static final class MaterializeObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super Notification<T>> f61807b;

        /* renamed from: c */
        public Disposable f61808c;

        public MaterializeObserver(Observer<? super Notification<T>> observer) {
            this.f61807b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61808c, disposable)) {
                this.f61808c = disposable;
                this.f61807b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61808c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61807b.onNext(Notification.f59570b);
            this.f61807b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Objects.requireNonNull(th, "error is null");
            this.f61807b.onNext(new Notification(NotificationLite.m31832e(th)));
            this.f61807b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            Observer<? super Notification<T>> observer = this.f61807b;
            Objects.requireNonNull(t, "value is null");
            observer.onNext(new Notification(t));
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61808c.mo31380s();
        }
    }

    public ObservableMaterialize(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Notification<T>> observer) {
        this.f61337b.mo31364c(new MaterializeObserver(observer));
    }
}
