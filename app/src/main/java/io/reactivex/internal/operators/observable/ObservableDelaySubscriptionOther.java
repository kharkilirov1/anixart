package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    public final class DelayObserver implements Observer<U> {

        /* renamed from: b */
        public final SequentialDisposable f61580b;

        /* renamed from: c */
        public final Observer<? super T> f61581c;

        /* renamed from: d */
        public boolean f61582d;

        /* renamed from: e */
        public final /* synthetic */ ObservableDelaySubscriptionOther f61583e;

        public final class OnComplete implements Observer<T> {

            /* renamed from: b */
            public final /* synthetic */ DelayObserver f61584b;

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31412d(this.f61584b.f61580b, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                this.f61584b.f61581c.onComplete();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                this.f61584b.f61581c.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onNext(T t) {
                this.f61584b.f61581c.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31412d(this.f61580b, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61582d) {
                return;
            }
            this.f61582d = true;
            Objects.requireNonNull(this.f61583e);
            throw null;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61582d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61582d = true;
                this.f61581c.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            onComplete();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        observer.mo31373a(new SequentialDisposable());
        throw null;
    }
}
