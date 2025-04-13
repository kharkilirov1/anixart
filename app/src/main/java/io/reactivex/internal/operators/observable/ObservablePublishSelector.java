package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservablePublishSelector<T, R> extends AbstractObservableWithUpstream<T, R> {

    public static final class SourceObserver<T, R> implements Observer<T> {

        /* renamed from: b */
        public final PublishSubject<T> f61865b;

        /* renamed from: c */
        public final AtomicReference<Disposable> f61866c;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61866c, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61865b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61865b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61865b.onNext(t);
        }
    }

    public static final class TargetObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, Disposable {

        /* renamed from: b */
        public final Observer<? super R> f61867b;

        /* renamed from: c */
        public Disposable f61868c;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61868c, disposable)) {
                this.f61868c = disposable;
                this.f61867b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61868c.mo31379f();
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this);
            this.f61867b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this);
            this.f61867b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r) {
            this.f61867b.onNext(r);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61868c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        new PublishSubject();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
