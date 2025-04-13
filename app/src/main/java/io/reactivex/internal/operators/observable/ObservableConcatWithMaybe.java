package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61532b;

        /* renamed from: c */
        public MaybeSource<? extends T> f61533c = null;

        /* renamed from: d */
        public boolean f61534d;

        public ConcatWithObserver(Observer<? super T> observer, MaybeSource<? extends T> maybeSource) {
            this.f61532b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (!DisposableHelper.m31413e(this, disposable) || this.f61534d) {
                return;
            }
            this.f61532b.mo31373a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61534d) {
                this.f61532b.onComplete();
                return;
            }
            this.f61534d = true;
            DisposableHelper.m31411c(this, null);
            MaybeSource<? extends T> maybeSource = this.f61533c;
            this.f61533c = null;
            maybeSource.mo31353b(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61532b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61532b.onNext(t);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61532b.onNext(t);
            this.f61532b.onComplete();
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
