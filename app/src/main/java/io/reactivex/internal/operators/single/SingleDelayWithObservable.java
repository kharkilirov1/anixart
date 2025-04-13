package io.reactivex.internal.operators.single;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62455b;

        /* renamed from: c */
        public final SingleSource<T> f62456c = null;

        /* renamed from: d */
        public boolean f62457d;

        public OtherSubscriber(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f62455b = singleObserver;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31412d(this, disposable)) {
                this.f62455b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f62457d) {
                return;
            }
            this.f62457d = true;
            this.f62456c.mo31385b(new ResumeSingleObserver(this, this.f62455b));
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f62457d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62457d = true;
                this.f62455b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(U u) {
            get().mo31379f();
            onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        new OtherSubscriber(singleObserver, null);
        throw null;
    }
}
