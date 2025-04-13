package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* renamed from: g */
    public final Observer<? super T> f62835g;

    /* renamed from: h */
    public final AtomicReference<Disposable> f62836h;

    public enum EmptyObserver implements Observer<Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }
    }

    public TestObserver() {
        EmptyObserver emptyObserver = EmptyObserver.INSTANCE;
        this.f62836h = new AtomicReference<>();
        this.f62835g = emptyObserver;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        Thread.currentThread();
        if (disposable == null) {
            this.f62810d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (this.f62836h.compareAndSet(null, disposable)) {
            this.f62835g.mo31373a(disposable);
            return;
        }
        disposable.mo31379f();
        if (this.f62836h.get() != DisposableHelper.DISPOSED) {
            this.f62810d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public final void mo31379f() {
        DisposableHelper.m31409a(this.f62836h);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f62836h.get() == null) {
                this.f62810d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f62811e++;
            this.f62835g.onComplete();
        } finally {
            this.f62808b.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f62836h.get() == null) {
                this.f62810d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th == null) {
                this.f62810d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f62810d.add(th);
            }
            this.f62835g.onError(th);
        } finally {
            this.f62808b.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (!this.f62812f) {
            this.f62812f = true;
            if (this.f62836h.get() == null) {
                this.f62810d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f62809c.add(t);
        if (t == null) {
            this.f62810d.add(new NullPointerException("onNext received a null value"));
        }
        this.f62835g.onNext(t);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public final boolean mo31380s() {
        return DisposableHelper.m31410b(this.f62836h.get());
    }
}
