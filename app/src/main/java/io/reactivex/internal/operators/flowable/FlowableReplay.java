package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {

    /* renamed from: d */
    public static final Callable f60508d = new DefaultUnboundedFactory();

    /* renamed from: c */
    public final Publisher<T> f60509c;

    public static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements ReplayBuffer<T> {

        /* renamed from: b */
        public Node f60510b;

        /* renamed from: c */
        public int f60511c;

        /* renamed from: d */
        public long f60512d;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0L);
            this.f60510b = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: a */
        public final void mo31560a(T t) {
            Object mo31562c = mo31562c(t);
            long j2 = this.f60512d + 1;
            this.f60512d = j2;
            Node node = new Node(mo31562c, j2);
            this.f60510b.set(node);
            this.f60510b = node;
            this.f60511c++;
            mo31567h();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: b */
        public final void mo31561b() {
            Object mo31562c = mo31562c(NotificationLite.COMPLETE);
            long j2 = this.f60512d + 1;
            this.f60512d = j2;
            Node node = new Node(mo31562c, j2);
            this.f60510b.set(node);
            this.f60510b = node;
            this.f60511c++;
            mo31568i();
        }

        /* renamed from: c */
        public Object mo31562c(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: d */
        public final void mo31563d(Throwable th) {
            Object mo31562c = mo31562c(NotificationLite.m31832e(th));
            long j2 = this.f60512d + 1;
            this.f60512d = j2;
            Node node = new Node(mo31562c, j2);
            this.f60510b.set(node);
            this.f60510b = node;
            this.f60511c++;
            mo31568i();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: e */
        public final void mo31564e(InnerSubscription<T> innerSubscription) {
            Node node;
            synchronized (innerSubscription) {
                if (innerSubscription.f60517f) {
                    innerSubscription.f60518g = true;
                    return;
                }
                innerSubscription.f60517f = true;
                while (!innerSubscription.mo31380s()) {
                    long j2 = innerSubscription.get();
                    boolean z = j2 == Long.MAX_VALUE;
                    Node node2 = (Node) innerSubscription.f60515d;
                    if (node2 == null) {
                        node2 = mo31565f();
                        innerSubscription.f60515d = node2;
                        BackpressureHelper.m31808a(innerSubscription.f60516e, node2.f60521c);
                    }
                    long j3 = 0;
                    while (j2 != 0 && (node = node2.get()) != null) {
                        Object mo31566g = mo31566g(node.f60520b);
                        try {
                            if (NotificationLite.m31829b(mo31566g, innerSubscription.f60514c)) {
                                innerSubscription.f60515d = null;
                                return;
                            }
                            j3++;
                            j2--;
                            if (innerSubscription.mo31380s()) {
                                innerSubscription.f60515d = null;
                                return;
                            }
                            node2 = node;
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            innerSubscription.f60515d = null;
                            innerSubscription.mo31379f();
                            if (NotificationLite.m31835i(mo31566g) || NotificationLite.m31834h(mo31566g)) {
                                return;
                            }
                            innerSubscription.f60514c.onError(th);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        innerSubscription.f60515d = node2;
                        if (!z) {
                            BackpressureHelper.m31813f(innerSubscription, j3);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.f60518g) {
                            innerSubscription.f60517f = false;
                            return;
                        }
                        innerSubscription.f60518g = false;
                    }
                }
                innerSubscription.f60515d = null;
            }
        }

        /* renamed from: f */
        public Node mo31565f() {
            return get();
        }

        /* renamed from: g */
        public Object mo31566g(Object obj) {
            return obj;
        }

        /* renamed from: h */
        public void mo31567h() {
        }

        /* renamed from: i */
        public void mo31568i() {
            Node node = get();
            if (node.f60520b != null) {
                Node node2 = new Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    public static final class ConnectableFlowableReplay<T> extends ConnectableFlowable<T> {
        @Override // io.reactivex.Flowable
        /* renamed from: c */
        public void mo31350c(Subscriber<? super T> subscriber) {
            throw null;
        }
    }

    public static final class DefaultUnboundedFactory implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public static final class InnerSubscription<T> extends AtomicLong implements Subscription, Disposable {

        /* renamed from: b */
        public final ReplaySubscriber<T> f60513b;

        /* renamed from: c */
        public final Subscriber<? super T> f60514c;

        /* renamed from: d */
        public Object f60515d;

        /* renamed from: e */
        public final AtomicLong f60516e = new AtomicLong();

        /* renamed from: f */
        public boolean f60517f;

        /* renamed from: g */
        public boolean f60518g;

        public InnerSubscription(ReplaySubscriber<T> replaySubscriber, Subscriber<? super T> subscriber) {
            this.f60513b = replaySubscriber;
            this.f60514c = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            mo31379f();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f60513b.m31570b(this);
                this.f60513b.m31569a();
                this.f60515d = null;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (!SubscriptionHelper.m31803h(j2) || BackpressureHelper.m31809b(this, j2) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.m31808a(this.f60516e, j2);
            this.f60513b.m31569a();
            this.f60513b.f60527b.mo31564e(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return get() == Long.MIN_VALUE;
        }
    }

    public static final class MulticastFlowable<R, U> extends Flowable<R> {

        public final class DisposableConsumer implements Consumer<Disposable> {

            /* renamed from: b */
            public final SubscriberResourceWrapper<R> f60519b;

            @Override // io.reactivex.functions.Consumer
            public void accept(Disposable disposable) throws Exception {
                DisposableHelper.m31412d(this.f60519b, disposable);
            }
        }

        @Override // io.reactivex.Flowable
        /* renamed from: c */
        public void mo31350c(Subscriber<? super R> subscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                subscriber.mo31352d(EmptySubscription.INSTANCE);
                subscriber.onError(th);
            }
        }
    }

    public static final class Node extends AtomicReference<Node> {

        /* renamed from: b */
        public final Object f60520b;

        /* renamed from: c */
        public final long f60521c;

        public Node(Object obj, long j2) {
            this.f60520b = obj;
            this.f60521c = j2;
        }
    }

    public interface ReplayBuffer<T> {
        /* renamed from: a */
        void mo31560a(T t);

        /* renamed from: b */
        void mo31561b();

        /* renamed from: d */
        void mo31563d(Throwable th);

        /* renamed from: e */
        void mo31564e(InnerSubscription<T> innerSubscription);
    }

    public static final class ReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {

        /* renamed from: b */
        public final int f60522b;

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            return new SizeBoundReplayBuffer(this.f60522b);
        }
    }

    public static final class ReplayPublisher<T> implements Publisher<T> {

        /* renamed from: b */
        public final AtomicReference<ReplaySubscriber<T>> f60523b;

        /* renamed from: c */
        public final Callable<? extends ReplayBuffer<T>> f60524c;

        @Override // org.reactivestreams.Publisher
        /* renamed from: g */
        public void mo31351g(Subscriber<? super T> subscriber) {
            ReplaySubscriber<T> replaySubscriber;
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            while (true) {
                replaySubscriber = this.f60523b.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    ReplaySubscriber<T> replaySubscriber2 = new ReplaySubscriber<>(this.f60524c.call());
                    if (this.f60523b.compareAndSet(null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    subscriber.mo31352d(EmptySubscription.INSTANCE);
                    subscriber.onError(th);
                    return;
                }
            }
            InnerSubscription<T> innerSubscription = new InnerSubscription<>(replaySubscriber, subscriber);
            subscriber.mo31352d(innerSubscription);
            do {
                innerSubscriptionArr = replaySubscriber.f60529d.get();
                if (innerSubscriptionArr == ReplaySubscriber.f60526j) {
                    break;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!replaySubscriber.f60529d.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
            if (innerSubscription.mo31380s()) {
                replaySubscriber.m31570b(innerSubscription);
            } else {
                replaySubscriber.m31569a();
                replaySubscriber.f60527b.mo31564e(innerSubscription);
            }
        }
    }

    public static final class ReplaySubscriber<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: i */
        public static final InnerSubscription[] f60525i = new InnerSubscription[0];

        /* renamed from: j */
        public static final InnerSubscription[] f60526j = new InnerSubscription[0];

        /* renamed from: b */
        public final ReplayBuffer<T> f60527b;

        /* renamed from: c */
        public boolean f60528c;

        /* renamed from: g */
        public long f60532g;

        /* renamed from: h */
        public long f60533h;

        /* renamed from: f */
        public final AtomicInteger f60531f = new AtomicInteger();

        /* renamed from: d */
        public final AtomicReference<InnerSubscription<T>[]> f60529d = new AtomicReference<>(f60525i);

        /* renamed from: e */
        public final AtomicBoolean f60530e = new AtomicBoolean();

        public ReplaySubscriber(ReplayBuffer<T> replayBuffer) {
            this.f60527b = replayBuffer;
        }

        /* renamed from: a */
        public void m31569a() {
            if (this.f60531f.getAndIncrement() != 0) {
                return;
            }
            int i2 = 1;
            while (!mo31380s()) {
                InnerSubscription<T>[] innerSubscriptionArr = this.f60529d.get();
                long j2 = this.f60532g;
                long j3 = j2;
                for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                    j3 = Math.max(j3, innerSubscription.f60516e.get());
                }
                long j4 = this.f60533h;
                Subscription subscription = get();
                long j5 = j3 - j2;
                if (j5 != 0) {
                    this.f60532g = j3;
                    if (subscription == null) {
                        long j6 = j4 + j5;
                        if (j6 < 0) {
                            j6 = Long.MAX_VALUE;
                        }
                        this.f60533h = j6;
                    } else if (j4 != 0) {
                        this.f60533h = 0L;
                        subscription.request(j4 + j5);
                    } else {
                        subscription.request(j5);
                    }
                } else if (j4 != 0 && subscription != null) {
                    this.f60533h = 0L;
                    subscription.request(j4);
                }
                i2 = this.f60531f.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m31570b(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription<T>[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.f60529d.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerSubscriptionArr[i2].equals(innerSubscription)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = f60525i;
                } else {
                    InnerSubscription<T>[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i2);
                    System.arraycopy(innerSubscriptionArr, i2 + 1, innerSubscriptionArr3, i2, (length - i2) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!this.f60529d.compareAndSet(innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this, subscription)) {
                m31569a();
                for (InnerSubscription<T> innerSubscription : this.f60529d.get()) {
                    this.f60527b.mo31564e(innerSubscription);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60529d.set(f60526j);
            SubscriptionHelper.m31797a(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f60528c) {
                return;
            }
            this.f60528c = true;
            this.f60527b.mo31561b();
            for (InnerSubscription<T> innerSubscription : this.f60529d.getAndSet(f60526j)) {
                this.f60527b.mo31564e(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f60528c) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f60528c = true;
            this.f60527b.mo31563d(th);
            for (InnerSubscription<T> innerSubscription : this.f60529d.getAndSet(f60526j)) {
                this.f60527b.mo31564e(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60528c) {
                return;
            }
            this.f60527b.mo31560a(t);
            for (InnerSubscription<T> innerSubscription : this.f60529d.get()) {
                this.f60527b.mo31564e(innerSubscription);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60529d.get() == f60526j;
        }
    }

    public static final class ScheduledReplayBufferTask<T> implements Callable<ReplayBuffer<T>> {

        /* renamed from: b */
        public final int f60534b;

        /* renamed from: c */
        public final long f60535c;

        /* renamed from: d */
        public final TimeUnit f60536d;

        /* renamed from: e */
        public final Scheduler f60537e;

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            return new SizeAndTimeBoundReplayBuffer(this.f60534b, this.f60535c, this.f60536d, this.f60537e);
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {

        /* renamed from: e */
        public final Scheduler f60538e;

        /* renamed from: f */
        public final long f60539f;

        /* renamed from: g */
        public final TimeUnit f60540g;

        /* renamed from: h */
        public final int f60541h;

        public SizeAndTimeBoundReplayBuffer(int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
            this.f60538e = scheduler;
            this.f60541h = i2;
            this.f60539f = j2;
            this.f60540g = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: c */
        public Object mo31562c(Object obj) {
            return new Timed(obj, this.f60538e.mo31375b(this.f60540g), this.f60540g);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: f */
        public Node mo31565f() {
            Node node;
            long mo31375b = this.f60538e.mo31375b(this.f60540g) - this.f60539f;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    Timed timed = (Timed) node2.f60520b;
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

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: g */
        public Object mo31566g(Object obj) {
            return ((Timed) obj).f62915a;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: h */
        public void mo31567h() {
            Node node;
            long mo31375b = this.f60538e.mo31375b(this.f60540g) - this.f60539f;
            Node node2 = get();
            Node node3 = node2.get();
            int i2 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i3 = this.f60511c;
                    if (i3 <= this.f60541h) {
                        if (((Timed) node2.f60520b).f62916b > mo31375b) {
                            break;
                        }
                        i2++;
                        this.f60511c = i3 - 1;
                        node3 = node2.get();
                    } else {
                        i2++;
                        this.f60511c = i3 - 1;
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
        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo31568i() {
            /*
                r10 = this;
                io.reactivex.Scheduler r0 = r10.f60538e
                java.util.concurrent.TimeUnit r1 = r10.f60540g
                long r0 = r0.mo31375b(r1)
                long r2 = r10.f60539f
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r2
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                r4 = 0
            L18:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L39
                int r5 = r10.f60511c
                r6 = 1
                if (r5 <= r6) goto L39
                java.lang.Object r6 = r2.f60520b
                io.reactivex.schedulers.Timed r6 = (io.reactivex.schedulers.Timed) r6
                long r6 = r6.f62916b
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L39
                int r4 = r4 + 1
                int r5 = r5 + (-1)
                r10.f60511c = r5
                java.lang.Object r3 = r2.get()
                io.reactivex.internal.operators.flowable.FlowableReplay$Node r3 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) r3
                goto L18
            L39:
                if (r4 == 0) goto L3e
                r10.set(r3)
            L3e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableReplay.SizeAndTimeBoundReplayBuffer.mo31568i():void");
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {

        /* renamed from: e */
        public final int f60542e;

        public SizeBoundReplayBuffer(int i2) {
            this.f60542e = i2;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /* renamed from: h */
        public void mo31567h() {
            if (this.f60511c > this.f60542e) {
                Node node = get().get();
                if (node == null) {
                    throw new IllegalStateException("Empty list!");
                }
                this.f60511c--;
                set(node);
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements ReplayBuffer<T> {

        /* renamed from: b */
        public volatile int f60543b;

        public UnboundedReplayBuffer(int i2) {
            super(i2);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: a */
        public void mo31560a(T t) {
            add(t);
            this.f60543b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: b */
        public void mo31561b() {
            add(NotificationLite.COMPLETE);
            this.f60543b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: d */
        public void mo31563d(Throwable th) {
            add(NotificationLite.m31832e(th));
            this.f60543b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        /* renamed from: e */
        public void mo31564e(InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.f60517f) {
                    innerSubscription.f60518g = true;
                    return;
                }
                innerSubscription.f60517f = true;
                Subscriber<? super T> subscriber = innerSubscription.f60514c;
                while (!innerSubscription.mo31380s()) {
                    int i2 = this.f60543b;
                    Integer num = (Integer) innerSubscription.f60515d;
                    int intValue = num != null ? num.intValue() : 0;
                    long j2 = innerSubscription.get();
                    long j3 = j2;
                    long j4 = 0;
                    while (j3 != 0 && intValue < i2) {
                        Object obj = get(intValue);
                        try {
                            if (NotificationLite.m31829b(obj, subscriber) || innerSubscription.mo31380s()) {
                                return;
                            }
                            intValue++;
                            j3--;
                            j4++;
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            innerSubscription.mo31379f();
                            if (NotificationLite.m31835i(obj) || NotificationLite.m31834h(obj)) {
                                return;
                            }
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (j4 != 0) {
                        innerSubscription.f60515d = Integer.valueOf(intValue);
                        if (j2 != Long.MAX_VALUE) {
                            BackpressureHelper.m31813f(innerSubscription, j4);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.f60518g) {
                            innerSubscription.f60517f = false;
                            return;
                        }
                        innerSubscription.f60518g = false;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f60509c.mo31351g(subscriber);
    }
}
