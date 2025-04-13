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
public final class ObservableRetryWhen<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61950b;

        /* renamed from: c */
        public final AtomicInteger f61951c;

        /* renamed from: d */
        public final AtomicThrowable f61952d;

        /* renamed from: e */
        public final Subject<Throwable> f61953e;

        /* renamed from: f */
        public final RepeatWhenObserver<T>.InnerRepeatObserver f61954f;

        /* renamed from: g */
        public final AtomicReference<Disposable> f61955g;

        /* renamed from: h */
        public final ObservableSource<T> f61956h;

        /* renamed from: i */
        public volatile boolean f61957i;

        public final class InnerRepeatObserver extends AtomicReference<Disposable> implements Observer<Object> {

            /* renamed from: b */
            public final /* synthetic */ RepeatWhenObserver f61958b;

            @Override // io.reactivex.Observer
            /* renamed from: a */
            public void mo31373a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                RepeatWhenObserver repeatWhenObserver = this.f61958b;
                DisposableHelper.m31409a(repeatWhenObserver.f61955g);
                HalfSerializer.m31822a(repeatWhenObserver.f61950b, repeatWhenObserver, repeatWhenObserver.f61952d);
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                RepeatWhenObserver repeatWhenObserver = this.f61958b;
                DisposableHelper.m31409a(repeatWhenObserver.f61955g);
                HalfSerializer.m31824c(repeatWhenObserver.f61950b, th, repeatWhenObserver, repeatWhenObserver.f61952d);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                this.f61958b.m31711b();
            }
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31411c(this.f61955g, disposable);
        }

        /* renamed from: b */
        public void m31711b() {
            if (this.f61951c.getAndIncrement() == 0) {
                while (!mo31380s()) {
                    if (!this.f61957i) {
                        this.f61957i = true;
                        this.f61956h.mo31364c(this);
                    }
                    if (this.f61951c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this.f61955g);
            DisposableHelper.m31409a(this.f61954f);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            DisposableHelper.m31409a(this.f61954f);
            HalfSerializer.m31822a(this.f61950b, this, this.f61952d);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            DisposableHelper.m31411c(this.f61955g, null);
            this.f61957i = false;
            this.f61953e.onNext(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            HalfSerializer.m31826e(this.f61950b, t, this, this.f61952d);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f61955g.get());
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
