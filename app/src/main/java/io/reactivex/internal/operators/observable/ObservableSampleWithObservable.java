package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableSampleWithObservable<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {

        /* renamed from: f */
        public final AtomicInteger f61966f;

        /* renamed from: g */
        public volatile boolean f61967g;

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* renamed from: b */
        public void mo31714b() {
            this.f61967g = true;
            if (this.f61966f.getAndIncrement() == 0) {
                m31716c();
                this.f61968b.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* renamed from: d */
        public void mo31715d() {
            if (this.f61966f.getAndIncrement() == 0) {
                do {
                    boolean z = this.f61967g;
                    m31716c();
                    if (z) {
                        this.f61968b.onComplete();
                        return;
                    }
                } while (this.f61966f.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        public SampleMainNoLast(Observer<? super T> observer, ObservableSource<?> observableSource) {
            super(observer, null);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* renamed from: b */
        public void mo31714b() {
            this.f61968b.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        /* renamed from: d */
        public void mo31715d() {
            m31716c();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61968b;

        /* renamed from: c */
        public final ObservableSource<?> f61969c;

        /* renamed from: d */
        public final AtomicReference<Disposable> f61970d = new AtomicReference<>();

        /* renamed from: e */
        public Disposable f61971e;

        public SampleMainObserver(Observer<? super T> observer, ObservableSource<?> observableSource) {
            this.f61968b = observer;
            this.f61969c = observableSource;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61971e, disposable)) {
                this.f61971e = disposable;
                this.f61968b.mo31373a(this);
                if (this.f61970d.get() == null) {
                    this.f61969c.mo31364c(new SamplerObserver(this));
                }
            }
        }

        /* renamed from: b */
        public abstract void mo31714b();

        /* renamed from: c */
        public void m31716c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f61968b.onNext(andSet);
            }
        }

        /* renamed from: d */
        public abstract void mo31715d();

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61970d);
            this.f61971e.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f61970d);
            mo31714b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61970d);
            this.f61968b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61970d.get() == DisposableHelper.DISPOSED;
        }
    }

    public static final class SamplerObserver<T> implements Observer<Object> {

        /* renamed from: b */
        public final SampleMainObserver<T> f61972b;

        public SamplerObserver(SampleMainObserver<T> sampleMainObserver) {
            this.f61972b = sampleMainObserver;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61972b.f61970d, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            SampleMainObserver<T> sampleMainObserver = this.f61972b;
            sampleMainObserver.f61971e.mo31379f();
            sampleMainObserver.mo31714b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            SampleMainObserver<T> sampleMainObserver = this.f61972b;
            sampleMainObserver.f61971e.mo31379f();
            sampleMainObserver.f61968b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f61972b.mo31715d();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SampleMainNoLast(new SerializedObserver(observer), null));
    }
}
