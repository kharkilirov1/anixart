package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.observables.GroupedObservable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractObservableWithUpstream<T, GroupedObservable<K, V>> {

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: j */
        public static final Object f61715j = new Object();

        /* renamed from: b */
        public final Observer<? super GroupedObservable<K, V>> f61716b;

        /* renamed from: e */
        public final int f61719e;

        /* renamed from: f */
        public final boolean f61720f;

        /* renamed from: h */
        public Disposable f61722h;

        /* renamed from: i */
        public final AtomicBoolean f61723i = new AtomicBoolean();

        /* renamed from: c */
        public final Function<? super T, ? extends K> f61717c = null;

        /* renamed from: d */
        public final Function<? super T, ? extends V> f61718d = null;

        /* renamed from: g */
        public final Map<Object, GroupedUnicast<K, V>> f61721g = new ConcurrentHashMap();

        public GroupByObserver(Observer<? super GroupedObservable<K, V>> observer, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i2, boolean z) {
            this.f61716b = observer;
            this.f61719e = i2;
            this.f61720f = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61722h, disposable)) {
                this.f61722h = disposable;
                this.f61716b.mo31373a(this);
            }
        }

        /* renamed from: b */
        public void m31672b(K k2) {
            if (k2 == null) {
                k2 = (K) f61715j;
            }
            this.f61721g.remove(k2);
            if (decrementAndGet() == 0) {
                this.f61722h.mo31379f();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61723i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f61722h.mo31379f();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f61721g.values());
            this.f61721g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                State<T, K> state = ((GroupedUnicast) it.next()).f61724c;
                state.f61729f = true;
                state.m31673a();
            }
            this.f61716b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f61721g.values());
            this.f61721g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                State<T, K> state = ((GroupedUnicast) it.next()).f61724c;
                state.f61730g = th;
                state.f61729f = true;
                state.m31673a();
            }
            this.f61716b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            try {
                K apply = this.f61717c.apply(t);
                Object obj = apply != null ? apply : f61715j;
                GroupedUnicast<K, V> groupedUnicast = this.f61721g.get(obj);
                if (groupedUnicast == null) {
                    if (this.f61723i.get()) {
                        return;
                    }
                    groupedUnicast = new GroupedUnicast<>(apply, new State(this.f61719e, this, apply, this.f61720f));
                    this.f61721g.put(obj, groupedUnicast);
                    getAndIncrement();
                    this.f61716b.onNext(groupedUnicast);
                }
                try {
                    V apply2 = this.f61718d.apply(t);
                    Objects.requireNonNull(apply2, "The value supplied is null");
                    State<V, K> state = groupedUnicast.f61724c;
                    state.f61726c.offer(apply2);
                    state.m31673a();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f61722h.mo31379f();
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f61722h.mo31379f();
                onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61723i.get();
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedObservable<K, T> {

        /* renamed from: c */
        public final State<T, K> f61724c;

        public GroupedUnicast(K k2, State<T, K> state) {
            super(k2);
            this.f61724c = state;
        }

        @Override // io.reactivex.Observable
        /* renamed from: m */
        public void mo31371m(Observer<? super T> observer) {
            this.f61724c.mo31364c(observer);
        }
    }

    public static final class State<T, K> extends AtomicInteger implements Disposable, ObservableSource<T> {

        /* renamed from: b */
        public final K f61725b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<T> f61726c;

        /* renamed from: d */
        public final GroupByObserver<?, K, T> f61727d;

        /* renamed from: e */
        public final boolean f61728e;

        /* renamed from: f */
        public volatile boolean f61729f;

        /* renamed from: g */
        public Throwable f61730g;

        /* renamed from: h */
        public final AtomicBoolean f61731h = new AtomicBoolean();

        /* renamed from: i */
        public final AtomicBoolean f61732i = new AtomicBoolean();

        /* renamed from: j */
        public final AtomicReference<Observer<? super T>> f61733j = new AtomicReference<>();

        public State(int i2, GroupByObserver<?, K, T> groupByObserver, K k2, boolean z) {
            this.f61726c = new SpscLinkedArrayQueue<>(i2);
            this.f61727d = groupByObserver;
            this.f61725b = k2;
            this.f61728e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m31673a() {
            /*
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r11.f61726c
                boolean r1 = r11.f61728e
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r2 = r11.f61733j
                java.lang.Object r2 = r2.get()
                io.reactivex.Observer r2 = (io.reactivex.Observer) r2
                r3 = 1
                r4 = 1
            L15:
                if (r2 == 0) goto L7d
            L17:
                boolean r5 = r11.f61729f
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r6 != 0) goto L22
                r8 = 1
                goto L23
            L22:
                r8 = 0
            L23:
                java.util.concurrent.atomic.AtomicBoolean r9 = r11.f61731h
                boolean r9 = r9.get()
                r10 = 0
                if (r9 == 0) goto L3f
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r5 = r11.f61726c
                r5.clear()
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver<?, K, T> r5 = r11.f61727d
                K r7 = r11.f61725b
                r5.m31672b(r7)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r5 = r11.f61733j
                r5.lazySet(r10)
            L3d:
                r7 = 1
                goto L73
            L3f:
                if (r5 == 0) goto L73
                if (r1 == 0) goto L56
                if (r8 == 0) goto L73
                java.lang.Throwable r5 = r11.f61730g
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r7 = r11.f61733j
                r7.lazySet(r10)
                if (r5 == 0) goto L52
                r2.onError(r5)
                goto L3d
            L52:
                r2.onComplete()
                goto L3d
            L56:
                java.lang.Throwable r5 = r11.f61730g
                if (r5 == 0) goto L68
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r7 = r11.f61726c
                r7.clear()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r7 = r11.f61733j
                r7.lazySet(r10)
                r2.onError(r5)
                goto L3d
            L68:
                if (r8 == 0) goto L73
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r5 = r11.f61733j
                r5.lazySet(r10)
                r2.onComplete()
                goto L3d
            L73:
                if (r7 == 0) goto L76
                return
            L76:
                if (r8 == 0) goto L79
                goto L7d
            L79:
                r2.onNext(r6)
                goto L17
            L7d:
                int r4 = -r4
                int r4 = r11.addAndGet(r4)
                if (r4 != 0) goto L85
                return
            L85:
                if (r2 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r2 = r11.f61733j
                java.lang.Object r2 = r2.get()
                io.reactivex.Observer r2 = (io.reactivex.Observer) r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableGroupBy.State.m31673a():void");
        }

        @Override // io.reactivex.ObservableSource
        /* renamed from: c */
        public void mo31364c(Observer<? super T> observer) {
            if (!this.f61732i.compareAndSet(false, true)) {
                IllegalStateException illegalStateException = new IllegalStateException("Only one Observer allowed!");
                observer.mo31373a(EmptyDisposable.INSTANCE);
                observer.onError(illegalStateException);
            } else {
                observer.mo31373a(this);
                this.f61733j.lazySet(observer);
                if (this.f61731h.get()) {
                    this.f61733j.lazySet(null);
                } else {
                    m31673a();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61731h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f61733j.lazySet(null);
                this.f61727d.m31672b(this.f61725b);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61731h.get();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super GroupedObservable<K, V>> observer) {
        this.f61337b.mo31364c(new GroupByObserver(observer, null, null, 0, false));
    }
}
