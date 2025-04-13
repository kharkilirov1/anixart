package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableRepeatWhen<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61902b;

        /* renamed from: c */
        public final AtomicInteger f61903c;

        /* renamed from: d */
        public final AtomicThrowable f61904d;

        /* renamed from: e */
        public final Subject<Object> f61905e;

        /* renamed from: f */
        public final RepeatWhenObserver<T>.InnerRepeatObserver f61906f;

        /* renamed from: g */
        public final AtomicReference<Disposable> f61907g;

        /* renamed from: h */
        public final ObservableSource<T> f61908h;

        /* renamed from: i */
        public volatile boolean f61909i;

        public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {

            /* renamed from: b */
            public final /* synthetic */ RepeatWhenObserver f61910b;

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                RepeatWhenObserver repeatWhenObserver = this.f61910b;
                DisposableHelper.m31409a(repeatWhenObserver.f61907g);
                HalfSerializer.m31822a(repeatWhenObserver.f61902b, repeatWhenObserver, repeatWhenObserver.f61904d);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = this.f61910b;
                DisposableHelper.m31409a(repeatWhenObserver.f61907g);
                HalfSerializer.m31824c(repeatWhenObserver.f61902b, th, repeatWhenObserver, repeatWhenObserver.f61904d);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                this.f61910b.m31696b();
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this.f61907g, disposable);
        }

        /* renamed from: b */
        public void m31696b() {
            if (this.f61903c.getAndIncrement() == 0) {
                while (!mo31380s()) {
                    if (!this.f61909i) {
                        this.f61909i = true;
                        this.f61908h.mo31364c(this);
                    }
                    if (this.f61903c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61907g);
            DisposableHelper.m31409a(this.f61906f);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31411c(this.f61907g, null);
            this.f61909i = false;
            this.f61905e.onNext(0);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61906f);
            HalfSerializer.m31824c(this.f61902b, th, this, this.f61904d);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            HalfSerializer.m31826e(this.f61902b, t, this, this.f61904d);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61907g.get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        new PublishSubject().m31870o();
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}
