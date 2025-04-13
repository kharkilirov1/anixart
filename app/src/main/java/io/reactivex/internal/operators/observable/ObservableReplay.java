package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class ObservableReplay<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    /* renamed from: c */
    public static final BufferSupplier f61911c = new UnBoundedFactory();

    /* renamed from: b */
    public final ObservableSource<T> f61912b;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {

        /* renamed from: b */
        public Node f61913b;

        /* renamed from: c */
        public int f61914c;

        public BoundedReplayBuffer() {
            Node node = new Node(null);
            this.f61913b = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: a */
        public final void mo31697a(T t) {
            Node node = new Node(mo31699c(t));
            this.f61913b.set(node);
            this.f61913b = node;
            this.f61914c++;
            mo31704h();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: b */
        public final void mo31698b() {
            Node node = new Node(mo31699c(NotificationLite.COMPLETE));
            this.f61913b.set(node);
            this.f61913b = node;
            this.f61914c++;
            mo31705i();
        }

        /* renamed from: c */
        public Object mo31699c(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: d */
        public final void mo31700d(Throwable th) {
            Node node = new Node(mo31699c(NotificationLite.m31832e(th)));
            this.f61913b.set(node);
            this.f61913b = node;
            this.f61914c++;
            mo31705i();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: e */
        public final void mo31701e(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            do {
                Node node = (Node) innerDisposable.f61918d;
                if (node == null) {
                    node = mo31702f();
                    innerDisposable.f61918d = node;
                }
                while (!innerDisposable.f61919e) {
                    Node node2 = node.get();
                    if (node2 == null) {
                        innerDisposable.f61918d = node;
                        i2 = innerDisposable.addAndGet(-i2);
                    } else {
                        if (NotificationLite.m31828a(mo31703g(node2.f61920b), innerDisposable.f61917c)) {
                            innerDisposable.f61918d = null;
                            return;
                        }
                        node = node2;
                    }
                }
                innerDisposable.f61918d = null;
                return;
            } while (i2 != 0);
        }

        /* renamed from: f */
        public Node mo31702f() {
            return get();
        }

        /* renamed from: g */
        public Object mo31703g(Object obj) {
            return obj;
        }

        /* renamed from: h */
        public abstract void mo31704h();

        /* renamed from: i */
        public void mo31705i() {
            Node node = get();
            if (node.f61920b != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    public interface BufferSupplier<T> {
        ReplayBuffer<T> call();
    }

    public static final class DisposeConsumer<R> implements Consumer<Disposable> {

        /* renamed from: b */
        public final ObserverResourceWrapper<R> f61915b;

        @Override // io.reactivex.functions.Consumer
        public void accept(Disposable disposable) throws Exception {
            DisposableHelper.m31412d(this.f61915b, disposable);
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements Disposable {

        /* renamed from: b */
        public final ReplayObserver<T> f61916b;

        /* renamed from: c */
        public final Observer<? super T> f61917c;

        /* renamed from: d */
        public Object f61918d;

        /* renamed from: e */
        public volatile boolean f61919e;

        public InnerDisposable(ReplayObserver<T> replayObserver, Observer<? super T> observer) {
            this.f61916b = replayObserver;
            this.f61917c = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (this.f61919e) {
                return;
            }
            this.f61919e = true;
            this.f61916b.m31706b(this);
            this.f61918d = null;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61919e;
        }
    }

    public static final class MulticastReplay<R, U> extends Observable<R> {
        @Override // io.reactivex.Observable
        /* renamed from: m */
        public void mo31371m(Observer<? super R> observer) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                observer.mo31373a(EmptyDisposable.INSTANCE);
                observer.onError(th);
            }
        }
    }

    public static final class Node extends AtomicReference<Node> {

        /* renamed from: b */
        public final Object f61920b;

        public Node(Object obj) {
            this.f61920b = obj;
        }
    }

    public static final class Replay<T> extends ConnectableObservable<T> {
        @Override // io.reactivex.Observable
        /* renamed from: m */
        public void mo31371m(Observer<? super T> observer) {
            throw null;
        }
    }

    public interface ReplayBuffer<T> {
        /* renamed from: a */
        void mo31697a(T t);

        /* renamed from: b */
        void mo31698b();

        /* renamed from: d */
        void mo31700d(Throwable th);

        /* renamed from: e */
        void mo31701e(InnerDisposable<T> innerDisposable);
    }

    public static final class ReplayBufferSupplier<T> implements BufferSupplier<T> {

        /* renamed from: a */
        public final int f61921a;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public ReplayBuffer<T> call() {
            return new SizeBoundReplayBuffer(this.f61921a);
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* renamed from: f */
        public static final InnerDisposable[] f61922f = new InnerDisposable[0];

        /* renamed from: g */
        public static final InnerDisposable[] f61923g = new InnerDisposable[0];

        /* renamed from: b */
        public final ReplayBuffer<T> f61924b;

        /* renamed from: c */
        public boolean f61925c;

        /* renamed from: d */
        public final AtomicReference<InnerDisposable[]> f61926d = new AtomicReference<>(f61922f);

        /* renamed from: e */
        public final AtomicBoolean f61927e = new AtomicBoolean();

        public ReplayObserver(ReplayBuffer<T> replayBuffer) {
            this.f61924b = replayBuffer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31413e(this, disposable)) {
                m31707c();
            }
        }

        /* renamed from: b */
        public void m31706b(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f61926d.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerDisposableArr[i2].equals(innerDisposable)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f61922f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i2);
                    System.arraycopy(innerDisposableArr, i2 + 1, innerDisposableArr3, i2, (length - i2) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!this.f61926d.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        /* renamed from: c */
        public void m31707c() {
            for (InnerDisposable<T> innerDisposable : this.f61926d.get()) {
                this.f61924b.mo31701e(innerDisposable);
            }
        }

        /* renamed from: d */
        public void m31708d() {
            for (InnerDisposable<T> innerDisposable : this.f61926d.getAndSet(f61923g)) {
                this.f61924b.mo31701e(innerDisposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61926d.set(f61923g);
            DisposableHelper.m31409a(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f61925c) {
                return;
            }
            this.f61925c = true;
            this.f61924b.mo31698b();
            m31708d();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.f61925c) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f61925c = true;
            this.f61924b.mo31700d(th);
            m31708d();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f61925c) {
                return;
            }
            this.f61924b.mo31697a(t);
            m31707c();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61926d.get() == f61923g;
        }
    }

    public static final class ReplaySource<T> implements ObservableSource<T> {

        /* renamed from: b */
        public final AtomicReference<ReplayObserver<T>> f61928b;

        /* renamed from: c */
        public final BufferSupplier<T> f61929c;

        @Override // io.reactivex.ObservableSource
        /* renamed from: c */
        public void mo31364c(Observer<? super T> observer) {
            ReplayObserver<T> replayObserver;
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            while (true) {
                replayObserver = this.f61928b.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f61929c.call());
                if (this.f61928b.compareAndSet(null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, observer);
            observer.mo31373a(innerDisposable);
            do {
                innerDisposableArr = replayObserver.f61926d.get();
                if (innerDisposableArr == ReplayObserver.f61923g) {
                    break;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!replayObserver.f61926d.compareAndSet(innerDisposableArr, innerDisposableArr2));
            if (innerDisposable.f61919e) {
                replayObserver.m31706b(innerDisposable);
            } else {
                replayObserver.f61924b.mo31701e(innerDisposable);
            }
        }
    }

    public static final class ScheduledReplaySupplier<T> implements BufferSupplier<T> {

        /* renamed from: a */
        public final int f61930a;

        /* renamed from: b */
        public final long f61931b;

        /* renamed from: c */
        public final TimeUnit f61932c;

        /* renamed from: d */
        public final Scheduler f61933d;

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public ReplayBuffer<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f61930a, this.f61931b, this.f61932c, this.f61933d);
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {

        /* renamed from: d */
        public final Scheduler f61934d;

        /* renamed from: e */
        public final long f61935e;

        /* renamed from: f */
        public final TimeUnit f61936f;

        /* renamed from: g */
        public final int f61937g;

        public SizeAndTimeBoundReplayBuffer(int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            this.f61934d = scheduler;
            this.f61937g = i2;
            this.f61935e = j2;
            this.f61936f = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: c */
        public Object mo31699c(Object obj) {
            return new Timed(obj, this.f61934d.mo31375b(this.f61936f), this.f61936f);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: f */
        public Node mo31702f() {
            Node node;
            long mo31375b = this.f61934d.mo31375b(this.f61936f) - this.f61935e;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    Timed timed = (Timed) node2.f61920b;
                    if (NotificationLite.m31834h(timed.f62915a) || NotificationLite.m31835i(timed.f62915a) || timed.f62916b > mo31375b) {
                        break;
                    }
                    node3 = node2.get();
                } else {
                    break;
                }
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: g */
        public Object mo31703g(Object obj) {
            return ((Timed) obj).f62915a;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: h */
        public void mo31704h() {
            Node node;
            long mo31375b = this.f61934d.mo31375b(this.f61936f) - this.f61935e;
            Node node2 = get();
            Node node3 = node2.get();
            int i2 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i3 = this.f61914c;
                    if (i3 <= this.f61937g) {
                        if (((Timed) node2.f61920b).f62916b > mo31375b) {
                            break;
                        }
                        i2++;
                        this.f61914c = i3 - 1;
                        node3 = node2.get();
                    } else {
                        i2++;
                        this.f61914c = i3 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i2 != 0) {
                set(node);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        
            set(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        
            return;
         */
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31705i() {
            /*
                r10 = this;
                io.reactivex.Scheduler r0 = r10.f61934d
                java.util.concurrent.TimeUnit r1 = r10.f61936f
                long r0 = r0.mo31375b(r1)
                long r2 = r10.f61935e
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                r4 = 0
            L18:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L39
                int r5 = r10.f61914c
                r6 = 1
                if (r5 <= r6) goto L39
                java.lang.Object r6 = r2.f61920b
                io.reactivex.schedulers.Timed r6 = (io.reactivex.schedulers.Timed) r6
                long r6 = r6.f62916b
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L39
                int r4 = r4 + 1
                int r5 = r5 + (-1)
                r10.f61914c = r5
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (io.reactivex.internal.operators.observable.ObservableReplay.Node) r3
                goto L18
            L39:
                if (r4 == 0) goto L3e
                r10.set(r3)
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.SizeAndTimeBoundReplayBuffer.mo31705i():void");
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {

        /* renamed from: d */
        public final int f61938d;

        public SizeBoundReplayBuffer(int i2) {
            this.f61938d = i2;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /* renamed from: h */
        public void mo31704h() {
            if (this.f61914c > this.f61938d) {
                this.f61914c--;
                set(get().get());
            }
        }
    }

    public static final class UnBoundedFactory implements BufferSupplier<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public ReplayBuffer<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {

        /* renamed from: b */
        public volatile int f61939b;

        public UnboundedReplayBuffer(int i2) {
            super(i2);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: a */
        public void mo31697a(T t) {
            add(t);
            this.f61939b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: b */
        public void mo31698b() {
            add(NotificationLite.COMPLETE);
            this.f61939b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: d */
        public void mo31700d(Throwable th) {
            add(NotificationLite.m31832e(th));
            this.f61939b++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        /* renamed from: e */
        public void mo31701e(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            Observer<? super T> observer = innerDisposable.f61917c;
            int i2 = 1;
            while (!innerDisposable.f61919e) {
                int i3 = this.f61939b;
                Integer num = (Integer) innerDisposable.f61918d;
                int intValue = num != null ? num.intValue() : 0;
                while (intValue < i3) {
                    if (NotificationLite.m31828a(get(intValue), observer) || innerDisposable.f61919e) {
                        return;
                    } else {
                        intValue++;
                    }
                }
                innerDisposable.f61918d = Integer.valueOf(intValue);
                i2 = innerDisposable.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61912b.mo31364c(observer);
    }
}
