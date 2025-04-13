package io.reactivex.internal.operators.observable;

import io.reactivex.Flowable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {

    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.JoinSupport {

        /* renamed from: o */
        public static final Integer f61775o = 1;

        /* renamed from: p */
        public static final Integer f61776p = 2;

        /* renamed from: q */
        public static final Integer f61777q = 3;

        /* renamed from: r */
        public static final Integer f61778r = 4;

        /* renamed from: b */
        public final Observer<? super R> f61779b;

        /* renamed from: l */
        public int f61789l;

        /* renamed from: m */
        public int f61790m;

        /* renamed from: n */
        public volatile boolean f61791n;

        /* renamed from: d */
        public final CompositeDisposable f61781d = new CompositeDisposable();

        /* renamed from: c */
        public final SpscLinkedArrayQueue<Object> f61780c = new SpscLinkedArrayQueue<>(Flowable.f59569b);

        /* renamed from: e */
        public final Map<Integer, TLeft> f61782e = new LinkedHashMap();

        /* renamed from: f */
        public final Map<Integer, TRight> f61783f = new LinkedHashMap();

        /* renamed from: g */
        public final AtomicReference<Throwable> f61784g = new AtomicReference<>();

        /* renamed from: h */
        public final Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> f61785h = null;

        /* renamed from: i */
        public final Function<? super TRight, ? extends ObservableSource<TRightEnd>> f61786i = null;

        /* renamed from: j */
        public final BiFunction<? super TLeft, ? super TRight, ? extends R> f61787j = null;

        /* renamed from: k */
        public final AtomicInteger f61788k = new AtomicInteger(2);

        public JoinDisposable(Observer<? super R> observer, Function<? super TLeft, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.f61779b = observer;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: a */
        public void mo31674a(Throwable th) {
            if (ExceptionHelper.m31817a(this.f61784g, th)) {
                m31682g();
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: b */
        public void mo31675b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61784g, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f61788k.decrementAndGet();
                m31682g();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: c */
        public void mo31676c(boolean z, Object obj) {
            synchronized (this) {
                this.f61780c.m31765c(z ? f61775o : f61776p, obj);
            }
            m31682g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: d */
        public void mo31677d(boolean z, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.f61780c.m31765c(z ? f61777q : f61778r, leftRightEndObserver);
            }
            m31682g();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.JoinSupport
        /* renamed from: e */
        public void mo31678e(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.f61781d.mo31394c(leftRightObserver);
            this.f61788k.decrementAndGet();
            m31682g();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61791n) {
                return;
            }
            this.f61791n = true;
            this.f61781d.mo31379f();
            if (getAndIncrement() == 0) {
                this.f61780c.clear();
            }
        }

        /* renamed from: g */
        public void m31682g() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.f61780c;
            Observer<? super R> observer = this.f61779b;
            int i2 = 1;
            while (!this.f61791n) {
                if (this.f61784g.get() != null) {
                    spscLinkedArrayQueue.clear();
                    this.f61781d.mo31379f();
                    m31683h(observer);
                    return;
                }
                boolean z = this.f61788k.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.f61782e.clear();
                    this.f61783f.clear();
                    this.f61781d.mo31379f();
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
                    if (num == f61775o) {
                        int i3 = this.f61789l;
                        this.f61789l = i3 + 1;
                        this.f61782e.put(Integer.valueOf(i3), poll);
                        try {
                            ObservableSource apply = this.f61785h.apply(poll);
                            Objects.requireNonNull(apply, "The leftEnd returned a null ObservableSource");
                            ObservableSource observableSource = apply;
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new ObservableGroupJoin.LeftRightEndObserver(this, true, i3);
                            this.f61781d.mo31393b(leftRightEndObserver);
                            observableSource.mo31364c(leftRightEndObserver);
                            if (this.f61784g.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f61781d.mo31379f();
                                m31683h(observer);
                                return;
                            }
                            Iterator<TRight> it = this.f61783f.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    R apply2 = this.f61787j.apply(poll, it.next());
                                    Objects.requireNonNull(apply2, "The resultSelector returned a null value");
                                    observer.onNext(apply2);
                                } catch (Throwable th) {
                                    m31684i(th, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            m31684i(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f61776p) {
                        int i4 = this.f61790m;
                        this.f61790m = i4 + 1;
                        this.f61783f.put(Integer.valueOf(i4), poll);
                        try {
                            ObservableSource apply3 = this.f61786i.apply(poll);
                            Objects.requireNonNull(apply3, "The rightEnd returned a null ObservableSource");
                            ObservableSource observableSource2 = apply3;
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new ObservableGroupJoin.LeftRightEndObserver(this, false, i4);
                            this.f61781d.mo31393b(leftRightEndObserver2);
                            observableSource2.mo31364c(leftRightEndObserver2);
                            if (this.f61784g.get() != null) {
                                spscLinkedArrayQueue.clear();
                                this.f61781d.mo31379f();
                                m31683h(observer);
                                return;
                            }
                            Iterator<TLeft> it2 = this.f61782e.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    R apply4 = this.f61787j.apply(it2.next(), poll);
                                    Objects.requireNonNull(apply4, "The resultSelector returned a null value");
                                    observer.onNext(apply4);
                                } catch (Throwable th3) {
                                    m31684i(th3, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            m31684i(th4, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == f61777q) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (ObservableGroupJoin.LeftRightEndObserver) poll;
                        this.f61782e.remove(Integer.valueOf(leftRightEndObserver3.f61753d));
                        this.f61781d.mo31392a(leftRightEndObserver3);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (ObservableGroupJoin.LeftRightEndObserver) poll;
                        this.f61783f.remove(Integer.valueOf(leftRightEndObserver4.f61753d));
                        this.f61781d.mo31392a(leftRightEndObserver4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        /* renamed from: h */
        public void m31683h(Observer<?> observer) {
            Throwable m31818b = ExceptionHelper.m31818b(this.f61784g);
            this.f61782e.clear();
            this.f61783f.clear();
            observer.onError(m31818b);
        }

        /* renamed from: i */
        public void m31684i(Throwable th, Observer<?> observer, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            Exceptions.m31402a(th);
            ExceptionHelper.m31817a(this.f61784g, th);
            spscLinkedArrayQueue.clear();
            this.f61781d.mo31379f();
            m31683h(observer);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61791n;
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        JoinDisposable joinDisposable = new JoinDisposable(observer, null, null, null);
        observer.mo31373a(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        joinDisposable.f61781d.mo31393b(leftRightObserver);
        joinDisposable.f61781d.mo31393b(new ObservableGroupJoin.LeftRightObserver(joinDisposable, false));
        this.f61337b.mo31364c(leftRightObserver);
        throw null;
    }
}
