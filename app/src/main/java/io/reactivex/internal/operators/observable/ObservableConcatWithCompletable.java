package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61529b;

        /* renamed from: c */
        public CompletableSource f61530c = null;

        /* renamed from: d */
        public boolean f61531d;

        public ConcatWithObserver(Observer<? super T> observer, CompletableSource completableSource) {
            this.f61529b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (!DisposableHelper.m31413e(this, disposable) || this.f61531d) {
                return;
            }
            this.f61529b.mo31373a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61531d) {
                this.f61529b.onComplete();
                return;
            }
            this.f61531d = true;
            DisposableHelper.m31411c(this, null);
            CompletableSource completableSource = this.f61530c;
            this.f61530c = null;
            completableSource.mo31345b(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61529b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61529b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new ConcatWithObserver(observer, null));
    }
}
