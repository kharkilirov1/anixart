package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableConcatWithSingle<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61535b;

        /* renamed from: c */
        public SingleSource<? extends T> f61536c = null;

        /* renamed from: d */
        public boolean f61537d;

        public ConcatWithObserver(Observer<? super T> observer, SingleSource<? extends T> singleSource) {
            this.f61535b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (!DisposableHelper.m31413e(this, disposable) || this.f61537d) {
                return;
            }
            this.f61535b.mo31373a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61537d = true;
            DisposableHelper.m31411c(this, null);
            SingleSource<? extends T> singleSource = this.f61536c;
            this.f61536c = null;
            singleSource.mo31385b(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61535b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61535b.onNext(t);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f61535b.onNext(t);
            this.f61535b.onComplete();
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
