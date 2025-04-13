package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ObservableSequenceEqualSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    public static final class EqualCoordinator<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Boolean> f61999b;

        /* renamed from: g */
        public final EqualObserver<T>[] f62004g;

        /* renamed from: h */
        public volatile boolean f62005h;

        /* renamed from: i */
        public T f62006i;

        /* renamed from: j */
        public T f62007j;

        /* renamed from: e */
        public final ObservableSource<? extends T> f62002e = null;

        /* renamed from: f */
        public final ObservableSource<? extends T> f62003f = null;

        /* renamed from: c */
        public final BiPredicate<? super T, ? super T> f62000c = null;

        /* renamed from: d */
        public final ArrayCompositeDisposable f62001d = new ArrayCompositeDisposable(2);

        public EqualCoordinator(SingleObserver<? super Boolean> singleObserver, int i2, ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
            this.f61999b = singleObserver;
            this.f62004g = new EqualObserver[]{new EqualObserver<>(this, 0, i2), new EqualObserver<>(this, 1, i2)};
        }

        /* renamed from: a */
        public void m31720a(SpscLinkedArrayQueue<T> spscLinkedArrayQueue, SpscLinkedArrayQueue<T> spscLinkedArrayQueue2) {
            this.f62005h = true;
            spscLinkedArrayQueue.clear();
            spscLinkedArrayQueue2.clear();
        }

        /* renamed from: b */
        public void m31721b() {
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            EqualObserver<T>[] equalObserverArr = this.f62004g;
            EqualObserver<T> equalObserver = equalObserverArr[0];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.f62009c;
            EqualObserver<T> equalObserver2 = equalObserverArr[1];
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.f62009c;
            int i2 = 1;
            while (!this.f62005h) {
                boolean z = equalObserver.f62011e;
                if (z && (th2 = equalObserver.f62012f) != null) {
                    m31720a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61999b.onError(th2);
                    return;
                }
                boolean z2 = equalObserver2.f62011e;
                if (z2 && (th = equalObserver2.f62012f) != null) {
                    m31720a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61999b.onError(th);
                    return;
                }
                if (this.f62006i == null) {
                    this.f62006i = spscLinkedArrayQueue.poll();
                }
                boolean z3 = this.f62006i == null;
                if (this.f62007j == null) {
                    this.f62007j = spscLinkedArrayQueue2.poll();
                }
                T t = this.f62007j;
                boolean z4 = t == null;
                if (z && z2 && z3 && z4) {
                    this.f61999b.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z && z2 && z3 != z4) {
                    m31720a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                    this.f61999b.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z3 && !z4) {
                    try {
                        if (!this.f62000c.mo31404a(this.f62006i, t)) {
                            m31720a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                            this.f61999b.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f62006i = null;
                            this.f62007j = null;
                        }
                    } catch (Throwable th3) {
                        Exceptions.m31402a(th3);
                        m31720a(spscLinkedArrayQueue, spscLinkedArrayQueue2);
                        this.f61999b.onError(th3);
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
            if (this.f62005h) {
                return;
            }
            this.f62005h = true;
            this.f62001d.mo31379f();
            if (getAndIncrement() == 0) {
                EqualObserver<T>[] equalObserverArr = this.f62004g;
                equalObserverArr[0].f62009c.clear();
                equalObserverArr[1].f62009c.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62005h;
        }
    }

    public static final class EqualObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final EqualCoordinator<T> f62008b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<T> f62009c;

        /* renamed from: d */
        public final int f62010d;

        /* renamed from: e */
        public volatile boolean f62011e;

        /* renamed from: f */
        public Throwable f62012f;

        public EqualObserver(EqualCoordinator<T> equalCoordinator, int i2, int i3) {
            this.f62008b = equalCoordinator;
            this.f62010d = i2;
            this.f62009c = new SpscLinkedArrayQueue<>(i3);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            EqualCoordinator<T> equalCoordinator = this.f62008b;
            equalCoordinator.f62001d.m31408a(this.f62010d, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f62011e = true;
            this.f62008b.m31721b();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62012f = th;
            this.f62011e = true;
            this.f62008b.m31721b();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f62009c.offer(t);
            this.f62008b.m31721b();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Boolean> singleObserver) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(singleObserver, 0, null, null, null);
        singleObserver.mo31388a(equalCoordinator);
        EqualObserver<T>[] equalObserverArr = equalCoordinator.f62004g;
        equalCoordinator.f62002e.mo31364c(equalObserverArr[0]);
        equalCoordinator.f62003f.mo31364c(equalObserverArr[1]);
    }
}
