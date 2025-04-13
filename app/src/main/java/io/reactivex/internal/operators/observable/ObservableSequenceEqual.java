package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableSequenceEqual<T> extends Observable<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final Observer<? super Boolean> f61985b;

        /* renamed from: g */
        public final EqualObserver<T>[] f61990g;

        /* renamed from: h */
        public volatile boolean f61991h;

        /* renamed from: i */
        public T f61992i;

        /* renamed from: j */
        public T f61993j;

        /* renamed from: e */
        public final ObservableSource<? extends T> f61988e = null;

        /* renamed from: f */
        public final ObservableSource<? extends T> f61989f = null;

        /* renamed from: c */
        public final BiPredicate<? super T, ? super T> f61986c = null;

        /* renamed from: d */
        public final ArrayCompositeDisposable f61987d = new ArrayCompositeDisposable(2);

        public EqualCoordinator(Observer<? super Boolean> observer, int i2, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f61985b = observer;
            this.f61990g = new EqualObserver[]{new EqualObserver<>(this, 0, i2), new EqualObserver<>(this, 1, i2)};
        }

        /* renamed from: a */
        public void m31718a(SpscLinkedArrayQueue<T> spscLinkedArrayQueue, SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.f61991h = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        /* renamed from: b */
        public void m31719b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver<T>[] equalObserverArr = this.f61990g;
            EqualObserver<T> equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.f61995c;
            EqualObserver<T> equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.f61995c;
            int i2 = 1;
            while (!this.f61991h) {
                boolean z = equalObserver.f61997e;
                if (z && (th2 = equalObserver.f61998f) != null) {
                    m31718a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61985b.onError(th2);
                    return;
                }
                boolean z2 = equalObserver2.f61997e;
                if (z2 && (th = equalObserver2.f61998f) != null) {
                    m31718a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61985b.onError(th);
                    return;
                }
                if (this.f61992i == null) {
                    this.f61992i = spscLinkedArrayQueue.poll();
                }
                boolean z3 = this.f61992i == null;
                if (this.f61993j == null) {
                    this.f61993j = spscLinkedArrayQueue2.poll();
                }
                T t = this.f61993j;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f61985b.onNext(Boolean.TRUE);
                    this.f61985b.onComplete();
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m31718a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61985b.onNext(Boolean.FALSE);
                    this.f61985b.onComplete();
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f61986c.mo31404a(this.f61992i, t)) {
                            m31718a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.f61985b.onNext(Boolean.FALSE);
                            this.f61985b.onComplete();
                            return;
                        }
                        this.f61992i = null;
                        this.f61993j = null;
                    } catch (Throwable th3) {
                        Exceptions.m31402a(th3);
                        m31718a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.f61985b.onError(th3);
                        return;
                    }
                }
                if (z3 || z4) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61991h) {
                return;
            }
            this.f61991h = true;
            this.f61987d.mo31379f();
            if (getAndIncrement() == 0) {
                EqualObserver<T>[] equalObserverArr = this.f61990g;
                equalObserverArr[0].f61995c.clear();
                equalObserverArr[1].f61995c.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61991h;
        }
    }

    public static final class EqualObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final EqualCoordinator<T> f61994b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<T> f61995c;

        /* renamed from: d */
        public final int f61996d;

        /* renamed from: e */
        public volatile boolean f61997e;

        /* renamed from: f */
        public Throwable f61998f;

        public EqualObserver(EqualCoordinator<T> equalCoordinator, int i2, int i3) {
            this.f61994b = equalCoordinator;
            this.f61996d = i2;
            this.f61995c = new SpscLinkedArrayQueue<>(i3);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            EqualCoordinator<T> equalCoordinator = this.f61994b;
            equalCoordinator.f61987d.m31408a(this.f61996d, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61997e = true;
            this.f61994b.m31719b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61998f = th;
            this.f61997e = true;
            this.f61994b.m31719b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61995c.offer(t);
            this.f61994b.m31719b();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Boolean> observer) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(observer, 0, null, null, null);
        observer.mo31373a(equalCoordinator);
        EqualObserver<T>[] equalObserverArr = equalCoordinator.f61990g;
        equalCoordinator.f61988e.mo31364c(equalObserverArr[0]);
        equalCoordinator.f61989f.mo31364c(equalObserverArr[1]);
    }
}
