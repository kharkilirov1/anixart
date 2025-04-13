package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {

    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {

        /* renamed from: b */
        public final Queue<GroupedUnicast<K, V>> f60220b;

        @Override // io.reactivex.functions.Consumer
        public void accept(Object obj) throws Exception {
            this.f60220b.offer((GroupedUnicast) obj);
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {

        /* renamed from: r */
        public static final Object f60221r = new Object();

        /* renamed from: b */
        public final Subscriber<? super GroupedFlowable<K, V>> f60222b;

        /* renamed from: e */
        public final int f60225e;

        /* renamed from: f */
        public final boolean f60226f;

        /* renamed from: g */
        public final Map<Object, GroupedUnicast<K, V>> f60227g;

        /* renamed from: h */
        public final SpscLinkedArrayQueue<GroupedFlowable<K, V>> f60228h;

        /* renamed from: j */
        public Subscription f60230j;

        /* renamed from: n */
        public Throwable f60234n;

        /* renamed from: o */
        public volatile boolean f60235o;

        /* renamed from: p */
        public boolean f60236p;

        /* renamed from: q */
        public boolean f60237q;

        /* renamed from: k */
        public final AtomicBoolean f60231k = new AtomicBoolean();

        /* renamed from: l */
        public final AtomicLong f60232l = new AtomicLong();

        /* renamed from: m */
        public final AtomicInteger f60233m = new AtomicInteger(1);

        /* renamed from: c */
        public final Function<? super T, ? extends K> f60223c = null;

        /* renamed from: d */
        public final Function<? super T, ? extends V> f60224d = null;

        /* renamed from: i */
        public final Queue<GroupedUnicast<K, V>> f60229i = null;

        public GroupBySubscriber(Subscriber<? super GroupedFlowable<K, V>> subscriber, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i2, boolean z, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.f60222b = subscriber;
            this.f60225e = i2;
            this.f60226f = z;
            this.f60227g = map;
            this.f60228h = new SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f60237q = true;
            return 2;
        }

        /* renamed from: c */
        public void m31513c() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            if (this.f60237q) {
                SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.f60228h;
                Subscriber<? super GroupedFlowable<K, V>> subscriber = this.f60222b;
                while (!this.f60231k.get()) {
                    boolean z = this.f60235o;
                    if (z && !this.f60226f && (th = this.f60234n) != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    subscriber.onNext(null);
                    if (z) {
                        Throwable th2 = this.f60234n;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue2 = this.f60228h;
            Subscriber<? super GroupedFlowable<K, V>> subscriber2 = this.f60222b;
            int i3 = 1;
            do {
                long j2 = this.f60232l.get();
                long j3 = 0;
                while (j3 != j2) {
                    boolean z2 = this.f60235o;
                    GroupedFlowable<K, V> poll = spscLinkedArrayQueue2.poll();
                    boolean z3 = poll == null;
                    if (m31514f(z2, z3, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    subscriber2.onNext(poll);
                    j3++;
                }
                if (j3 == j2 && m31514f(this.f60235o, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j3 != 0) {
                    if (j2 != Long.MAX_VALUE) {
                        this.f60232l.addAndGet(-j3);
                    }
                    this.f60230j.request(j3);
                }
                i3 = addAndGet(-i3);
            } while (i3 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60231k.compareAndSet(false, true)) {
                m31515h();
                if (this.f60233m.decrementAndGet() == 0) {
                    this.f60230j.cancel();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60228h.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60230j, subscription)) {
                this.f60230j = subscription;
                this.f60222b.mo31352d(this);
                subscription.request(this.f60225e);
            }
        }

        /* renamed from: f */
        public boolean m31514f(boolean z, boolean z2, Subscriber<?> subscriber, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.f60231k.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.f60226f) {
                if (!z || !z2) {
                    return false;
                }
                Throwable th = this.f60234n;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th2 = this.f60234n;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        /* renamed from: h */
        public final void m31515h() {
            if (this.f60229i != null) {
                int i2 = 0;
                while (true) {
                    GroupedUnicast<K, V> poll = this.f60229i.poll();
                    if (poll == null) {
                        break;
                    }
                    State<V, K> state = poll.f60239d;
                    state.f60245g = true;
                    state.m31516c();
                    i2++;
                }
                if (i2 != 0) {
                    this.f60233m.addAndGet(-i2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60228h.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60236p) {
                return;
            }
            Iterator<GroupedUnicast<K, V>> it = this.f60227g.values().iterator();
            while (it.hasNext()) {
                State<V, K> state = it.next().f60239d;
                state.f60245g = true;
                state.m31516c();
            }
            this.f60227g.clear();
            Queue<GroupedUnicast<K, V>> queue = this.f60229i;
            if (queue != null) {
                queue.clear();
            }
            this.f60236p = true;
            this.f60235o = true;
            m31513c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60236p) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60236p = true;
            Iterator<GroupedUnicast<K, V>> it = this.f60227g.values().iterator();
            while (it.hasNext()) {
                State<V, K> state = it.next().f60239d;
                state.f60246h = th;
                state.f60245g = true;
                state.m31516c();
            }
            this.f60227g.clear();
            Queue<GroupedUnicast<K, V>> queue = this.f60229i;
            if (queue != null) {
                queue.clear();
            }
            this.f60234n = th;
            this.f60235o = true;
            m31513c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60236p) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.f60228h;
            try {
                K apply = this.f60223c.apply(t);
                boolean z = false;
                Object obj = apply != null ? apply : f60221r;
                GroupedUnicast<K, V> groupedUnicast = this.f60227g.get(obj);
                if (groupedUnicast == null) {
                    if (this.f60231k.get()) {
                        return;
                    }
                    int i2 = this.f60225e;
                    boolean z2 = this.f60226f;
                    int i3 = GroupedUnicast.f60238e;
                    groupedUnicast = new GroupedUnicast<>(apply, new State(i2, this, apply, z2));
                    this.f60227g.put(obj, groupedUnicast);
                    this.f60233m.getAndIncrement();
                    z = true;
                }
                try {
                    V apply2 = this.f60224d.apply(t);
                    Objects.requireNonNull(apply2, "The valueSelector returned null");
                    State<V, K> state = groupedUnicast.f60239d;
                    state.f60241c.offer(apply2);
                    state.m31516c();
                    m31515h();
                    if (z) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        m31513c();
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f60230j.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f60230j.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            return this.f60228h.poll();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60232l, j2);
                m31513c();
            }
        }
    }

    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {

        /* renamed from: e */
        public static final /* synthetic */ int f60238e = 0;

        /* renamed from: d */
        public final State<T, K> f60239d;

        public GroupedUnicast(K k2, State<T, K> state) {
            super(k2);
            this.f60239d = state;
        }

        @Override // io.reactivex.Flowable
        /* renamed from: c */
        public void mo31350c(Subscriber<? super T> subscriber) {
            this.f60239d.mo31351g(subscriber);
        }
    }

    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements Publisher<T> {

        /* renamed from: b */
        public final K f60240b;

        /* renamed from: c */
        public final SpscLinkedArrayQueue<T> f60241c;

        /* renamed from: d */
        public final GroupBySubscriber<?, K, T> f60242d;

        /* renamed from: e */
        public final boolean f60243e;

        /* renamed from: g */
        public volatile boolean f60245g;

        /* renamed from: h */
        public Throwable f60246h;

        /* renamed from: l */
        public boolean f60250l;

        /* renamed from: m */
        public int f60251m;

        /* renamed from: f */
        public final AtomicLong f60244f = new AtomicLong();

        /* renamed from: i */
        public final AtomicBoolean f60247i = new AtomicBoolean();

        /* renamed from: j */
        public final AtomicReference<Subscriber<? super T>> f60248j = new AtomicReference<>();

        /* renamed from: k */
        public final AtomicBoolean f60249k = new AtomicBoolean();

        public State(int i2, GroupBySubscriber<?, K, T> groupBySubscriber, K k2, boolean z) {
            this.f60241c = new SpscLinkedArrayQueue<>(i2);
            this.f60242d = groupBySubscriber;
            this.f60240b = k2;
            this.f60243e = z;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            if ((i2 & 2) == 0) {
                return 0;
            }
            this.f60250l = true;
            return 2;
        }

        /* renamed from: c */
        public void m31516c() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            if (this.f60250l) {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.f60241c;
                Subscriber<? super T> subscriber = this.f60248j.get();
                while (true) {
                    if (subscriber != null) {
                        if (this.f60247i.get()) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        boolean z = this.f60245g;
                        if (z && !this.f60243e && (th = this.f60246h) != null) {
                            spscLinkedArrayQueue.clear();
                            subscriber.onError(th);
                            return;
                        }
                        subscriber.onNext(null);
                        if (z) {
                            Throwable th2 = this.f60246h;
                            if (th2 != null) {
                                subscriber.onError(th2);
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                    if (subscriber == null) {
                        subscriber = this.f60248j.get();
                    }
                }
            } else {
                SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.f60241c;
                boolean z2 = this.f60243e;
                Subscriber<? super T> subscriber2 = this.f60248j.get();
                int i3 = 1;
                while (true) {
                    if (subscriber2 != null) {
                        long j2 = this.f60244f.get();
                        long j3 = 0;
                        while (j3 != j2) {
                            boolean z3 = this.f60245g;
                            T poll = spscLinkedArrayQueue2.poll();
                            boolean z4 = poll == null;
                            if (m31517f(z3, z4, subscriber2, z2)) {
                                return;
                            }
                            if (z4) {
                                break;
                            }
                            subscriber2.onNext(poll);
                            j3++;
                        }
                        if (j3 == j2 && m31517f(this.f60245g, spscLinkedArrayQueue2.isEmpty(), subscriber2, z2)) {
                            return;
                        }
                        if (j3 != 0) {
                            if (j2 != Long.MAX_VALUE) {
                                this.f60244f.addAndGet(-j3);
                            }
                            this.f60242d.f60230j.request(j3);
                        }
                    }
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                    if (subscriber2 == null) {
                        subscriber2 = this.f60248j.get();
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60247i.compareAndSet(false, true)) {
                GroupBySubscriber<?, K, T> groupBySubscriber = this.f60242d;
                Object obj = this.f60240b;
                if (obj == null) {
                    obj = GroupBySubscriber.f60221r;
                }
                groupBySubscriber.f60227g.remove(obj);
                if (groupBySubscriber.f60233m.decrementAndGet() == 0) {
                    groupBySubscriber.f60230j.cancel();
                    if (groupBySubscriber.getAndIncrement() == 0) {
                        groupBySubscriber.f60228h.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60241c.clear();
        }

        /* renamed from: f */
        public boolean m31517f(boolean z, boolean z2, Subscriber<? super T> subscriber, boolean z3) {
            if (this.f60247i.get()) {
                this.f60241c.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.f60246h;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f60246h;
            if (th2 != null) {
                this.f60241c.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // org.reactivestreams.Publisher
        /* renamed from: g */
        public void mo31351g(Subscriber<? super T> subscriber) {
            if (this.f60249k.compareAndSet(false, true)) {
                subscriber.mo31352d(this);
                this.f60248j.lazySet(subscriber);
                m31516c();
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Only one Subscriber allowed!");
                subscriber.mo31352d(EmptySubscription.INSTANCE);
                subscriber.onError(illegalStateException);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f60241c.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.f60241c.poll();
            if (poll != null) {
                this.f60251m++;
                return poll;
            }
            int i2 = this.f60251m;
            if (i2 == 0) {
                return null;
            }
            this.f60251m = 0;
            this.f60242d.f60230j.request(i2);
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60244f, j2);
                m31516c();
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super GroupedFlowable<K, V>> subscriber) {
        try {
            this.f59782c.m31349b(new GroupBySubscriber(subscriber, null, null, 0, false, new ConcurrentHashMap(), null));
        } catch (Exception e2) {
            Exceptions.m31402a(e2);
            subscriber.mo31352d(EmptyComponent.INSTANCE);
            subscriber.onError(e2);
        }
    }
}
