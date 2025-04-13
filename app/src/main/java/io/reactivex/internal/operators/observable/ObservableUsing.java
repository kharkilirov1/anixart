package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class ObservableUsing<T, D> extends Observable<T> {

    public static final class UsingObserver<T, D> extends AtomicBoolean implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f62180b;

        /* renamed from: c */
        public final D f62181c;

        /* renamed from: d */
        public final Consumer<? super D> f62182d;

        /* renamed from: e */
        public final boolean f62183e;

        /* renamed from: f */
        public Disposable f62184f;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62184f, disposable)) {
                this.f62184f = disposable;
                this.f62180b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31729b() {
            if (compareAndSet(false, true)) {
                try {
                    this.f62182d.accept(this.f62181c);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            m31729b();
            this.f62184f.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f62183e) {
                this.f62180b.onComplete();
                this.f62184f.mo31379f();
                m31729b();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f62182d.accept(this.f62181c);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62180b.onError(th);
                    return;
                }
            }
            this.f62184f.mo31379f();
            this.f62180b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.f62183e) {
                this.f62180b.onError(th);
                this.f62184f.mo31379f();
                m31729b();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f62182d.accept(this.f62181c);
                } catch (Throwable th2) {
                    Exceptions.m31402a(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.f62184f.mo31379f();
            this.f62180b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62180b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
