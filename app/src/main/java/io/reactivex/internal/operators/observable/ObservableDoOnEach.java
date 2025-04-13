package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableDoOnEach<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final Consumer<? super T> f61603c;

    /* renamed from: d */
    public final Consumer<? super Throwable> f61604d;

    /* renamed from: e */
    public final Action f61605e;

    /* renamed from: f */
    public final Action f61606f;

    public static final class DoOnEachObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61607b;

        /* renamed from: c */
        public final Consumer<? super T> f61608c;

        /* renamed from: d */
        public final Consumer<? super Throwable> f61609d;

        /* renamed from: e */
        public final Action f61610e;

        /* renamed from: f */
        public final Action f61611f;

        /* renamed from: g */
        public Disposable f61612g;

        /* renamed from: h */
        public boolean f61613h;

        public DoOnEachObserver(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.f61607b = observer;
            this.f61608c = consumer;
            this.f61609d = consumer2;
            this.f61610e = action;
            this.f61611f = action2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61612g, disposable)) {
                this.f61612g = disposable;
                this.f61607b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61612g.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61613h) {
                return;
            }
            try {
                this.f61610e.run();
                this.f61613h = true;
                this.f61607b.onComplete();
                try {
                    this.f61611f.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61613h) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61613h = true;
            try {
                this.f61609d.accept(th);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                th = new CompositeException(th, th2);
            }
            this.f61607b.onError(th);
            try {
                this.f61611f.run();
            } catch (Throwable th3) {
                Exceptions.m31402a(th3);
                RxJavaPlugins.m31848b(th3);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61613h) {
                return;
            }
            try {
                this.f61608c.accept(t);
                this.f61607b.onNext(t);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f61612g.mo31379f();
                onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61612g.mo31380s();
        }
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f61603c = consumer;
        this.f61604d = consumer2;
        this.f61605e = action;
        this.f61606f = action2;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DoOnEachObserver(observer, this.f61603c, this.f61604d, this.f61605e, this.f61606f));
    }
}
