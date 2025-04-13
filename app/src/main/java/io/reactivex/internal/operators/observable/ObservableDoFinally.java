package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f61598b;

        /* renamed from: c */
        public final Action f61599c = null;

        /* renamed from: d */
        public Disposable f61600d;

        /* renamed from: e */
        public QueueDisposable<T> f61601e;

        /* renamed from: f */
        public boolean f61602f;

        public DoFinallyObserver(Observer<? super T> observer, Action action) {
            this.f61598b = observer;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            QueueDisposable<T> queueDisposable = this.f61601e;
            if (queueDisposable == null || (i2 & 4) != 0) {
                return 0;
            }
            int mo31420F = queueDisposable.mo31420F(i2);
            if (mo31420F != 0) {
                this.f61602f = mo31420F == 1;
            }
            return mo31420F;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61600d, disposable)) {
                this.f61600d = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f61601e = (QueueDisposable) disposable;
                }
                this.f61598b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31661b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f61599c.run();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f61601e.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61600d.mo31379f();
            m31661b();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f61601e.isEmpty();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61598b.onComplete();
            m31661b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61598b.onError(th);
            m31661b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61598b.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f61601e.poll();
            if (poll == null && this.f61602f) {
                m31661b();
            }
            return poll;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61600d.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DoFinallyObserver(observer, null));
    }
}
