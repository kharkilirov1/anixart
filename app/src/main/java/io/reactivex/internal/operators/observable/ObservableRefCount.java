package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableRefCount<T> extends Observable<T> {

    /* renamed from: b */
    public RefConnection f61886b;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* renamed from: b */
        public final ObservableRefCount<?> f61887b;

        /* renamed from: c */
        public long f61888c;

        /* renamed from: d */
        public boolean f61889d;

        public RefConnection(ObservableRefCount<?> observableRefCount) {
            this.f61887b = observableRefCount;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.m31411c(this, disposable);
            synchronized (this.f61887b) {
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f61887b.m31693p(this);
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61890b;

        /* renamed from: c */
        public final ObservableRefCount<T> f61891c;

        /* renamed from: d */
        public final RefConnection f61892d;

        /* renamed from: e */
        public Disposable f61893e;

        public RefCountObserver(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.f61890b = observer;
            this.f61891c = observableRefCount;
            this.f61892d = refConnection;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61893e, disposable)) {
                this.f61893e = disposable;
                this.f61890b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61893e.mo31379f();
            if (compareAndSet(false, true)) {
                ObservableRefCount<T> observableRefCount = this.f61891c;
                RefConnection refConnection = this.f61892d;
                synchronized (observableRefCount) {
                    RefConnection refConnection2 = observableRefCount.f61886b;
                    if (refConnection2 != null && refConnection2 == refConnection) {
                        long j2 = refConnection.f61888c - 1;
                        refConnection.f61888c = j2;
                        if (j2 == 0 && refConnection.f61889d) {
                            observableRefCount.m31693p(refConnection);
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f61891c.m31692o(this.f61892d);
                this.f61890b.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61891c.m31692o(this.f61892d);
                this.f61890b.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61890b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61893e.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        RefConnection refConnection;
        synchronized (this) {
            refConnection = this.f61886b;
            if (refConnection == null) {
                refConnection = new RefConnection(this);
                this.f61886b = refConnection;
            }
            long j2 = refConnection.f61888c;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            long j3 = j2 + 1;
            refConnection.f61888c = j3;
            if (!refConnection.f61889d && j3 == 0) {
                refConnection.f61889d = true;
            }
        }
        new RefCountObserver(observer, this, refConnection);
        throw null;
    }

    /* renamed from: o */
    public void m31692o(RefConnection refConnection) {
        synchronized (this) {
            RefConnection refConnection2 = this.f61886b;
            if (refConnection2 != null && refConnection2 == refConnection) {
                this.f61886b = null;
                Objects.requireNonNull(refConnection);
            }
            long j2 = refConnection.f61888c - 1;
            refConnection.f61888c = j2;
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        }
    }

    /* renamed from: p */
    public void m31693p(RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.f61888c == 0 && refConnection == this.f61886b) {
                this.f61886b = null;
                refConnection.get();
                DisposableHelper.m31409a(refConnection);
            }
        }
    }
}
