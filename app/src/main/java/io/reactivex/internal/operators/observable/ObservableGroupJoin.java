package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {

    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, JoinSupport {

        /* renamed from: o */
        public static final Integer f61734o = 1;

        /* renamed from: p */
        public static final Integer f61735p = 2;

        /* renamed from: q */
        public static final Integer f61736q = 3;

        /* renamed from: r */
        public static final Integer f61737r = 4;

        /* renamed from: b */
        public final Observer<? super R> f61738b;

        /* renamed from: l */
        public int f61748l;

        /* renamed from: m */
        public int f61749m;

        /* renamed from: n */
        public volatile boolean f61750n;

        /* renamed from: d */
        public final CompositeDisposable f61740d = new CompositeDisposable();

        /* renamed from: c */
        public final SpscLinkedArrayQueue<Object> f61739c = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: e */
        public final Map<Integer, UnicastSubject<TRight>> f61741e = new LinkedHashMap();

        /* renamed from: f */
        public final Map<Integer, TRight> f61742f = new LinkedHashMap();

        /* renamed from: g */
        public final AtomicReference<Throwable> f61743g = new AtomicReference<>();

        /* renamed from: h */
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f61744h = null;

        /* renamed from: i */
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f61745i = null;

        /* renamed from: j */
        public final BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> f61746j = null;

        /* renamed from: k */
        public final AtomicInteger f61747k = new AtomicInteger(2);

        public GroupJoinDisposable(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super Observable<TRight>, ? extends R> biFunction) {
            this.f61738b = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: a */
        public void mo31674a(Throwable th) {
            if (ExceptionHelper.m31817a(this.f61743g, th)) {
                m31679g();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: b */
        public void mo31675b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61743g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61747k.decrementAndGet();
                m31679g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: c */
        public void mo31676c(boolean z, Object obj) {
            synchronized (this) {
                this.f61739c.m31765c(z ? f61734o : f61735p, obj);
            }
            m31679g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: d */
        public void mo31677d(boolean z, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f61739c.m31765c(z ? f61736q : f61737r, leftRightEndObserver);
            }
            m31679g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: e */
        public void mo31678e(LeftRightObserver leftRightObserver) {
            this.f61740d.mo31394c(leftRightObserver);
            this.f61747k.decrementAndGet();
            m31679g();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61750n) {
                return;
            }
            this.f61750n = true;
            this.f61740d.mo31379f();
            if (getAndIncrement() == 0) {
                this.f61739c.clear();
            }
        }

        /* renamed from: g */
        public void m31679g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.f61739c;
            Observer<? super R> observer = this.f61738b;
            int i2 = 1;
            while (!this.f61750n) {
                if (this.f61743g.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f61740d.mo31379f();
                    m31680h(observer);
                    return;
                }
                boolean z = this.f61747k.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<UnicastSubject<TRight>> it = this.f61741e.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f61741e.clear();
                    this.f61742f.clear();
                    this.f61740d.mo31379f();
                    observer.onComplete();
                    return;
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    Object poll = spscLinkedArrayQueue.poll();
                    if (num == f61734o) {
                        UnicastSubject unicastSubject = new UnicastSubject(Flowable.f59569b, true);
                        int i3 = this.f61748l;
                        this.f61748l = i3 + 1;
                        this.f61741e.put(Integer.valueOf(i3), unicastSubject);
                        try {
                            ObservableSource apply = this.f61744h.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null ObservableSource");
                            ObservableSource observableSource = apply;
                            LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i3);
                            this.f61740d.mo31393b(leftRightEndObserver);
                            observableSource.mo31364c(leftRightEndObserver);
                            if (this.f61743g.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f61740d.mo31379f();
                                m31680h(observer);
                                return;
                            }
                            try {
                                R apply2 = this.f61746j.apply(poll, unicastSubject);
                                Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                observer.onNext(apply2);
                                Iterator<TRight> it2 = this.f61742f.values().iterator();
                                while (it2.hasNext()) {
                                    unicastSubject.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                m31681i(th, observer, spscLinkedArrayQueue);
                                return;
                            }
                        } catch (Throwable th2) {
                            m31681i(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f61735p) {
                        int i4 = this.f61749m;
                        this.f61749m = i4 + 1;
                        this.f61742f.put(Integer.valueOf(i4), poll);
                        try {
                            ObservableSource apply3 = this.f61745i.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null ObservableSource");
                            ObservableSource observableSource2 = apply3;
                            LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i4);
                            this.f61740d.mo31393b(leftRightEndObserver2);
                            observableSource2.mo31364c(leftRightEndObserver2);
                            if (this.f61743g.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f61740d.mo31379f();
                                m31680h(observer);
                                return;
                            } else {
                                Iterator<UnicastSubject<TRight>> it3 = this.f61741e.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(poll);
                                }
                            }
                        } catch (Throwable th3) {
                            m31681i(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f61736q) {
                        LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) poll;
                        UnicastSubject<TRight> remove = this.f61741e.remove(Integer.valueOf(leftRightEndObserver3.f61753d));
                        this.f61740d.mo31392a(leftRightEndObserver3);
                        if (remove != null) {
                            remove.onComplete();
                        }
                    } else if (num == f61737r) {
                        LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) poll;
                        this.f61742f.remove(Integer.valueOf(leftRightEndObserver4.f61753d));
                        this.f61740d.mo31392a(leftRightEndObserver4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* renamed from: h */
        public void m31680h(Observer<?> observer) {
            Throwable m31818b = ExceptionHelper.m31818b(this.f61743g);
            Iterator<UnicastSubject<TRight>> it = this.f61741e.values().iterator();
            while (it.hasNext()) {
                it.next().onError(m31818b);
            }
            this.f61741e.clear();
            this.f61742f.clear();
            observer.onError(m31818b);
        }

        /* renamed from: i */
        public void m31681i(Throwable th, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.m31402a(th);
            ExceptionHelper.m31817a(this.f61743g, th);
            spscLinkedArrayQueue.clear();
            this.f61740d.mo31379f();
            m31680h(observer);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61750n;
        }
    }

    public interface JoinSupport {
        /* renamed from: a */
        void mo31674a(Throwable th);

        /* renamed from: b */
        void mo31675b(Throwable th);

        /* renamed from: c */
        void mo31676c(boolean z, Object obj);

        /* renamed from: d */
        void mo31677d(boolean z, LeftRightEndObserver leftRightEndObserver);

        /* renamed from: e */
        void mo31678e(LeftRightObserver leftRightObserver);
    }

    public static final class LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final JoinSupport f61751b;

        /* renamed from: c */
        public final boolean f61752c;

        /* renamed from: d */
        public final int f61753d;

        public LeftRightEndObserver(JoinSupport joinSupport, boolean z, int i2) {
            this.f61751b = joinSupport;
            this.f61752c = z;
            this.f61753d = i2;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61751b.mo31677d(this.f61752c, this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61751b.mo31674a(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (DisposableHelper.m31409a(this)) {
                this.f61751b.mo31677d(this.f61752c, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final JoinSupport f61754b;

        /* renamed from: c */
        public final boolean f61755c;

        public LeftRightObserver(JoinSupport joinSupport, boolean z) {
            this.f61754b = joinSupport;
            this.f61755c = z;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61754b.mo31678e(this);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61754b.mo31675b(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f61754b.mo31676c(this.f61755c, obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(observer, null, null, null);
        observer.mo31373a(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.f61740d.mo31393b(leftRightObserver);
        groupJoinDisposable.f61740d.mo31393b(new LeftRightObserver(groupJoinDisposable, false));
        this.f61337b.mo31364c(leftRightObserver);
        throw null;
    }
}
