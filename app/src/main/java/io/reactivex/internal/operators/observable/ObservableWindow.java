package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableWindow<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowExactObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super Observable<T>> f62185b;

        /* renamed from: c */
        public final long f62186c;

        /* renamed from: d */
        public final int f62187d;

        /* renamed from: e */
        public long f62188e;

        /* renamed from: f */
        public Disposable f62189f;

        /* renamed from: g */
        public UnicastSubject<T> f62190g;

        /* renamed from: h */
        public volatile boolean f62191h;

        public WindowExactObserver(Observer<? super Observable<T>> observer, long j2, int i2) {
            this.f62185b = observer;
            this.f62186c = j2;
            this.f62187d = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62189f, disposable)) {
                this.f62189f = disposable;
                this.f62185b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62191h = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            UnicastSubject<T> unicastSubject = this.f62190g;
            if (unicastSubject != null) {
                this.f62190g = null;
                unicastSubject.onComplete();
            }
            this.f62185b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            UnicastSubject<T> unicastSubject = this.f62190g;
            if (unicastSubject != null) {
                this.f62190g = null;
                unicastSubject.onError(th);
            }
            this.f62185b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            UnicastSubject<T> unicastSubject = this.f62190g;
            if (unicastSubject == null && !this.f62191h) {
                unicastSubject = UnicastSubject.m31872q(this.f62187d, this);
                this.f62190g = unicastSubject;
                this.f62185b.onNext(unicastSubject);
            }
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
                long j2 = this.f62188e + 1;
                this.f62188e = j2;
                if (j2 >= this.f62186c) {
                    this.f62188e = 0L;
                    this.f62190g = null;
                    unicastSubject.onComplete();
                    if (this.f62191h) {
                        this.f62189f.mo31379f();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62191h) {
                this.f62189f.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62191h;
        }
    }

    public static final class WindowSkipObserver<T> extends AtomicBoolean implements Observer<T>, Disposable, Runnable {

        /* renamed from: b */
        public final Observer<? super Observable<T>> f62192b;

        /* renamed from: c */
        public final long f62193c;

        /* renamed from: d */
        public final long f62194d;

        /* renamed from: e */
        public final int f62195e;

        /* renamed from: f */
        public final ArrayDeque<UnicastSubject<T>> f62196f;

        /* renamed from: g */
        public long f62197g;

        /* renamed from: h */
        public volatile boolean f62198h;

        /* renamed from: i */
        public long f62199i;

        /* renamed from: j */
        public Disposable f62200j;

        /* renamed from: k */
        public final AtomicInteger f62201k;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62200j, disposable)) {
                this.f62200j = disposable;
                this.f62192b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62198h = true;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f62196f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onComplete();
            }
            this.f62192b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f62196f;
            while (!arrayDeque.isEmpty()) {
                arrayDeque.poll().onError(th);
            }
            this.f62192b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            ArrayDeque<UnicastSubject<T>> arrayDeque = this.f62196f;
            long j2 = this.f62197g;
            long j3 = this.f62194d;
            if (j2 % j3 == 0 && !this.f62198h) {
                this.f62201k.getAndIncrement();
                UnicastSubject<T> m31872q = UnicastSubject.m31872q(this.f62195e, this);
                arrayDeque.offer(m31872q);
                this.f62192b.onNext(m31872q);
            }
            long j4 = this.f62199i + 1;
            Iterator<UnicastSubject<T>> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (j4 >= this.f62193c) {
                arrayDeque.poll().onComplete();
                if (arrayDeque.isEmpty() && this.f62198h) {
                    this.f62200j.mo31379f();
                    return;
                }
                this.f62199i = j4 - j3;
            } else {
                this.f62199i = j4;
            }
            this.f62197g = j2 + 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62201k.decrementAndGet() == 0 && this.f62198h) {
                this.f62200j.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62198h;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Observable<T>> observer) {
        this.f61337b.mo31364c(new WindowExactObserver(observer, 0L, 0));
    }
}
